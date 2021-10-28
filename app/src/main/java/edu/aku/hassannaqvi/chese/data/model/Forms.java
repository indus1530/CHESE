package edu.aku.hassannaqvi.chese.data.model;


import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.chese.BR;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.chese.core.MainApp;


public class Forms extends BaseObservable implements Observable {

    private final String TAG = "Forms";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String districtCode = StringUtils.EMPTY;
    private String districtName = StringUtils.EMPTY;
    private String hfCode = StringUtils.EMPTY;
    private String hfName = StringUtils.EMPTY;
    private String reportingMonth = StringUtils.EMPTY;
    private String reportingYear = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;


    // FIELD VARIABLES
    private String a101 = StringUtils.EMPTY;
    private String a102 = StringUtils.EMPTY;
    private String a103 = StringUtils.EMPTY;
    private String a104n = StringUtils.EMPTY;
    private String a104c = StringUtils.EMPTY;
    private String a105 = StringUtils.EMPTY;


    public Forms() {
        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        //setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());
    }

    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (projectName != projectName)
            this.projectName = projectName;

        //TODO: Update field in layout
        // notifyPropertyChanged(BR.layoutFieldName);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    @Bindable
    public String getUid() {
        return uid;
    }

    public Forms setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public Forms setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Forms setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public Forms setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    @Bindable
    public String getDistrictName() {
        return districtName;
    }

    public Forms setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public Forms setHfCode(String hfCode) {
        this.hfCode = hfCode;
        return this;
    }

    @Bindable
    public String getHfName() {
        return hfName;
    }

    public Forms setHfName(String hfName) {
        this.hfName = hfName;
        return this;
    }

    @Bindable
    public String getReportingMonth() {
        return reportingMonth;
    }

    public Forms setReportingMonth(String reportingMonth) {
        this.reportingMonth = reportingMonth;
        return this;
    }

    @Bindable
    public String getReportingYear() {
        return reportingYear;
    }

    public Forms setReportingYear(String reportingYear) {
        this.reportingYear = reportingYear;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Forms setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Forms setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Forms setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Forms setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public Forms setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public Forms setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public Forms setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Forms setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    @Bindable
    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
        notifyPropertyChanged(BR.a101);
    }

    @Bindable
    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
        notifyPropertyChanged(BR.a102);
    }

    @Bindable
    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
        notifyPropertyChanged(BR.a103);
    }

    @Bindable
    public String getA104n() {
        return a104n;
    }

    public void setA104n(String a104n) {
        this.a104n = a104n;
        notifyPropertyChanged(BR.a104n);
    }

    @Bindable
    public String getA104c() {
        return a104c;
    }

    public void setA104c(String a104c) {
        this.a104c = a104c;
        notifyPropertyChanged(BR.a104c);
    }

    @Bindable
    public String getA105() {
        return a105;
    }

    public void setA105(String a105) {
        this.a105 = a105;
        notifyPropertyChanged(BR.a105);
    }


    public Forms Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(FormsTable.COLUMN_ID);
        this.uid = jsonObject.getString(FormsTable.COLUMN_UID);
        this.userName = jsonObject.getString(FormsTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(FormsTable.COLUMN_SYSDATE);
        this.districtCode = jsonObject.getString(FormsTable.COLUMN_DISTRICT_CODE);
        this.districtName = jsonObject.getString(FormsTable.COLUMN_DISTRICT_NAME);
        this.hfCode = jsonObject.getString(FormsTable.COLUMN_HF_CODE);
        this.hfName = jsonObject.getString(FormsTable.COLUMN_HF_NAME);
        this.reportingMonth = jsonObject.getString(FormsTable.COLUMN_REPORTING_MONTH);
        this.reportingYear = jsonObject.getString(FormsTable.COLUMN_REPORTING_YEAR);
        this.deviceId = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(FormsTable.COLUMN_APPVERSION);
        this.endTime = jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(FormsTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);

        this.a101 = jsonObject.getString(FormsTable.COLUMN_A101);
        this.a102 = jsonObject.getString(FormsTable.COLUMN_A102);
        this.a103 = jsonObject.getString(FormsTable.COLUMN_A103);
        this.a104n = jsonObject.getString(FormsTable.COLUMN_A104N);
        this.a104c = jsonObject.getString(FormsTable.COLUMN_A104C);
        this.a105 = jsonObject.getString(FormsTable.COLUMN_A105);

        return this;

    }


    public Forms Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYSDATE));
        this.districtCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT_CODE));
        this.districtName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT_NAME));
        this.hfCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF_CODE));
        this.hfName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF_NAME));
        this.reportingMonth = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_REPORTING_MONTH));
        this.reportingYear = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_REPORTING_YEAR));
        this.deviceId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));
        this.endTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));

        this.a101 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A101));
        this.a102 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A102));
        this.a103 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A103));
        this.a104n = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A104N));
        this.a104c = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A104C));
        this.a105 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A105));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Forms.class);
    }


    public JSONObject toJSONObject() {
        JSONObject json = new JSONObject();
        try {
            json.put(FormsTable.COLUMN_ID, this.id);
            json.put(FormsTable.COLUMN_UID, this.uid);
            json.put(FormsTable.COLUMN_USERNAME, this.userName);
            json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
            json.put(FormsTable.COLUMN_DISTRICT_CODE, this.districtCode);
            json.put(FormsTable.COLUMN_DISTRICT_NAME, this.districtName);
            json.put(FormsTable.COLUMN_HF_CODE, this.hfCode);
            json.put(FormsTable.COLUMN_HF_NAME, this.hfName);
            json.put(FormsTable.COLUMN_REPORTING_MONTH, this.reportingMonth);
            json.put(FormsTable.COLUMN_REPORTING_YEAR, this.reportingYear);
            json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
            json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(FormsTable.COLUMN_APPVERSION, this.appver);
            json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endTime);
            json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
            json.put(FormsTable.COLUMN_ISTATUS96x, this.iStatus96x);
            json.put(FormsTable.COLUMN_SYNCED, this.synced);
            json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(FormsTable.COLUMN_A101, this.a101);
            json.put(FormsTable.COLUMN_A102, this.a102);
            json.put(FormsTable.COLUMN_A103, this.a103);
            json.put(FormsTable.COLUMN_A104N, this.a104n);
            json.put(FormsTable.COLUMN_A104C, this.a104c);
            json.put(FormsTable.COLUMN_A105, this.a105);
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


}
