package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.wsgForm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.WSGFormTable;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionWsg5Binding;
import edu.aku.hassannaqvi.chese.ui.EndingActivity;


public class SectionWSG5Activity extends AppCompatActivity {
    ActivitySectionWsg5Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_wsg5);
        bi.setCallback(this);
        bi.setWsg(wsgForm);
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesWSGFormColumn(WSGFormTable.COLUMN_SWS5, wsgForm.sWS5toString());
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
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
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
        if (!wsgForm.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addWSG(wsgForm);
        wsgForm.setId(String.valueOf(rowid));
        if (rowid > 0) {
            wsgForm.setUid(wsgForm.getDeviceId() + wsgForm.getId());
            db.updatesWSGFormColumn(WSGFormTable.COLUMN_UID, wsgForm.getUid());
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