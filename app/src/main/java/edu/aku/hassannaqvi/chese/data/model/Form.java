package edu.aku.hassannaqvi.chese.data.model;


import android.database.Cursor;
import android.provider.BaseColumns;

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
import edu.aku.hassannaqvi.chese.core.MainApp;


public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
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
    private String sA = StringUtils.EMPTY; //Maternal Health Register
    private String sB = StringUtils.EMPTY; //EPI Health Register
    private String sC = StringUtils.EMPTY; //Secondary healthcare facilities- Ob/Gyn OPD register
    private String sD = StringUtils.EMPTY; //Obstetric Register
    private String sE = StringUtils.EMPTY; //FP Register
    private String sF = StringUtils.EMPTY; //Collect through Stickers new variables in DHIS
    private String sG = StringUtils.EMPTY; //Stock Out Registers
    private String sH = StringUtils.EMPTY; //Stock Out Registers

    // FIELD VARIABLES
    private String h101 = StringUtils.EMPTY;
    private String h102 = StringUtils.EMPTY;
    private String h103 = StringUtils.EMPTY;
    private String h104 = StringUtils.EMPTY;
    private String f101 = StringUtils.EMPTY;
    private String f101ax = StringUtils.EMPTY;
    private String f102 = StringUtils.EMPTY;
    private String f102ax = StringUtils.EMPTY;
    private String f103 = StringUtils.EMPTY;
    private String f103ax = StringUtils.EMPTY;
    private String f104 = StringUtils.EMPTY;
    private String f104ax = StringUtils.EMPTY;
    private String f105 = StringUtils.EMPTY;
    private String f105ax = StringUtils.EMPTY;
    private String f106 = StringUtils.EMPTY;
    private String f106ax = StringUtils.EMPTY;
    private String f1image = StringUtils.EMPTY;
    private String f201 = StringUtils.EMPTY;
    private String f201ax = StringUtils.EMPTY;
    private String f202 = StringUtils.EMPTY;
    private String f202ax = StringUtils.EMPTY;
    private String f203 = StringUtils.EMPTY;
    private String f203ax = StringUtils.EMPTY;
    private String f2image = StringUtils.EMPTY;
    private String f301 = StringUtils.EMPTY;
    private String f301ax = StringUtils.EMPTY;
    private String f302 = StringUtils.EMPTY;
    private String f302ax = StringUtils.EMPTY;
    private String f303 = StringUtils.EMPTY;
    private String f303ax = StringUtils.EMPTY;
    private String f304 = StringUtils.EMPTY;
    private String f304ax = StringUtils.EMPTY;
    private String f305 = StringUtils.EMPTY;
    private String f305ax = StringUtils.EMPTY;
    private String f306 = StringUtils.EMPTY;
    private String f306ax = StringUtils.EMPTY;
    private String f307 = StringUtils.EMPTY;
    private String f307ax = StringUtils.EMPTY;
    private String f308 = StringUtils.EMPTY;
    private String f308ax = StringUtils.EMPTY;
    private String f309 = StringUtils.EMPTY;
    private String f309ax = StringUtils.EMPTY;
    private String f310 = StringUtils.EMPTY;
    private String f310ax = StringUtils.EMPTY;
    private String f311 = StringUtils.EMPTY;
    private String f311ax = StringUtils.EMPTY;
    private String f312 = StringUtils.EMPTY;
    private String f312ax = StringUtils.EMPTY;
    private String f313 = StringUtils.EMPTY;
    private String f313ax = StringUtils.EMPTY;
    private String f314 = StringUtils.EMPTY;
    private String f314ax = StringUtils.EMPTY;
    private String f315 = StringUtils.EMPTY;
    private String f315ax = StringUtils.EMPTY;
    private String f316 = StringUtils.EMPTY;
    private String f316ax = StringUtils.EMPTY;
    private String f317 = StringUtils.EMPTY;
    private String f317ax = StringUtils.EMPTY;
    private String f318 = StringUtils.EMPTY;
    private String f318ax = StringUtils.EMPTY;
    private String f319 = StringUtils.EMPTY;
    private String f319ax = StringUtils.EMPTY;
    private String f320 = StringUtils.EMPTY;
    private String f320ax = StringUtils.EMPTY;
    private String f321 = StringUtils.EMPTY;
    private String f321ax = StringUtils.EMPTY;
    private String f322 = StringUtils.EMPTY;
    private String f322ax = StringUtils.EMPTY;
    private String f323 = StringUtils.EMPTY;
    private String f323ax = StringUtils.EMPTY;
    private String f324 = StringUtils.EMPTY;
    private String f324ax = StringUtils.EMPTY;
    private String f325 = StringUtils.EMPTY;
    private String f325ax = StringUtils.EMPTY;
    private String f326 = StringUtils.EMPTY;
    private String f326ax = StringUtils.EMPTY;
    private String f327 = StringUtils.EMPTY;
    private String f327ax = StringUtils.EMPTY;
    private String f328 = StringUtils.EMPTY;
    private String f328ax = StringUtils.EMPTY;
    private String f329 = StringUtils.EMPTY;
    private String f329ax = StringUtils.EMPTY;
    private String f330 = StringUtils.EMPTY;
    private String f330ax = StringUtils.EMPTY;
    private String f331 = StringUtils.EMPTY;
    private String f331ax = StringUtils.EMPTY;
    private String f332 = StringUtils.EMPTY;
    private String f332ax = StringUtils.EMPTY;
    private String f333 = StringUtils.EMPTY;
    private String f333ax = StringUtils.EMPTY;
    private String f334 = StringUtils.EMPTY;
    private String f334ax = StringUtils.EMPTY;
    private String f335 = StringUtils.EMPTY;
    private String f335ax = StringUtils.EMPTY;
    private String f336 = StringUtils.EMPTY;
    private String f336ax = StringUtils.EMPTY;
    private String f337 = StringUtils.EMPTY;
    private String f337ax = StringUtils.EMPTY;
    private String f338 = StringUtils.EMPTY;
    private String f338ax = StringUtils.EMPTY;
    private String f339 = StringUtils.EMPTY;
    private String f339ax = StringUtils.EMPTY;
    private String f340 = StringUtils.EMPTY;
    private String f340ax = StringUtils.EMPTY;
    private String f341 = StringUtils.EMPTY;
    private String f341ax = StringUtils.EMPTY;
    private String f342 = StringUtils.EMPTY;
    private String f342ax = StringUtils.EMPTY;
    private String f3image = StringUtils.EMPTY;
    private String f401 = StringUtils.EMPTY;
    private String f401ax = StringUtils.EMPTY;
    private String f402 = StringUtils.EMPTY;
    private String f402ax = StringUtils.EMPTY;
    private String f403 = StringUtils.EMPTY;
    private String f403ax = StringUtils.EMPTY;
    private String f404 = StringUtils.EMPTY;
    private String f404ax = StringUtils.EMPTY;
    private String f405 = StringUtils.EMPTY;
    private String f405ax = StringUtils.EMPTY;
    private String f406 = StringUtils.EMPTY;
    private String f406ax = StringUtils.EMPTY;
    private String f407 = StringUtils.EMPTY;
    private String f407ax = StringUtils.EMPTY;
    private String f408 = StringUtils.EMPTY;
    private String f408ax = StringUtils.EMPTY;
    private String f409 = StringUtils.EMPTY;
    private String f409ax = StringUtils.EMPTY;
    private String f410 = StringUtils.EMPTY;
    private String f410ax = StringUtils.EMPTY;
    private String f411 = StringUtils.EMPTY;
    private String f411ax = StringUtils.EMPTY;
    private String f412 = StringUtils.EMPTY;
    private String f412ax = StringUtils.EMPTY;
    private String f413 = StringUtils.EMPTY;
    private String f413ax = StringUtils.EMPTY;
    private String f414 = StringUtils.EMPTY;
    private String f414ax = StringUtils.EMPTY;
    private String f415 = StringUtils.EMPTY;
    private String f415ax = StringUtils.EMPTY;
    private String f416 = StringUtils.EMPTY;
    private String f416ax = StringUtils.EMPTY;
    private String f417 = StringUtils.EMPTY;
    private String f417ax = StringUtils.EMPTY;
    private String f418 = StringUtils.EMPTY;
    private String f418ax = StringUtils.EMPTY;
    private String f419 = StringUtils.EMPTY;
    private String f419ax = StringUtils.EMPTY;
    private String f4image = StringUtils.EMPTY;
    private String f501 = StringUtils.EMPTY;
    private String f501ax = StringUtils.EMPTY;
    private String f502 = StringUtils.EMPTY;
    private String f502ax = StringUtils.EMPTY;
    private String f503 = StringUtils.EMPTY;
    private String f503ax = StringUtils.EMPTY;
    private String f504 = StringUtils.EMPTY;
    private String f504ax = StringUtils.EMPTY;
    private String f505 = StringUtils.EMPTY;
    private String f505ax = StringUtils.EMPTY;
    private String f506 = StringUtils.EMPTY;
    private String f506ax = StringUtils.EMPTY;
    private String f507 = StringUtils.EMPTY;
    private String f507ax = StringUtils.EMPTY;
    private String f508 = StringUtils.EMPTY;
    private String f508ax = StringUtils.EMPTY;
    private String f509 = StringUtils.EMPTY;
    private String f509ax = StringUtils.EMPTY;
    private String f510 = StringUtils.EMPTY;
    private String f510ax = StringUtils.EMPTY;
    private String f511 = StringUtils.EMPTY;
    private String f511ax = StringUtils.EMPTY;
    private String f512 = StringUtils.EMPTY;
    private String f512ax = StringUtils.EMPTY;
    private String f513 = StringUtils.EMPTY;
    private String f513ax = StringUtils.EMPTY;
    private String f514 = StringUtils.EMPTY;
    private String f514ax = StringUtils.EMPTY;
    private String f515 = StringUtils.EMPTY;
    private String f515ax = StringUtils.EMPTY;
    private String f516 = StringUtils.EMPTY;
    private String f516ax = StringUtils.EMPTY;
    private String f5image = StringUtils.EMPTY;
    private String f601 = StringUtils.EMPTY;
    private String f601ax = StringUtils.EMPTY;
    private String f602 = StringUtils.EMPTY;
    private String f602ax = StringUtils.EMPTY;
    private String f603 = StringUtils.EMPTY;
    private String f603ax = StringUtils.EMPTY;
    private String f6image = StringUtils.EMPTY;
    private String f701 = StringUtils.EMPTY;
    private String f701ax = StringUtils.EMPTY;
    private String f702a = StringUtils.EMPTY;
    private String f702aax = StringUtils.EMPTY;
    private String f702b = StringUtils.EMPTY;
    private String f702bax = StringUtils.EMPTY;
    private String f703a = StringUtils.EMPTY;
    private String f703aax = StringUtils.EMPTY;
    private String f703b = StringUtils.EMPTY;
    private String f703bax = StringUtils.EMPTY;
    private String f703c = StringUtils.EMPTY;
    private String f703cax = StringUtils.EMPTY;
    private String f704 = StringUtils.EMPTY;
    private String f704ax = StringUtils.EMPTY;
    private String f705 = StringUtils.EMPTY;
    private String f705ax = StringUtils.EMPTY;
    private String f7image = StringUtils.EMPTY;
    private String f8011 = StringUtils.EMPTY;
    private String f8012m = StringUtils.EMPTY;
    private String f8012d = StringUtils.EMPTY;
    private String f8021 = StringUtils.EMPTY;
    private String f8022m = StringUtils.EMPTY;
    private String f8022d = StringUtils.EMPTY;
    private String f8031 = StringUtils.EMPTY;
    private String f8032m = StringUtils.EMPTY;
    private String f8032d = StringUtils.EMPTY;
    private String f8041 = StringUtils.EMPTY;
    private String f8042m = StringUtils.EMPTY;
    private String f8042d = StringUtils.EMPTY;
    private String f8051 = StringUtils.EMPTY;
    private String f8052m = StringUtils.EMPTY;
    private String f8052d = StringUtils.EMPTY;
    private String f8061 = StringUtils.EMPTY;
    private String f8062m = StringUtils.EMPTY;
    private String f8062d = StringUtils.EMPTY;
    private String f8071 = StringUtils.EMPTY;
    private String f8072m = StringUtils.EMPTY;
    private String f8072d = StringUtils.EMPTY;
    private String f8081 = StringUtils.EMPTY;
    private String f8082m = StringUtils.EMPTY;
    private String f8082d = StringUtils.EMPTY;
    private String f8091 = StringUtils.EMPTY;
    private String f8092m = StringUtils.EMPTY;
    private String f8092d = StringUtils.EMPTY;
    private String f8image = StringUtils.EMPTY;
    private String rsdremarks = StringUtils.EMPTY;


    public Form() {
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

    public Form setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public Form setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Form setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public Form setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    @Bindable
    public String getDistrictName() {
        return districtName;
    }

    public Form setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public Form setHfCode(String hfCode) {
        this.hfCode = hfCode;
        return this;
    }

    @Bindable
    public String getHfName() {
        return hfName;
    }

    public Form setHfName(String hfName) {
        this.hfName = hfName;
        return this;
    }

    @Bindable
    public String getReportingMonth() {
        return reportingMonth;
    }

    public Form setReportingMonth(String reportingMonth) {
        this.reportingMonth = reportingMonth;
        return this;
    }

    @Bindable
    public String getReportingYear() {
        return reportingYear;
    }

    public Form setReportingYear(String reportingYear) {
        this.reportingYear = reportingYear;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Form setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Form setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Form setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Form setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public Form setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public Form setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public Form setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Form setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    @Bindable
    public String getsA() {
        return sA;
    }

    public Form setsA(String sA) {
        this.sA = sA;
        return this;
        //notifyPropertyChanged(BR.sA);
    }

    @Bindable
    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
        notifyPropertyChanged(BR.sB);
    }

    @Bindable
    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
        notifyPropertyChanged(BR.sC);
    }

    @Bindable
    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
        notifyPropertyChanged(BR.sD);
    }

    @Bindable
    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
        notifyPropertyChanged(BR.sE);
    }

    @Bindable
    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
        notifyPropertyChanged(BR.sF);
    }

    @Bindable
    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
        notifyPropertyChanged(BR.sG);
    }

    @Bindable
    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
        notifyPropertyChanged(BR.sH);
    }


    @Bindable
    public String getH101() {
        return h101;
    }

    public void setH101(String h101) {
        this.h101 = h101;
        notifyPropertyChanged(BR.h101);
    }

    @Bindable
    public String getH102() {
        return h102;
    }

    public void setH102(String h102) {
        this.h102 = h102;
        notifyPropertyChanged(BR.h102);
    }

    @Bindable
    public String getH103() {
        return h103;
    }

    public void setH103(String h103) {
        this.h103 = h103;
        notifyPropertyChanged(BR.h103);
    }

    @Bindable
    public String getH104() {
        return h104;
    }

    public void setH104(String h104) {
        this.h104 = h104;
        notifyPropertyChanged(BR.h104);
    }

    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        setF101ax(f101.equals("1") ? this.f101ax : "");
        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF101ax() {
        return f101ax;
    }

    public void setF101ax(String f101ax) {
        this.f101ax = f101ax;
        notifyPropertyChanged(BR.f101ax);
    }

    @Bindable
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
        setF102ax(f102.equals("1") ? this.f102ax : "");
        notifyPropertyChanged(BR.f102);
    }

    @Bindable
    public String getF102ax() {
        return f102ax;
    }

    public void setF102ax(String f102ax) {
        this.f102ax = f102ax;
        notifyPropertyChanged(BR.f102ax);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        setF103ax(f103.equals("1") ? this.f103ax : "");
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF103ax() {
        return f103ax;
    }

    public void setF103ax(String f103ax) {
        this.f103ax = f103ax;
        notifyPropertyChanged(BR.f103ax);
    }

    @Bindable
    public String getF104() {
        return f104;
    }

    public void setF104(String f104) {
        this.f104 = f104;
        setF104ax(f104.equals("1") ? this.f104ax : "");
        notifyPropertyChanged(BR.f104);
    }


    @Bindable
    public String getF104ax() {
        return f104ax;
    }

    public void setF104ax(String f104ax) {
        this.f104ax = f104ax;
        notifyPropertyChanged(BR.f104ax);
    }

    @Bindable
    public String getF105() {
        return f105;
    }

    public void setF105(String f105) {
        this.f105 = f105;
        setF105ax(f105.equals("1") ? this.f105ax : "");
        notifyPropertyChanged(BR.f105);
    }


    @Bindable
    public String getF105ax() {
        return f105ax;
    }

    public void setF105ax(String f105ax) {
        this.f105ax = f105ax;
        notifyPropertyChanged(BR.f105ax);
    }

    @Bindable
    public String getF106() {
        return f106;
    }

    public void setF106(String f106) {
        this.f106 = f106;
        setF106ax(f106.equals("1") ? this.f106ax : "");
        notifyPropertyChanged(BR.f106);
    }

    @Bindable
    public String getF106ax() {
        return f106ax;
    }

    public void setF106ax(String f106ax) {
        this.f106ax = f106ax;
        notifyPropertyChanged(BR.f106ax);
    }

    @Bindable
    public String getF1image() {
        return f1image;
    }

    public void setF1image(String f1image) {
        this.f1image = f1image;
        notifyPropertyChanged(BR.f1image);
    }

    @Bindable
    public String getF201() {
        return f201;
    }

    public void setF201(String f201) {
        this.f201 = f201;
        setF201ax(f201.equals("1") ? this.f201ax : "");
        notifyPropertyChanged(BR.f201);
    }

    @Bindable
    public String getF201ax() {
        return f201ax;
    }

    public void setF201ax(String f201ax) {
        this.f201ax = f201ax;
        notifyPropertyChanged(BR.f201ax);
    }

    @Bindable
    public String getF202() {
        return f202;
    }

    public void setF202(String f202) {
        this.f202 = f202;
        setF202ax(f202.equals("1") ? this.f202ax : "");
        notifyPropertyChanged(BR.f202);
    }

    @Bindable
    public String getF202ax() {
        return f202ax;
    }

    public void setF202ax(String f202ax) {
        this.f202ax = f202ax;
        notifyPropertyChanged(BR.f202ax);
    }

    @Bindable
    public String getF203() {
        return f203;
    }

    public void setF203(String f203) {
        this.f203 = f203;
        setF203ax(f203.equals("1") ? this.f203ax : "");
        notifyPropertyChanged(BR.f203);
    }

    @Bindable
    public String getF203ax() {
        return f203ax;
    }

    public void setF203ax(String f203ax) {
        this.f203ax = f203ax;
        notifyPropertyChanged(BR.f203ax);
    }

    @Bindable
    public String getF2image() {
        return f2image;
    }

    public void setF2image(String f2image) {
        this.f2image = f2image;
        notifyPropertyChanged(BR.f2image);
    }

    @Bindable
    public String getF301() {
        return f301;
    }

    public void setF301(String f301) {
        this.f301 = f301;
        setF301ax(f301.equals("1") ? this.f301ax : "");
        notifyPropertyChanged(BR.f301);
    }

    @Bindable
    public String getF301ax() {
        return f301ax;
    }

    public void setF301ax(String f301ax) {
        this.f301ax = f301ax;
        notifyPropertyChanged(BR.f301ax);
    }

    @Bindable
    public String getF302() {
        return f302;
    }

    public void setF302(String f302) {
        this.f302 = f302;
        setF302ax(f301.equals("1") ? this.f302ax : "");
        notifyPropertyChanged(BR.f302);
    }

    @Bindable
    public String getF302ax() {
        return f302ax;
    }

    public void setF302ax(String f302ax) {
        this.f302ax = f302ax;
        notifyPropertyChanged(BR.f302ax);
    }

    @Bindable
    public String getF303() {
        return f303;
    }

    public void setF303(String f303) {
        this.f303 = f303;
        setF303ax(f303.equals("1") ? this.f303ax : "");
        notifyPropertyChanged(BR.f303);
    }

    @Bindable
    public String getF303ax() {
        return f303ax;
    }

    public void setF303ax(String f303ax) {
        this.f303ax = f303ax;
        notifyPropertyChanged(BR.f303ax);
    }

    @Bindable
    public String getF304() {
        return f304;
    }

    public void setF304(String f304) {
        this.f304 = f304;
        setF304ax(f304.equals("1") ? this.f304ax : "");
        notifyPropertyChanged(BR.f304);
    }

    @Bindable
    public String getF304ax() {
        return f304ax;
    }

    public void setF304ax(String f304ax) {
        this.f304ax = f304ax;
        notifyPropertyChanged(BR.f304ax);
    }

    @Bindable
    public String getF305() {
        return f305;
    }

    public void setF305(String f305) {
        this.f305 = f305;
        setF305ax(f305.equals("1") ? this.f305ax : "");
        notifyPropertyChanged(BR.f305);
    }

    @Bindable
    public String getF305ax() {
        return f305ax;
    }

    public void setF305ax(String f305ax) {
        this.f305ax = f305ax;
        notifyPropertyChanged(BR.f305ax);
    }

    @Bindable
    public String getF306() {
        return f306;
    }

    public void setF306(String f306) {
        this.f306 = f306;
        setF306ax(f306.equals("1") ? this.f306ax : "");
        notifyPropertyChanged(BR.f306);
    }

    @Bindable
    public String getF306ax() {
        return f306ax;
    }

    public void setF306ax(String f306ax) {
        this.f306ax = f306ax;
        notifyPropertyChanged(BR.f306ax);
    }

    @Bindable
    public String getF307() {
        return f307;
    }

    public void setF307(String f307) {
        this.f307 = f307;
        setF307ax(f307.equals("1") ? this.f307ax : "");
        notifyPropertyChanged(BR.f307);
    }

    @Bindable
    public String getF307ax() {
        return f307ax;
    }

    public void setF307ax(String f307ax) {
        this.f307ax = f307ax;
        notifyPropertyChanged(BR.f307ax);
    }

    @Bindable
    public String getF308() {
        return f308;
    }

    public void setF308(String f308) {
        this.f308 = f308;
        setF308ax(f308.equals("1") ? this.f308ax : "");
        notifyPropertyChanged(BR.f308);
    }

    @Bindable
    public String getF308ax() {
        return f308ax;
    }

    public void setF308ax(String f308ax) {
        this.f308ax = f308ax;
        notifyPropertyChanged(BR.f308ax);
    }

    @Bindable
    public String getF309() {
        return f309;
    }

    public void setF309(String f309) {
        this.f309 = f309;
        setF309ax(f309.equals("1") ? this.f309ax : "");
        notifyPropertyChanged(BR.f309);
    }

    @Bindable
    public String getF309ax() {
        return f309ax;
    }

    public void setF309ax(String f309ax) {
        this.f309ax = f309ax;
        notifyPropertyChanged(BR.f309ax);
    }

    @Bindable
    public String getF310() {
        return f310;
    }

    public void setF310(String f310) {
        this.f310 = f310;
        setF310ax(f310.equals("1") ? this.f310ax : "");
        notifyPropertyChanged(BR.f310);
    }

    @Bindable
    public String getF310ax() {
        return f310ax;
    }

    public void setF310ax(String f310ax) {
        this.f310ax = f310ax;
        notifyPropertyChanged(BR.f310ax);
    }

    @Bindable
    public String getF311() {
        return f311;
    }

    public void setF311(String f311) {
        this.f311 = f311;
        setF311ax(f311.equals("1") ? this.f311ax : "");
        notifyPropertyChanged(BR.f311);
    }

    @Bindable
    public String getF311ax() {
        return f311ax;
    }

    public void setF311ax(String f311ax) {
        this.f311ax = f311ax;
        notifyPropertyChanged(BR.f311ax);
    }

    @Bindable
    public String getF312() {
        return f312;
    }

    public void setF312(String f312) {
        this.f312 = f312;
        setF312ax(f312.equals("1") ? this.f312ax : "");
        notifyPropertyChanged(BR.f312);
    }

    @Bindable
    public String getF312ax() {
        return f312ax;
    }

    public void setF312ax(String f312ax) {
        this.f312ax = f312ax;
        notifyPropertyChanged(BR.f312ax);
    }

    @Bindable
    public String getF313() {
        return f313;
    }

    public void setF313(String f313) {
        this.f313 = f313;
        setF313ax(f313.equals("1") ? this.f313ax : "");
        notifyPropertyChanged(BR.f313);
    }

    @Bindable
    public String getF313ax() {
        return f313ax;
    }

    public void setF313ax(String f313ax) {
        this.f313ax = f313ax;
        notifyPropertyChanged(BR.f313ax);
    }

    @Bindable
    public String getF314() {
        return f314;
    }

    public void setF314(String f314) {
        this.f314 = f314;
        setF314ax(f314.equals("1") ? this.f314ax : "");
        notifyPropertyChanged(BR.f314);
    }

    @Bindable
    public String getF314ax() {
        return f314ax;
    }

    public void setF314ax(String f314ax) {
        this.f314ax = f314ax;
        notifyPropertyChanged(BR.f314ax);
    }

    @Bindable
    public String getF315() {
        return f315;
    }

    public void setF315(String f315) {
        this.f315 = f315;
        setF315ax(f315.equals("1") ? this.f315ax : "");
        notifyPropertyChanged(BR.f315);
    }

    @Bindable
    public String getF315ax() {
        return f315ax;
    }

    public void setF315ax(String f315ax) {
        this.f315ax = f315ax;
        notifyPropertyChanged(BR.f315ax);
    }

    @Bindable
    public String getF316() {
        return f316;
    }

    public void setF316(String f316) {
        this.f316 = f316;
        setF316ax(f316.equals("1") ? this.f316ax : "");
        notifyPropertyChanged(BR.f316);
    }

    @Bindable
    public String getF316ax() {
        return f316ax;
    }

    public void setF316ax(String f316ax) {
        this.f316ax = f316ax;
        notifyPropertyChanged(BR.f316ax);
    }

    @Bindable
    public String getF317() {
        return f317;
    }

    public void setF317(String f317) {
        this.f317 = f317;
        setF317ax(f317.equals("1") ? this.f317ax : "");
        notifyPropertyChanged(BR.f317);
    }

    @Bindable
    public String getF317ax() {
        return f317ax;
    }

    public void setF317ax(String f317ax) {
        this.f317ax = f317ax;
        notifyPropertyChanged(BR.f317ax);
    }

    @Bindable
    public String getF318() {
        return f318;
    }

    public void setF318(String f318) {
        this.f318 = f318;
        setF318ax(f318.equals("1") ? this.f318ax : "");
        notifyPropertyChanged(BR.f318);
    }

    @Bindable
    public String getF318ax() {
        return f318ax;
    }

    public void setF318ax(String f318ax) {
        this.f318ax = f318ax;
        notifyPropertyChanged(BR.f318ax);
    }

    @Bindable
    public String getF319() {
        return f319;
    }

    public void setF319(String f319) {
        this.f319 = f319;
        setF319ax(f319.equals("1") ? this.f319ax : "");
        notifyPropertyChanged(BR.f319);
    }

    @Bindable
    public String getF319ax() {
        return f319ax;
    }

    public void setF319ax(String f319ax) {
        this.f319ax = f319ax;
        notifyPropertyChanged(BR.f319ax);
    }

    @Bindable
    public String getF320() {
        return f320;
    }

    public void setF320(String f320) {
        this.f320 = f320;
        setF320ax(f320.equals("1") ? this.f320ax : "");
        notifyPropertyChanged(BR.f320);
    }

    @Bindable
    public String getF320ax() {
        return f320ax;
    }

    public void setF320ax(String f320ax) {
        this.f320ax = f320ax;
        notifyPropertyChanged(BR.f320ax);
    }

    @Bindable
    public String getF321() {
        return f321;
    }

    public void setF321(String f321) {
        this.f321 = f321;
        setF321ax(f321.equals("1") ? this.f321ax : "");
        notifyPropertyChanged(BR.f321);
    }

    @Bindable
    public String getF321ax() {
        return f321ax;
    }

    public void setF321ax(String f321ax) {
        this.f321ax = f321ax;
        notifyPropertyChanged(BR.f321ax);
    }

    @Bindable
    public String getF322() {
        return f322;
    }

    public void setF322(String f322) {
        this.f322 = f322;
        setF322ax(f322.equals("1") ? this.f322ax : "");
        notifyPropertyChanged(BR.f322);
    }

    @Bindable
    public String getF322ax() {
        return f322ax;
    }

    public void setF322ax(String f322ax) {
        this.f322ax = f322ax;
        notifyPropertyChanged(BR.f322ax);
    }

    @Bindable
    public String getF323() {
        return f323;
    }

    public void setF323(String f323) {
        this.f323 = f323;
        setF323ax(f323.equals("1") ? this.f323ax : "");
        notifyPropertyChanged(BR.f323);
    }

    @Bindable
    public String getF323ax() {
        return f323ax;
    }

    public void setF323ax(String f323ax) {
        this.f323ax = f323ax;
        notifyPropertyChanged(BR.f323ax);
    }

    @Bindable
    public String getF324() {
        return f324;
    }

    public void setF324(String f324) {
        this.f324 = f324;
        setF324ax(f324.equals("1") ? this.f324ax : "");
        notifyPropertyChanged(BR.f324);
    }

    @Bindable
    public String getF324ax() {
        return f324ax;
    }

    public void setF324ax(String f324ax) {
        this.f324ax = f324ax;
        notifyPropertyChanged(BR.f324ax);
    }

    @Bindable
    public String getF325() {
        return f325;
    }

    public void setF325(String f325) {
        this.f325 = f325;
        setF325ax(f325.equals("1") ? this.f325ax : "");
        notifyPropertyChanged(BR.f325);
    }

    @Bindable
    public String getF325ax() {
        return f325ax;
    }

    public void setF325ax(String f325ax) {
        this.f325ax = f325ax;
        notifyPropertyChanged(BR.f325ax);
    }

    @Bindable
    public String getF326() {
        return f326;
    }

    public void setF326(String f326) {
        this.f326 = f326;
        setF326ax(f326.equals("1") ? this.f326ax : "");
        notifyPropertyChanged(BR.f326);
    }

    @Bindable
    public String getF326ax() {
        return f326ax;
    }

    public void setF326ax(String f326ax) {
        this.f326ax = f326ax;
        notifyPropertyChanged(BR.f326ax);
    }

    @Bindable
    public String getF327() {
        return f327;
    }

    public void setF327(String f327) {
        this.f327 = f327;
        setF327ax(f327.equals("1") ? this.f327ax : "");
        notifyPropertyChanged(BR.f327);
    }

    @Bindable
    public String getF327ax() {
        return f327ax;
    }

    public void setF327ax(String f327ax) {
        this.f327ax = f327ax;
        notifyPropertyChanged(BR.f327ax);
    }

    @Bindable
    public String getF328() {
        return f328;
    }

    public void setF328(String f328) {
        this.f328 = f328;
        setF328ax(f328.equals("1") ? this.f328ax : "");
        notifyPropertyChanged(BR.f328);
    }

    @Bindable
    public String getF328ax() {
        return f328ax;
    }

    public void setF328ax(String f328ax) {
        this.f328ax = f328ax;
        notifyPropertyChanged(BR.f328ax);
    }

    @Bindable
    public String getF329() {
        return f329;
    }

    public void setF329(String f329) {
        this.f329 = f329;
        setF329ax(f329.equals("1") ? this.f329ax : "");
        notifyPropertyChanged(BR.f329);
    }

    @Bindable
    public String getF329ax() {
        return f329ax;
    }

    public void setF329ax(String f329ax) {
        this.f329ax = f329ax;
        notifyPropertyChanged(BR.f329ax);
    }

    @Bindable
    public String getF330() {
        return f330;
    }

    public void setF330(String f330) {
        this.f330 = f330;
        setF330ax(f330.equals("1") ? this.f330ax : "");
        notifyPropertyChanged(BR.f330);
    }

    @Bindable
    public String getF330ax() {
        return f330ax;
    }

    public void setF330ax(String f330ax) {
        this.f330ax = f330ax;
        notifyPropertyChanged(BR.f330ax);
    }

    @Bindable
    public String getF331() {
        return f331;
    }

    public void setF331(String f331) {
        this.f331 = f331;
        setF331ax(f331.equals("1") ? this.f331ax : "");
        notifyPropertyChanged(BR.f331);
    }

    @Bindable
    public String getF331ax() {
        return f331ax;
    }

    public void setF331ax(String f331ax) {
        this.f331ax = f331ax;
        notifyPropertyChanged(BR.f331ax);
    }

    @Bindable
    public String getF332() {
        return f332;
    }

    public void setF332(String f332) {
        this.f332 = f332;
        setF332ax(f332.equals("1") ? this.f332ax : "");
        notifyPropertyChanged(BR.f332);
    }

    @Bindable
    public String getF332ax() {
        return f332ax;
    }

    public void setF332ax(String f332ax) {
        this.f332ax = f332ax;
        notifyPropertyChanged(BR.f332ax);
    }

    @Bindable
    public String getF333() {
        return f333;
    }

    public void setF333(String f333) {
        this.f333 = f333;
        setF333ax(f333.equals("1") ? this.f333ax : "");
        notifyPropertyChanged(BR.f333);
    }

    @Bindable
    public String getF333ax() {
        return f333ax;
    }

    public void setF333ax(String f333ax) {
        this.f333ax = f333ax;
        notifyPropertyChanged(BR.f333ax);
    }

    @Bindable
    public String getF334() {
        return f334;
    }

    public void setF334(String f334) {
        this.f334 = f334;
        setF334ax(f334.equals("1") ? this.f334ax : "");
        notifyPropertyChanged(BR.f334);
    }

    @Bindable
    public String getF334ax() {
        return f334ax;
    }

    public void setF334ax(String f334ax) {
        this.f334ax = f334ax;
        notifyPropertyChanged(BR.f334ax);
    }

    @Bindable
    public String getF335() {
        return f335;
    }

    public void setF335(String f335) {
        this.f335 = f335;
        setF335ax(f335.equals("1") ? this.f335ax : "");
        notifyPropertyChanged(BR.f335);
    }

    @Bindable
    public String getF335ax() {
        return f335ax;
    }

    public void setF335ax(String f335ax) {
        this.f335ax = f335ax;
        notifyPropertyChanged(BR.f335ax);
    }

    @Bindable
    public String getF336() {
        return f336;
    }

    public void setF336(String f336) {
        this.f336 = f336;
        setF336ax(f336.equals("1") ? this.f336ax : "");
        notifyPropertyChanged(BR.f336);
    }

    @Bindable
    public String getF336ax() {
        return f336ax;
    }

    public void setF336ax(String f336ax) {
        this.f336ax = f336ax;
        notifyPropertyChanged(BR.f336ax);
    }

    @Bindable
    public String getF337() {
        return f337;
    }

    public void setF337(String f337) {
        this.f337 = f337;
        setF337ax(f337.equals("1") ? this.f337ax : "");
        notifyPropertyChanged(BR.f337);
    }

    @Bindable
    public String getF337ax() {
        return f337ax;
    }

    public void setF337ax(String f337ax) {
        this.f337ax = f337ax;
        notifyPropertyChanged(BR.f337ax);
    }

    @Bindable
    public String getF338() {
        return f338;
    }

    public void setF338(String f338) {
        this.f338 = f338;
        setF338ax(f338.equals("1") ? this.f338ax : "");
        notifyPropertyChanged(BR.f338);
    }

    @Bindable
    public String getF338ax() {
        return f338ax;
    }

    public void setF338ax(String f338ax) {
        this.f338ax = f338ax;
        notifyPropertyChanged(BR.f338ax);
    }

    @Bindable
    public String getF339() {
        return f339;
    }

    public void setF339(String f339) {
        this.f339 = f339;
        setF339ax(f339.equals("1") ? this.f339ax : "");
        notifyPropertyChanged(BR.f339);
    }

    @Bindable
    public String getF339ax() {
        return f339ax;
    }

    public void setF339ax(String f339ax) {
        this.f339ax = f339ax;
        notifyPropertyChanged(BR.f339ax);
    }

    @Bindable
    public String getF340() {
        return f340;
    }

    public void setF340(String f340) {
        this.f340 = f340;
        setF340ax(f340.equals("1") ? this.f340ax : "");
        notifyPropertyChanged(BR.f340);
    }

    @Bindable
    public String getF340ax() {
        return f340ax;
    }

    public void setF340ax(String f340ax) {
        this.f340ax = f340ax;
        notifyPropertyChanged(BR.f340ax);
    }

    @Bindable
    public String getF341() {
        return f341;
    }

    public void setF341(String f341) {
        this.f341 = f341;
        setF341ax(f341.equals("1") ? this.f341ax : "");
        notifyPropertyChanged(BR.f341);
    }

    @Bindable
    public String getF341ax() {
        return f341ax;
    }

    public void setF341ax(String f341ax) {
        this.f341ax = f341ax;
        notifyPropertyChanged(BR.f341ax);
    }

    @Bindable
    public String getF342() {
        return f342;
    }

    public void setF342(String f342) {
        this.f342 = f342;
        setF342ax(f342.equals("1") ? this.f342ax : "");
        notifyPropertyChanged(BR.f342);
    }

    @Bindable
    public String getF342ax() {
        return f342ax;
    }

    public void setF342ax(String f342ax) {
        this.f342ax = f342ax;
        notifyPropertyChanged(BR.f342ax);
    }

    @Bindable
    public String getF3image() {
        return f3image;
    }

    public void setF3image(String f3image) {
        this.f3image = f3image;
        notifyPropertyChanged(BR.f3image);
    }

    @Bindable
    public String getF401() {
        return f401;
    }

    public void setF401(String f401) {
        this.f401 = f401;
        setF401ax(f401.equals("1") ? this.f401ax : "");
        notifyPropertyChanged(BR.f401);
    }

    @Bindable
    public String getF401ax() {
        return f401ax;
    }

    public void setF401ax(String f401ax) {
        this.f401ax = f401ax;
        notifyPropertyChanged(BR.f401ax);
    }

    @Bindable
    public String getF402() {
        return f402;
    }

    public void setF402(String f402) {
        this.f402 = f402;
        setF402ax(f402.equals("1") ? this.f402ax : "");
        notifyPropertyChanged(BR.f402);
    }

    @Bindable
    public String getF402ax() {
        return f402ax;
    }

    public void setF402ax(String f402ax) {
        this.f402ax = f402ax;
        notifyPropertyChanged(BR.f402ax);
    }

    @Bindable
    public String getF403() {
        return f403;
    }

    public void setF403(String f403) {
        this.f403 = f403;
        setF403ax(f403.equals("1") ? this.f403ax : "");
        notifyPropertyChanged(BR.f403);
    }

    @Bindable
    public String getF403ax() {
        return f403ax;
    }

    public void setF403ax(String f403ax) {
        this.f403ax = f403ax;
        notifyPropertyChanged(BR.f403ax);
    }

    @Bindable
    public String getF404() {
        return f404;
    }

    public void setF404(String f404) {
        this.f404 = f404;
        setF404ax(f404.equals("1") ? this.f404ax : "");
        notifyPropertyChanged(BR.f404);
    }

    @Bindable
    public String getF404ax() {
        return f404ax;
    }

    public void setF404ax(String f404ax) {
        this.f404ax = f404ax;
        notifyPropertyChanged(BR.f404ax);
    }

    @Bindable
    public String getF405() {
        return f405;
    }

    public void setF405(String f405) {
        this.f405 = f405;
        setF405ax(f405.equals("1") ? this.f405ax : "");
        notifyPropertyChanged(BR.f405);
    }

    @Bindable
    public String getF405ax() {
        return f405ax;
    }

    public void setF405ax(String f405ax) {
        this.f405ax = f405ax;
        notifyPropertyChanged(BR.f405ax);
    }

    @Bindable
    public String getF406() {
        return f406;
    }

    public void setF406(String f406) {
        this.f406 = f406;
        setF406ax(f406.equals("1") ? this.f406ax : "");
        notifyPropertyChanged(BR.f406);
    }

    @Bindable
    public String getF406ax() {
        return f406ax;
    }

    public void setF406ax(String f406ax) {
        this.f406ax = f406ax;
        notifyPropertyChanged(BR.f406ax);
    }

    @Bindable
    public String getF407() {
        return f407;
    }

    public void setF407(String f407) {
        this.f407 = f407;
        setF407ax(f407.equals("1") ? this.f407ax : "");
        notifyPropertyChanged(BR.f407);
    }

    @Bindable
    public String getF407ax() {
        return f407ax;
    }

    public void setF407ax(String f407ax) {
        this.f407ax = f407ax;
        notifyPropertyChanged(BR.f407ax);
    }

    @Bindable
    public String getF408() {
        return f408;
    }

    public void setF408(String f408) {
        this.f408 = f408;
        setF408ax(f408.equals("1") ? this.f408ax : "");
        notifyPropertyChanged(BR.f408);
    }

    @Bindable
    public String getF408ax() {
        return f408ax;
    }

    public void setF408ax(String f408ax) {
        this.f408ax = f408ax;
        notifyPropertyChanged(BR.f408ax);
    }

    @Bindable
    public String getF409() {
        return f409;
    }

    public void setF409(String f409) {
        this.f409 = f409;
        setF409ax(f409.equals("1") ? this.f409ax : "");
        notifyPropertyChanged(BR.f409);
    }

    @Bindable
    public String getF409ax() {
        return f409ax;
    }

    public void setF409ax(String f409ax) {
        this.f409ax = f409ax;
        notifyPropertyChanged(BR.f409ax);
    }

    @Bindable
    public String getF410() {
        return f410;
    }

    public void setF410(String f410) {
        this.f410 = f410;
        setF410ax(f410.equals("1") ? this.f410ax : "");
        notifyPropertyChanged(BR.f410);
    }

    @Bindable
    public String getF410ax() {
        return f410ax;
    }

    public void setF410ax(String f410ax) {
        this.f410ax = f410ax;
        notifyPropertyChanged(BR.f410ax);
    }

    @Bindable
    public String getF411() {
        return f411;
    }

    public void setF411(String f411) {
        this.f411 = f411;
        setF411ax(f411.equals("1") ? this.f411ax : "");
        notifyPropertyChanged(BR.f411);
    }

    @Bindable
    public String getF411ax() {
        return f411ax;
    }

    public void setF411ax(String f411ax) {
        this.f411ax = f411ax;
        notifyPropertyChanged(BR.f411ax);
    }

    @Bindable
    public String getF412() {
        return f412;
    }

    public void setF412(String f412) {
        this.f412 = f412;
        setF412ax(f412.equals("1") ? this.f412ax : "");
        notifyPropertyChanged(BR.f412);
    }

    @Bindable
    public String getF412ax() {
        return f412ax;
    }

    public void setF412ax(String f412ax) {
        this.f412ax = f412ax;
        notifyPropertyChanged(BR.f412ax);
    }

    @Bindable
    public String getF413() {
        return f413;
    }

    public void setF413(String f413) {
        this.f413 = f413;
        setF413ax(f413.equals("1") ? this.f413ax : "");
        notifyPropertyChanged(BR.f413);
    }

    @Bindable
    public String getF413ax() {
        return f413ax;
    }

    public void setF413ax(String f413ax) {
        this.f413ax = f413ax;
        notifyPropertyChanged(BR.f413ax);
    }

    @Bindable
    public String getF414() {
        return f414;
    }

    public void setF414(String f414) {
        this.f414 = f414;
        setF414ax(f414.equals("1") ? this.f414ax : "");
        notifyPropertyChanged(BR.f414);
    }

    @Bindable
    public String getF414ax() {
        return f414ax;
    }

    public void setF414ax(String f414ax) {
        this.f414ax = f414ax;
        notifyPropertyChanged(BR.f414ax);
    }

    @Bindable
    public String getF415() {
        return f415;
    }

    public void setF415(String f415) {
        this.f415 = f415;
        setF415ax(f415.equals("1") ? this.f415ax : "");
        notifyPropertyChanged(BR.f415);
    }

    @Bindable
    public String getF415ax() {
        return f415ax;
    }

    public void setF415ax(String f415ax) {
        this.f415ax = f415ax;
        notifyPropertyChanged(BR.f415ax);
    }

    @Bindable
    public String getF416() {
        return f416;
    }

    public void setF416(String f416) {
        this.f416 = f416;
        setF416ax(f416.equals("1") ? this.f416ax : "");
        notifyPropertyChanged(BR.f416);
    }

    @Bindable
    public String getF416ax() {
        return f416ax;
    }

    public void setF416ax(String f416ax) {
        this.f416ax = f416ax;
        notifyPropertyChanged(BR.f416ax);
    }

    @Bindable
    public String getF417() {
        return f417;
    }

    public void setF417(String f417) {
        this.f417 = f417;
        setF417ax(f417.equals("1") ? this.f417ax : "");
        notifyPropertyChanged(BR.f417);
    }

    @Bindable
    public String getF417ax() {
        return f417ax;
    }

    public void setF417ax(String f417ax) {
        this.f417ax = f417ax;
        notifyPropertyChanged(BR.f417ax);
    }

    @Bindable
    public String getF418() {
        return f418;
    }

    public void setF418(String f418) {
        this.f418 = f418;
        setF418ax(f418.equals("1") ? this.f418ax : "");
        notifyPropertyChanged(BR.f418);
    }

    @Bindable
    public String getF418ax() {
        return f418ax;
    }

    public void setF418ax(String f418ax) {
        this.f418ax = f418ax;
        notifyPropertyChanged(BR.f418ax);
    }

    @Bindable
    public String getF419() {
        return f419;
    }

    public void setF419(String f419) {
        this.f419 = f419;
        setF419ax(f419.equals("1") ? this.f419ax : "");
        notifyPropertyChanged(BR.f419);
    }

    @Bindable
    public String getF419ax() {
        return f419ax;
    }

    public void setF419ax(String f419ax) {
        this.f419ax = f419ax;
        notifyPropertyChanged(BR.f419ax);
    }

    @Bindable
    public String getF4image() {
        return f4image;
    }

    public void setF4image(String f4image) {
        this.f4image = f4image;
        notifyPropertyChanged(BR.f4image);
    }

    @Bindable
    public String getF501() {
        return f501;
    }

    public void setF501(String f501) {
        this.f501 = f501;
        setF501ax(f501.equals("1") ? this.f501ax : "");
        notifyPropertyChanged(BR.f501);
    }

    @Bindable
    public String getF501ax() {
        return f501ax;
    }

    public void setF501ax(String f501ax) {
        this.f501ax = f501ax;
        notifyPropertyChanged(BR.f501ax);
    }

    @Bindable
    public String getF502() {
        return f502;
    }

    public void setF502(String f502) {
        this.f502 = f502;
        setF502ax(f502.equals("1") ? this.f502ax : "");
        notifyPropertyChanged(BR.f502);
    }

    @Bindable
    public String getF502ax() {
        return f502ax;
    }

    public void setF502ax(String f502ax) {
        this.f502ax = f502ax;
        notifyPropertyChanged(BR.f502ax);
    }

    @Bindable
    public String getF503() {
        return f503;
    }

    public void setF503(String f503) {
        this.f503 = f503;
        setF503ax(f503.equals("1") ? this.f503ax : "");
        notifyPropertyChanged(BR.f503);
    }

    @Bindable
    public String getF503ax() {
        return f503ax;
    }

    public void setF503ax(String f503ax) {
        this.f503ax = f503ax;
        notifyPropertyChanged(BR.f503ax);
    }


    @Bindable
    public String getF504() {
        return f504;
    }

    public void setF504(String f504) {
        this.f504 = f504;
        setF504ax(f504.equals("1") ? this.f504ax : "");
        notifyPropertyChanged(BR.f504);
    }

    @Bindable
    public String getF504ax() {
        return f504ax;
    }

    public void setF504ax(String f504ax) {
        this.f504ax = f504ax;
        notifyPropertyChanged(BR.f504ax);
    }

    @Bindable
    public String getF505() {
        return f505;
    }

    public void setF505(String f505) {
        this.f505 = f505;
        setF505ax(f505.equals("1") ? this.f505ax : "");
        notifyPropertyChanged(BR.f505);
    }

    @Bindable
    public String getF505ax() {
        return f505ax;
    }

    public void setF505ax(String f505ax) {
        this.f505ax = f505ax;
        notifyPropertyChanged(BR.f505ax);
    }

    @Bindable
    public String getF506() {
        return f506;
    }

    public void setF506(String f506) {
        this.f506 = f506;
        setF506ax(f506.equals("1") ? this.f506ax : "");
        notifyPropertyChanged(BR.f506);
    }

    @Bindable
    public String getF506ax() {
        return f506ax;
    }

    public void setF506ax(String f506ax) {
        this.f506ax = f506ax;
        notifyPropertyChanged(BR.f506ax);
    }

    @Bindable
    public String getF507() {
        return f507;
    }

    public void setF507(String f507) {
        this.f507 = f507;
        setF507ax(f507.equals("1") ? this.f507ax : "");
        notifyPropertyChanged(BR.f507);
    }

    @Bindable
    public String getF507ax() {
        return f507ax;
    }

    public void setF507ax(String f507ax) {
        this.f507ax = f507ax;
        notifyPropertyChanged(BR.f507ax);
    }

    @Bindable
    public String getF508() {
        return f508;
    }

    public void setF508(String f508) {
        this.f508 = f508;
        setF508ax(f508.equals("1") ? this.f508ax : "");
        notifyPropertyChanged(BR.f508);
    }

    @Bindable
    public String getF508ax() {
        return f508ax;
    }

    public void setF508ax(String f508ax) {
        this.f508ax = f508ax;
        notifyPropertyChanged(BR.f508ax);
    }

    @Bindable
    public String getF509() {
        return f509;
    }

    public void setF509(String f509) {
        this.f509 = f509;
        setF509ax(f509.equals("1") ? this.f509ax : "");
        notifyPropertyChanged(BR.f509);
    }

    @Bindable
    public String getF509ax() {
        return f509ax;
    }

    public void setF509ax(String f509ax) {
        this.f509ax = f509ax;
        notifyPropertyChanged(BR.f509ax);
    }

    @Bindable
    public String getF510() {
        return f510;
    }

    public void setF510(String f510) {
        this.f510 = f510;
        setF510ax(f510.equals("1") ? this.f510ax : "");
        notifyPropertyChanged(BR.f510);
    }

    @Bindable
    public String getF510ax() {
        return f510ax;
    }

    public void setF510ax(String f510ax) {
        this.f510ax = f510ax;
        notifyPropertyChanged(BR.f510ax);
    }

    @Bindable
    public String getF511() {
        return f511;
    }

    public void setF511(String f511) {
        this.f511 = f511;
        setF511ax(f511.equals("1") ? this.f511ax : "");
        notifyPropertyChanged(BR.f511);
    }

    @Bindable
    public String getF511ax() {
        return f511ax;
    }

    public void setF511ax(String f511ax) {
        this.f511ax = f511ax;
        notifyPropertyChanged(BR.f511ax);
    }

    @Bindable
    public String getF512() {
        return f512;
    }

    public void setF512(String f512) {
        this.f512 = f512;
        setF512ax(f512.equals("1") ? this.f512ax : "");
        notifyPropertyChanged(BR.f512);
    }

    @Bindable
    public String getF512ax() {
        return f512ax;
    }

    public void setF512ax(String f512ax) {
        this.f512ax = f512ax;
        notifyPropertyChanged(BR.f512ax);
    }

    @Bindable
    public String getF513() {
        return f513;
    }

    public void setF513(String f513) {
        this.f513 = f513;
        setF513ax(f513.equals("1") ? this.f513ax : "");
        notifyPropertyChanged(BR.f513);
    }

    @Bindable
    public String getF513ax() {
        return f513ax;
    }

    public void setF513ax(String f513ax) {
        this.f513ax = f513ax;
        notifyPropertyChanged(BR.f513ax);
    }

    @Bindable
    public String getF514() {
        return f514;
    }

    public void setF514(String f514) {
        this.f514 = f514;
        setF514ax(f514.equals("1") ? this.f514ax : "");
        notifyPropertyChanged(BR.f514);
    }

    @Bindable
    public String getF514ax() {
        return f514ax;
    }

    public void setF514ax(String f514ax) {
        this.f514ax = f514ax;
        notifyPropertyChanged(BR.f514ax);
    }

    @Bindable
    public String getF515() {
        return f515;
    }

    public void setF515(String f515) {
        this.f515 = f515;
        setF515ax(f515.equals("1") ? this.f515ax : "");
        notifyPropertyChanged(BR.f515);
    }

    @Bindable
    public String getF515ax() {
        return f515ax;
    }

    public void setF515ax(String f515ax) {
        this.f515ax = f515ax;
        notifyPropertyChanged(BR.f515ax);
    }

    @Bindable
    public String getF516() {
        return f516;
    }

    public void setF516(String f516) {
        this.f516 = f516;
        setF516ax(f516.equals("1") ? this.f516ax : "");
        notifyPropertyChanged(BR.f516);
    }

    @Bindable
    public String getF516ax() {
        return f516ax;
    }

    public void setF516ax(String f516ax) {
        this.f516ax = f516ax;
        notifyPropertyChanged(BR.f516ax);
    }

    @Bindable
    public String getF5image() {
        return f5image;
    }

    public void setF5image(String f5image) {
        this.f5image = f5image;
        notifyPropertyChanged(BR.f5image);
    }

    @Bindable
    public String getF601() {
        return f601;
    }

    public void setF601(String f601) {
        this.f601 = f601;
        setF601ax(f601.equals("1") ? this.f601ax : "");
        notifyPropertyChanged(BR.f601);
    }

    @Bindable
    public String getF601ax() {
        return f601ax;
    }

    public void setF601ax(String f601ax) {
        this.f601ax = f601ax;
        notifyPropertyChanged(BR.f601ax);
    }

    @Bindable
    public String getF602() {
        return f602;
    }

    public void setF602(String f602) {
        this.f602 = f602;
        setF602ax(f602.equals("1") ? this.f602ax : "");
        notifyPropertyChanged(BR.f602);
    }

    @Bindable
    public String getF602ax() {
        return f602ax;
    }

    public void setF602ax(String f602ax) {
        this.f602ax = f602ax;
        notifyPropertyChanged(BR.f602ax);
    }

    @Bindable
    public String getF603() {
        return f603;
    }

    public void setF603(String f603) {
        this.f603 = f603;
        setF603ax(f603.equals("1") ? this.f603ax : "");
        notifyPropertyChanged(BR.f603);
    }

    @Bindable
    public String getF603ax() {
        return f603ax;
    }

    public void setF603ax(String f603ax) {
        this.f603ax = f603ax;
        notifyPropertyChanged(BR.f603ax);
    }

    @Bindable
    public String getF6image() {
        return f6image;
    }

    public void setF6image(String f6image) {
        this.f6image = f6image;
        notifyPropertyChanged(BR.f6image);
    }

    @Bindable
    public String getF701() {
        return f701;
    }

    public void setF701(String f701) {
        this.f701 = f701;
        setF701ax(f701.equals("1") ? this.f701ax : "");
        notifyPropertyChanged(BR.f701);
    }

    @Bindable
    public String getF701ax() {
        return f701ax;
    }

    public void setF701ax(String f701ax) {
        this.f701ax = f701ax;
        notifyPropertyChanged(BR.f701ax);
    }

    @Bindable
    public String getF702a() {
        return f702a;
    }

    public void setF702a(String f702a) {
        this.f702a = f702a;
        setF702aax(f702a.equals("1") ? this.f702aax : "");
        notifyPropertyChanged(BR.f702a);
    }

    @Bindable
    public String getF702aax() {
        return f702aax;
    }

    public void setF702aax(String f702aax) {
        this.f702aax = f702aax;
        notifyPropertyChanged(BR.f702aax);
    }

    @Bindable
    public String getF702b() {
        return f702b;
    }

    public void setF702b(String f702b) {
        this.f702b = f702b;
        setF702bax(f702b.equals("1") ? this.f702bax : "");
        notifyPropertyChanged(BR.f702b);
    }

    @Bindable
    public String getF702bax() {
        return f702bax;
    }

    public void setF702bax(String f702bax) {
        this.f702bax = f702bax;
        notifyPropertyChanged(BR.f702bax);
    }

    @Bindable
    public String getF703a() {
        return f703a;
    }

    public void setF703a(String f703a) {
        this.f703a = f703a;
        setF703aax(f703a.equals("1") ? this.f703aax : "");
        notifyPropertyChanged(BR.f703a);
    }

    @Bindable
    public String getF703aax() {
        return f703aax;
    }

    public void setF703aax(String f703aax) {
        this.f703aax = f703aax;
        notifyPropertyChanged(BR.f703aax);
    }

    @Bindable
    public String getF703b() {
        return f703b;
    }

    public void setF703b(String f703b) {
        this.f703b = f703b;
        setF703bax(f703b.equals("1") ? this.f703bax : "");
        notifyPropertyChanged(BR.f703b);
    }

    @Bindable
    public String getF703bax() {
        return f703bax;
    }

    public void setF703bax(String f703bax) {
        this.f703bax = f703bax;
        notifyPropertyChanged(BR.f703bax);
    }

    @Bindable
    public String getF703c() {
        return f703c;
    }

    public void setF703c(String f703c) {
        this.f703c = f703c;
        setF703cax(f703c.equals("1") ? this.f703cax : "");
        notifyPropertyChanged(BR.f703c);
    }

    @Bindable
    public String getF703cax() {
        return f703cax;
    }

    public void setF703cax(String f703cax) {
        this.f703cax = f703cax;
        notifyPropertyChanged(BR.f703cax);
    }

    @Bindable
    public String getF704() {
        return f704;
    }

    public void setF704(String f704) {
        this.f704 = f704;
        setF704ax(f704.equals("1") ? this.f704ax : "");
        notifyPropertyChanged(BR.f704);
    }

    @Bindable
    public String getF704ax() {
        return f704ax;
    }

    public void setF704ax(String f704ax) {
        this.f704ax = f704ax;
        notifyPropertyChanged(BR.f704ax);
    }

    @Bindable
    public String getF705() {
        return f705;
    }

    public void setF705(String f705) {
        this.f705 = f705;
        setF705ax(f705.equals("1") ? this.f705ax : "");
        notifyPropertyChanged(BR.f705);
    }

    @Bindable
    public String getF705ax() {
        return f705ax;
    }

    public void setF705ax(String f705ax) {
        this.f705ax = f705ax;
        notifyPropertyChanged(BR.f705ax);
    }

    @Bindable
    public String getF7image() {
        return f7image;
    }

    public void setF7image(String f7image) {
        this.f7image = f7image;
        notifyPropertyChanged(BR.f7image);
    }

    @Bindable
    public String getF8011() {
        return f8011;
    }

    public void setF8011(String f8011) {
        this.f8011 = f8011;
        setF8012d(f8011.equals("2") ? "" : this.f8012d);
        setF8012m(f8011.equals("2") ? "" : this.f8012m);
        notifyPropertyChanged(BR.f8011);
    }

    @Bindable
    public String getF8012m() {
        return f8012m;
    }

    public void setF8012m(String f8012m) {
        this.f8012m = f8012m;
        notifyPropertyChanged(BR.f8012m);
    }

    @Bindable
    public String getF8012d() {
        return f8012d;
    }

    public void setF8012d(String f8012d) {
        this.f8012d = f8012d;
        notifyPropertyChanged(BR.f8012d);
    }

    @Bindable
    public String getF8021() {
        return f8021;
    }

    public void setF8021(String f8021) {
        this.f8021 = f8021;
        setF8022d(f8021.equals("2") ? "" : this.f8022d);
        setF8022m(f8021.equals("2") ? "" : this.f8022m);
        notifyPropertyChanged(BR.f8021);
    }

    @Bindable
    public String getF8022m() {
        return f8022m;
    }

    public void setF8022m(String f8022m) {
        this.f8022m = f8022m;
        notifyPropertyChanged(BR.f8022m);
    }

    @Bindable
    public String getF8022d() {
        return f8022d;
    }

    public void setF8022d(String f8022d) {
        this.f8022d = f8022d;
        notifyPropertyChanged(BR.f8022d);
    }

    @Bindable
    public String getF8031() {
        return f8031;
    }

    public void setF8031(String f8031) {
        this.f8031 = f8031;
        setF8032d(f8031.equals("2") ? "" : this.f8032d);
        setF8032m(f8031.equals("2") ? "" : this.f8032m);
        notifyPropertyChanged(BR.f8031);
    }

    @Bindable
    public String getF8032m() {
        return f8032m;
    }

    public void setF8032m(String f8032m) {
        this.f8032m = f8032m;
        notifyPropertyChanged(BR.f8032m);
    }

    @Bindable
    public String getF8032d() {
        return f8032d;
    }

    public void setF8032d(String f8032d) {
        this.f8032d = f8032d;
        notifyPropertyChanged(BR.f8032d);
    }

    @Bindable
    public String getF8041() {
        return f8041;
    }

    public void setF8041(String f8041) {
        this.f8041 = f8041;
        setF8042d(f8041.equals("2") ? "" : this.f8042d);
        setF8042m(f8041.equals("2") ? "" : this.f8042m);
        notifyPropertyChanged(BR.f8041);
    }

    @Bindable
    public String getF8042m() {
        return f8042m;
    }

    public void setF8042m(String f8042m) {
        this.f8042m = f8042m;
        notifyPropertyChanged(BR.f8042m);
    }

    @Bindable
    public String getF8042d() {
        return f8042d;
    }

    public void setF8042d(String f8042d) {
        this.f8042d = f8042d;
        notifyPropertyChanged(BR.f8042d);
    }

    @Bindable
    public String getF8051() {
        return f8051;
    }

    public void setF8051(String f8051) {
        this.f8051 = f8051;
        setF8052d(f8051.equals("2") ? "" : this.f8052d);
        setF8052m(f8051.equals("2") ? "" : this.f8052m);
        notifyPropertyChanged(BR.f8051);
    }

    @Bindable
    public String getF8052m() {
        return f8052m;
    }

    public void setF8052m(String f8052m) {
        this.f8052m = f8052m;
        notifyPropertyChanged(BR.f8052m);
    }

    @Bindable
    public String getF8052d() {
        return f8052d;
    }

    public void setF8052d(String f8052d) {
        this.f8052d = f8052d;
        notifyPropertyChanged(BR.f8052d);
    }

    @Bindable
    public String getF8061() {
        return f8061;
    }

    public void setF8061(String f8061) {
        this.f8061 = f8061;
        setF8062d(f8061.equals("2") ? "" : this.f8062d);
        setF8062m(f8061.equals("2") ? "" : this.f8062m);
        notifyPropertyChanged(BR.f8061);
    }

    @Bindable
    public String getF8062m() {
        return f8062m;
    }

    public void setF8062m(String f8062m) {
        this.f8062m = f8062m;
        notifyPropertyChanged(BR.f8062m);
    }

    @Bindable
    public String getF8062d() {
        return f8062d;
    }

    public void setF8062d(String f8062d) {
        this.f8062d = f8062d;
        notifyPropertyChanged(BR.f8062d);
    }

    @Bindable
    public String getF8071() {
        return f8071;
    }

    public void setF8071(String f8071) {
        this.f8071 = f8071;
        setF8072d(f8071.equals("2") ? "" : this.f8072d);
        setF8072m(f8071.equals("2") ? "" : this.f8072m);
        notifyPropertyChanged(BR.f8071);
    }

    @Bindable
    public String getF8072m() {
        return f8072m;
    }

    public void setF8072m(String f8072m) {
        this.f8072m = f8072m;
        notifyPropertyChanged(BR.f8072m);
    }

    @Bindable
    public String getF8072d() {
        return f8072d;
    }

    public void setF8072d(String f8072d) {
        this.f8072d = f8072d;
        notifyPropertyChanged(BR.f8072d);
    }

    @Bindable
    public String getF8081() {
        return f8081;
    }

    public void setF8081(String f8081) {
        this.f8081 = f8081;
        setF8082d(f8081.equals("2") ? "" : this.f8082d);
        setF8082m(f8081.equals("2") ? "" : this.f8082m);
        notifyPropertyChanged(BR.f8081);
    }

    @Bindable
    public String getF8082m() {
        return f8082m;
    }

    public void setF8082m(String f8082m) {
        this.f8082m = f8082m;
        notifyPropertyChanged(BR.f8082m);
    }

    @Bindable
    public String getF8082d() {
        return f8082d;
    }

    public void setF8082d(String f8082d) {
        this.f8082d = f8082d;
        notifyPropertyChanged(BR.f8082d);
    }

    @Bindable
    public String getF8091() {
        return f8091;
    }

    public void setF8091(String f8091) {
        this.f8091 = f8091;
        setF8092d(f8091.equals("2") ? "" : this.f8092d);
        setF8092m(f8091.equals("2") ? "" : this.f8092m);
        notifyPropertyChanged(BR.f8091);
    }

    @Bindable
    public String getF8092m() {
        return f8092m;
    }

    public void setF8092m(String f8092m) {
        this.f8092m = f8092m;
        notifyPropertyChanged(BR.f8092m);
    }

    @Bindable
    public String getF8092d() {
        return f8092d;
    }

    public void setF8092d(String f8092d) {
        this.f8092d = f8092d;
        notifyPropertyChanged(BR.f8092d);
    }

    @Bindable
    public String getF8image() {
        return f8image;
    }

    public void setF8image(String f8image) {
        this.f8image = f8image;
        notifyPropertyChanged(BR.f8image);
    }

    @Bindable
    public String getRsdremarks() {
        return rsdremarks;
    }

    public void setRsdremarks(String rsdremarks) {
        this.rsdremarks = rsdremarks;
        notifyPropertyChanged(BR.rsdremarks);
    }


    public Form Sync(JSONObject jsonObject) throws JSONException {
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

        this.sA = jsonObject.getString(FormsTable.COLUMN_SA);

        return this;

    }


    public Form Hydrate(Cursor cursor) {
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

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA));

        sAHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA)));
        sBHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB)));
        sCHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC)));
        sDHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD)));
        sEHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE)));
        sFHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF)));
        sGHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SG)));
        sHHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }


    public String sAtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("f101", f101)
                    .put("f101ax", f101ax)
                    .put("f102", f102)
                    .put("f102ax", f102ax)
                    .put("f103", f103)
                    .put("f103ax", f103ax)
                    .put("f104", f104)
                    .put("f104ax", f104ax)
                    .put("f105", f105)
                    .put("f105ax", f105ax)
                    .put("f106", f106)
                    .put("f106ax", f106ax)
                    .put("f1image", f1image);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sBtoString() {
        JSONObject json = new JSONObject();
        try {
            json.put("f201", f201)
                    .put("f201ax", f201ax)
                    .put("f202", f202)
                    .put("f202ax", f202ax)
                    .put("f203", f203)
                    .put("f203ax", f203ax)
                    .put("f2image", f2image);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sCtoString() {
        JSONObject json = new JSONObject();
        try {
            json.put("f301", f301)
                    .put("f301ax", f301ax)
                    .put("f302", f302)
                    .put("f302ax", f302ax)
                    .put("f303", f303)
                    .put("f303ax", f303ax)
                    .put("f304", f304)
                    .put("f304ax", f304ax)
                    .put("f305", f305)
                    .put("f305ax", f305ax)
                    .put("f306", f306)
                    .put("f306ax", f306ax)
                    .put("f307", f307)
                    .put("f307ax", f307ax)
                    .put("f308", f308)
                    .put("f308ax", f308ax)
                    .put("f309", f309)
                    .put("f309ax", f309ax)
                    .put("f310", f310)
                    .put("f310ax", f310ax)
                    .put("f311", f311)
                    .put("f311ax", f311ax)
                    .put("f312", f312)
                    .put("f312ax", f312ax)
                    .put("f313", f313)
                    .put("f313ax", f313ax)
                    .put("f314", f314)
                    .put("f314ax", f314ax)
                    .put("f315", f315)
                    .put("f315ax", f315ax)
                    .put("f316", f316)
                    .put("f316ax", f316ax)
                    .put("f317", f317)
                    .put("f317ax", f317ax)
                    .put("f318", f318)
                    .put("f318ax", f318ax)
                    .put("f319", f319)
                    .put("f319ax", f319ax)
                    .put("f320", f320)
                    .put("f320ax", f320ax)
                    .put("f321", f321)
                    .put("f321ax", f321ax)
                    .put("f322", f322)
                    .put("f322ax", f322ax)
                    .put("f323", f323)
                    .put("f323ax", f323ax)
                    .put("f324", f324)
                    .put("f324ax", f324ax)
                    .put("f325", f325)
                    .put("f325ax", f325ax)
                    .put("f326", f326)
                    .put("f326ax", f326ax)
                    .put("f327", f327)
                    .put("f327ax", f327ax)
                    .put("f328", f328)
                    .put("f328ax", f328ax)
                    .put("f329", f329)
                    .put("f329ax", f329ax)
                    .put("f330", f330)
                    .put("f330ax", f330ax)
                    .put("f331", f331)
                    .put("f331ax", f331ax)
                    .put("f332", f332)
                    .put("f332ax", f332ax)
                    .put("f333", f333)
                    .put("f333ax", f333ax)
                    .put("f334", f334)
                    .put("f334ax", f334ax)
                    .put("f335", f335)
                    .put("f335ax", f335ax)
                    .put("f336", f336)
                    .put("f336ax", f336ax)
                    .put("f337", f337)
                    .put("f337ax", f337ax)
                    .put("f338", f338)
                    .put("f338ax", f338ax)
                    .put("f339", f339)
                    .put("f339ax", f339ax)
                    .put("f340", f340)
                    .put("f340ax", f340ax)
                    .put("f341", f341)
                    .put("f341ax", f341ax)
                    .put("f342", f342)
                    .put("f342ax", f342ax)
                    .put("f3image", f3image);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sDtoString() {
        JSONObject json = new JSONObject();
        try {
            json.put("f401", f401)
                    .put("f401ax", f401ax)
                    .put("f402", f402)
                    .put("f402ax", f402ax)
                    .put("f403", f403)
                    .put("f403ax", f403ax)
                    .put("f404", f404)
                    .put("f404ax", f404ax)
                    .put("f405", f405)
                    .put("f405ax", f405ax)
                    .put("f406", f406)
                    .put("f406ax", f406ax)
                    .put("f407", f407)
                    .put("f407ax", f407ax)
                    .put("f408", f408)
                    .put("f408ax", f408ax)
                    .put("f409", f409)
                    .put("f409ax", f409ax)
                    .put("f410", f410)
                    .put("f410ax", f410ax)
                    .put("f411", f411)
                    .put("f411ax", f411ax)
                    .put("f412", f412)
                    .put("f412ax", f412ax)
                    .put("f413", f413)
                    .put("f413ax", f413ax)
                    .put("f414", f414)
                    .put("f414ax", f414ax)
                    .put("f415", f415)
                    .put("f415ax", f415ax)
                    .put("f416", f416)
                    .put("f416ax", f416ax)
                    .put("f417", f417)
                    .put("f417ax", f417ax)
                    .put("f418", f418)
                    .put("f418ax", f418ax)
                    .put("f419", f419)
                    .put("f419ax", f419ax);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sEtoString() {
        JSONObject json = new JSONObject();
        try {
            json.put("f501", f501)
                    .put("f501ax", f501ax)
                    .put("f502", f502)
                    .put("f502ax", f502ax)
                    .put("f503", f503)
                    .put("f503ax", f503ax)
                    .put("f504", f504)
                    .put("f504ax", f504ax)
                    .put("f505", f505)
                    .put("f505ax", f505ax)
                    .put("f506", f506)
                    .put("f506ax", f506ax)
                    .put("f507", f507)
                    .put("f507ax", f507ax)
                    .put("f508", f508)
                    .put("f508ax", f508ax)
                    .put("f509", f509)
                    .put("f509ax", f509ax)
                    .put("f510", f510)
                    .put("f510ax", f510ax)
                    .put("f511", f511)
                    .put("f511ax", f511ax)
                    .put("f512", f512)
                    .put("f512ax", f512ax)
                    .put("f513", f513)
                    .put("f513ax", f513ax)
                    .put("f514", f514)
                    .put("f514ax", f514ax)
                    .put("f515", f515)
                    .put("f515ax", f515ax)
                    .put("f516", f516)
                    .put("f516ax", f516ax)
                    .put("f5image", f5image);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sFtoString() {
        JSONObject json = new JSONObject();
        try {
            json.put("f601", f601)
                    .put("f601ax", f601ax)
                    .put("f602", f602)
                    .put("f602ax", f602ax)
                    .put("f603", f603)
                    .put("f603ax", f603ax)
                    .put("f6image", f6image);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sGtoString() {
        JSONObject json = new JSONObject();
        try {
            json.put("f701", f701)
                    .put("f701ax", f701ax)
                    .put("f702a", f702a)
                    .put("f702aax", f702aax)
                    .put("f702b", f702b)
                    .put("f702bax", f702bax)
                    .put("f703a", f703a)
                    .put("f703aax", f703aax)
                    .put("f703b", f703b)
                    .put("f703bax", f703bax)
                    .put("f703c", f703c)
                    .put("f703cax", f703cax)
                    .put("f704", f704)
                    .put("f704ax", f704ax)
                    .put("f705", f705)
                    .put("f705ax", f705ax)
                    .put("f7image", f7image);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sHtoString() {
        JSONObject json = new JSONObject();
        try {
            json.put("f8011", f8011)
                    .put("f8012m", f8012m)
                    .put("f8012d", f8012d)
                    .put("f8021", f8021)
                    .put("f8022m", f8022m)
                    .put("f8022d", f8022d)
                    .put("f8031", f8031)
                    .put("f8032m", f8032m)
                    .put("f8032d", f8032d)
                    .put("f8041", f8041)
                    .put("f8042m", f8042m)
                    .put("f8042d", f8042d)
                    .put("f8051", f8051)
                    .put("f8052m", f8052m)
                    .put("f8052d", f8052d)
                    .put("f8061", f8061)
                    .put("f8062m", f8062m)
                    .put("f8062d", f8062d)
                    .put("f8071", f8071)
                    .put("f8072m", f8072m)
                    .put("f8072d", f8072d)
                    .put("f8081", f8081)
                    .put("f8082m", f8082m)
                    .put("f8082d", f8082d)
                    .put("f8091", f8091)
                    .put("f8092m", f8092m)
                    .put("f8092d", f8092d)
                    .put("f8image", f8image)
                    .put("rsdremarks", rsdremarks);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
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
            json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));
            json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));
            json.put(FormsTable.COLUMN_SC, new JSONObject(sCtoString()));
            json.put(FormsTable.COLUMN_SD, new JSONObject(sDtoString()));
            json.put(FormsTable.COLUMN_SE, new JSONObject(sEtoString()));
            json.put(FormsTable.COLUMN_SF, new JSONObject(sFtoString()));
            json.put(FormsTable.COLUMN_SG, new JSONObject(sGtoString()));
            json.put(FormsTable.COLUMN_SH, new JSONObject(sHtoString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void sAHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f101 = json.getString("f101");
                this.f101ax = json.getString("f101ax");
                this.f102 = json.getString("f102");
                this.f102ax = json.getString("f102ax");
                this.f103 = json.getString("f103");
                this.f103ax = json.getString("f103ax");
                this.f104 = json.getString("f104");
                this.f104ax = json.getString("f104ax");
                this.f105 = json.getString("f105");
                this.f105ax = json.getString("f105ax");
                this.f106 = json.getString("f106");
                this.f106ax = json.getString("f106ax");
                this.f1image = json.getString("f1image");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sBHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f201 = json.getString("f201");
                this.f201ax = json.getString("f201ax");
                this.f202 = json.getString("f202");
                this.f202ax = json.getString("f202ax");
                this.f203 = json.getString("f203");
                this.f203ax = json.getString("f203ax");
                this.f2image = json.getString("f2image");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sCHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f301 = json.getString("f301");
                this.f301ax = json.getString("f301ax");
                this.f302 = json.getString("f302");
                this.f302ax = json.getString("f302ax");
                this.f303 = json.getString("f303");
                this.f303ax = json.getString("f303ax");
                this.f304 = json.getString("f304");
                this.f304ax = json.getString("f304ax");
                this.f305 = json.getString("f305");
                this.f305ax = json.getString("f305ax");
                this.f306 = json.getString("f306");
                this.f306ax = json.getString("f306ax");
                this.f307 = json.getString("f307");
                this.f307ax = json.getString("f307ax");
                this.f308 = json.getString("f308");
                this.f308ax = json.getString("f308ax");
                this.f309 = json.getString("f309");
                this.f309ax = json.getString("f309ax");
                this.f310 = json.getString("f310");
                this.f310ax = json.getString("f310ax");
                this.f311 = json.getString("f311");
                this.f311ax = json.getString("f311ax");
                this.f312 = json.getString("f312");
                this.f312ax = json.getString("f312ax");
                this.f313 = json.getString("f313");
                this.f313ax = json.getString("f313ax");
                this.f314 = json.getString("f314");
                this.f314ax = json.getString("f314ax");
                this.f315 = json.getString("f315");
                this.f315ax = json.getString("f315ax");
                this.f316 = json.getString("f316");
                this.f316ax = json.getString("f316ax");
                this.f317 = json.getString("f317");
                this.f317ax = json.getString("f317ax");
                this.f318 = json.getString("f318");
                this.f318ax = json.getString("f318ax");
                this.f319 = json.getString("f319");
                this.f319ax = json.getString("f319ax");
                this.f320 = json.getString("f320");
                this.f320ax = json.getString("f320ax");
                this.f321 = json.getString("f321");
                this.f321ax = json.getString("f321ax");
                this.f322 = json.getString("f322");
                this.f322ax = json.getString("f322ax");
                this.f323 = json.getString("f323");
                this.f323ax = json.getString("f323ax");
                this.f324 = json.getString("f324");
                this.f324ax = json.getString("f324ax");
                this.f325 = json.getString("f325");
                this.f325ax = json.getString("f325ax");
                this.f326 = json.getString("f326");
                this.f326ax = json.getString("f326ax");
                this.f327 = json.getString("f327");
                this.f327ax = json.getString("f327ax");
                this.f328 = json.getString("f328");
                this.f328ax = json.getString("f328ax");
                this.f329 = json.getString("f329");
                this.f329ax = json.getString("f329ax");
                this.f330 = json.getString("f330");
                this.f330ax = json.getString("f330ax");
                this.f331 = json.getString("f331");
                this.f331ax = json.getString("f331ax");
                this.f332 = json.getString("f332");
                this.f332ax = json.getString("f332ax");
                this.f333 = json.getString("f333");
                this.f333ax = json.getString("f333ax");
                this.f334 = json.getString("f334");
                this.f334ax = json.getString("f334ax");
                this.f335 = json.getString("f335");
                this.f335ax = json.getString("f335ax");
                this.f336 = json.getString("f336");
                this.f336ax = json.getString("f336ax");
                this.f337 = json.getString("f337");
                this.f337ax = json.getString("f337ax");
                this.f338 = json.getString("f338");
                this.f338ax = json.getString("f338ax");
                this.f339 = json.getString("f339");
                this.f339ax = json.getString("f339ax");
                this.f340 = json.getString("f340");
                this.f340ax = json.getString("f340ax");
                this.f341 = json.getString("f341");
                this.f341ax = json.getString("f341ax");
                this.f342 = json.getString("f342");
                this.f342ax = json.getString("f342ax");
                this.f3image = json.getString("f3image");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sDHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f401 = json.getString("f401");
                this.f401ax = json.getString("f401ax");
                this.f402 = json.getString("f402");
                this.f402ax = json.getString("f402ax");
                this.f403 = json.getString("f403");
                this.f403ax = json.getString("f403ax");
                this.f404 = json.getString("f404");
                this.f404ax = json.getString("f404ax");
                this.f405 = json.getString("f405");
                this.f405ax = json.getString("f405ax");
                this.f406 = json.getString("f406");
                this.f406ax = json.getString("f406ax");
                this.f407 = json.getString("f407");
                this.f407ax = json.getString("f407ax");
                this.f408 = json.getString("f408");
                this.f408ax = json.getString("f408ax");
                this.f409 = json.getString("f409");
                this.f409ax = json.getString("f409ax");
                this.f410 = json.getString("f410");
                this.f410ax = json.getString("f410ax");
                this.f411 = json.getString("f411");
                this.f411ax = json.getString("f411ax");
                this.f412 = json.getString("f412");
                this.f412ax = json.getString("f412ax");
                this.f413 = json.getString("f413");
                this.f413ax = json.getString("f413ax");
                this.f414 = json.getString("f414");
                this.f414ax = json.getString("f414ax");
                this.f415 = json.getString("f415");
                this.f415ax = json.getString("f415ax");
                this.f416 = json.getString("f416");
                this.f416ax = json.getString("f416ax");
                this.f417 = json.getString("f417");
                this.f417ax = json.getString("f417ax");
                this.f418 = json.getString("f418");
                this.f418ax = json.getString("f418ax");
                this.f419 = json.getString("f419");
                this.f419ax = json.getString("f419ax");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sEHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f501 = json.getString("f501");
                this.f501ax = json.getString("f501ax");
                this.f502 = json.getString("f502");
                this.f502ax = json.getString("f502ax");
                this.f503 = json.getString("f503");
                this.f503ax = json.getString("f503ax");
                this.f504 = json.getString("f504");
                this.f504ax = json.getString("f504ax");
                this.f505 = json.getString("f505");
                this.f505ax = json.getString("f505ax");
                this.f506 = json.getString("f506");
                this.f506ax = json.getString("f506ax");
                this.f507 = json.getString("f507");
                this.f507ax = json.getString("f507ax");
                this.f508 = json.getString("f508");
                this.f508ax = json.getString("f508ax");
                this.f509 = json.getString("f509");
                this.f509ax = json.getString("f509ax");
                this.f510 = json.getString("f510");
                this.f510ax = json.getString("f510ax");
                this.f511 = json.getString("f511");
                this.f511ax = json.getString("f511ax");
                this.f512 = json.getString("f512");
                this.f512ax = json.getString("f512ax");
                this.f513 = json.getString("f513");
                this.f513ax = json.getString("f513ax");
                this.f514 = json.getString("f514");
                this.f514ax = json.getString("f514ax");
                this.f515 = json.getString("f515");
                this.f515ax = json.getString("f515ax");
                this.f516 = json.getString("f516");
                this.f516ax = json.getString("f516ax");
                this.f5image = json.getString("f5image");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sFHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f601 = json.getString("f601");
                this.f601ax = json.getString("f601ax");
                this.f602 = json.getString("f602");
                this.f602ax = json.getString("f602ax");
                this.f603 = json.getString("f603");
                this.f603ax = json.getString("f603ax");
                this.f6image = json.getString("f6image");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sGHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f701 = json.getString("f701");
                this.f701ax = json.getString("f701ax");
                this.f702a = json.getString("f702a");
                this.f702aax = json.getString("f702aax");
                this.f702b = json.getString("f702b");
                this.f702bax = json.getString("f702bax");
                this.f703a = json.getString("f703a");
                this.f703aax = json.getString("f703aax");
                this.f703b = json.getString("f703b");
                this.f703bax = json.getString("f703bax");
                this.f703c = json.getString("f703c");
                this.f703cax = json.getString("f703cax");
                this.f704 = json.getString("f704");
                this.f704ax = json.getString("f704ax");
                this.f705 = json.getString("f705");
                this.f705ax = json.getString("f705ax");
                this.f7image = json.getString("f7image");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sHHydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.f8011 = json.getString("f8011");
                this.f8012m = json.getString("f8012m");
                this.f8012d = json.getString("f8012d");
                this.f8021 = json.getString("f8021");
                this.f8022m = json.getString("f8022m");
                this.f8022d = json.getString("f8022d");
                this.f8031 = json.getString("f8031");
                this.f8032m = json.getString("f8032m");
                this.f8032d = json.getString("f8032d");
                this.f8041 = json.getString("f8041");
                this.f8042m = json.getString("f8042m");
                this.f8042d = json.getString("f8042d");
                this.f8051 = json.getString("f8051");
                this.f8052m = json.getString("f8052m");
                this.f8052d = json.getString("f8052d");
                this.f8061 = json.getString("f8061");
                this.f8062m = json.getString("f8062m");
                this.f8062d = json.getString("f8062d");
                this.f8071 = json.getString("f8071");
                this.f8072m = json.getString("f8072m");
                this.f8072d = json.getString("f8072d");
                this.f8081 = json.getString("f8081");
                this.f8082m = json.getString("f8082m");
                this.f8082d = json.getString("f8082d");
                this.f8091 = json.getString("f8091");
                this.f8092m = json.getString("f8092m");
                this.f8092d = json.getString("f8092d");
                this.f8image = json.getString("f8image");
                this.rsdremarks = json.getString("rsdremarks");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


   /* private synchronized void notifyChange(int propertyId) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.notifyChange(this, propertyId);
    }

    @Override
    public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.add(callback);

    }

    @Override
    public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry != null) {
            propertyChangeRegistry.remove(callback);
        }
    }*/


    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "FormsRSD";
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
        public static final String COLUMN_SA = "sA";
        public static final String COLUMN_SB = "sB";
        public static final String COLUMN_SC = "sC";
        public static final String COLUMN_SD = "sD";
        public static final String COLUMN_SE = "sE";
        public static final String COLUMN_SF = "sF";
        public static final String COLUMN_SG = "sG";
        public static final String COLUMN_SH = "sH";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";

    }
}
