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
import edu.aku.hassannaqvi.chese.contracts.TableContracts.WSGFormTable;
import edu.aku.hassannaqvi.chese.core.MainApp;


public class WSGForm extends BaseObservable implements Observable {

    private final String TAG = "WSG";
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


    // SECTION VARIABLES
    private String sWS2 = StringUtils.EMPTY;
    private String sWS3 = StringUtils.EMPTY;
    private String sWS4 = StringUtils.EMPTY;
    private String sWS5 = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String ws201 = StringUtils.EMPTY;
    private String ws202 = StringUtils.EMPTY;
    private String ws203 = StringUtils.EMPTY;
    private String ws204 = StringUtils.EMPTY;
    private String ws205 = StringUtils.EMPTY;
    private String ws206 = StringUtils.EMPTY;
    private String ws207 = StringUtils.EMPTY;
    private String ws208 = StringUtils.EMPTY;
    private String ws20896x = StringUtils.EMPTY;
    private String ws209 = StringUtils.EMPTY;
    private String ws210 = StringUtils.EMPTY;
    private String ws21096x = StringUtils.EMPTY;
    private String ws301 = StringUtils.EMPTY;
    private String ws302 = StringUtils.EMPTY;
    private String ws303 = StringUtils.EMPTY;
    private String ws304 = StringUtils.EMPTY;
    private String ws305 = StringUtils.EMPTY;
    private String ws306 = StringUtils.EMPTY;
    private String ws307 = StringUtils.EMPTY;
    private String ws308 = StringUtils.EMPTY;
    private String ws401a = StringUtils.EMPTY;
    private String ws401b = StringUtils.EMPTY;
    private String ws401c = StringUtils.EMPTY;
    private String ws401d = StringUtils.EMPTY;
    private String ws401e = StringUtils.EMPTY;
    private String ws402a = StringUtils.EMPTY;
    private String ws402b = StringUtils.EMPTY;
    private String ws402c = StringUtils.EMPTY;
    private String ws402d = StringUtils.EMPTY;
    private String ws402e = StringUtils.EMPTY;
    private String ws402f = StringUtils.EMPTY;
    private String ws402g = StringUtils.EMPTY;
    private String ws402h = StringUtils.EMPTY;
    private String ws402i = StringUtils.EMPTY;
    private String ws403a = StringUtils.EMPTY;
    private String ws403b = StringUtils.EMPTY;
    private String ws403c = StringUtils.EMPTY;
    private String ws403d = StringUtils.EMPTY;
    private String ws404a = StringUtils.EMPTY;
    private String ws404b = StringUtils.EMPTY;
    private String ws404c = StringUtils.EMPTY;
    private String ws404d = StringUtils.EMPTY;
    private String ws404e = StringUtils.EMPTY;
    private String ws404f = StringUtils.EMPTY;
    private String ws404g = StringUtils.EMPTY;
    private String ws404h = StringUtils.EMPTY;
    private String ws404i = StringUtils.EMPTY;
    private String ws404k = StringUtils.EMPTY;
    private String ws405a = StringUtils.EMPTY;
    private String ws405b = StringUtils.EMPTY;
    private String ws405c = StringUtils.EMPTY;
    private String ws405d = StringUtils.EMPTY;
    private String ws405e = StringUtils.EMPTY;
    private String ws405f = StringUtils.EMPTY;
    private String ws405g = StringUtils.EMPTY;
    private String ws405h = StringUtils.EMPTY;
    private String ws405i = StringUtils.EMPTY;
    private String ws405j = StringUtils.EMPTY;
    private String ws405k = StringUtils.EMPTY;
    private String ws405l = StringUtils.EMPTY;
    private String ws406a = StringUtils.EMPTY;
    private String ws406b = StringUtils.EMPTY;
    private String ws406c = StringUtils.EMPTY;
    private String ws406d = StringUtils.EMPTY;
    private String ws406e = StringUtils.EMPTY;
    private String ws406f = StringUtils.EMPTY;
    private String ws406g = StringUtils.EMPTY;
    private String ws406h = StringUtils.EMPTY;
    private String ws406i = StringUtils.EMPTY;
    private String ws407a = StringUtils.EMPTY;
    private String ws407b = StringUtils.EMPTY;
    private String ws407c = StringUtils.EMPTY;
    private String ws407d = StringUtils.EMPTY;
    private String ws407e = StringUtils.EMPTY;
    private String ws407f = StringUtils.EMPTY;
    private String ws407g = StringUtils.EMPTY;
    private String ws407h = StringUtils.EMPTY;
    private String ws407i = StringUtils.EMPTY;
    private String ws407j = StringUtils.EMPTY;
    private String ws408a = StringUtils.EMPTY;
    private String ws408b = StringUtils.EMPTY;
    private String ws408c = StringUtils.EMPTY;
    private String ws408d = StringUtils.EMPTY;
    private String ws408e = StringUtils.EMPTY;
    private String ws408f = StringUtils.EMPTY;
    private String ws408g = StringUtils.EMPTY;
    private String ws408h = StringUtils.EMPTY;
    private String ws409a = StringUtils.EMPTY;
    private String ws409b = StringUtils.EMPTY;
    private String ws409c = StringUtils.EMPTY;
    private String ws409d = StringUtils.EMPTY;
    private String ws409e = StringUtils.EMPTY;
    private String ws409f = StringUtils.EMPTY;
    private String ws409g = StringUtils.EMPTY;
    private String ws409h = StringUtils.EMPTY;
    private String ws409i = StringUtils.EMPTY;
    private String ws410a = StringUtils.EMPTY;
    private String ws410b = StringUtils.EMPTY;
    private String ws410c = StringUtils.EMPTY;
    private String ws410d = StringUtils.EMPTY;
    private String ws410e = StringUtils.EMPTY;
    private String ws411a = StringUtils.EMPTY;
    private String ws411b = StringUtils.EMPTY;
    private String ws411c = StringUtils.EMPTY;
    private String ws411d = StringUtils.EMPTY;
    private String ws411e = StringUtils.EMPTY;
    private String ws411f = StringUtils.EMPTY;
    private String ws411g = StringUtils.EMPTY;
    private String ws412a = StringUtils.EMPTY;
    private String ws412b = StringUtils.EMPTY;
    private String ws412c = StringUtils.EMPTY;
    private String ws412d = StringUtils.EMPTY;
    private String ws412e = StringUtils.EMPTY;
    private String ws412f = StringUtils.EMPTY;
    private String ws413a = StringUtils.EMPTY;
    private String ws413b = StringUtils.EMPTY;
    private String ws413c = StringUtils.EMPTY;
    private String ws413d = StringUtils.EMPTY;
    private String ws413e = StringUtils.EMPTY;
    private String ws413f = StringUtils.EMPTY;
    private String ws413g = StringUtils.EMPTY;
    private String ws414a = StringUtils.EMPTY;
    private String ws414b = StringUtils.EMPTY;
    private String ws414c = StringUtils.EMPTY;
    private String ws414d = StringUtils.EMPTY;
    private String ws414e = StringUtils.EMPTY;
    private String ws414f = StringUtils.EMPTY;
    private String ws414g = StringUtils.EMPTY;
    private String ws414h = StringUtils.EMPTY;
    private String ws414i = StringUtils.EMPTY;
    private String ws414j = StringUtils.EMPTY;
    private String ws501 = StringUtils.EMPTY;
    private String ws502 = StringUtils.EMPTY;
    private String ws503 = StringUtils.EMPTY;
    private String ws504 = StringUtils.EMPTY;
    private String ws505 = StringUtils.EMPTY;
    private String ws506 = StringUtils.EMPTY;
    private String ws507 = StringUtils.EMPTY;
    private String ws508 = StringUtils.EMPTY;
    private String ws509 = StringUtils.EMPTY;
    private String ws510 = StringUtils.EMPTY;


