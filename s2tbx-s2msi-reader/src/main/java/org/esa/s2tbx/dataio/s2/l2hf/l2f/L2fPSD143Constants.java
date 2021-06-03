package org.esa.s2tbx.dataio.s2.l2hf.l2f;

/**
 * Created by obarrile on 06/02/2018.
 */
public class L2fPSD143Constants {

    //TODO
    private final static String PRODUCT_SCHEMA_FILE_PATH = "schemas/L2HF_PSD14/S2_User_Product_Level-2F_Metadata.xsd";
    private final static String GRANULE_SCHEMA_FILE_PATH = "schemas/L2HF_PSD14/S2_PDI_Level-2F_Tile_Metadata.xsd";
    private final static String DATASTRIP_SCHEMA_FILE_PATH = "schemas/L2HF_PSD14/S2_PDI_Level-2F_Datastrip_Metadata.xsd";
    private final static String SCHEMA12_BASE_PATH = "schemas/L2HF_PSD14/";

    public static String[] getProductSchemaLocations() {

        String[] locations = new String[1];
        locations[0] = PRODUCT_SCHEMA_FILE_PATH;

        return locations;
    }

    public static String[] getGranuleSchemaLocations() {

        String[] locations = new String[1];
        locations[0] = GRANULE_SCHEMA_FILE_PATH;

        return locations;
    }

    public static String[] getDatastripSchemaLocations() {

        String[] locations = new String[1];
        locations[0] = DATASTRIP_SCHEMA_FILE_PATH;

        return locations;
    }

    public static String getProductSchemaBasePath() {
        return SCHEMA12_BASE_PATH;
    }

    public static String getDatastripSchemaBasePath() {
        return SCHEMA12_BASE_PATH;
    }

    public static String getGranuleSchemaBasePath() {
        return SCHEMA12_BASE_PATH;
    }


    /*
    * Default values
    */
    public static double DEFAULT_BOA_QUANTIFICATION = 10000;
    public static double DEFAULT_AOT_QUANTIFICATION = 1000;
    public static double DEFAULT_WVP_QUANTIFICATION = 1000;
    public static int DEFAULT_ANGLES_RESOLUTION = 5000;


    /*
    * Product metadata element paths
   */
    public static final String PATH_PRODUCT_METADATA_GRANULE_LIST_ALT = "/Level-2F_User_Product/General_Info/Product_Info/Product_Organisation/Granule_List/Granule/granuleIdentifier";
    public static final String PATH_PRODUCT_METADATA_DATASTRIP_LIST_ALT = "/Level-2F_User_Product/General_Info/Product_Info/Product_Organisation/Granule_List/Granule/datastripIdentifier";
    //PSD143
    public static final String PATH_PRODUCT_METADATA_DATATAKE = "/Level-2F_User_Product/General_Info/Product_Info/Datatake/datatakeIdentifier";
    public static final String PATH_PRODUCT_METADATA_SPACECRAFT = "/Level-2F_User_Product/General_Info/Product_Info/Datatake/SPACECRAFT_NAME";
    public static final String PATH_PRODUCT_METADATA_DATATAKE_TYPE = "/Level-2F_User_Product/General_Info/Product_Info/Datatake/DATATAKE_TYPE";
    public static final String PATH_PRODUCT_METADATA_SENSING_START = "/Level-2F_User_Product/General_Info/Product_Info/Datatake/DATATAKE_SENSING_START";
    public static final String PATH_PRODUCT_METADATA_SENSING_ORBIT_NUMBER = "/Level-2F_User_Product/General_Info/Product_Info/Datatake/SENSING_ORBIT_NUMBER";
    public static final String PATH_PRODUCT_METADATA_ORBIT_DIRECTION = "/Level-2F_User_Product/General_Info/Product_Info/Datatake/SENSING_ORBIT_DIRECTION";

