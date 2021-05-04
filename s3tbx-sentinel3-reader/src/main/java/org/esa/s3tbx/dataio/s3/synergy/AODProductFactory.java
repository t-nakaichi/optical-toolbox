package org.esa.s3tbx.dataio.s3.synergy;

import org.esa.s3tbx.dataio.s3.AbstractProductFactory;
import org.esa.s3tbx.dataio.s3.Manifest;
import org.esa.s3tbx.dataio.s3.Sentinel3ProductReader;
import org.esa.s3tbx.dataio.s3.util.S3NetcdfReader;
import org.esa.snap.core.dataio.geocoding.ComponentFactory;
import org.esa.snap.core.dataio.geocoding.ComponentGeoCoding;
import org.esa.snap.core.dataio.geocoding.ForwardCoding;
import org.esa.snap.core.dataio.geocoding.GeoChecks;
import org.esa.snap.core.dataio.geocoding.GeoRaster;
import org.esa.snap.core.dataio.geocoding.InverseCoding;
import org.esa.snap.core.dataio.geocoding.forward.PixelForward;
import org.esa.snap.core.dataio.geocoding.inverse.PixelQuadTreeInverse;
import org.esa.snap.core.dataio.geocoding.util.RasterUtils;
import org.esa.snap.core.datamodel.Band;
import org.esa.snap.core.datamodel.Product;
import org.esa.snap.runtime.Config;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.prefs.Preferences;

public class AODProductFactory extends AbstractProductFactory {

    private static final double FILL_VALUE = -999.0;
    private static final double RESOLUTION_IN_KM = 4.5;

    private final static String SYSPROP_SYN_AOD_PIXEL_GEO_CODING_INVERSE = "s3tbx.reader.syn.aod.pixelGeoCoding.inverse";

    public AODProductFactory(Sentinel3ProductReader productReader) {
        super(productReader);
    }

    @Override
    protected List<String> getFileNames(Manifest manifest) {
        return manifest.getFileNames(new String[0]);
    }

    @Override
    protected Product readProduct(String fileName, Manifest manifest) throws IOException {
        final File file = new File(getInputFileParentDirectory(), fileName);
        if (!file.exists()) {
            return null;
        }
        return new S3NetcdfReader().readProductNodes(file, null);
    }

    @Override
    protected void setGeoCoding(Product targetProduct) throws IOException {
        final String lonVariableName = "longitude";
        final String latVariableName = "latitude";
        final Band lonBand = targetProduct.getBand(lonVariableName);
        final Band latBand = targetProduct.getBand(latVariableName);
        if (lonBand == null || latBand == null) {
            return;
        }

        final double[] longitudes = RasterUtils.loadGeoData(lonBand);
        final double[] latitudes = RasterUtils.loadGeoData(latBand);

        // replace fill value with NaN
        for (int i = 0; i < longitudes.length; i++) {
            if (longitudes[i] <= FILL_VALUE) {
                longitudes[i] = Double.NaN;
            }
            if (latitudes[i] <= FILL_VALUE) {
                latitudes[i] = Double.NaN;
            }
        }

        final int width = targetProduct.getSceneRasterWidth();
        final int height = targetProduct.getSceneRasterHeight();
        final GeoRaster geoRaster = new GeoRaster(longitudes, latitudes, lonVariableName, latVariableName,
                                                  width, height, RESOLUTION_IN_KM);

        final String[] keys = getForwardAndInverseKeys_pixelCoding(SYSPROP_SYN_AOD_PIXEL_GEO_CODING_INVERSE);
        final ForwardCoding forward = ComponentFactory.getForward(keys[0]);
        final InverseCoding inverse = ComponentFactory.getInverse(keys[1]);

        final ComponentGeoCoding geoCoding = new ComponentGeoCoding(geoRaster, forward, inverse, GeoChecks.POLES);
        geoCoding.initialize();

        targetProduct.setSceneGeoCoding(geoCoding);
    }

    @Override
    protected void setAutoGrouping(Product[] sourceProducts, Product targetProduct) {
        targetProduct.setAutoGrouping("AOD:SSA:Surface_reflectance");
    }
}
