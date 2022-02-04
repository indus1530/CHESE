package edu.aku.hassannaqvi.chese.database;

import static edu.aku.hassannaqvi.chese.core.MainApp.IBAHC;
import static edu.aku.hassannaqvi.chese.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.chese.core.UserAuth.checkPassword;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.util.Log;
import android.widget.Toast;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import edu.aku.hassannaqvi.chese.contracts.TableContracts;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.AttendeesTable;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.VHCFormTable;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.WSGFormTable;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.Attendees;
import edu.aku.hassannaqvi.chese.data.model.EntryLog;
import edu.aku.hassannaqvi.chese.data.model.Users;
import edu.aku.hassannaqvi.chese.data.model.VHCForm;
import edu.aku.hassannaqvi.chese.data.model.WSGForm;
import edu.aku.hassannaqvi.chese.models.Districts;
import edu.aku.hassannaqvi.chese.models.HealthFacilities;
import edu.aku.hassannaqvi.chese.models.LHW;
import edu.aku.hassannaqvi.chese.models.VersionApp;
import edu.aku.hassannaqvi.chese.models.VersionApp.VersionAppTable;


/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    private final String TAG = "DatabaseHelper";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_PASSWORD = IBAHC;
    private final Context mContext;

    public DatabaseHelper(Context context) {
        super(context, CreateSQL.DATABASE_NAME, null, CreateSQL.DATABASE_VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateSQL.SQL_CREATE_USERS);
        db.execSQL(CreateSQL.SQL_CREATE_DISTRICTS);
        db.execSQL(CreateSQL.SQL_CREATE_ENTRYLOGS);
        db.execSQL(CreateSQL.SQL_CREATE_VHCFORM);
        db.execSQL(CreateSQL.SQL_CREATE_WSGFORM);
        db.execSQL(CreateSQL.SQL_CREATE_ATTENDEES);
        db.execSQL(CreateSQL.SQL_CREATE_VERSIONAPP);
        db.execSQL(CreateSQL.SQL_CREATE_HEALTH_FACILITIES);
        db.execSQL(CreateSQL.SQL_CREATE_LHW);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }


    /*Addition in DB*/
    public Long addVHCForm(VHCForm vhcForm) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(VHCFormTable.COLUMN_PROJECT_NAME, vhcForm.getProjectName());
        values.put(VHCFormTable.COLUMN_UID, vhcForm.getUid());
        values.put(VHCFormTable.COLUMN_USERNAME, vhcForm.getUserName());
        values.put(VHCFormTable.COLUMN_SYSDATE, vhcForm.getSysDate());
        values.put(VHCFormTable.COLUMN_DISTRICT_CODE, vhcForm.getDistrictCode());
        values.put(VHCFormTable.COLUMN_DISTRICT_NAME, vhcForm.getDistrictName());
        values.put(VHCFormTable.COLUMN_TEHSIL_CODE, vhcForm.getTehsilCode());
        values.put(VHCFormTable.COLUMN_TEHSIL_NAME, vhcForm.getTehsilName());
        values.put(VHCFormTable.COLUMN_HF_CODE, vhcForm.getHfCode());
        values.put(VHCFormTable.COLUMN_HF_NAME, vhcForm.getHfName());
        values.put(VHCFormTable.COLUMN_LHW_CODE, vhcForm.getLhwCode());
        values.put(VHCFormTable.COLUMN_LHW_NAME, vhcForm.getLhwName());
        values.put(VHCFormTable.COLUMN_LHW_SUPERVISOR, vhcForm.getLhwSupervisor());
        values.put(VHCFormTable.COLUMN_SV2, vhcForm.sV2toString());
        values.put(VHCFormTable.COLUMN_SV4, vhcForm.sV4toString());
        values.put(VHCFormTable.COLUMN_ISTATUS, vhcForm.getiStatus());
        values.put(VHCFormTable.COLUMN_ISTATUS96x, vhcForm.getiStatus96x());
        values.put(VHCFormTable.COLUMN_ENDINGDATETIME, vhcForm.getEndTime());
        values.put(VHCFormTable.COLUMN_DEVICETAGID, vhcForm.getDeviceTag());
        values.put(VHCFormTable.COLUMN_DEVICEID, vhcForm.getDeviceId());
        values.put(VHCFormTable.COLUMN_APPVERSION, vhcForm.getAppver());
        long newRowId;
        newRowId = db.insert(
                VHCFormTable.TABLE_NAME,
                VHCFormTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addWSGForm(WSGForm wsgForm) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(WSGFormTable.COLUMN_PROJECT_NAME, wsgForm.getProjectName());
        values.put(WSGFormTable.COLUMN_UID, wsgForm.getUid());
        values.put(WSGFormTable.COLUMN_USERNAME, wsgForm.getUserName());
        values.put(WSGFormTable.COLUMN_SYSDATE, wsgForm.getSysDate());
        values.put(WSGFormTable.COLUMN_DISTRICT_CODE, wsgForm.getDistrictCode());
        values.put(WSGFormTable.COLUMN_DISTRICT_NAME, wsgForm.getDistrictName());
        values.put(WSGFormTable.COLUMN_TEHSIL_CODE, wsgForm.getTehsilCode());
        values.put(WSGFormTable.COLUMN_TEHSIL_NAME, wsgForm.getTehsilName());
        values.put(WSGFormTable.COLUMN_HF_CODE, wsgForm.getHfCode());
        values.put(WSGFormTable.COLUMN_HF_NAME, wsgForm.getHfName());
        values.put(WSGFormTable.COLUMN_LHW_CODE, wsgForm.getLhwCode());
        values.put(WSGFormTable.COLUMN_LHW_NAME, wsgForm.getLhwName());
        values.put(WSGFormTable.COLUMN_LHW_SUPERVISOR, wsgForm.getLhwSupervisor());
        values.put(WSGFormTable.COLUMN_SWS2, wsgForm.sWS2toString());
        values.put(WSGFormTable.COLUMN_SWS41, wsgForm.sWS41toString());
        values.put(WSGFormTable.COLUMN_SWS42, wsgForm.sWS42toString());
        values.put(WSGFormTable.COLUMN_SWS5, wsgForm.sWS5toString());
        values.put(WSGFormTable.COLUMN_ISTATUS, wsgForm.getiStatus());
        values.put(WSGFormTable.COLUMN_ISTATUS96x, wsgForm.getiStatus96x());
        values.put(WSGFormTable.COLUMN_ENDINGDATETIME, wsgForm.getEndTime());
        values.put(WSGFormTable.COLUMN_DEVICETAGID, wsgForm.getDeviceTag());
        values.put(WSGFormTable.COLUMN_DEVICEID, wsgForm.getDeviceId());
        values.put(WSGFormTable.COLUMN_APPVERSION, wsgForm.getAppver());
        long newRowId;
        newRowId = db.insert(
                WSGFormTable.TABLE_NAME,
                WSGFormTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addEntryLog(EntryLog entryLog) throws SQLiteException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_PROJECT_NAME, entryLog.getProjectName());
        values.put(EntryLogTable.COLUMN_UUID, entryLog.getUuid());
        values.put(EntryLogTable.COLUMN_DISTRICT_CODE, entryLog.getDistrictCode());
        values.put(EntryLogTable.COLUMN_TEHSIL_CODE, entryLog.getTehsilCode());
        values.put(EntryLogTable.COLUMN_HF_CODE, entryLog.getHfCode());
        values.put(EntryLogTable.COLUMN_LHW_CODE, entryLog.getLhwCode());
        values.put(EntryLogTable.COLUMN_USERNAME, entryLog.getUserName());
        values.put(EntryLogTable.COLUMN_SYSDATE, entryLog.getSysDate());
        values.put(EntryLogTable.COLUMN_ISTATUS, entryLog.getiStatus());
        values.put(EntryLogTable.COLUMN_ISTATUS96x, entryLog.getiStatus96x());
        values.put(EntryLogTable.COLUMN_ENTRY_TYPE, entryLog.getEntryType());
        values.put(EntryLogTable.COLUMN_ENTRY_DATE, entryLog.getEntryDate());
        values.put(EntryLogTable.COLUMN_DEVICEID, entryLog.getDeviceId());
        values.put(EntryLogTable.COLUMN_SYNCED, entryLog.getSynced());
        values.put(EntryLogTable.COLUMN_SYNCED_DATE, entryLog.getSyncDate());
        values.put(EntryLogTable.COLUMN_APPVERSION, entryLog.getAppver());

        long newRowId;
        newRowId = db.insertOrThrow(
                EntryLogTable.TABLE_NAME,
                EntryLogTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addAttendees(Attendees atn) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(AttendeesTable.COLUMN_PROJECT_NAME, atn.getProjectName());
        values.put(AttendeesTable.COLUMN_UID, atn.getUid());
        values.put(AttendeesTable.COLUMN_UUID, atn.getUuid());
        values.put(AttendeesTable.COLUMN_USERNAME, atn.getUserName());
        values.put(AttendeesTable.COLUMN_SYSDATE, atn.getSysDate());
        values.put(AttendeesTable.COLUMN_SESSION_TYPE, atn.getSessionType());
        values.put(AttendeesTable.COLUMN_DISTRICT_CODE, atn.getDistrictCode());
        values.put(AttendeesTable.COLUMN_DISTRICT_NAME, atn.getDistrictName());
        values.put(AttendeesTable.COLUMN_TEHSIL_CODE, atn.getTehsilCode());
        values.put(AttendeesTable.COLUMN_TEHSIL_NAME, atn.getTehsilName());
        values.put(AttendeesTable.COLUMN_HF_CODE, atn.getHfCode());
        values.put(AttendeesTable.COLUMN_HF_NAME, atn.getHfName());
        values.put(AttendeesTable.COLUMN_LHW_CODE, atn.getLhwCode());
        values.put(AttendeesTable.COLUMN_LHW_NAME, atn.getLhwName());
        values.put(AttendeesTable.COLUMN_SV3, atn.sV3toString());
        values.put(AttendeesTable.COLUMN_ISTATUS, atn.getiStatus());
        values.put(AttendeesTable.COLUMN_ISTATUS96x, atn.getiStatus96x());
        values.put(AttendeesTable.COLUMN_ENDINGDATETIME, atn.getEndTime());
        values.put(AttendeesTable.COLUMN_DEVICETAGID, atn.getDeviceTag());
        values.put(AttendeesTable.COLUMN_DEVICEID, atn.getDeviceId());
        values.put(AttendeesTable.COLUMN_APPVERSION, atn.getAppver());
        long newRowId;
        newRowId = db.insert(
                AttendeesTable.TABLE_NAME,
                AttendeesTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    /*
     * Functions that dealing with table data
     * */
    public Users getLoginUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                UsersTable.COLUMN_ID,
                UsersTable.COLUMN_USERNAME,
                UsersTable.COLUMN_PASSWORD,
                UsersTable.COLUMN_FULLNAME,
                UsersTable.COLUMN_DIST_ID,
        };
        String whereClause = UsersTable.COLUMN_USERNAME + "=? AND " + UsersTable.COLUMN_PASSWORD + "=?";
        String[] whereArgs = {username, password};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users allForms = null;
        try {
            c = db.query(
                    UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allForms = new Users().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }


    public ArrayList<VHCForm> getVHCormByDate(String sysdate) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                VHCFormTable._ID,
                VHCFormTable.COLUMN_UID,
                VHCFormTable.COLUMN_SYSDATE,
                VHCFormTable.COLUMN_USERNAME,
                VHCFormTable.COLUMN_ISTATUS,
                VHCFormTable.COLUMN_ISTATUS96x,
                VHCFormTable.COLUMN_ENDINGDATETIME,
                VHCFormTable.COLUMN_SYNCED,

        };
        String whereClause = VHCFormTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = VHCFormTable.COLUMN_ID + " ASC";
        ArrayList<VHCForm> allForms = new ArrayList<>();
        try {
            c = db.query(
                    VHCFormTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                VHCForm vhcForm = new VHCForm();
                vhcForm.setId(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_ID)));
                vhcForm.setUid(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_UID)));
                vhcForm.setSysDate(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_SYSDATE)));
                vhcForm.setUserName(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_USERNAME)));
                allForms.add(vhcForm);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

