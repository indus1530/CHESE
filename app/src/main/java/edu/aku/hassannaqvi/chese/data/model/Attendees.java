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

import edu.aku.hassannaqvi.chese.BR;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.AttendeesTable;
import edu.aku.hassannaqvi.chese.core.MainApp;


public class Attendees extends BaseObservable implements Observable {

    private final String TAG = "Attendees";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String sessionType = StringUtils.EMPTY;
    private String districtCode = StringUtils.EMPTY;
    private String districtName = StringUtils.EMPTY;
    private String tehsilCode = StringUtils.EMPTY;
    private String tehsilName = StringUtils.EMPTY;
    private String hfCode = StringUtils.EMPTY;
    private String hfName = StringUtils.EMPTY;
    private String lhwCode = StringUtils.EMPTY;
    private String lhwName = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;


    // SECTION VARIABLES
    private String sV3 = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String v301 = StringUtils.EMPTY;
    private String v302 = StringUtils.EMPTY;
    private String v303 = StringUtils.EMPTY;
    private String v304 = StringUtils.EMPTY;
    private String v305 = StringUtils.EMPTY;
    private String v306 = StringUtils.EMPTY;
    private String v307 = StringUtils.EMPTY;
    private String v308 = StringUtils.EMPTY;


    public Attendees() {
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

    public Attendees setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUuid() {
        return uuid;
    }

    public Attendees setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public Attendees setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Attendees setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public Attendees setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    @Bindable
    public String getDistrictName() {
        return districtName;
    }

    public Attendees setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @Bindable
    public String getTehsilCode() {
        return tehsilCode;
    }

    public Attendees setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
        return this;
    }

    @Bindable
    public String getTehsilName() {
        return tehsilName;
    }

    public Attendees setTehsilName(String tehsilName) {
        this.tehsilName = tehsilName;
        return this;
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public Attendees setHfCode(String hfCode) {
        this.hfCode = hfCode;
        return this;
    }

    @Bindable
    public String getHfName() {
        return hfName;
    }

    public Attendees setHfName(String hfName) {
        this.hfName = hfName;
        return this;
    }

    @Bindable
    public String getLhwCode() {
        return lhwCode;
    }

    public Attendees setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
        return this;
    }

    @Bindable
    public String getLhwName() {
        return lhwName;
    }

    public Attendees setLhwName(String lhwName) {
        this.lhwName = lhwName;
        return this;
    }

    @Bindable
    public String getSessionType() {
        return sessionType;
    }

    public Attendees setSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Attendees setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Attendees setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Attendees setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Attendees setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public Attendees setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public Attendees setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public Attendees setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Attendees setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    @Bindable
    public String getsV3() {
        return sV3;
    }

    public void setsV3(String sV3) {
        this.sV3 = sV3;
        notifyPropertyChanged(BR.sV3);
    }

    @Bindable
    public String getV301() {
        return v301;
    }

    public void setV301(String v301) {
        this.v301 = v301;
        notifyPropertyChanged(BR.v301);
    }

    @Bindable
    public String getV302() {
        return v302;
    }

    public void setV302(String v302) {
        this.v302 = v302;
        notifyPropertyChanged(BR.v302);
    }

    @Bindable
    public String getV303() {
        return v303;
    }

    public void setV303(String v303) {
        this.v303 = v303;
        notifyPropertyChanged(BR.v303);
    }

    @Bindable
    public String getV304() {
        return v304;
    }

    public void setV304(String v304) {
        this.v304 = v304;
        notifyPropertyChanged(BR.v304);
    }

    @Bindable
    public String getV305() {
        return v305;
    }

    public void setV305(String v305) {
        this.v305 = v305;
        notifyPropertyChanged(BR.v305);
    }

    @Bindable
    public String getV306() {
        return v306;
    }

    public void setV306(String v306) {
        this.v306 = v306;
        notifyPropertyChanged(BR.v306);
    }

    @Bindable
    public String getV307() {
        return v307;
    }

    public void setV307(String v307) {
        this.v307 = v307;
        notifyPropertyChanged(BR.v307);
    }

    @Bindable
    public String getV308() {
        return v308;
    }

    public void setV308(String v308) {
        this.v308 = v308;
        notifyPropertyChanged(BR.v308);
    }