    public static final String PATH_PRODUCT_METADATA_PRODUCT_START_TIME = "/Level-2F_User_Product/General_Info/Product_Info/PRODUCT_START_TIME";
    public static final String PATH_PRODUCT_METADATA_PRODUCT_STOP_TIME = "/Level-2F_User_Product/General_Info/Product_Info/PRODUCT_STOP_TIME";
    public static final String PATH_PRODUCT_METADATA_PRODUCT_URI = "/Level-2F_User_Product/General_Info/Product_Info/PRODUCT_URI";
    public static final String PATH_PRODUCT_METADATA_PROCESSING_LEVEL = "/Level-2F_User_Product/General_Info/Product_Info/PROCESSING_LEVEL";
    public static final String PATH_PRODUCT_METADATA_PRODUCT_TYPE = "/Level-2F_User_Product/General_Info/Product_Info/PRODUCT_TYPE";
    public static final String PATH_PRODUCT_METADATA_PROCESSING_BASELINE = "/Level-2F_User_Product/General_Info/Product_Info/PROCESSING_BASELINE";
    public static final String PATH_PRODUCT_METADATA_GENERATION_TIME = "/Level-2F_User_Product/General_Info/Product_Info/GENERATION_TIME";
    public static final String PATH_PRODUCT_METADATA_PREVIEW_IMAGE_URL = "/Level-2F_User_Product/General_Info/Product_Info/PREVIEW_IMAGE_URL";
    public static final String PATH_PRODUCT_METADATA_PREVIEW_GEO_INFO = "/Level-2F_User_Product/General_Info/Product_Info/PREVIEW_GEO_INFO";

    public static final String PATH_PRODUCT_METADATA_METADATA_LEVEL = "/Level-2F_User_Product/General_Info/Product_Info/Query_Options/METADATA_LEVEL";
    public static final String PATH_PRODUCT_METADATA_GRANULE_LIST = "/Level-2F_User_Product/General_Info/Product_Info/Product_Organisation/Granule_List/Granule/granuleIdentifier";
    public static final String PATH_PRODUCT_METADATA_GRANULE_FILE_LIST = "/Level-2F_User_Product/General_Info/Product_Info/Product_Organisation/Granule_List/Granule/IMAGE_FILE";

    public static final String PATH_PRODUCT_METADATA_DATASTRIP_LIST = "/Level-2F_User_Product/General_Info/Product_Info/Product_Organisation/Granule_List/Granule/datastripIdentifier";
    public static final String PATH_PRODUCT_METADATA_IMAGE_ID = "/Level-2F_User_Product/General_Info/Product_Info/Product_Organisation/Granule_List/Granules/IMAGE_ID_2A";


    public static final String PATH_PRODUCT_METADATA_L1C_TOA_QUANTIFICATION_VALUE = "/Level-2F_User_Product/General_Info/Product_Image_Characteristics/QUANTIFICATION_VALUES_LIST/L1C_TOA_QUANTIFICATION_VALUE";
    public static final String PATH_PRODUCT_METADATA_L2F_BOA_QUANTIFICATION_VALUE = "/Level-2F_User_Product/General_Info/Product_Image_Characteristics/QUANTIFICATION_VALUES_LIST/BOA_QUANTIFICATION_VALUE";
    public static final String PATH_PRODUCT_METADATA_L2F_AOT_QUANTIFICATION_VALUE = "/Level-2F_User_Product/General_Info/Product_Image_Characteristics/QUANTIFICATION_VALUES_LIST/AOT_QUANTIFICATION_VALUE";
    public static final String PATH_PRODUCT_METADATA_L2F_WVP_QUANTIFICATION_VALUE = "/Level-2F_User_Product/General_Info/Product_Image_Characteristics/QUANTIFICATION_VALUES_LIST/WVP_QUANTIFICATION_VALUE";

