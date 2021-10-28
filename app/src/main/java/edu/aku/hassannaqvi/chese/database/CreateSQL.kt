package edu.aku.hassannaqvi.chese.database

import edu.aku.hassannaqvi.chese.core.MainApp.PROJECT_NAME
import edu.aku.hassannaqvi.chese.data.model.Forms
import edu.aku.hassannaqvi.chese.models.Districts
import edu.aku.hassannaqvi.chese.models.HealthFacilities
import edu.aku.hassannaqvi.chese.models.Users
import edu.aku.hassannaqvi.chese.models.VersionApp

object CreateSQL {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + Forms.FormsTable.TABLE_NAME + "("
            + Forms.FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Forms.FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + Forms.FormsTable.COLUMN_UID + " TEXT,"
            + Forms.FormsTable.COLUMN_USERNAME + " TEXT,"
            + Forms.FormsTable.COLUMN_SYSDATE + " TEXT,"
            + Forms.FormsTable.COLUMN_ISTATUS + " TEXT,"
            + Forms.FormsTable.COLUMN_ISTATUS96x + " TEXT,"
            + Forms.FormsTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + Forms.FormsTable.COLUMN_DEVICEID + " TEXT,"
            + Forms.FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + Forms.FormsTable.COLUMN_SYNCED + " TEXT,"
            + Forms.FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + Forms.FormsTable.COLUMN_APPVERSION + " TEXT,"
            + Forms.FormsTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + Forms.FormsTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + Forms.FormsTable.COLUMN_HF_CODE + " TEXT,"
            + Forms.FormsTable.COLUMN_HF_NAME + " TEXT,"
            + Forms.FormsTable.COLUMN_REPORTING_MONTH + " TEXT,"
            + Forms.FormsTable.COLUMN_REPORTING_YEAR + " TEXT,"
            + Forms.FormsTable.COLUMN_SV2 + " TEXT,"
            + Forms.FormsTable.COLUMN_SV3 + " TEXT,"
            + Forms.FormsTable.COLUMN_SV4 + " TEXT,"
            + Forms.FormsTable.COLUMN_SD + " TEXT,"
            + Forms.FormsTable.COLUMN_SE + " TEXT,"
            + Forms.FormsTable.COLUMN_SF + " TEXT,"
            + Forms.FormsTable.COLUMN_SG + " TEXT,"
            + Forms.FormsTable.COLUMN_SH + " TEXT"
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


}