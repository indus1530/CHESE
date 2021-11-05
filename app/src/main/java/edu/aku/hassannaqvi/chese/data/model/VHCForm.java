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
import edu.aku.hassannaqvi.chese.contracts.TableContracts.VHCFormTable;
import edu.aku.hassannaqvi.chese.core.MainApp;


public class VHCForm extends BaseObservable implements Observable {

    private final String TAG = "VHC";
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
    private String tehsilCode = StringUtils.EMPTY;
    private String tehsilName = StringUtils.EMPTY;
    private String hfCode = StringUtils.EMPTY;
    private String hfName = StringUtils.EMPTY;
    private String lhwCode = StringUtils.EMPTY;
    private String lhwName = StringUtils.EMPTY;
    private String lhwSupervisor = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;


    // SECTION VARIABLES
    private String sV2 = StringUtils.EMPTY;
    private String sV4 = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String v201 = StringUtils.EMPTY;
    private String v202 = StringUtils.EMPTY;
    private String v203 = StringUtils.EMPTY;
    private String v204 = StringUtils.EMPTY;
    private String v205 = StringUtils.EMPTY;
    private String v20596x = StringUtils.EMPTY;
    private String v206 = StringUtils.EMPTY;
    private String v401 = StringUtils.EMPTY;
    private String v402 = StringUtils.EMPTY;
    private String v403 = StringUtils.EMPTY;
    private String v404 = StringUtils.EMPTY;
    private String v405 = StringUtils.EMPTY;
    private String v406 = StringUtils.EMPTY;
    private String v407 = StringUtils.EMPTY;
    private String v408 = StringUtils.EMPTY;
    private String v409 = StringUtils.EMPTY;
    private String v410 = StringUtils.EMPTY;
    private String v411 = StringUtils.EMPTY;
    private String v412 = StringUtils.EMPTY;
    private String v413 = StringUtils.EMPTY;
    private String v414 = StringUtils.EMPTY;


    public VHCForm() {
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

    public VHCForm setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public VHCForm setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public VHCForm setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public VHCForm setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    @Bindable
    public String getDistrictName() {
        return districtName;
    }

    public VHCForm setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @Bindable
    public String getTehsilCode() {
        return tehsilCode;
    }

    public VHCForm setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
        return this;
    }

    @Bindable
    public String getTehsilName() {
        return tehsilName;
    }

    public VHCForm setTehsilName(String tehsilName) {
        this.tehsilName = tehsilName;
        return this;
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public VHCForm setHfCode(String hfCode) {
        this.hfCode = hfCode;
        return this;
    }

    @Bindable
    public String getHfName() {
        return hfName;
    }

    public VHCForm setHfName(String hfName) {
        this.hfName = hfName;
        return this;
    }

    @Bindable
    public String getLhwCode() {
        return lhwCode;
    }

    public VHCForm setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
        return this;
    }

    @Bindable
    public String getLhwName() {
        return lhwName;
    }

    public VHCForm setLhwName(String lhwName) {
        this.lhwName = lhwName;
        return this;
    }

    @Bindable
    public String getLhwSupervisor() {
        return lhwSupervisor;
    }

