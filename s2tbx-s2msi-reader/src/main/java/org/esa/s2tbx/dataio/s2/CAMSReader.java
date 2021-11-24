package org.esa.s2tbx.dataio.s2;

import org.apache.commons.io.FileUtils;
import org.esa.snap.core.datamodel.TiePointGrid;

import ucar.ma2.InvalidRangeException;
import ucar.ma2.Range;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class CAMSReader {

    final List<TiePointGrid> tiePointGrids;

    public CAMSReader(Path path, Path cachedir) throws IOException {
        this.tiePointGrids = new ArrayList<>();
        NetcdfFile ncfile = null;
        final Path cacheFolderPath = cachedir.resolve("aux_camsfo");
        try {
            final Path copyPath = cacheFolderPath.resolve(path.getFileName().toString());
            Files.createDirectories(copyPath);
            Files.copy(path, copyPath, StandardCopyOption.REPLACE_EXISTING);
            ncfile = NetcdfFile.openInMemory(copyPath.toString());
            List<GridPair> gridList = new ArrayList<GridPair>();
            gridList.add(new GridPair("Total_Aerosol_Optical_Depth_at_550nm_surface","aod550"));
            gridList.add(new GridPair("Geopotential_surface","z"));
            gridList.add(new GridPair("Black_Carbon_Aerosol_Optical_Depth_at_550nm_surface","bcaod550"));
            gridList.add(new GridPair("Dust_Aerosol_Optical_Depth_at_550nm_surface","duaod550"));
            gridList.add(new GridPair("Organic_Matter_Aerosol_Optical_Depth_at_550nm_surface","omaod550"));
            gridList.add(new GridPair("Sea_Salt_Aerosol_Optical_Depth_at_550nm_surface","ssaod550"));
            gridList.add(new GridPair("Sulphate_Aerosol_Optical_Depth_at_550nm_surface","suaod550"));
            gridList.add(new GridPair("Total_Aerosol_Optical_Depth_at_469nm_surface","aod469"));
            gridList.add(new GridPair("Total_Aerosol_Optical_Depth_at_670nm_surface","aod670"));
            gridList.add(new GridPair("Total_Aerosol_Optical_Depth_at_865nm_surface","aod865"));
            gridList.add(new GridPair("Total_Aerosol_Optical_Depth_at_1240nm_surface","aod1240"));
            for(GridPair gridPair:gridList) {
                TiePointGrid tpGrid = getGrid(ncfile, gridPair);
                if (tpGrid != null) {
                    this.tiePointGrids.add(tpGrid);
                }
            }
        } catch (Exception ioe) {
            // Handle less-cool exceptions here
            ioe.printStackTrace();
        } finally {
            if (ncfile != null) {
                ncfile.close();
            }
            FileUtils.deleteDirectory(cacheFolderPath.toFile());
        }
    }

    public List<TiePointGrid> getCAMSGrids() {
        return tiePointGrids;
    }

    public TiePointGrid getGrid(NetcdfFile ncfile, GridPair GridPair) throws IOException, InvalidRangeException {
        final Variable variable = ncfile.findVariable(null, GridPair.getKey());
        if (variable == null) {
            return null;
        }
        String description = variable.getDescription();
        if( description.contains("@"))
            description = description.split(" @")[0] + " at surface level provided by CAMS";
        String units = variable.getUnitsString();
        final int[] shape = variable.getShape();
        final float[] tiePoints = (float[])variable.read().getStorage();
        final TiePointGrid tiePointGrid = new TiePointGrid(GridPair.name, shape[1],shape[2], 0.5, 0.5, 1220, 1220,tiePoints);
        tiePointGrid.setUnit(units);
        tiePointGrid.setNoDataValue(Double.NaN);
        tiePointGrid.setNoDataValueUsed(true);
        tiePointGrid.setDescription(description);
        return tiePointGrid;
    }

    public class GridPair {
        private String key;
        private String name;
    
        public GridPair(String key, String name) {
            this.key = key;
            this.name = name;
        }

        protected final String getKey() {
            return key;
        }

        protected final String getName() {
            return name;
        }

    }
}


