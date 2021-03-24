package org.esa.s2tbx.dataio.s2.l2hf.l2f.metadata;

/**
 * Created by fdouziech
 */
public interface IL2fMetadataPathsProvider {


    String[] getProductSchemaLocations();
    String[] getGranuleSchemaLocations();
    String[] getDatastripSchemaLocations();
    String getProductSchemaBasePath();
    String getDatastripSchemaBasePath();
    String getGranuleSchemaBasePath();

    /*
    * Default values
    */
    double DEFAULT_BOA_QUANTIFICATION = 10000;
    double DEFAULT_AOT_QUANTIFICATION = 1000;
    double DEFAULT_WVP_QUANTIFICATION = 1000;
    int DEFAULT_ANGLES_RESOLUTION = 5000;


    /*
    * Product metadata element paths
   */
    String getPATH_PRODUCT_METADATA_DATATAKE();
    String getPATH_PRODUCT_METADATA_SPACECRAFT();
    String getPATH_PRODUCT_METADATA_DATATAKE_TYPE();
    String getPATH_PRODUCT_METADATA_SENSING_START();
    String getPATH_PRODUCT_METADATA_SENSING_ORBIT_NUMBER();
    String getPATH_PRODUCT_METADATA_ORBIT_DIRECTION();

    String getPATH_PRODUCT_METADATA_PRODUCT_START_TIME();
    String getPATH_PRODUCT_METADATA_PRODUCT_STOP_TIME();
    String getPATH_PRODUCT_METADATA_PRODUCT_URI();
    String getPATH_PRODUCT_METADATA_PROCESSING_LEVEL();
    String getPATH_PRODUCT_METADATA_PRODUCT_TYPE();
    String getPATH_PRODUCT_METADATA_PROCESSING_BASELINE();
    String getPATH_PRODUCT_METADATA_GENERATION_TIME();
    String getPATH_PRODUCT_METADATA_PREVIEW_IMAGE_URL();
    String getPATH_PRODUCT_METADATA_PREVIEW_GEO_INFO();

    String getPATH_PRODUCT_METADATA_METADATA_LEVEL();
    String getPATH_PRODUCT_METADATA_GRANULE_LIST();
    String getPATH_PRODUCT_METADATA_GRANULE_FILE_LIST();
    String getPATH_PRODUCT_METADATA_GRANULE_LIST_ALT();
    String getPATH_PRODUCT_METADATA_DATASTRIP_LIST();
    String getPATH_PRODUCT_METADATA_DATASTRIP_LIST_ALT();
    String getPATH_PRODUCT_METADATA_IMAGE_ID();

    String getPATH_PRODUCT_METADATA_L1C_TOA_QUANTIFICATION_VALUE();
    String getPATH_PRODUCT_METADATA_L2F_BOA_QUANTIFICATION_VALUE();
    String getPATH_PRODUCT_METADATA_L2F_AOT_QUANTIFICATION_VALUE();
    String getPATH_PRODUCT_METADATA_L2F_WVP_QUANTIFICATION_VALUE();

    String getPATH_PRODUCT_METADATA_BAND_LIST();
    String getPATH_PRODUCT_METADATA_PRODUCT_FORMAT();

    //Granule
    String getPATH_GRANULE_METADATA_TILE_ID ();
    String getPATH_GRANULE_METADATA_HORIZONTAL_CS_NAME();
    String getPATH_GRANULE_METADATA_HORIZONTAL_CS_CODE ();
    String getPATH_GRANULE_METADATA_SIZE_RESOLUTION ();
    String getPATH_GRANULE_METADATA_SIZE_NROWS ();
    String getPATH_GRANULE_METADATA_SIZE_NCOLS ();
    String getPATH_GRANULE_METADATA_GEOPOSITION_RESOLUTION();
    String getPATH_GRANULE_METADATA_GEOPOSITION_ULX();
    String getPATH_GRANULE_METADATA_GEOPOSITION_ULY ();
    String getPATH_GRANULE_METADATA_GEOPOSITION_XDIM();
    String getPATH_GRANULE_METADATA_GEOPOSITION_YDIM ();
    String getPATH_GRANULE_METADATA_ANGLE_RESOLUTION ();
    String getPATH_GRANULE_METADATA_SUN_ZENITH_ANGLES();
    String getPATH_GRANULE_METADATA_SUN_AZIMUTH_ANGLES();
    String getPATH_GRANULE_METADATA_VIEWING_ZENITH_ANGLES();
    String getPATH_GRANULE_METADATA_VIEWING_AZIMUTH_ANGLES ();
    String getPATH_GRANULE_METADATA_VIEWING_BAND_ID ();

    String getPATH_GRANULE_METADATA_MASK_FILENAME ();
    String getPATH_GRANULE_METADATA_MASK_TYPE ();
    String getPATH_GRANULE_METADATA_MASK_BAND ();

    String getPATH_GRANULE_METADATA_PVI_FILENAME ();

}
