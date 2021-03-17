package org.esa.s2tbx.dataio.s2.l2h.metadata;

import org.esa.s2tbx.dataio.s2.VirtualPath;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by obarrile on 05/10/2016.
 */
public class L2hMetadataFactory {
    public static IL2hProductMetadata createL2hProductMetadata(VirtualPath metadataPath) throws IOException, ParserConfigurationException, SAXException {
        int psd = L2hMetadata.getDeepPSD(metadataPath);
        if(psd == 14 || psd == 13 || psd == 12 || psd == 0 )  {
            return L2hProductMetadataGenericPSD.create(metadataPath, new L2hMetadataPathsProviderPSD13());
        } else if (psd == 143) {
            return L2hProductMetadataGenericPSD.create(metadataPath, new L2hMetadataPathsProviderPSD143());
        } else {
            //TODO
            return null;
        }
    }

    public static IL2hGranuleMetadata createL2hGranuleMetadata(VirtualPath metadataPath) throws IOException, ParserConfigurationException, SAXException {
        int psd = L2hMetadata.getDeepPSD(metadataPath);
        if(psd == 14 || psd == 13 || psd == 12 || psd == 0 )  {
            return L2hGranuleMetadataGenericPSD.create(metadataPath, new L2hMetadataPathsProviderPSD13());
        } else if (psd == 143) {
            return L2hGranuleMetadataGenericPSD.create(metadataPath, new L2hMetadataPathsProviderPSD143());
        } else {
            //TODO
            return null;
        }
    }


    public static IL2hDatastripMetadata createL2hDatastripMetadata(VirtualPath metadataPath) throws IOException, ParserConfigurationException, SAXException {
        int psd = L2hMetadata.getDeepPSD(metadataPath);
        if(psd == 14 || psd == 13 || psd == 12 || psd == 0 )  {
            return L2hDatastripMetadataGenericPSD.create(metadataPath, new L2hMetadataPathsProviderPSD13());
        } else if (psd == 143) {
            return L2hDatastripMetadataGenericPSD.create(metadataPath, new L2hMetadataPathsProviderPSD143());
        } else {
            //TODO
            return null;
        }
    }


}