/*


    public ArrayList<Districts> getAllDistricts() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = TableDistricts._ID + " ASC";
        ArrayList<Districts> all = new ArrayList<>();
        try {
            c = db.query(
                    TableDistricts.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                all.add(new Districts().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }


    public ArrayList<Tehsil> getAllTehsils() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = TableTehsil._ID + " ASC";
        ArrayList<Tehsil> all = new ArrayList<>();
        try {
            c = db.query(
                    TableTehsil.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                all.add(new Tehsil().hydrate(c));

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }


    public ArrayList<HealthFacilities> getHFByTehsil(String tehsilCode) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = HealthFacilities.TableHealthFacilities.COLUMN_TEHSIL_ID + "=?";
        String[] whereArgs = {tehsilCode};
        String groupBy = null;
        String having = null;

        String orderBy = HealthFacilities.TableHealthFacilities.COLUMN_HF_NAME + " ASC";
        ArrayList<HealthFacilities> hf =  new ArrayList<>();
        try {
            c = db.query(
                    HealthFacilities.TableHealthFacilities.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                hf.add(new HealthFacilities().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return hf;
    }
*/

    /*public ArrayList<UCs> getUCsByDistricts(String dCode) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = TableUCs.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = new String[]{dCode};
        String groupBy = null;
        String having = null;

        String orderBy = TableUCs.COLUMN_UC_CODE + " ASC";

        ArrayList<UCs> allDC = new ArrayList<>();
        try {
            c = db.query(
                    TableUCs.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                UCs dc = new UCs();
                allDC.add(dc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allDC;
    }*/

    public VHCForm getFormByClusterHH(String distCode, String subAreaCode, String hh) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = VHCFormTable.COLUMN_HF_CODE + "=? AND " +
                VHCFormTable.COLUMN_DISTRICT_CODE + "=? AND " +
                VHCFormTable.COLUMN_TEHSIL_CODE + "=? AND " +
                VHCFormTable.COLUMN_HF_CODE + "=? AND " +
                VHCFormTable.COLUMN_LHW_CODE + "=? AND " +
                VHCFormTable.COLUMN_SYNCED + " is null AND " +
                VHCFormTable.COLUMN_ISTATUS + "=?";

        String[] whereArgs = {distCode, subAreaCode, hh, "2"};

        String groupBy = null;
        String having = null;

        String orderBy = VHCFormTable.COLUMN_ID + " ASC";

        VHCForm allFC = null;
        try {
            c = db.query(
                    VHCFormTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC = new VHCForm().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    public int updatesVHCFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = VHCFormTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.vhcForm.getId())};

        return db.update(VHCFormTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesWSGFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = WSGFormTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.wsgForm.getId())};

        return db.update(WSGFormTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesEntryLogColumn(String column, String value, String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = EntryLogTable._ID + " =? ";
        String[] selectionArgs = {id};

        return db.update(EntryLogTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesAtenColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = AttendeesTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.attendees.getId())};

        return db.update(AttendeesTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updateVHCEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(VHCFormTable.COLUMN_ISTATUS, MainApp.vhcForm.getiStatus());
        //values.put(VHCFormTable.COLUMN_ISTATUS, MainApp.form.getHh26());
        values.put(VHCFormTable.COLUMN_ISTATUS96x, MainApp.vhcForm.getiStatus96x());
        values.put(VHCFormTable.COLUMN_ENDINGDATETIME, MainApp.vhcForm.getEndTime());

        // Which row to update, based on the ID
        String selection = VHCFormTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.vhcForm.getId())};

        return db.update(VHCFormTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updateWSGEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(WSGFormTable.COLUMN_ISTATUS, MainApp.wsgForm.getiStatus());
        //values.put(VHCFormTable.COLUMN_ISTATUS, MainApp.form.getHh26());
        values.put(WSGFormTable.COLUMN_ISTATUS96x, MainApp.wsgForm.getiStatus96x());
        values.put(WSGFormTable.COLUMN_ENDINGDATETIME, MainApp.wsgForm.getEndTime());

        // Which row to update, based on the ID
        String selection = WSGFormTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.wsgForm.getId())};

        return db.update(WSGFormTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    /*
     * Download data functions
     * */
    /*public int syncDistricts(JSONArray Districtslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Districts.TableDistricts.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < Districtslist.length(); i++) {
                JSONObject jsonObjectDistrict = Districtslist.getJSONObject(i);
                Districts District = new Districts();
                District.sync(jsonObjectDistrict);
                ContentValues values = new ContentValues();

                values.put(TableDistricts.COLUMN_DISTRICT_CODE, District.getDistrictCode());
                values.put(TableDistricts.COLUMN_DISTRICT_NAME, District.getDistrictName());
                long rowID = db.insert(TableDistricts.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncDistrict(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }*/

    /*public int syncUCs(JSONArray ucList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableUCs.TABLE_NAME, null, null);
        int insertCount = 0;
        try {

            for (int i = 0; i < ucList.length(); i++) {
                JSONObject jsonObjectUc = ucList.getJSONObject(i);
                UCs uc = new UCs();
                uc.sync(jsonObjectUc);
                ContentValues values = new ContentValues();

                values.put(TableUCs.COLUMN_UC_CODE, uc.getUcCode());
                values.put(TableUCs.COLUMN_UC_NAME, uc.getUcName());
                values.put(TableUCs.COLUMN_DISTRICT_CODE, uc.getDistrictCode());

                long rowID = db.insert(TableUCs.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }
            db.close();

        } catch (Exception e) {
            Log.d(TAG, "syncUc(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }*/


    public int syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(VersionAppTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionAppTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionAppTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionAppTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionAppTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionAppTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }


    public int syncUser(JSONArray userList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableContracts.UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < userList.length(); i++) {

            JSONObject jsonObjectUser = userList.getJSONObject(i);

            Users user = new Users();
            user.sync(jsonObjectUser);
            ContentValues values = new ContentValues();

            values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
            values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
            values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
            values.put(UsersTable.COLUMN_ENABLED, user.getEnabled());
            values.put(UsersTable.COLUMN_ISNEW_USER, user.getNewUser());
            values.put(UsersTable.COLUMN_PWD_EXPIRY, user.getPwdExpiry());
            values.put(UsersTable.COLUMN_DESIGNATION, user.getDesignation());
            values.put(UsersTable.COLUMN_DIST_ID, user.getDist_id());
            long rowID = db.insert(TableContracts.UsersTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }


        db.close();
        return insertCount;
    }


    //    Sync Districts
    public int syncDistricts(JSONArray districtsList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(Districts.TableDistricts.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < districtsList.length(); i++) {
            JSONObject json = districtsList.getJSONObject(i);
            Districts districts = new Districts();
            districts.sync(json);
            ContentValues values = new ContentValues();

            values.put(Districts.TableDistricts.COLUMN_PROVINCE_CODE, districts.getProvinceCode());
            values.put(Districts.TableDistricts.COLUMN_PROVINCE_NAME, districts.getProvinceName());
            values.put(Districts.TableDistricts.COLUMN_DISTRICT_CODE, districts.getDistrictCode());
            values.put(Districts.TableDistricts.COLUMN_DISTRICT_NAME, districts.getDistrictName());

            long rowID = db.insert(Districts.TableDistricts.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        db.close();
        return insertCount;
    }

    //    Sync HealthFacilities
    public int syncHealthFacilities(JSONArray healthFacilitiesList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(HealthFacilities.TableHealthFacilities.TABLE_NAME, null, null);
        int insertCount = 0;
        try {

            for (int i = 0; i < healthFacilitiesList.length(); i++) {
                JSONObject json = healthFacilitiesList.getJSONObject(i);
                HealthFacilities healthFacilities = new HealthFacilities();
                healthFacilities.sync(json);
                ContentValues values = new ContentValues();

                values.put(HealthFacilities.TableHealthFacilities.COLUMN_HF_NAME, healthFacilities.getHf_name());
                values.put(HealthFacilities.TableHealthFacilities.COLUMN_HF_CODE, healthFacilities.getHfcode());
                values.put(HealthFacilities.TableHealthFacilities.COLUMN_TEHSIL_ID, healthFacilities.getTehsilId());
                values.put(HealthFacilities.TableHealthFacilities.COLUMN_DISTRICT_CODE, healthFacilities.getDist_id());
                values.put(HealthFacilities.TableHealthFacilities.COLUMN_UC_ID, healthFacilities.getUc_Id());

                long rowID = db.insert(HealthFacilities.TableHealthFacilities.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }
            db.close();

        } catch (Exception e) {
            Log.d(TAG, "syncHF(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    //    Sync LHW
    public int syncLHW(JSONArray lhwList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(LHW.LHWTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < lhwList.length(); i++) {
            JSONObject json = lhwList.getJSONObject(i);
            LHW lhw = new LHW();
            lhw.sync(json);
            ContentValues values = new ContentValues();

            values.put(LHW.LHWTable.COLUMN_DISTRICT_CODE, lhw.getDistrict_code());
            values.put(LHW.LHWTable.COLUMN_TEHSIL_CODE, lhw.getTehsil_code());
            values.put(LHW.LHWTable.COLUMN_TEHSIL_NAME, lhw.getTehsil_name());
            values.put(LHW.LHWTable.COLUMN_UC_CODE, lhw.getUc_code());
            values.put(LHW.LHWTable.COLUMN_UC_NAME, lhw.getUc_name());
            values.put(LHW.LHWTable.COLUMN_HF_CODE, lhw.getHf_code());
            values.put(LHW.LHWTable.COLUMN_HF_NAME, lhw.getHf_name());
            values.put(LHW.LHWTable.COLUMN_LHW_CODE, lhw.getLhw_code());
            values.put(LHW.LHWTable.COLUMN_LHW_NAME, lhw.getLhw_name());
            values.put(LHW.LHWTable.COLUMN_LHW_CNIC, lhw.getLhw_cnic());
            values.put(LHW.LHWTable.COLUMN_LHW_SUPERVISOR, lhw.getLhw_supervisor());

            long rowID = db.insert(LHW.LHWTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
            db.close();
        return insertCount;
    }


    //get UnSyncedTables
    public JSONArray getUnsyncedVHCForm() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = VHCFormTable.COLUMN_SYNCED + " is null AND "
                + VHCFormTable.COLUMN_ISTATUS + "= '1' ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = VHCFormTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        c = db.query(
                VHCFormTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedVHCForm: " + c.getCount());
            VHCForm vhcForm = new VHCForm();
            allForms.put(vhcForm.Hydrate(c).toJSONObject());
        }
        c.close();
        db.close();

        Log.d(TAG, "getUnsyncedVHCForms: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedVHCForms: " + allForms);
        return allForms;
    }

    public JSONArray getUnsyncedWSGForm() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = WSGFormTable.COLUMN_SYNCED + " is null AND "
                + WSGFormTable.COLUMN_ISTATUS + "= '1' ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = WSGFormTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        c = db.query(
                WSGFormTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedWSGForm: " + c.getCount());
            WSGForm wsgForm = new WSGForm();
            allForms.put(wsgForm.Hydrate(c).toJSONObject());
        }
        c.close();
        db.close();
        Log.d(TAG, "getUnsyncedWSGForm: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedWSGForm: " + allForms);
        return allForms;
    }

    public JSONArray getUnsyncedAttendees() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = AttendeesTable.COLUMN_SYNCED + " is null AND "
                + AttendeesTable.COLUMN_ISTATUS + "= '1' ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = AttendeesTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();

        c = db.query(
                AttendeesTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedAttendees: " + c.getCount());
            Attendees atn = new Attendees();
            allForms.put(atn.Hydrate(c).toJSONObject());
        }
        c.close();
        db.close();

        Log.d(TAG, "getUnsyncedAttendees: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedAttendees: " + allForms);
        return allForms;
    }

    public JSONArray getUnsyncedEntryLog() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = EntryLogTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = EntryLogTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                EntryLogTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEntryLog: " + c.getCount());
            EntryLog entryLog = new EntryLog();
            all.put(entryLog.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEntryLog: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEntryLog: " + all);
        return all;
    }


    //updateSyncedTables
    public void updateSyncedVHCForm(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(VHCFormTable.COLUMN_SYNCED, true);
        values.put(VHCFormTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = VHCFormTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                VHCFormTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedWSGForm(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(WSGFormTable.COLUMN_SYNCED, true);
        values.put(WSGFormTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = WSGFormTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                WSGFormTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedEntryLog(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_SYNCED, true);
        values.put(EntryLogTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = EntryLogTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                EntryLogTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedAttendees(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(AttendeesTable.COLUMN_SYNCED, true);
        values.put(AttendeesTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = AttendeesTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                AttendeesTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public ArrayList<VHCForm> getUnclosedVHCForm() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                VHCFormTable._ID,
                VHCFormTable.COLUMN_UID,
                VHCFormTable.COLUMN_SYSDATE,
                VHCFormTable.COLUMN_DISTRICT_CODE,
                VHCFormTable.COLUMN_TEHSIL_CODE,
                VHCFormTable.COLUMN_HF_CODE,
                VHCFormTable.COLUMN_LHW_CODE,
                VHCFormTable.COLUMN_ISTATUS,
                VHCFormTable.COLUMN_SYNCED,
        };
        String whereClause = VHCFormTable.COLUMN_ISTATUS + " = ''";
        String[] whereArgs = null;
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;
        String orderBy = VHCFormTable.COLUMN_ID + " ASC";
        ArrayList<VHCForm> allFC = new ArrayList<>();
        try {
            c = db.query(
                    VHCFormTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                VHCForm fc = new VHCForm();
                fc.setId(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_SYSDATE)));
                fc.setDistrictCode(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_DISTRICT_CODE)));
                fc.setTehsilCode(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_TEHSIL_CODE)));
                fc.setHfCode(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_HF_CODE)));
                fc.setLhwCode(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_LHW_CODE)));
                fc.setiStatus(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndex(VHCFormTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<VHCForm> getTodayForms(String sysdate) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                VHCFormTable.COLUMN_ID,
                VHCFormTable.COLUMN_UID,
                VHCFormTable.COLUMN_SYSDATE,
/*                FormsTable.COLUMN_MH02,
                FormsTable.COLUMN_MH06,
                FormsTable.COLUMN_MH07,
                FormsTable.COLUMN_SA,*/
                VHCFormTable.COLUMN_SYNCED,


        };
        String whereClause = VHCFormTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = VHCFormTable.COLUMN_ID + " DESC";

        Collection<VHCForm> allFC = new ArrayList<>();
        try {
            c = db.query(
                    VHCFormTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                VHCForm fc = new VHCForm();
             /*   fc.setId(c.getString(c.getColumnIndex(MHTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndex(MHTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndex(MHTable.COLUMN_SYSDATE)));
                fc.setMh02(c.getString(c.getColumnIndex(MHTable.COLUMN_MH02)));
                fc.setMh06(c.getString(c.getColumnIndex(MHTable.COLUMN_MH06)));
                fc.setMh07(c.getString(c.getColumnIndex(MHTable.COLUMN_MH07)));
                fc.sAHydrate(c.getString(c.getColumnIndex(MHTable.COLUMN_SA)));
                fc.setSynced(c.getString(c.getColumnIndex(MHTable.COLUMN_SYNCED)));*/
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    public ArrayList<Districts> getAllDistricts() {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = Districts.TableDistricts._ID + " ASC";
        ArrayList<Districts> all = new ArrayList<>();
        try {
            c = db.query(
                    Districts.TableDistricts.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                all.add(new Districts().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public ArrayList<Districts> getDistrictsByUser(String distid) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = Districts.TableDistricts.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = {distid};
        String groupBy = null;
        String having = null;

        String orderBy = Districts.TableDistricts._ID + " ASC";
        ArrayList<Districts> all = new ArrayList<>();
        try {
            c = db.query(
                    Districts.TableDistricts.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                all.add(new Districts().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public ArrayList<HealthFacilities> getHfByDist(String distid) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = HealthFacilities.TableHealthFacilities.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = {distid};
        String groupBy = null;
        String having = null;

        String orderBy = HealthFacilities.TableHealthFacilities.COLUMN_HF_NAME + " ASC";

        ArrayList<HealthFacilities> hf = new ArrayList<>();
        try {
            c = db.query(
                    HealthFacilities.TableHealthFacilities.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                hf.add(new HealthFacilities().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return hf;
    }

    public ArrayList<LHW> getTehsilByDist(String distid) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {"DISTINCT " +
                LHW.LHWTable.COLUMN_TEHSIL_CODE,
                LHW.LHWTable.COLUMN_TEHSIL_NAME
        };

        String whereClause = LHW.LHWTable.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = {distid};
        String groupBy = null;
        String having = null;

        String orderBy = LHW.LHWTable.COLUMN_TEHSIL_NAME + " ASC";

        ArrayList<LHW> lhw = new ArrayList<>();
        try {
            c = db.query(
                    LHW.LHWTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                lhw.add(new LHW().hydrateTehsil(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return lhw;
    }

    public ArrayList<LHW> getUcByTehil(String teh) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {"DISTINCT " +
                LHW.LHWTable.COLUMN_UC_CODE,
                LHW.LHWTable.COLUMN_UC_NAME
        };

        String whereClause = LHW.LHWTable.COLUMN_TEHSIL_CODE + "=?";
        String[] whereArgs = {teh};
        String groupBy = null;
        String having = null;

        String orderBy = LHW.LHWTable.COLUMN_UC_NAME + " ASC";

        ArrayList<LHW> lhw = new ArrayList<>();
        try {
            c = db.query(
                    LHW.LHWTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                lhw.add(new LHW().hydrateUC(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return lhw;
    }

    public ArrayList<LHW> getHfByUc(String uc) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {"DISTINCT " +
                LHW.LHWTable.COLUMN_HF_CODE,
                LHW.LHWTable.COLUMN_HF_NAME
        };

        String whereClause = LHW.LHWTable.COLUMN_UC_CODE + "=?";
        String[] whereArgs = {uc};
        String groupBy = null;
        String having = null;

        String orderBy = LHW.LHWTable.COLUMN_HF_NAME + " ASC";

        ArrayList<LHW> lhw = new ArrayList<>();
        try {
            c = db.query(
                    LHW.LHWTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                lhw.add(new LHW().hydrateHF(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return lhw;
    }

    public ArrayList<LHW> getHfByTehsil(String tehsil) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {"DISTINCT " +
                LHW.LHWTable.COLUMN_HF_CODE,
                LHW.LHWTable.COLUMN_HF_NAME
        };

        String whereClause = LHW.LHWTable.COLUMN_TEHSIL_CODE + "=?";
        String[] whereArgs = {tehsil};
        String groupBy = null;
        String having = null;

        String orderBy = LHW.LHWTable.COLUMN_HF_NAME + " ASC";

        ArrayList<LHW> lhw = new ArrayList<>();
        try {
            c = db.query(
                    LHW.LHWTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                lhw.add(new LHW().hydrateHF(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return lhw;
    }

    public ArrayList<LHW> getLhwByHf(String hf) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {"DISTINCT " +
                LHW.LHWTable.COLUMN_LHW_CODE,
                LHW.LHWTable.COLUMN_LHW_NAME,
                LHW.LHWTable.COLUMN_LHW_SUPERVISOR
        };

        String whereClause = LHW.LHWTable.COLUMN_HF_CODE + "=?";
        String[] whereArgs = {hf};
        String groupBy = null;
        String having = null;

        String orderBy = LHW.LHWTable.COLUMN_LHW_NAME + " ASC";

        ArrayList<LHW> lhw = new ArrayList<>();
        try {
            c = db.query(
                    LHW.LHWTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                lhw.add(new LHW().hydrateLHW(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return lhw;
    }


    //Functions that dealing with table data
    //Functions that dealing with table data
    public boolean doLogin(String username, String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = UsersTable.COLUMN_USERNAME + "=? ";
        String[] whereArgs = {username};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = new Users();
        c = db.query(
                UsersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            loggedInUser = new Users().hydrate(c);

        }

        c.close();

        db.close();
        if (loggedInUser.getPassword().equals("")) {
            Toast.makeText(mContext, "Stored password is invalid", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (checkPassword(password, loggedInUser.getPassword())) {
            MainApp.user = loggedInUser;
            //  MainApp.selectedDistrict = loggedInUser.getDist_id();
            return c.getCount() > 0;
        } else {
            return false;
        }
    }

    public VHCForm getVHCFormByHF(String hfCode, String rMonth) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause =
                VHCFormTable.COLUMN_HF_CODE + "=? AND " +
                        VHCFormTable.COLUMN_TEHSIL_CODE + "=?";

        String[] whereArgs = {hfCode, rMonth};

        String groupBy = null;
        String having = null;

        String orderBy = VHCFormTable.COLUMN_ID + " ASC";

        VHCForm allFC = null;
        try {
            c = db.query(
                    VHCFormTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC = new VHCForm().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;


    }


    public int updatePassword(String hashedPassword) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(UsersTable.COLUMN_PASSWORD, hashedPassword);
        values.put(UsersTable.COLUMN_ISNEW_USER, "");

        String selection = UsersTable.COLUMN_USERNAME + " =? ";
        String[] selectionArgs = {MainApp.user.getUserName()};

        return db.update(UsersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }
}