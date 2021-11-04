package edu.aku.hassannaqvi.chese.contracts;

import android.provider.BaseColumns;

public class TableContracts {

    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "FormsTable";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_TEHSIL_CODE = "tehsilCode";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_LHW_CODE = "lhwCode";
        public static final String COLUMN_A101 = "a101";
        public static final String COLUMN_A102 = "a102";
        public static final String COLUMN_A103 = "a103";
        public static final String COLUMN_A104N = "a104n";
        public static final String COLUMN_A104C = "a104c";
        public static final String COLUMN_A105 = "a105";
        public static final String COLUMN_SESSION_TYPE = "sessionType";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }


    public static abstract class VHCTable implements BaseColumns {
        public static final String TABLE_NAME = "VHC";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_NAME = "districtName";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_HF_NAME = "hfName";
        public static final String COLUMN_REPORTING_MONTH = "reportingMonth";
        public static final String COLUMN_REPORTING_YEAR = "reportingYear";
        public static final String COLUMN_SV2 = "sV2";
        public static final String COLUMN_SV3 = "sV3";
        public static final String COLUMN_SV4 = "sV4";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }


    public static abstract class AttendeesTable implements BaseColumns {
        public static final String TABLE_NAME = "Attendees";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_NAME = "districtName";
        public static final String COLUMN_TEHSIL_CODE = "districtCode";
        public static final String COLUMN_TEHSIL_NAME = "districtName";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_HF_NAME = "hfName";
        public static final String COLUMN_LHW_CODE = "lhwCode";
        public static final String COLUMN_LHW_NAME = "lhwName";
        public static final String COLUMN_SESSION_TYPE = "sessionType";
        public static final String COLUMN_SV3 = "sV3";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }


    public static abstract class WSGTable implements BaseColumns {
        public static final String TABLE_NAME = "WSG";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_NAME = "districtName";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_HF_NAME = "hfName";
        public static final String COLUMN_REPORTING_MONTH = "reportingMonth";
        public static final String COLUMN_REPORTING_YEAR = "reportingYear";
        public static final String COLUMN_SWS2 = "sWS2";
        public static final String COLUMN_SWS3 = "sWS3";
        public static final String COLUMN_SWS4 = "sWS4";
        public static final String COLUMN_SWS5 = "sWS5";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }


    public static abstract class UsersTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "password";
        public static final String COLUMN_FULLNAME = "full_name";

    }

    public static abstract class TableDistricts implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "district";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_DISTRICT_NAME = "district";
        public static final String COLUMN_DISTRICT_CODE = "dist_id";

    }

    public static abstract class TableTehsil implements BaseColumns {

        public static final String TABLE_NAME = "tehsil";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_id";
        public static final String COLUMN_TEHSIL_NAME = "tehsil";
        public static final String COLUMN_DIST_ID = "dist_id";


    }


    public static abstract class RandomTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "rand_hh";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_CLUSTER_NO = "cluster_no";
        public static final String COLUMN_HEAD_HH = "head_hh";
        public static final String COLUMN_HH_NO = "hh_no";

    }

    public static abstract class VersionTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "versionApp";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_VERSION_PATH = "elements";
        public static final String COLUMN_VERSION_CODE = "versionCode";
        public static final String COLUMN_VERSION_NAME = "versionName";
        public static final String COLUMN_PATH_NAME = "outputFile";
        public static final String SERVER_URI = "output-metadata.json";

    }

}
