package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.attendees;
import static edu.aku.hassannaqvi.chese.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.AttendeesTable;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.Attendees;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionVhc3Binding;


public class SectionVHC3Activity extends AppCompatActivity {
    ActivitySectionVhc3Binding bi;
    int sno = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_vhc3);
        bi.setCallback(this);
        bi.v301.setText(sno);
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesAtenColumn(AttendeesTable.COLUMN_SV3, attendees.sV3toString());
        if (updcount == 1) {
            db.updatesAtenColumn(AttendeesTable.COLUMN_ISTATUS, attendees.getiStatus());
            sno++;
            return true;
        } else {
            Toast.makeText(this, "SORRY! updateDB Failed", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (!addForm()) return;
        if (updateDB()) {
            setResult(2);
            finish();
            startActivity(new Intent(this, form.getSessionType().contains("WSG") ? SectionWSG41Activity.class : SectionVHC4Activity.class));
        }
    }

    public void saveDraft() {

        attendees = new Attendees();
        attendees.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        attendees.setUuid(form.getUid());
        attendees.setUserName(MainApp.user.getUserName());
        attendees.setDeviceId(MainApp.appInfo.getDeviceID());
        attendees.setDeviceTag(MainApp.appInfo.getTagName());
        attendees.setAppver(MainApp.appInfo.getAppVersion());
        attendees.setDistrictCode(form.getDistrictCode());
        attendees.setDistrictName(form.getA101());
        attendees.setTehsilCode(form.getTehsilCode());
        attendees.setTehsilName(form.getA102());
        attendees.setHfCode(form.getHfCode());
        attendees.setHfName(form.getA103());
        attendees.setLhwCode(form.getLhwCode());
        attendees.setLhwName(form.getA104n());
        attendees.setSessionType(form.getSessionType());
        attendees.setiStatus("1");

        attendees.setV301(bi.v301.getText().toString().trim().isEmpty() ? "-1" : bi.v301.getText().toString());
        attendees.setV302(bi.v302.getText().toString().trim().isEmpty() ? "-1" : bi.v302.getText().toString());
        attendees.setV303(bi.v303.getText().toString().trim().isEmpty() ? "-1" : bi.v303.getText().toString());

        attendees.setV304(bi.v304a.isChecked() ? "1"
                : bi.v304b.isChecked() ? "2"
                : bi.v304c.isChecked() ? "3"
                : bi.v304d.isChecked() ? "4"
                : bi.v304e.isChecked() ? "5"
                : bi.v304f.isChecked() ? "6"
                : bi.v304g.isChecked() ? "7"
                : bi.v304h.isChecked() ? "8"
                : bi.v304i.isChecked() ? "9"
                : bi.v304j.isChecked() ? "10"
                : bi.v304k.isChecked() ? "11"
                : bi.v30498.isChecked() ? "98"
                : bi.v30499.isChecked() ? "99"
                : "-1");

        attendees.setV305(bi.v305a.isChecked() ? "1"
                : bi.v305b.isChecked() ? "2"
                : bi.v305c.isChecked() ? "3"
                : bi.v305d.isChecked() ? "4"
                : bi.v305e.isChecked() ? "5"
                : bi.v305f.isChecked() ? "6"
                : bi.v305g.isChecked() ? "7"
                : bi.v305h.isChecked() ? "8"
                : bi.lhwv305i.isChecked() ? "9"
                : bi.v30598.isChecked() ? "98"
                : bi.v30599.isChecked() ? "99"
                : "-1");

        attendees.setV306(bi.v306a.isChecked() ? "1"
                : bi.v306b.isChecked() ? "2"
                : bi.v306c.isChecked() ? "3"
                : bi.v306d.isChecked() ? "4"
                : "-1");

        attendees.setV307(bi.v307a.isChecked() ? "1"
                : bi.v307b.isChecked() ? "2"
                : "-1");

        attendees.setV308(bi.v308a.isChecked() ? "1"
                : bi.v308b.isChecked() ? "2"
                : "-1");

    }


    public void addMore(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (!addForm()) return;
        if (updateDB()) {
            setResult(2);
            finish();
            startActivity(new Intent(this, SectionVHC3Activity.class));
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    private boolean addForm() {
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addAttendees(attendees);
        attendees.setId(String.valueOf(rowid));
        if (rowid > 0) {
            attendees.setUid(attendees.getDeviceId() + attendees.getId());
            db.updatesAtenColumn(AttendeesTable.COLUMN_UID, attendees.getUid());
            return true;
        } else {
            Toast.makeText(this, "SORRY! addForm Failed", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        finish();
    }

}