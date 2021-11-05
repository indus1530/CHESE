package edu.aku.hassannaqvi.chese.database

import edu.aku.hassannaqvi.chese.contracts.TableContracts.*
import edu.aku.hassannaqvi.chese.core.MainApp.PROJECT_NAME
import edu.aku.hassannaqvi.chese.models.*

object CreateSQL {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_ISTATUS96x + " TEXT,"
            + FormsTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + FormsTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + FormsTable.COLUMN_HF_CODE + " TEXT,"
            + FormsTable.COLUMN_LHW_CODE + " TEXT,"
            + FormsTable.COLUMN_A101 + " TEXT,"
            + FormsTable.COLUMN_A102 + " TEXT,"
            + FormsTable.COLUMN_A103 + " TEXT,"
            + FormsTable.COLUMN_A104N + " TEXT,"
            + FormsTable.COLUMN_A104C + " TEXT,"
            + FormsTable.COLUMN_A105 + " TEXT"
            + " );")

    const val SQL_CREATE_VHC = ("CREATE TABLE "
            + VHCTable.TABLE_NAME + "("
            + VHCTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VHCTable.COLUMN_PROJECT_NAME + " TEXT,"
            + VHCTable.COLUMN_UID + " TEXT,"
            + VHCTable.COLUMN_USERNAME + " TEXT,"
            + VHCTable.COLUMN_SYSDATE + " TEXT,"
            + VHCTable.COLUMN_ISTATUS + " TEXT,"
            + VHCTable.COLUMN_ISTATUS96x + " TEXT,"
            + VHCTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + VHCTable.COLUMN_DEVICEID + " TEXT,"
            + VHCTable.COLUMN_DEVICETAGID + " TEXT,"
            + VHCTable.COLUMN_SYNCED + " TEXT,"
            + VHCTable.COLUMN_SYNCED_DATE + " TEXT,"
            + VHCTable.COLUMN_APPVERSION + " TEXT,"
            + VHCTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + VHCTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + VHCTable.COLUMN_HF_CODE + " TEXT,"
            + VHCTable.COLUMN_HF_NAME + " TEXT,"
            + VHCTable.COLUMN_REPORTING_MONTH + " TEXT,"
            + VHCTable.COLUMN_REPORTING_YEAR + " TEXT,"
            + VHCTable.COLUMN_SV2 + " TEXT,"
            + VHCTable.COLUMN_SV3 + " TEXT,"
            + VHCTable.COLUMN_SV4 + " TEXT"
            + " );")

    const val SQL_CREATE_WSG = ("CREATE TABLE "
            + WSGTable.TABLE_NAME + "("
            + WSGTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + WSGTable.COLUMN_PROJECT_NAME + " TEXT,"
            + WSGTable.COLUMN_UID + " TEXT,"
            + WSGTable.COLUMN_USERNAME + " TEXT,"
            + WSGTable.COLUMN_SYSDATE + " TEXT,"
            + WSGTable.COLUMN_ISTATUS + " TEXT,"
            + WSGTable.COLUMN_ISTATUS96x + " TEXT,"
            + WSGTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + WSGTable.COLUMN_DEVICEID + " TEXT,"
            + WSGTable.COLUMN_DEVICETAGID + " TEXT,"
            + WSGTable.COLUMN_SYNCED + " TEXT,"
            + WSGTable.COLUMN_SYNCED_DATE + " TEXT,"
            + WSGTable.COLUMN_APPVERSION + " TEXT,"
            + WSGTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + WSGTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + WSGTable.COLUMN_HF_CODE + " TEXT,"
            + WSGTable.COLUMN_HF_NAME + " TEXT,"
            + WSGTable.COLUMN_REPORTING_MONTH + " TEXT,"
            + WSGTable.COLUMN_REPORTING_YEAR + " TEXT,"
            + WSGTable.COLUMN_SWS2 + " TEXT,"
            + WSGTable.COLUMN_SWS3 + " TEXT,"
            + WSGTable.COLUMN_SWS4 + " TEXT,"
            + WSGTable.COLUMN_SWS5 + " TEXT"
            + " );")

    const val SQL_CREATE_ATTENDEES = ("CREATE TABLE "
            + AttendeesTable.TABLE_NAME + "("
            + AttendeesTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + AttendeesTable.COLUMN_PROJECT_NAME + " TEXT,"
            + AttendeesTable.COLUMN_UID + " TEXT,"
            + AttendeesTable.COLUMN_UUID + " TEXT,"
            + AttendeesTable.COLUMN_USERNAME + " TEXT,"
            + AttendeesTable.COLUMN_SYSDATE + " TEXT,"
            + AttendeesTable.COLUMN_ISTATUS + " TEXT,"
            + AttendeesTable.COLUMN_ISTATUS96x + " TEXT,"
            + AttendeesTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + AttendeesTable.COLUMN_DEVICEID + " TEXT,"
            + AttendeesTable.COLUMN_DEVICETAGID + " TEXT,"
            + AttendeesTable.COLUMN_SYNCED + " TEXT,"
            + AttendeesTable.COLUMN_SYNCED_DATE + " TEXT,"
            + AttendeesTable.COLUMN_APPVERSION + " TEXT,"
            + AttendeesTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + AttendeesTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + AttendeesTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + AttendeesTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + AttendeesTable.COLUMN_HF_CODE + " TEXT,"
            + AttendeesTable.COLUMN_HF_NAME + " TEXT,"
            + AttendeesTable.COLUMN_LHW_CODE + " TEXT,"
            + AttendeesTable.COLUMN_LHW_NAME + " TEXT,"
            + AttendeesTable.COLUMN_SESSION_TYPE + " TEXT,"
            + AttendeesTable.COLUMN_SV3 + " TEXT"
            + " );")


    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT,"
            + Users.UsersTable.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_CREATE_DISTRICTS = ("CREATE TABLE " + Districts.TableDistricts.TABLE_NAME + "("
            + Districts.TableDistricts.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Districts.TableDistricts.COLUMN_PROVINCE_NAME + " TEXT,"
            + Districts.TableDistricts.COLUMN_PROVINCE_CODE + " TEXT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_NAME + " TEXT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")


    const val SQL_CREATE_VERSIONAPP =
        "CREATE TABLE " + VersionApp.VersionAppTable.TABLE_NAME + " (" +
                VersionApp.VersionAppTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                VersionApp.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
                ");"

    const val SQL_CREATE_HEALTH_FACILITIES =
        ("CREATE TABLE " + HealthFacilities.TableHealthFacilities.TABLE_NAME + "("
                + HealthFacilities.TableHealthFacilities.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_HF_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_UC_ID + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_HF_NAME + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_DISTRICT_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_TEHSIL_ID + " TEXT"
                + " );")

    const val SQL_CREATE_LHW =
        ("CREATE TABLE " + LHW.LHWTable.TABLE_NAME + "("
                + LHW.LHWTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + LHW.LHWTable.COLUMN_DISTRICT_CODE + " TEXT,"
                + LHW.LHWTable.COLUMN_TEHSIL_CODE + " TEXT,"
                + LHW.LHWTable.COLUMN_TEHSIL_NAME + " TEXT,"
                + LHW.LHWTable.COLUMN_UC_CODE + " TEXT,"
                + LHW.LHWTable.COLUMN_UC_NAME + " TEXT,"
                + LHW.LHWTable.COLUMN_HF_CODE + " TEXT,"
                + LHW.LHWTable.COLUMN_HF_NAME + " TEXT,"
                + LHW.LHWTable.COLUMN_LHW_CODE + " TEXT,"
                + LHW.LHWTable.COLUMN_LHW_NAME + " TEXT,"
                + LHW.LHWTable.COLUMN_LHW_CNIC + " TEXT,"
                + LHW.LHWTable.COLUMN_LHW_SUPERVISOR + " TEXT"
                + " );")


}