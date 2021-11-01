package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.wsg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.WSGTable;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionWsg3Binding;


public class SectionWSG3Activity extends AppCompatActivity {
    ActivitySectionWsg3Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_wsg3);
        bi.setCallback(this);
        bi.setWsg(wsg);
        setSupportActionBar(bi.toolbar);
    }


    private void saveDraft() {
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesWSGColumn(WSGTable.COLUMN_SWS3, wsg.sWS3toString());
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
        saveDraft();
        if (updateDB()) {
            setResult(2);
            finish();
            startActivity(new Intent(this, SectionWSG41Activity.class));
        }
    }


    public void BtnEnd(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    private boolean addForm() {
        if (!wsg.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addWSG(wsg);
        wsg.setId(String.valueOf(rowid));
        if (rowid > 0) {
            wsg.setUid(wsg.getDeviceId() + wsg.getId());
            db.updatesFormColumn(WSGTable.COLUMN_UID, wsg.getUid());
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