    public VHCForm setLhwSupervisor(String lhwSupervisor) {
        this.lhwSupervisor = lhwSupervisor;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public VHCForm setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public VHCForm setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public VHCForm setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public VHCForm setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public VHCForm setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public VHCForm setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public VHCForm setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public VHCForm setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    @Bindable
    public String getsV2() {
        return sV2;
    }

    public VHCForm setsV2(String sV2) {
        this.sV2 = sV2;
        return this;
        //notifyPropertyChanged(BR.sA);
    }


    @Bindable
    public String getsV4() {
        return sV4;
    }

    public void setsV4(String sV4) {
        this.sV4 = sV4;
        notifyPropertyChanged(BR.sV4);
    }


    @Bindable
    public String getV201() {
        return v201;
    }

    public void setV201(String v201) {
        this.v201 = v201;
        notifyPropertyChanged(BR.v201);
    }

    @Bindable
    public String getV202() {
        return v202;
    }

    public void setV202(String v202) {
        this.v202 = v202;
        notifyPropertyChanged(BR.v202);
    }

    @Bindable
    public String getV203() {
        return v203;
    }

    public void setV203(String v203) {
        this.v203 = v203;
        setV204(v203.equals("2") ? "" : this.v204);
        setV205(v203.equals("2") ? "" : this.v205);
        setV206(v203.equals("2") ? "" : this.v206);
        notifyPropertyChanged(BR.v203);
    }

    @Bindable
    public String getV204() {
        return v204;
    }

    public void setV204(String v204) {
        this.v204 = v204;
        notifyPropertyChanged(BR.v204);
    }

    @Bindable
    public String getV205() {
        return v205;
    }

    public void setV205(String v205) {
        this.v205 = v205;
        setV20596x(v205.equals("96") ? this.v20596x : "");
        notifyPropertyChanged(BR.v205);
    }

    @Bindable
    public String getV20596x() {
        return v20596x;
    }

    public void setV20596x(String v20596x) {
        this.v20596x = v20596x;
        notifyPropertyChanged(BR.v20596x);
    }

    @Bindable
    public String getV206() {
        return v206;
    }

    public void setV206(String v206) {
        this.v206 = v206;
        notifyPropertyChanged(BR.v206);
    }



    @Bindable
    public String getV401() {
        return v401;
    }

    public void setV401(String v401) {
        this.v401 = v401;
        notifyPropertyChanged(BR.v401);
    }

    @Bindable
    public String getV402() {
        return v402;
    }

    public void setV402(String v402) {
        this.v402 = v402;
        notifyPropertyChanged(BR.v402);
    }

    @Bindable
    public String getV403() {
        return v403;
    }

    public void setV403(String v403) {
        this.v403 = v403;
        notifyPropertyChanged(BR.v403);
    }

    @Bindable
    public String getV404() {
        return v404;
    }

    public void setV404(String v404) {
        this.v404 = v404;
        notifyPropertyChanged(BR.v404);
    }

    @Bindable
    public String getV405() {
        return v405;
    }

    public void setV405(String v405) {
        this.v405 = v405;
        notifyPropertyChanged(BR.v405);
    }

    @Bindable
    public String getV406() {
        return v406;
    }

    public void setV406(String v406) {
        this.v406 = v406;
        notifyPropertyChanged(BR.v406);
    }

    @Bindable
    public String getV407() {
        return v407;
    }

    public void setV407(String v407) {
        this.v407 = v407;
        notifyPropertyChanged(BR.v407);
    }

    @Bindable
    public String getV408() {
        return v408;
    }

    public void setV408(String v408) {
        this.v408 = v408;
        notifyPropertyChanged(BR.v408);
    }

    @Bindable
    public String getV409() {
        return v409;
    }

    public void setV409(String v409) {
        this.v409 = v409;
        notifyPropertyChanged(BR.v409);
    }

    @Bindable
    public String getV410() {
        return v410;
    }

    public void setV410(String v410) {
        this.v410 = v410;
        notifyPropertyChanged(BR.v410);
    }

    @Bindable
    public String getV411() {
        return v411;
    }

    public void setV411(String v411) {
        this.v411 = v411;
        notifyPropertyChanged(BR.v411);
    }

    @Bindable
    public String getV412() {
        return v412;
    }

    public void setV412(String v412) {
        this.v412 = v412;
        notifyPropertyChanged(BR.v412);
    }

    @Bindable
    public String getV413() {
        return v413;
    }

    public void setV413(String v413) {
        this.v413 = v413;
        notifyPropertyChanged(BR.v413);
    }

    @Bindable
    public String getV414() {
        return v414;
    }

    public void setV414(String v414) {
        this.v414 = v414;
        notifyPropertyChanged(BR.v414);
    }


    public VHCForm Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(VHCFormTable.COLUMN_ID);
        this.uid = jsonObject.getString(VHCFormTable.COLUMN_UID);
        this.userName = jsonObject.getString(VHCFormTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(VHCFormTable.COLUMN_SYSDATE);
        this.districtCode = jsonObject.getString(VHCFormTable.COLUMN_DISTRICT_CODE);
        this.districtName = jsonObject.getString(VHCFormTable.COLUMN_DISTRICT_NAME);
        this.tehsilCode = jsonObject.getString(VHCFormTable.COLUMN_TEHSIL_CODE);
        this.tehsilName = jsonObject.getString(VHCFormTable.COLUMN_TEHSIL_NAME);
        this.hfCode = jsonObject.getString(VHCFormTable.COLUMN_HF_CODE);
        this.hfName = jsonObject.getString(VHCFormTable.COLUMN_HF_NAME);
        this.lhwCode = jsonObject.getString(VHCFormTable.COLUMN_LHW_CODE);
        this.lhwName = jsonObject.getString(VHCFormTable.COLUMN_LHW_NAME);
        this.lhwSupervisor = jsonObject.getString(VHCFormTable.COLUMN_LHW_SUPERVISOR);
        this.deviceId = jsonObject.getString(VHCFormTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(VHCFormTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(VHCFormTable.COLUMN_APPVERSION);
        this.endTime = jsonObject.getString(VHCFormTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(VHCFormTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(VHCFormTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(VHCFormTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(VHCFormTable.COLUMN_SYNCED_DATE);

        this.sV2 = jsonObject.getString(VHCFormTable.COLUMN_SV2);
        this.sV4 = jsonObject.getString(VHCFormTable.COLUMN_SV4);

        return this;

    }


    public VHCForm Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_SYSDATE));
        this.districtCode = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_DISTRICT_CODE));
        this.districtName = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_DISTRICT_NAME));
        this.tehsilCode = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_TEHSIL_CODE));
        this.tehsilName = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_TEHSIL_NAME);
        this.hfCode = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_HF_CODE));
        this.hfName = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_HF_NAME));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_LHW_CODE));
        this.lhwName = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_LHW_NAME));
        this.lhwSupervisor = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_LHW_SUPERVISOR));
        this.deviceId = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_APPVERSION));
        this.endTime = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_SYNCED_DATE));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndex(VHCTable.COLUMN_SA));

        sV2Hydrate(cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_SV2)));
        sV4Hydrate(cursor.getString(cursor.getColumnIndex(VHCFormTable.COLUMN_SV4)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, VHCForm.class);
    }


    public String sV2toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("v201", v201)
                    .put("v202", v202)
                    .put("v203", v203)
                    .put("v204", v204)
                    .put("v205", v205)
                    .put("v20596x", v20596x)
                    .put("v206", v206);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sV4toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("v401", v401)
                    .put("v402", v402)
                    .put("v403", v403)
                    .put("v404", v404)
                    .put("v405", v405)
                    .put("v406", v406)
                    .put("v407", v407)
                    .put("v408", v408)
                    .put("v409", v409)
                    .put("v410", v410)
                    .put("v411", v411)
                    .put("v412", v412)
                    .put("v413", v413)
                    .put("v414", v414);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {
        JSONObject json = new JSONObject();
        try {
            json.put(VHCFormTable.COLUMN_ID, this.id);
            json.put(VHCFormTable.COLUMN_UID, this.uid);
            json.put(VHCFormTable.COLUMN_USERNAME, this.userName);
            json.put(VHCFormTable.COLUMN_SYSDATE, this.sysDate);
            json.put(VHCFormTable.COLUMN_DISTRICT_CODE, this.districtCode);
            json.put(VHCFormTable.COLUMN_DISTRICT_NAME, this.districtName);
            json.put(VHCFormTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
            json.put(VHCFormTable.COLUMN_TEHSIL_NAME, this.tehsilName);
            json.put(VHCFormTable.COLUMN_HF_CODE, this.hfCode);
            json.put(VHCFormTable.COLUMN_HF_NAME, this.hfName);
            json.put(VHCFormTable.COLUMN_LHW_CODE, this.lhwCode);
            json.put(VHCFormTable.COLUMN_LHW_NAME, this.lhwName);
            json.put(VHCFormTable.COLUMN_LHW_SUPERVISOR, this.lhwSupervisor);
            json.put(VHCFormTable.COLUMN_DEVICEID, this.deviceId);
            json.put(VHCFormTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(VHCFormTable.COLUMN_APPVERSION, this.appver);
            json.put(VHCFormTable.COLUMN_ENDINGDATETIME, this.endTime);
            json.put(VHCFormTable.COLUMN_ISTATUS, this.iStatus);
            json.put(VHCFormTable.COLUMN_ISTATUS96x, this.iStatus96x);
            json.put(VHCFormTable.COLUMN_SYNCED, this.synced);
            json.put(VHCFormTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(VHCFormTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(VHCFormTable.COLUMN_SV2, new JSONObject(sV2toString()));
            json.put(VHCFormTable.COLUMN_SV4, new JSONObject(sV4toString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void sV2Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.v201 = json.getString("v201");
                this.v202 = json.getString("v202");
                this.v203 = json.getString("v203");
                this.v204 = json.getString("v204");
                this.v205 = json.getString("v205");
                this.v20596x = json.getString("v20596x");
                this.v206 = json.getString("v206");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sV4Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.v401 = json.getString("v401");
                this.v402 = json.getString("v402");
                this.v403 = json.getString("v403");
                this.v404 = json.getString("v404");
                this.v405 = json.getString("v405");
                this.v406 = json.getString("v406");
                this.v407 = json.getString("v407");
                this.v408 = json.getString("v408");
                this.v409 = json.getString("v409");
                this.v410 = json.getString("v410");
                this.v411 = json.getString("v411");
                this.v412 = json.getString("v412");
                this.v413 = json.getString("v413");
                this.v414 = json.getString("v414");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}
