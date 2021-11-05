package edu.aku.hassannaqvi.chese.database

import edu.aku.hassannaqvi.chese.contracts.TableContracts.*
import edu.aku.hassannaqvi.chese.core.MainApp.PROJECT_NAME
import edu.aku.hassannaqvi.chese.models.*

object CreateSQL {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1


    const val SQL_CREATE_VHCFORM = ("CREATE TABLE "
            + VHCFormTable.TABLE_NAME + "("
            + VHCFormTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VHCFormTable.COLUMN_PROJECT_NAME + " TEXT,"
            + VHCFormTable.COLUMN_UID + " TEXT,"
            + VHCFormTable.COLUMN_USERNAME + " TEXT,"
            + VHCFormTable.COLUMN_SYSDATE + " TEXT,"
            + VHCFormTable.COLUMN_ISTATUS + " TEXT,"
            + VHCFormTable.COLUMN_ISTATUS96x + " TEXT,"
            + VHCFormTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + VHCFormTable.COLUMN_DEVICEID + " TEXT,"
            + VHCFormTable.COLUMN_DEVICETAGID + " TEXT,"
            + VHCFormTable.COLUMN_SYNCED + " TEXT,"
            + VHCFormTable.COLUMN_SYNCED_DATE + " TEXT,"
            + VHCFormTable.COLUMN_APPVERSION + " TEXT,"
            + VHCFormTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + VHCFormTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + VHCFormTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + VHCFormTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + VHCFormTable.COLUMN_HF_CODE + " TEXT,"
            + VHCFormTable.COLUMN_HF_NAME + " TEXT,"
            + VHCFormTable.COLUMN_LHW_CODE + " TEXT,"
            + VHCFormTable.COLUMN_LHW_NAME + " TEXT,"
            + VHCFormTable.COLUMN_LHW_SUPERVISOR + " TEXT,"
            + VHCFormTable.COLUMN_SV2 + " TEXT,"
            + VHCFormTable.COLUMN_SV4 + " TEXT"
            + " );")

    const val SQL_CREATE_WSGFORM = ("CREATE TABLE "
            + WSGFormTable.TABLE_NAME + "("
            + WSGFormTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + WSGFormTable.COLUMN_PROJECT_NAME + " TEXT,"
            + WSGFormTable.COLUMN_UID + " TEXT,"
            + WSGFormTable.COLUMN_USERNAME + " TEXT,"
            + WSGFormTable.COLUMN_SYSDATE + " TEXT,"
            + WSGFormTable.COLUMN_ISTATUS + " TEXT,"
            + WSGFormTable.COLUMN_ISTATUS96x + " TEXT,"
            + WSGFormTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + WSGFormTable.COLUMN_DEVICEID + " TEXT,"
            + WSGFormTable.COLUMN_DEVICETAGID + " TEXT,"
            + WSGFormTable.COLUMN_SYNCED + " TEXT,"
            + WSGFormTable.COLUMN_SYNCED_DATE + " TEXT,"
            + WSGFormTable.COLUMN_APPVERSION + " TEXT,"
            + WSGFormTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + WSGFormTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + WSGFormTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + WSGFormTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + WSGFormTable.COLUMN_HF_CODE + " TEXT,"
            + WSGFormTable.COLUMN_HF_NAME + " TEXT,"
            + WSGFormTable.COLUMN_LHW_CODE + " TEXT,"
            + WSGFormTable.COLUMN_LHW_NAME + " TEXT,"
            + WSGFormTable.COLUMN_LHW_SUPERVISOR + " TEXT,"
            + WSGFormTable.COLUMN_SWS2 + " TEXT,"
            + WSGFormTable.COLUMN_SWS41 + " TEXT,"
            + WSGFormTable.COLUMN_SWS42 + " TEXT,"
            + WSGFormTable.COLUMN_SWS5 + " TEXT"
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