    public Attendees Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(AttendeesTable.COLUMN_ID);
        this.uid = jsonObject.getString(AttendeesTable.COLUMN_UID);
        this.uuid = jsonObject.getString(AttendeesTable.COLUMN_UUID);
        this.userName = jsonObject.getString(AttendeesTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(AttendeesTable.COLUMN_SYSDATE);
        this.sessionType = jsonObject.getString(AttendeesTable.COLUMN_SESSION_TYPE);
        this.districtCode = jsonObject.getString(AttendeesTable.COLUMN_DISTRICT_CODE);
        this.districtName = jsonObject.getString(AttendeesTable.COLUMN_DISTRICT_NAME);
        this.tehsilCode = jsonObject.getString(AttendeesTable.COLUMN_TEHSIL_CODE);
        this.tehsilName = jsonObject.getString(AttendeesTable.COLUMN_TEHSIL_NAME);
        this.hfCode = jsonObject.getString(AttendeesTable.COLUMN_HF_CODE);
        this.hfName = jsonObject.getString(AttendeesTable.COLUMN_HF_NAME);
        this.lhwCode = jsonObject.getString(AttendeesTable.COLUMN_LHW_CODE);
        this.lhwName = jsonObject.getString(AttendeesTable.COLUMN_LHW_NAME);
        this.deviceId = jsonObject.getString(AttendeesTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(AttendeesTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(AttendeesTable.COLUMN_APPVERSION);
        this.endTime = jsonObject.getString(AttendeesTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(AttendeesTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(AttendeesTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(AttendeesTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(AttendeesTable.COLUMN_SYNCED_DATE);

        this.sV3 = jsonObject.getString(AttendeesTable.COLUMN_SV3);

        return this;

    }


    public Attendees Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_UUID));
        this.userName = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_SYSDATE));
        this.sessionType = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_SESSION_TYPE));
        this.districtCode = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_DISTRICT_CODE));
        this.districtName = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_DISTRICT_NAME));
        this.tehsilCode = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_TEHSIL_CODE));
        this.tehsilName = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_TEHSIL_NAME));
        this.hfCode = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_HF_CODE));
        this.hfName = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_HF_NAME));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_LHW_CODE));
        this.lhwName = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_LHW_NAME));
        this.deviceId = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_APPVERSION));
        this.endTime = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_SYNCED_DATE));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_SA));

        sV3Hydrate(cursor.getString(cursor.getColumnIndex(AttendeesTable.COLUMN_SV3)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Attendees.class);
    }

    public String sV3toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("v301", v301)
                    .put("v302", v302)
                    .put("v303", v303)
                    .put("v304", v304)
                    .put("v305", v305)
                    .put("v306", v306)
                    .put("v307", v307)
                    .put("v308", v308);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {
        JSONObject json = new JSONObject();
        try {
            json.put(AttendeesTable.COLUMN_ID, this.id);
            json.put(AttendeesTable.COLUMN_UID, this.uid);
            json.put(AttendeesTable.COLUMN_UUID, this.uuid);
            json.put(AttendeesTable.COLUMN_USERNAME, this.userName);
            json.put(AttendeesTable.COLUMN_SYSDATE, this.sysDate);
            json.put(AttendeesTable.COLUMN_SESSION_TYPE, this.sessionType);
            json.put(AttendeesTable.COLUMN_DISTRICT_CODE, this.districtCode);
            json.put(AttendeesTable.COLUMN_DISTRICT_NAME, this.districtName);
            json.put(AttendeesTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
            json.put(AttendeesTable.COLUMN_TEHSIL_NAME, this.tehsilName);
            json.put(AttendeesTable.COLUMN_HF_CODE, this.hfCode);
            json.put(AttendeesTable.COLUMN_HF_NAME, this.hfName);
            json.put(AttendeesTable.COLUMN_LHW_CODE, this.lhwCode);
            json.put(AttendeesTable.COLUMN_LHW_NAME, this.lhwName);
            json.put(AttendeesTable.COLUMN_DEVICEID, this.deviceId);
            json.put(AttendeesTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(AttendeesTable.COLUMN_APPVERSION, this.appver);
            json.put(AttendeesTable.COLUMN_ENDINGDATETIME, this.endTime);
            json.put(AttendeesTable.COLUMN_ISTATUS, this.iStatus);
            json.put(AttendeesTable.COLUMN_ISTATUS96x, this.iStatus96x);
            json.put(AttendeesTable.COLUMN_SYNCED, this.synced);
            json.put(AttendeesTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(AttendeesTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(AttendeesTable.COLUMN_SV3, new JSONObject(sV3toString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void sV3Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.v301 = json.getString("v301");
                this.v302 = json.getString("v302");
                this.v303 = json.getString("v303");
                this.v304 = json.getString("v304");
                this.v305 = json.getString("v305");
                this.v306 = json.getString("v306");
                this.v307 = json.getString("v307");
                this.v308 = json.getString("v308");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}
