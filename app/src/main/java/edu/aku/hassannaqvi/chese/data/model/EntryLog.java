package edu.aku.hassannaqvi.chese.data.model;


import static edu.aku.hassannaqvi.chese.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.chese.core.MainApp._EMPTY_;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.chese.BR;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.chese.core.MainApp;


public class EntryLog extends BaseObservable implements Observable {

    private final String TAG = "EntryLog";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String entryDate = _EMPTY_;         //
    private String districtCode = _EMPTY_;
    private String tehsilCode = _EMPTY_;
    private String hfCode = _EMPTY_;
    private String lhwCode = _EMPTY_;
    private String appver = _EMPTY_;            //
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;        //
    private String entryType = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    public EntryLog() {
    }


    public void populateMeta(String type) {

        setProjectName(PROJECT_NAME);
        setUserName(MainApp.user.getUserName());
        setEntryDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setAppver(MainApp.appInfo.getAppVersion());
        setDeviceId(MainApp.deviceid);

        if (type.equals("VHC")) {
            setUuid(MainApp.vhcForm.getUid());  // not applicable in Form table
            setSysDate(MainApp.vhcForm.getSysDate());
            setDistrictCode(MainApp.vhcForm.getDistrictCode());
            setTehsilCode(MainApp.vhcForm.getTehsilCode());
            setHfCode(MainApp.vhcForm.getHfCode());
            setLhwCode(MainApp.vhcForm.getLhwCode());
            setiStatus(MainApp.vhcForm.getiStatus());
            setiStatus96x(MainApp.vhcForm.getiStatus96x());
            setEntryType(type);
        } else {
            setUuid(MainApp.wsgForm.getUid());  // not applicable in Form table
            setSysDate(MainApp.wsgForm.getSysDate());
            setDistrictCode(MainApp.wsgForm.getDistrictCode());
            setTehsilCode(MainApp.wsgForm.getTehsilCode());
            setHfCode(MainApp.wsgForm.getHfCode());
            setLhwCode(MainApp.wsgForm.getLhwCode());
            setiStatus(MainApp.wsgForm.getiStatus());
            setiStatus96x(MainApp.wsgForm.getiStatus96x());
            setEntryType(type);
        }

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        notifyPropertyChanged(BR.districtCode);
    }

    @Bindable
    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
        notifyPropertyChanged(BR.tehsilCode);
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public void setHfCode(String hfCode) {
        this.hfCode = hfCode;
        notifyPropertyChanged(BR.hfCode);
    }

    @Bindable
    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
        notifyPropertyChanged(BR.lhwCode);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }
/*

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }
*/

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public EntryLog Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_PROJECT_NAME));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_TEHSIL_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_HF_CODE));
        this.lhwCode = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_LHW_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYSDATE));
        this.entryDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ENTRY_DATE));
        this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ENTRY_TYPE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_DEVICEID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYNCED_DATE));

        return this;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(EntryLogTable.COLUMN_ID, this.id);
        json.put(EntryLogTable.COLUMN_UID, this.uid);
        json.put(EntryLogTable.COLUMN_UUID, this.uuid);
        json.put(EntryLogTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(EntryLogTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(EntryLogTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(EntryLogTable.COLUMN_HF_CODE, this.hfCode);
        json.put(EntryLogTable.COLUMN_LHW_CODE, this.lhwCode);
        json.put(EntryLogTable.COLUMN_USERNAME, this.userName);
        json.put(EntryLogTable.COLUMN_SYSDATE, this.sysDate);
        json.put(EntryLogTable.COLUMN_ENTRY_DATE, this.entryDate);
        json.put(EntryLogTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(EntryLogTable.COLUMN_DEVICEID, this.deviceId);
        json.put(EntryLogTable.COLUMN_ISTATUS, this.iStatus);
        json.put(EntryLogTable.COLUMN_ISTATUS96x, this.iStatus96x);
        json.put(EntryLogTable.COLUMN_SYNCED, this.synced);
        json.put(EntryLogTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(EntryLogTable.COLUMN_APPVERSION, this.appver);
        return json;
    }


}