    public WSGForm() {
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

    public WSGForm setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public WSGForm setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public WSGForm setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public WSGForm setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    @Bindable
    public String getDistrictName() {
        return districtName;
    }

    public WSGForm setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public WSGForm setHfCode(String hfCode) {
        this.hfCode = hfCode;
        return this;
    }

    @Bindable
    public String getHfName() {
        return hfName;
    }

    public WSGForm setHfName(String hfName) {
        this.hfName = hfName;
        return this;
    }

    @Bindable
    public String getReportingMonth() {
        return reportingMonth;
    }

    public WSGForm setReportingMonth(String reportingMonth) {
        this.reportingMonth = reportingMonth;
        return this;
    }

    @Bindable
    public String getReportingYear() {
        return reportingYear;
    }

    public WSGForm setReportingYear(String reportingYear) {
        this.reportingYear = reportingYear;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public WSGForm setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public WSGForm setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public WSGForm setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public WSGForm setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public WSGForm setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public WSGForm setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public WSGForm setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public WSGForm setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    @Bindable
    public String getsWS2() {
        return sWS2;
    }

    public WSGForm setsWS2(String sWS2) {
        this.sWS2 = sWS2;
        return this;
        //notifyPropertyChanged(BR.sA);
    }

    @Bindable
    public String getsWS3() {
        return sWS3;
    }

    public void setsWS3(String sWS3) {
        this.sWS3 = sWS3;
        notifyPropertyChanged(BR.sWS3);
    }

    @Bindable
    public String getsWS4() {
        return sWS4;
    }

    public void setsWS4(String sWS4) {
        this.sWS4 = sWS4;
        notifyPropertyChanged(BR.sWS4);
    }

    @Bindable
    public String getsWS5() {
        return sWS5;
    }

    public void setsWS5(String sWS5) {
        this.sWS5 = sWS5;
        notifyPropertyChanged(BR.sWS5);
    }


    @Bindable
    public String getWs201() {
        return ws201;
    }

    public void setWs201(String ws201) {
        this.ws201 = ws201;
        notifyPropertyChanged(BR.ws201);
    }

    @Bindable
    public String getWs202() {
        return ws202;
    }

    public void setWs202(String ws202) {
        this.ws202 = ws202;
        notifyPropertyChanged(BR.ws202);
    }

    @Bindable
    public String getWs203() {
        return ws203;
    }

    public void setWs203(String ws203) {
        this.ws203 = ws203;
        setWs204(ws203.equals("2") ? "" : this.ws204);
        setWs205(ws203.equals("2") ? "" : this.ws205);
        setWs206(ws203.equals("2") ? "" : this.ws206);
        setWs207(ws203.equals("2") ? "" : this.ws207);
        setWs208(ws203.equals("2") ? "" : this.ws208);
        setWs209(ws203.equals("2") ? "" : this.ws209);
        setWs210(ws203.equals("2") ? "" : this.ws210);
        notifyPropertyChanged(BR.ws203);
    }

    @Bindable
    public String getWs204() {
        return ws204;
    }

    public void setWs204(String ws204) {
        this.ws204 = ws204;
        setWs205(ws204.equals("2") ? "" : this.ws205);
        notifyPropertyChanged(BR.ws204);
    }

    @Bindable
    public String getWs205() {
        return ws205;
    }

    public void setWs205(String ws205) {
        this.ws205 = ws205;
        notifyPropertyChanged(BR.ws205);
    }

    @Bindable
    public String getWs206() {
        return ws206;
    }

    public void setWs206(String ws206) {
        this.ws206 = ws206;
        setWs207(ws206.equals("2") ? "" : this.ws207);
        setWs208(ws206.equals("2") ? "" : this.ws208);
        setWs209(ws206.equals("2") ? "" : this.ws209);
        setWs210(ws206.equals("2") ? "" : this.ws210);
        notifyPropertyChanged(BR.ws206);
    }

    @Bindable
    public String getWs207() {
        return ws207;
    }

    public void setWs207(String ws207) {
        this.ws207 = ws207;
        notifyPropertyChanged(BR.ws207);
    }

    @Bindable
    public String getWs208() {
        return ws208;
    }

    public void setWs208(String ws208) {
        this.ws208 = ws208;
        setWs20896x(ws208.equals("96") ? this.ws20896x : "");
        notifyPropertyChanged(BR.ws208);
    }

    @Bindable
    public String getWs20896x() {
        return ws20896x;
    }

    public void setWs20896x(String ws20896x) {
        this.ws20896x = ws20896x;
        notifyPropertyChanged(BR.ws20896x);
    }

    @Bindable
    public String getWs209() {
        return ws209;
    }

    public void setWs209(String ws209) {
        this.ws209 = ws209;
        notifyPropertyChanged(BR.ws209);
    }

    @Bindable
    public String getWs210() {
        return ws210;
    }

    public void setWs210(String ws210) {
        this.ws210 = ws210;
        setWs21096x(ws210.equals("96") ? this.ws21096x : "");
        notifyPropertyChanged(BR.ws210);
    }

    @Bindable
    public String getWs21096x() {
        return ws21096x;
    }

    public void setWs21096x(String ws21096x) {
        this.ws21096x = ws21096x;
        notifyPropertyChanged(BR.ws21096x);
    }

    @Bindable
    public String getWs301() {
        return ws301;
    }

    public void setWs301(String ws301) {
        this.ws301 = ws301;
        notifyPropertyChanged(BR.ws301);
    }

    @Bindable
    public String getWs302() {
        return ws302;
    }

    public void setWs302(String ws302) {
        this.ws302 = ws302;
        notifyPropertyChanged(BR.ws302);
    }

    @Bindable
    public String getWs303() {
        return ws303;
    }

    public void setWs303(String ws303) {
        this.ws303 = ws303;
        notifyPropertyChanged(BR.ws303);
    }

    @Bindable
    public String getWs304() {
        return ws304;
    }

    public void setWs304(String ws304) {
        this.ws304 = ws304;
        notifyPropertyChanged(BR.ws304);
    }

    @Bindable
    public String getWs305() {
        return ws305;
    }

    public void setWs305(String ws305) {
        this.ws305 = ws305;
        notifyPropertyChanged(BR.ws305);
    }

    @Bindable
    public String getWs306() {
        return ws306;
    }

    public void setWs306(String ws306) {
        this.ws306 = ws306;
        notifyPropertyChanged(BR.ws306);
    }

    @Bindable
    public String getWs307() {
        return ws307;
    }

    public void setWs307(String ws307) {
        this.ws307 = ws307;
        notifyPropertyChanged(BR.ws307);
    }

    @Bindable
    public String getWs308() {
        return ws308;
    }

    public void setWs308(String ws308) {
        this.ws308 = ws308;
        notifyPropertyChanged(BR.ws308);
    }

    @Bindable
    public String getWs401a() {
        return ws401a;
    }

    public void setWs401a(String ws401a) {
        this.ws401a = ws401a;
        notifyPropertyChanged(BR.ws401a);
    }

    @Bindable
    public String getWs401b() {
        return ws401b;
    }

    public void setWs401b(String ws401b) {
        this.ws401b = ws401b;
        notifyPropertyChanged(BR.ws401b);
    }

    @Bindable
    public String getWs401c() {
        return ws401c;
    }

    public void setWs401c(String ws401c) {
        this.ws401c = ws401c;
        notifyPropertyChanged(BR.ws401c);
    }

    @Bindable
    public String getWs401d() {
        return ws401d;
    }

    public void setWs401d(String ws401d) {
        this.ws401d = ws401d;
        notifyPropertyChanged(BR.ws401d);
    }

    @Bindable
    public String getWs401e() {
        return ws401e;
    }

    public void setWs401e(String ws401e) {
        this.ws401e = ws401e;
        notifyPropertyChanged(BR.ws401e);
    }

    @Bindable
    public String getWs402a() {
        return ws402a;
    }

    public void setWs402a(String ws402a) {
        this.ws402a = ws402a;
        notifyPropertyChanged(BR.ws402a);
    }

    @Bindable
    public String getWs402b() {
        return ws402b;
    }

    public void setWs402b(String ws402b) {
        this.ws402b = ws402b;
        notifyPropertyChanged(BR.ws402b);
    }

    @Bindable
    public String getWs402c() {
        return ws402c;
    }

    public void setWs402c(String ws402c) {
        this.ws402c = ws402c;
        notifyPropertyChanged(BR.ws402c);
    }

    @Bindable
    public String getWs402d() {
        return ws402d;
    }

    public void setWs402d(String ws402d) {
        this.ws402d = ws402d;
        notifyPropertyChanged(BR.ws402d);
    }

    @Bindable
    public String getWs402e() {
        return ws402e;
    }

    public void setWs402e(String ws402e) {
        this.ws402e = ws402e;
        notifyPropertyChanged(BR.ws402e);
    }

    @Bindable
    public String getWs402f() {
        return ws402f;
    }

    public void setWs402f(String ws402f) {
        this.ws402f = ws402f;
        notifyPropertyChanged(BR.ws402f);
    }

    @Bindable
    public String getWs402g() {
        return ws402g;
    }

    public void setWs402g(String ws402g) {
        this.ws402g = ws402g;
        notifyPropertyChanged(BR.ws402g);
    }

    @Bindable
    public String getWs402h() {
        return ws402h;
    }

    public void setWs402h(String ws402h) {
        this.ws402h = ws402h;
        notifyPropertyChanged(BR.ws402h);
    }

    @Bindable
    public String getWs402i() {
        return ws402i;
    }

    public void setWs402i(String ws402i) {
        this.ws402i = ws402i;
        notifyPropertyChanged(BR.ws402i);
    }

    @Bindable
    public String getWs403a() {
        return ws403a;
    }

    public void setWs403a(String ws403a) {
        this.ws403a = ws403a;
        notifyPropertyChanged(BR.ws403a);
    }

    @Bindable
    public String getWs403b() {
        return ws403b;
    }

    public void setWs403b(String ws403b) {
        this.ws403b = ws403b;
        notifyPropertyChanged(BR.ws403b);
    }

    @Bindable
    public String getWs403c() {
        return ws403c;
    }

    public void setWs403c(String ws403c) {
        this.ws403c = ws403c;
        notifyPropertyChanged(BR.ws403c);
    }

    @Bindable
    public String getWs403d() {
        return ws403d;
    }

    public void setWs403d(String ws403d) {
        this.ws403d = ws403d;
        notifyPropertyChanged(BR.ws403d);
    }

    @Bindable
    public String getWs404a() {
        return ws404a;
    }

    public void setWs404a(String ws404a) {
        this.ws404a = ws404a;
        notifyPropertyChanged(BR.ws404a);
    }

    @Bindable
    public String getWs404b() {
        return ws404b;
    }

    public void setWs404b(String ws404b) {
        this.ws404b = ws404b;
        notifyPropertyChanged(BR.ws404b);
    }

    @Bindable
    public String getWs404c() {
        return ws404c;
    }

    public void setWs404c(String ws404c) {
        this.ws404c = ws404c;
        notifyPropertyChanged(BR.ws404c);
    }

    @Bindable
    public String getWs404d() {
        return ws404d;
    }

    public void setWs404d(String ws404d) {
        this.ws404d = ws404d;
        notifyPropertyChanged(BR.ws404d);
    }

    @Bindable
    public String getWs404e() {
        return ws404e;
    }

    public void setWs404e(String ws404e) {
        this.ws404e = ws404e;
        notifyPropertyChanged(BR.ws404e);
    }

    @Bindable
    public String getWs404f() {
        return ws404f;
    }

    public void setWs404f(String ws404f) {
        this.ws404f = ws404f;
        notifyPropertyChanged(BR.ws404f);
    }

    @Bindable
    public String getWs404g() {
        return ws404g;
    }

    public void setWs404g(String ws404g) {
        this.ws404g = ws404g;
        notifyPropertyChanged(BR.ws404g);
    }

    @Bindable
    public String getWs404h() {
        return ws404h;
    }

    public void setWs404h(String ws404h) {
        this.ws404h = ws404h;
        notifyPropertyChanged(BR.ws404h);
    }

    @Bindable
    public String getWs404i() {
        return ws404i;
    }

    public void setWs404i(String ws404i) {
        this.ws404i = ws404i;
        notifyPropertyChanged(BR.ws404i);
    }

    @Bindable
    public String getWs404k() {
        return ws404k;
    }

    public void setWs404k(String ws404k) {
        this.ws404k = ws404k;
        notifyPropertyChanged(BR.ws404k);
    }

    @Bindable
    public String getWs405a() {
        return ws405a;
    }

    public void setWs405a(String ws405a) {
        this.ws405a = ws405a;
        notifyPropertyChanged(BR.ws405a);
    }

    @Bindable
    public String getWs405b() {
        return ws405b;
    }

    public void setWs405b(String ws405b) {
        this.ws405b = ws405b;
        notifyPropertyChanged(BR.ws405b);
    }

    @Bindable
    public String getWs405c() {
        return ws405c;
    }

    public void setWs405c(String ws405c) {
        this.ws405c = ws405c;
        notifyPropertyChanged(BR.ws405c);
    }

    @Bindable
    public String getWs405d() {
        return ws405d;
    }

    public void setWs405d(String ws405d) {
        this.ws405d = ws405d;
        notifyPropertyChanged(BR.ws405d);
    }

    @Bindable
    public String getWs405e() {
        return ws405e;
    }

    public void setWs405e(String ws405e) {
        this.ws405e = ws405e;
        notifyPropertyChanged(BR.ws405e);
    }

    @Bindable
    public String getWs405f() {
        return ws405f;
    }

    public void setWs405f(String ws405f) {
        this.ws405f = ws405f;
        notifyPropertyChanged(BR.ws405f);
    }

    @Bindable
    public String getWs405g() {
        return ws405g;
    }

    public void setWs405g(String ws405g) {
        this.ws405g = ws405g;
        notifyPropertyChanged(BR.ws405g);
    }

    @Bindable
    public String getWs405h() {
        return ws405h;
    }

    public void setWs405h(String ws405h) {
        this.ws405h = ws405h;
        notifyPropertyChanged(BR.ws405h);
    }

    @Bindable
    public String getWs405i() {
        return ws405i;
    }

    public void setWs405i(String ws405i) {
        this.ws405i = ws405i;
        notifyPropertyChanged(BR.ws405i);
    }

    @Bindable
    public String getWs405j() {
        return ws405j;
    }

    public void setWs405j(String ws405j) {
        this.ws405j = ws405j;
        notifyPropertyChanged(BR.ws405j);
    }

    @Bindable
    public String getWs405k() {
        return ws405k;
    }

    public void setWs405k(String ws405k) {
        this.ws405k = ws405k;
        notifyPropertyChanged(BR.ws405k);
    }

    @Bindable
    public String getWs405l() {
        return ws405l;
    }

    public void setWs405l(String ws405l) {
        this.ws405l = ws405l;
        notifyPropertyChanged(BR.ws405l);
    }

    @Bindable
    public String getWs406a() {
        return ws406a;
    }

    public void setWs406a(String ws406a) {
        this.ws406a = ws406a;
        notifyPropertyChanged(BR.ws406a);
    }

    @Bindable
    public String getWs406b() {
        return ws406b;
    }

    public void setWs406b(String ws406b) {
        this.ws406b = ws406b;
        notifyPropertyChanged(BR.ws406b);
    }

    @Bindable
    public String getWs406c() {
        return ws406c;
    }

    public void setWs406c(String ws406c) {
        this.ws406c = ws406c;
        notifyPropertyChanged(BR.ws406c);
    }

    @Bindable
    public String getWs406d() {
        return ws406d;
    }

    public void setWs406d(String ws406d) {
        this.ws406d = ws406d;
        notifyPropertyChanged(BR.ws406d);
    }

    @Bindable
    public String getWs406e() {
        return ws406e;
    }

    public void setWs406e(String ws406e) {
        this.ws406e = ws406e;
        notifyPropertyChanged(BR.ws406e);
    }

    @Bindable
    public String getWs406f() {
        return ws406f;
    }

    public void setWs406f(String ws406f) {
        this.ws406f = ws406f;
        notifyPropertyChanged(BR.ws406f);
    }

    @Bindable
    public String getWs406g() {
        return ws406g;
    }

    public void setWs406g(String ws406g) {
        this.ws406g = ws406g;
        notifyPropertyChanged(BR.ws406g);
    }

    @Bindable
    public String getWs406h() {
        return ws406h;
    }

    public void setWs406h(String ws406h) {
        this.ws406h = ws406h;
        notifyPropertyChanged(BR.ws406h);
    }

    @Bindable
    public String getWs406i() {
        return ws406i;
    }

    public void setWs406i(String ws406i) {
        this.ws406i = ws406i;
        notifyPropertyChanged(BR.ws406i);
    }

    @Bindable
    public String getWs407a() {
        return ws407a;
    }

    public void setWs407a(String ws407a) {
        this.ws407a = ws407a;
        notifyPropertyChanged(BR.ws407a);
    }

    @Bindable
    public String getWs407b() {
        return ws407b;
    }

    public void setWs407b(String ws407b) {
        this.ws407b = ws407b;
        notifyPropertyChanged(BR.ws407b);
    }

    @Bindable
    public String getWs407c() {
        return ws407c;
    }

    public void setWs407c(String ws407c) {
        this.ws407c = ws407c;
        notifyPropertyChanged(BR.ws407c);
    }

    @Bindable
    public String getWs407d() {
        return ws407d;
    }

    public void setWs407d(String ws407d) {
        this.ws407d = ws407d;
        notifyPropertyChanged(BR.ws407d);
    }

    @Bindable
    public String getWs407e() {
        return ws407e;
    }

    public void setWs407e(String ws407e) {
        this.ws407e = ws407e;
        notifyPropertyChanged(BR.ws407e);
    }

    @Bindable
    public String getWs407f() {
        return ws407f;
    }

    public void setWs407f(String ws407f) {
        this.ws407f = ws407f;
        notifyPropertyChanged(BR.ws407f);
    }

    @Bindable
    public String getWs407g() {
        return ws407g;
    }

    public void setWs407g(String ws407g) {
        this.ws407g = ws407g;
        notifyPropertyChanged(BR.ws407g);
    }

    @Bindable
    public String getWs407h() {
        return ws407h;
    }

    public void setWs407h(String ws407h) {
        this.ws407h = ws407h;
        notifyPropertyChanged(BR.ws407h);
    }

    @Bindable
    public String getWs407i() {
        return ws407i;
    }

    public void setWs407i(String ws407i) {
        this.ws407i = ws407i;
        notifyPropertyChanged(BR.ws407i);
    }

    @Bindable
    public String getWs407j() {
        return ws407j;
    }

    public void setWs407j(String ws407j) {
        this.ws407j = ws407j;
        notifyPropertyChanged(BR.ws407j);
    }

    @Bindable
    public String getWs408a() {
        return ws408a;
    }

    public void setWs408a(String ws408a) {
        this.ws408a = ws408a;
        notifyPropertyChanged(BR.ws408a);
    }

    @Bindable
    public String getWs408b() {
        return ws408b;
    }

    public void setWs408b(String ws408b) {
        this.ws408b = ws408b;
        notifyPropertyChanged(BR.ws408b);
    }

    @Bindable
    public String getWs408c() {
        return ws408c;
    }

    public void setWs408c(String ws408c) {
        this.ws408c = ws408c;
        notifyPropertyChanged(BR.ws408c);
    }

    @Bindable
    public String getWs408d() {
        return ws408d;
    }

    public void setWs408d(String ws408d) {
        this.ws408d = ws408d;
        notifyPropertyChanged(BR.ws408d);
    }

    @Bindable
    public String getWs408e() {
        return ws408e;
    }

    public void setWs408e(String ws408e) {
        this.ws408e = ws408e;
        notifyPropertyChanged(BR.ws408e);
    }

    @Bindable
    public String getWs408f() {
        return ws408f;
    }

    public void setWs408f(String ws408f) {
        this.ws408f = ws408f;
        notifyPropertyChanged(BR.ws408f);
    }

    @Bindable
    public String getWs408g() {
        return ws408g;
    }

    public void setWs408g(String ws408g) {
        this.ws408g = ws408g;
        notifyPropertyChanged(BR.ws408g);
    }

    @Bindable
    public String getWs408h() {
        return ws408h;
    }

    public void setWs408h(String ws408h) {
        this.ws408h = ws408h;
        notifyPropertyChanged(BR.ws408h);
    }

    @Bindable
    public String getWs409a() {
        return ws409a;
    }

    public void setWs409a(String ws409a) {
        this.ws409a = ws409a;
        notifyPropertyChanged(BR.ws409a);
    }

    @Bindable
    public String getWs409b() {
        return ws409b;
    }

    public void setWs409b(String ws409b) {
        this.ws409b = ws409b;
        notifyPropertyChanged(BR.ws409b);
    }

    @Bindable
    public String getWs409c() {
        return ws409c;
    }

    public void setWs409c(String ws409c) {
        this.ws409c = ws409c;
        notifyPropertyChanged(BR.ws409c);
    }

    @Bindable
    public String getWs409d() {
        return ws409d;
    }

    public void setWs409d(String ws409d) {
        this.ws409d = ws409d;
        notifyPropertyChanged(BR.ws409d);
    }

    @Bindable
    public String getWs409e() {
        return ws409e;
    }

    public void setWs409e(String ws409e) {
        this.ws409e = ws409e;
        notifyPropertyChanged(BR.ws409e);
    }

    @Bindable
    public String getWs409f() {
        return ws409f;
    }

    public void setWs409f(String ws409f) {
        this.ws409f = ws409f;
        notifyPropertyChanged(BR.ws409f);
    }

    @Bindable
    public String getWs409g() {
        return ws409g;
    }

    public void setWs409g(String ws409g) {
        this.ws409g = ws409g;
        notifyPropertyChanged(BR.ws409g);
    }

    @Bindable
    public String getWs409h() {
        return ws409h;
    }

    public void setWs409h(String ws409h) {
        this.ws409h = ws409h;
        notifyPropertyChanged(BR.ws409h);
    }

    @Bindable
    public String getWs409i() {
        return ws409i;
    }

    public void setWs409i(String ws409i) {
        this.ws409i = ws409i;
        notifyPropertyChanged(BR.ws409i);
    }

    @Bindable
    public String getWs410a() {
        return ws410a;
    }

    public void setWs410a(String ws410a) {
        this.ws410a = ws410a;
        notifyPropertyChanged(BR.ws410a);
    }

    @Bindable
    public String getWs410b() {
        return ws410b;
    }

    public void setWs410b(String ws410b) {
        this.ws410b = ws410b;
        notifyPropertyChanged(BR.ws410b);
    }

    @Bindable
    public String getWs410c() {
        return ws410c;
    }

    public void setWs410c(String ws410c) {
        this.ws410c = ws410c;
        notifyPropertyChanged(BR.ws410c);
    }

    @Bindable
    public String getWs410d() {
        return ws410d;
    }

    public void setWs410d(String ws410d) {
        this.ws410d = ws410d;
        notifyPropertyChanged(BR.ws410d);
    }

    @Bindable
    public String getWs410e() {
        return ws410e;
    }

    public void setWs410e(String ws410e) {
        this.ws410e = ws410e;
        notifyPropertyChanged(BR.ws410e);
    }

    @Bindable
    public String getWs411a() {
        return ws411a;
    }

    public void setWs411a(String ws411a) {
        this.ws411a = ws411a;
        notifyPropertyChanged(BR.ws411a);
    }

    @Bindable
    public String getWs411b() {
        return ws411b;
    }

    public void setWs411b(String ws411b) {
        this.ws411b = ws411b;
        notifyPropertyChanged(BR.ws411b);
    }

    @Bindable
    public String getWs411c() {
        return ws411c;
    }

    public void setWs411c(String ws411c) {
        this.ws411c = ws411c;
        notifyPropertyChanged(BR.ws411c);
    }

    @Bindable
    public String getWs411d() {
        return ws411d;
    }

    public void setWs411d(String ws411d) {
        this.ws411d = ws411d;
        notifyPropertyChanged(BR.ws411d);
    }

    @Bindable
    public String getWs411e() {
        return ws411e;
    }

    public void setWs411e(String ws411e) {
        this.ws411e = ws411e;
        notifyPropertyChanged(BR.ws411e);
    }

    @Bindable
    public String getWs411f() {
        return ws411f;
    }

    public void setWs411f(String ws411f) {
        this.ws411f = ws411f;
        notifyPropertyChanged(BR.ws411f);
    }

    @Bindable
    public String getWs411g() {
        return ws411g;
    }

    public void setWs411g(String ws411g) {
        this.ws411g = ws411g;
        notifyPropertyChanged(BR.ws411g);
    }

    @Bindable
    public String getWs412a() {
        return ws412a;
    }

    public void setWs412a(String ws412a) {
        this.ws412a = ws412a;
        notifyPropertyChanged(BR.ws412a);
    }

    @Bindable
    public String getWs412b() {
        return ws412b;
    }

    public void setWs412b(String ws412b) {
        this.ws412b = ws412b;
        notifyPropertyChanged(BR.ws412b);
    }

    @Bindable
    public String getWs412c() {
        return ws412c;
    }

    public void setWs412c(String ws412c) {
        this.ws412c = ws412c;
        notifyPropertyChanged(BR.ws412c);
    }

    @Bindable
    public String getWs412d() {
        return ws412d;
    }

    public void setWs412d(String ws412d) {
        this.ws412d = ws412d;
        notifyPropertyChanged(BR.ws412d);
    }

    @Bindable
    public String getWs412e() {
        return ws412e;
    }

    public void setWs412e(String ws412e) {
        this.ws412e = ws412e;
        notifyPropertyChanged(BR.ws412e);
    }

    @Bindable
    public String getWs412f() {
        return ws412f;
    }

    public void setWs412f(String ws412f) {
        this.ws412f = ws412f;
        notifyPropertyChanged(BR.ws412f);
    }

    @Bindable
    public String getWs413a() {
        return ws413a;
    }

    public void setWs413a(String ws413a) {
        this.ws413a = ws413a;
        notifyPropertyChanged(BR.ws413a);
    }

    @Bindable
    public String getWs413b() {
        return ws413b;
    }

    public void setWs413b(String ws413b) {
        this.ws413b = ws413b;
        notifyPropertyChanged(BR.ws413b);
    }

    @Bindable
    public String getWs413c() {
        return ws413c;
    }

    public void setWs413c(String ws413c) {
        this.ws413c = ws413c;
        notifyPropertyChanged(BR.ws413c);
    }

    @Bindable
    public String getWs413d() {
        return ws413d;
    }

    public void setWs413d(String ws413d) {
        this.ws413d = ws413d;
        notifyPropertyChanged(BR.ws413d);
    }

    @Bindable
    public String getWs413e() {
        return ws413e;
    }

    public void setWs413e(String ws413e) {
        this.ws413e = ws413e;
        notifyPropertyChanged(BR.ws413e);
    }

    @Bindable
    public String getWs413f() {
        return ws413f;
    }

    public void setWs413f(String ws413f) {
        this.ws413f = ws413f;
        notifyPropertyChanged(BR.ws413f);
    }

    @Bindable
    public String getWs413g() {
        return ws413g;
    }

    public void setWs413g(String ws413g) {
        this.ws413g = ws413g;
        notifyPropertyChanged(BR.ws413g);
    }

    @Bindable
    public String getWs414a() {
        return ws414a;
    }

    public void setWs414a(String ws414a) {
        this.ws414a = ws414a;
        notifyPropertyChanged(BR.ws414a);
    }

    @Bindable
    public String getWs414b() {
        return ws414b;
    }

    public void setWs414b(String ws414b) {
        this.ws414b = ws414b;
        notifyPropertyChanged(BR.ws414b);
    }

    @Bindable
    public String getWs414c() {
        return ws414c;
    }

    public void setWs414c(String ws414c) {
        this.ws414c = ws414c;
        notifyPropertyChanged(BR.ws414c);
    }

    @Bindable
    public String getWs414d() {
        return ws414d;
    }

    public void setWs414d(String ws414d) {
        this.ws414d = ws414d;
        notifyPropertyChanged(BR.ws414d);
    }

    @Bindable
    public String getWs414e() {
        return ws414e;
    }

    public void setWs414e(String ws414e) {
        this.ws414e = ws414e;
        notifyPropertyChanged(BR.ws414e);
    }

    @Bindable
    public String getWs414f() {
        return ws414f;
    }

    public void setWs414f(String ws414f) {
        this.ws414f = ws414f;
        notifyPropertyChanged(BR.ws414f);
    }

    @Bindable
    public String getWs414g() {
        return ws414g;
    }

    public void setWs414g(String ws414g) {
        this.ws414g = ws414g;
        notifyPropertyChanged(BR.ws414g);
    }

    @Bindable
    public String getWs414h() {
        return ws414h;
    }

    public void setWs414h(String ws414h) {
        this.ws414h = ws414h;
        notifyPropertyChanged(BR.ws414h);
    }

    @Bindable
    public String getWs414i() {
        return ws414i;
    }

    public void setWs414i(String ws414i) {
        this.ws414i = ws414i;
        notifyPropertyChanged(BR.ws414i);
    }

    @Bindable
    public String getWs414j() {
        return ws414j;
    }

    public void setWs414j(String ws414j) {
        this.ws414j = ws414j;
        notifyPropertyChanged(BR.ws414j);
    }

    @Bindable
    public String getWs501() {
        return ws501;
    }

    public void setWs501(String ws501) {
        this.ws501 = ws501;
        notifyPropertyChanged(BR.ws501);
    }

    @Bindable
    public String getWs502() {
        return ws502;
    }

    public void setWs502(String ws502) {
        this.ws502 = ws502;
        notifyPropertyChanged(BR.ws502);
    }

    @Bindable
    public String getWs503() {
        return ws503;
    }

    public void setWs503(String ws503) {
        this.ws503 = ws503;
        notifyPropertyChanged(BR.ws503);
    }

    @Bindable
    public String getWs504() {
        return ws504;
    }

    public void setWs504(String ws504) {
        this.ws504 = ws504;
        notifyPropertyChanged(BR.ws504);
    }

    @Bindable
    public String getWs505() {
        return ws505;
    }

    public void setWs505(String ws505) {
        this.ws505 = ws505;
        notifyPropertyChanged(BR.ws505);
    }

    @Bindable
    public String getWs506() {
        return ws506;
    }

    public void setWs506(String ws506) {
        this.ws506 = ws506;
        notifyPropertyChanged(BR.ws506);
    }

    @Bindable
    public String getWs507() {
        return ws507;
    }

    public void setWs507(String ws507) {
        this.ws507 = ws507;
        notifyPropertyChanged(BR.ws507);
    }

    @Bindable
    public String getWs508() {
        return ws508;
    }

    public void setWs508(String ws508) {
        this.ws508 = ws508;
        notifyPropertyChanged(BR.ws508);
    }

    @Bindable
    public String getWs509() {
        return ws509;
    }

    public void setWs509(String ws509) {
        this.ws509 = ws509;
        notifyPropertyChanged(BR.ws509);
    }

    @Bindable
    public String getWs510() {
        return ws510;
    }

    public void setWs510(String ws510) {
        this.ws510 = ws510;
        notifyPropertyChanged(BR.ws510);
    }


    public WSGForm Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(WSGFormTable.COLUMN_ID);
        this.uid = jsonObject.getString(WSGFormTable.COLUMN_UID);
        this.userName = jsonObject.getString(WSGFormTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(WSGFormTable.COLUMN_SYSDATE);
        this.districtCode = jsonObject.getString(WSGFormTable.COLUMN_DISTRICT_CODE);
        this.districtName = jsonObject.getString(WSGFormTable.COLUMN_DISTRICT_NAME);
        this.hfCode = jsonObject.getString(WSGFormTable.COLUMN_HF_CODE);
        this.hfName = jsonObject.getString(WSGFormTable.COLUMN_HF_NAME);
        this.reportingMonth = jsonObject.getString(WSGFormTable.COLUMN_REPORTING_MONTH);
        this.reportingYear = jsonObject.getString(WSGFormTable.COLUMN_REPORTING_YEAR);
        this.deviceId = jsonObject.getString(WSGFormTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(WSGFormTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(WSGFormTable.COLUMN_APPVERSION);
        this.endTime = jsonObject.getString(WSGFormTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(WSGFormTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(WSGFormTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(WSGFormTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(WSGFormTable.COLUMN_SYNCED_DATE);

        this.sWS2 = jsonObject.getString(WSGFormTable.COLUMN_SWS2);
        this.sWS3 = jsonObject.getString(WSGFormTable.COLUMN_SWS3);
        this.sWS4 = jsonObject.getString(WSGFormTable.COLUMN_SWS41);
        this.sWS5 = jsonObject.getString(WSGFormTable.COLUMN_SWS5);

        return this;

    }


    public WSGForm Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_SYSDATE));
        this.districtCode = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_DISTRICT_CODE));
        this.districtName = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_DISTRICT_NAME));
        this.hfCode = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_HF_CODE));
        this.hfName = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_HF_NAME));
        this.reportingMonth = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_REPORTING_MONTH));
        this.reportingYear = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_REPORTING_YEAR));
        this.deviceId = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_APPVERSION));
        this.endTime = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_SYNCED_DATE));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndex(WSGTable.COLUMN_SA));

        sWS2Hydrate(cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_SWS2)));
        sWS3Hydrate(cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_SWS3)));
        sWS4Hydrate(cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_SWS41)));
        sWS5Hydrate(cursor.getString(cursor.getColumnIndex(WSGFormTable.COLUMN_SWS5)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, WSGForm.class);
    }


    public String sWS2toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("ws201", ws201)
                    .put("ws202", ws202)
                    .put("ws203", ws203)
                    .put("ws204", ws204)
                    .put("ws205", ws205)
                    .put("ws206", ws206)
                    .put("ws207", ws207)
                    .put("ws208", ws208)
                    .put("ws20896x", ws20896x)
                    .put("ws209", ws209)
                    .put("ws210", ws210)
                    .put("ws21096x", ws21096x);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sWS3toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("ws301", ws301)
                    .put("ws302", ws302)
                    .put("ws303", ws303)
                    .put("ws304", ws304)
                    .put("ws305", ws305)
                    .put("ws306", ws306)
                    .put("ws307", ws307)
                    .put("ws308", ws308);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sWS4toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("ws401a", ws401a)
                    .put("ws401b", ws401b)
                    .put("ws401c", ws401c)
                    .put("ws401d", ws401d)
                    .put("ws401e", ws401e)
                    .put("ws402a", ws402a)
                    .put("ws402b", ws402b)
                    .put("ws402c", ws402c)
                    .put("ws402d", ws402d)
                    .put("ws402e", ws402e)
                    .put("ws402f", ws402f)
                    .put("ws402g", ws402g)
                    .put("ws402h", ws402h)
                    .put("ws402i", ws402i)
                    .put("ws403a", ws403a)
                    .put("ws403b", ws403b)
                    .put("ws403c", ws403c)
                    .put("ws403d", ws403d)
                    .put("ws404a", ws404a)
                    .put("ws404b", ws404b)
                    .put("ws404c", ws404c)
                    .put("ws404d", ws404d)
                    .put("ws404e", ws404e)
                    .put("ws404f", ws404f)
                    .put("ws404g", ws404g)
                    .put("ws404h", ws404h)
                    .put("ws404i", ws404i)
                    .put("ws404k", ws404k)
                    .put("ws405a", ws405a)
                    .put("ws405b", ws405b)
                    .put("ws405c", ws405c)
                    .put("ws405d", ws405d)
                    .put("ws405e", ws405e)
                    .put("ws405f", ws405f)
                    .put("ws405g", ws405g)
                    .put("ws405h", ws405h)
                    .put("ws405i", ws405i)
                    .put("ws405j", ws405j)
                    .put("ws405k", ws405k)
                    .put("ws405l", ws405l)
                    .put("ws406a", ws406a)
                    .put("ws406b", ws406b)
                    .put("ws406c", ws406c)
                    .put("ws406d", ws406d)
                    .put("ws406e", ws406e)
                    .put("ws406f", ws406f)
                    .put("ws406g", ws406g)
                    .put("ws406h", ws406h)
                    .put("ws406i", ws406i)
                    .put("ws407a", ws407a)
                    .put("ws407b", ws407b)
                    .put("ws407c", ws407c)
                    .put("ws407d", ws407d)
                    .put("ws407e", ws407e)
                    .put("ws407f", ws407f)
                    .put("ws407g", ws407g)
                    .put("ws407h", ws407h)
                    .put("ws407i", ws407i)
                    .put("ws407j", ws407j)
                    .put("ws408a", ws408a)
                    .put("ws408b", ws408b)
                    .put("ws408c", ws408c)
                    .put("ws408d", ws408d)
                    .put("ws408e", ws408e)
                    .put("ws408f", ws408f)
                    .put("ws408g", ws408g)
                    .put("ws408h", ws408h)
                    .put("ws409a", ws409a)
                    .put("ws409b", ws409b)
                    .put("ws409c", ws409c)
                    .put("ws409d", ws409d)
                    .put("ws409e", ws409e)
                    .put("ws409f", ws409f)
                    .put("ws409g", ws409g)
                    .put("ws409h", ws409h)
                    .put("ws409i", ws409i)
                    .put("ws410a", ws410a)
                    .put("ws410b", ws410b)
                    .put("ws410c", ws410c)
                    .put("ws410d", ws410d)
                    .put("ws410e", ws410e)
                    .put("ws411a", ws411a)
                    .put("ws411b", ws411b)
                    .put("ws411c", ws411c)
                    .put("ws411d", ws411d)
                    .put("ws411e", ws411e)
                    .put("ws411f", ws411f)
                    .put("ws411g", ws411g)
                    .put("ws412a", ws412a)
                    .put("ws412b", ws412b)
                    .put("ws412c", ws412c)
                    .put("ws412d", ws412d)
                    .put("ws412e", ws412e)
                    .put("ws412f", ws412f)
                    .put("ws413a", ws413a)
                    .put("ws413b", ws413b)
                    .put("ws413c", ws413c)
                    .put("ws413d", ws413d)
                    .put("ws413e", ws413e)
                    .put("ws413f", ws413f)
                    .put("ws413g", ws413g)
                    .put("ws414a", ws414a)
                    .put("ws414b", ws414b)
                    .put("ws414c", ws414c)
                    .put("ws414d", ws414d)
                    .put("ws414e", ws414e)
                    .put("ws414f", ws414f)
                    .put("ws414g", ws414g)
                    .put("ws414h", ws414h)
                    .put("ws414i", ws414i)
                    .put("ws414j", ws414j);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sWS5toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("ws501", ws501)
                    .put("ws502", ws502)
                    .put("ws503", ws503)
                    .put("ws504", ws504)
                    .put("ws505", ws505)
                    .put("ws506", ws506)
                    .put("ws507", ws507)
                    .put("ws508", ws508)
                    .put("ws509", ws509)
                    .put("ws510", ws510);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {
        JSONObject json = new JSONObject();
        try {
            json.put(WSGFormTable.COLUMN_ID, this.id);
            json.put(WSGFormTable.COLUMN_UID, this.uid);
            json.put(WSGFormTable.COLUMN_USERNAME, this.userName);
            json.put(WSGFormTable.COLUMN_SYSDATE, this.sysDate);
            json.put(WSGFormTable.COLUMN_DISTRICT_CODE, this.districtCode);
            json.put(WSGFormTable.COLUMN_DISTRICT_NAME, this.districtName);
            json.put(WSGFormTable.COLUMN_HF_CODE, this.hfCode);
            json.put(WSGFormTable.COLUMN_HF_NAME, this.hfName);
            json.put(WSGFormTable.COLUMN_REPORTING_MONTH, this.reportingMonth);
            json.put(WSGFormTable.COLUMN_REPORTING_YEAR, this.reportingYear);
            json.put(WSGFormTable.COLUMN_DEVICEID, this.deviceId);
            json.put(WSGFormTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(WSGFormTable.COLUMN_APPVERSION, this.appver);
            json.put(WSGFormTable.COLUMN_ENDINGDATETIME, this.endTime);
            json.put(WSGFormTable.COLUMN_ISTATUS, this.iStatus);
            json.put(WSGFormTable.COLUMN_ISTATUS96x, this.iStatus96x);
            json.put(WSGFormTable.COLUMN_SYNCED, this.synced);
            json.put(WSGFormTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(WSGFormTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(WSGFormTable.COLUMN_SWS2, new JSONObject(sWS2toString()));
            json.put(WSGFormTable.COLUMN_SWS3, new JSONObject(sWS3toString()));
            json.put(WSGFormTable.COLUMN_SWS41, new JSONObject(sWS4toString()));
            json.put(WSGFormTable.COLUMN_SWS5, new JSONObject(sWS5toString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void sWS2Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.ws201 = json.getString("ws201");
                this.ws202 = json.getString("ws202");
                this.ws203 = json.getString("ws203");
                this.ws204 = json.getString("ws204");
                this.ws205 = json.getString("ws205");
                this.ws206 = json.getString("ws206");
                this.ws207 = json.getString("ws207");
                this.ws208 = json.getString("ws208");
                this.ws20896x = json.getString("ws20896x");
                this.ws209 = json.getString("ws209");
                this.ws210 = json.getString("ws210");
                this.ws21096x = json.getString("ws21096x");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sWS3Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.ws301 = json.getString("ws301");
                this.ws302 = json.getString("ws302");
                this.ws303 = json.getString("ws303");
                this.ws304 = json.getString("ws304");
                this.ws305 = json.getString("ws305");
                this.ws306 = json.getString("ws306");
                this.ws307 = json.getString("ws307");
                this.ws308 = json.getString("ws308");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sWS4Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.ws401a = json.getString("ws401a");
                this.ws401b = json.getString("ws401b");
                this.ws401c = json.getString("ws401c");
                this.ws401d = json.getString("ws401d");
                this.ws401e = json.getString("ws401e");
                this.ws402a = json.getString("ws402a");
                this.ws402b = json.getString("ws402b");
                this.ws402c = json.getString("ws402c");
                this.ws402d = json.getString("ws402d");
                this.ws402e = json.getString("ws402e");
                this.ws402f = json.getString("ws402f");
                this.ws402g = json.getString("ws402g");
                this.ws402h = json.getString("ws402h");
                this.ws402i = json.getString("ws402i");
                this.ws403a = json.getString("ws403a");
                this.ws403b = json.getString("ws403b");
                this.ws403c = json.getString("ws403c");
                this.ws403d = json.getString("ws403d");
                this.ws404a = json.getString("ws404a");
                this.ws404b = json.getString("ws404b");
                this.ws404c = json.getString("ws404c");
                this.ws404d = json.getString("ws404d");
                this.ws404e = json.getString("ws404e");
                this.ws404f = json.getString("ws404f");
                this.ws404g = json.getString("ws404g");
                this.ws404h = json.getString("ws404h");
                this.ws404i = json.getString("ws404i");
                this.ws404k = json.getString("ws404k");
                this.ws405a = json.getString("ws405a");
                this.ws405b = json.getString("ws405b");
                this.ws405c = json.getString("ws405c");
                this.ws405d = json.getString("ws405d");
                this.ws405e = json.getString("ws405e");
                this.ws405f = json.getString("ws405f");
                this.ws405g = json.getString("ws405g");
                this.ws405h = json.getString("ws405h");
                this.ws405i = json.getString("ws405i");
                this.ws405j = json.getString("ws405j");
                this.ws405k = json.getString("ws405k");
                this.ws405l = json.getString("ws405l");
                this.ws406a = json.getString("ws406a");
                this.ws406b = json.getString("ws406b");
                this.ws406c = json.getString("ws406c");
                this.ws406d = json.getString("ws406d");
                this.ws406e = json.getString("ws406e");
                this.ws406f = json.getString("ws406f");
                this.ws406g = json.getString("ws406g");
                this.ws406h = json.getString("ws406h");
                this.ws406i = json.getString("ws406i");
                this.ws407a = json.getString("ws407a");
                this.ws407b = json.getString("ws407b");
                this.ws407c = json.getString("ws407c");
                this.ws407d = json.getString("ws407d");
                this.ws407e = json.getString("ws407e");
                this.ws407f = json.getString("ws407f");
                this.ws407g = json.getString("ws407g");
                this.ws407h = json.getString("ws407h");
                this.ws407i = json.getString("ws407i");
                this.ws407j = json.getString("ws407j");
                this.ws408a = json.getString("ws408a");
                this.ws408b = json.getString("ws408b");
                this.ws408c = json.getString("ws408c");
                this.ws408d = json.getString("ws408d");
                this.ws408e = json.getString("ws408e");
                this.ws408f = json.getString("ws408f");
                this.ws408g = json.getString("ws408g");
                this.ws408h = json.getString("ws408h");
                this.ws409a = json.getString("ws409a");
                this.ws409b = json.getString("ws409b");
                this.ws409c = json.getString("ws409c");
                this.ws409d = json.getString("ws409d");
                this.ws409e = json.getString("ws409e");
                this.ws409f = json.getString("ws409f");
                this.ws409g = json.getString("ws409g");
                this.ws409h = json.getString("ws409h");
                this.ws409i = json.getString("ws409i");
                this.ws410a = json.getString("ws410a");
                this.ws410b = json.getString("ws410b");
                this.ws410c = json.getString("ws410c");
                this.ws410d = json.getString("ws410d");
                this.ws410e = json.getString("ws410e");
                this.ws411a = json.getString("ws411a");
                this.ws411b = json.getString("ws411b");
                this.ws411c = json.getString("ws411c");
                this.ws411d = json.getString("ws411d");
                this.ws411e = json.getString("ws411e");
                this.ws411f = json.getString("ws411f");
                this.ws411g = json.getString("ws411g");
                this.ws412a = json.getString("ws412a");
                this.ws412b = json.getString("ws412b");
                this.ws412c = json.getString("ws412c");
                this.ws412d = json.getString("ws412d");
                this.ws412e = json.getString("ws412e");
                this.ws412f = json.getString("ws412f");
                this.ws413a = json.getString("ws413a");
                this.ws413b = json.getString("ws413b");
                this.ws413c = json.getString("ws413c");
                this.ws413d = json.getString("ws413d");
                this.ws413e = json.getString("ws413e");
                this.ws413f = json.getString("ws413f");
                this.ws413g = json.getString("ws413g");
                this.ws414a = json.getString("ws414a");
                this.ws414b = json.getString("ws414b");
                this.ws414c = json.getString("ws414c");
                this.ws414d = json.getString("ws414d");
                this.ws414e = json.getString("ws414e");
                this.ws414f = json.getString("ws414f");
                this.ws414g = json.getString("ws414g");
                this.ws414h = json.getString("ws414h");
                this.ws414i = json.getString("ws414i");
                this.ws414j = json.getString("ws414j");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sWS5Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.ws501 = json.getString("ws501");
                this.ws502 = json.getString("ws502");
                this.ws503 = json.getString("ws503");
                this.ws504 = json.getString("ws504");
                this.ws505 = json.getString("ws505");
                this.ws506 = json.getString("ws506");
                this.ws507 = json.getString("ws507");
                this.ws508 = json.getString("ws508");
                this.ws509 = json.getString("ws509");
                this.ws510 = json.getString("ws510");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}
