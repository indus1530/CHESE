package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.attendees;
import static edu.aku.hassannaqvi.chese.core.MainApp.form;
import static edu.aku.hassannaqvi.chese.core.MainApp.vhc;
import static edu.aku.hassannaqvi.chese.core.MainApp.wsg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.chese.MainActivity;
import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.AttendeesTable;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionVhc3Binding;


public class SectionVHC3Activity extends AppCompatActivity {
    ActivitySectionVhc3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_vhc3);
        bi.setCallback(this);
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesAtenColumn(AttendeesTable.COLUMN_SV3, attendees.sV3toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!addForm()) return;
        if (updateDB()) {
            setResult(2);
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
    }


    public void btnEnd(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    private boolean addForm() {
        if (!attendees.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addAttendees(attendees);
        attendees.setId(String.valueOf(rowid));
        if (rowid > 0) {
            attendees.setUid(attendees.getDeviceId() + attendees.getId());
            db.updatesAtenColumn(AttendeesTable.COLUMN_UID, attendees.getUid());
            if (form.getSessionType().contains("VHC"))
                db.updatesAtenColumn(AttendeesTable.COLUMN_UUID, vhc.getUid());
            else db.updatesAtenColumn(AttendeesTable.COLUMN_UUID, wsg.getUid());
            return true;
        } else {
            Toast.makeText(this, "Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        finish();
    }

}