    public static final String PATH_PRODUCT_METADATA_BAND_LIST = "/Level-2F_User_Product/General_Info/Product_Info/Query_Options/Band_List";
    public static final String PATH_PRODUCT_METADATA_PRODUCT_FORMAT = "/Level-2F_User_Product/General_Info/Product_Info/Query_Options/PRODUCT_FORMAT";


    /*
     * Granule metadata element path
     */
    public static final String PATH_GRANULE_METADATA_TILE_ID = "/Level-2F_Tile_ID/General_Info/TILE_ID";
    public static final String PATH_GRANULE_METADATA_HORIZONTAL_CS_NAME = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/HORIZONTAL_CS_NAME";
    public static final String PATH_GRANULE_METADATA_HORIZONTAL_CS_CODE = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/HORIZONTAL_CS_CODE";
    public static final String PATH_GRANULE_METADATA_SIZE_RESOLUTION = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Size/resolution";
    public static final String PATH_GRANULE_METADATA_SIZE_NROWS = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Size/NROWS";
    public static final String PATH_GRANULE_METADATA_SIZE_NCOLS = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Size/NCOLS";
    public static final String PATH_GRANULE_METADATA_GEOPOSITION_RESOLUTION = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Geoposition/resolution";
    public static final String PATH_GRANULE_METADATA_GEOPOSITION_ULX = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Geoposition/ULX";
    public static final String PATH_GRANULE_METADATA_GEOPOSITION_ULY = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Geoposition/ULY";
    public static final String PATH_GRANULE_METADATA_GEOPOSITION_XDIM = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Geoposition/XDIM";
    public static final String PATH_GRANULE_METADATA_GEOPOSITION_YDIM = "/Level-2F_Tile_ID/Geometric_Info/Tile_Geocoding/Geoposition/YDIM";
    public static final String PATH_GRANULE_METADATA_ANGLE_RESOLUTION = "/Level-2F_Tile_ID/Geometric_Info/Tile_Angles/Sun_Angles_Grid/Zenith/COL_STEP";
    public static final String PATH_GRANULE_METADATA_SUN_ZENITH_ANGLES = "/Level-2F_Tile_ID/Geometric_Info/Tile_Angles/Sun_Angles_Grid/Zenith/Values_List/VALUES";
    public static final String PATH_GRANULE_METADATA_SUN_AZIMUTH_ANGLES = "/Level-2F_Tile_ID/Geometric_Info/Tile_Angles/Sun_Angles_Grid/Azimuth/Values_List/VALUES";
    public static final String PATH_GRANULE_METADATA_VIEWING_ZENITH_ANGLES = "/Level-2F_Tile_ID/Geometric_Info/Tile_Angles/Viewing_Incidence_Angles_Grids/Zenith/Values_List/VALUES";
    public static final String PATH_GRANULE_METADATA_VIEWING_AZIMUTH_ANGLES = "/Level-2F_Tile_ID/Geometric_Info/Tile_Angles/Viewing_Incidence_Angles_Grids/Azimuth/Values_List/VALUES";
    public static final String PATH_GRANULE_METADATA_VIEWING_BAND_ID = "/Level-2F_Tile_ID/Geometric_Info/Tile_Angles/Viewing_Incidence_Angles_Grids/bandId";

    public static final String PATH_GRANULE_METADATA_MASK_FILENAME = "/Level-2F_Tile_ID/Quality_Indicators_Info/Pixel_Level_QI/MASK_FILENAME";
    public static final String PATH_GRANULE_METADATA_MASK_TYPE = "/Level-2F_Tile_ID/Quality_Indicators_Info/Pixel_Level_QI/MASK_FILENAME/type";
    public static final String PATH_GRANULE_METADATA_MASK_BAND = "/Level-2F_Tile_ID/Quality_Indicators_Info/Pixel_Level_QI/MASK_FILENAME/bandId";

    public static final String PATH_GRANULE_METADATA_PVI_FILENAME = "/Level-2F_Tile_ID/Quality_Indicators_Info/PVI_FILENAME";
}
