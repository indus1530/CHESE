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
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.WSGForm;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionWsg2Binding;
import edu.aku.hassannaqvi.chese.utils.DateUtilsKt;


public class SectionWSG2Activity extends AppCompatActivity {
    ActivitySectionWsg2Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_wsg2);
        bi.setCallback(this);
        MainApp.sno = 0;
        if (wsgForm == null) wsgForm = new WSGForm();
        bi.setWsgForm(wsgForm);
        bi.ws201.setMinDate(DateUtilsKt.getMonthsBack("dd/MM/yyyy", -1));
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesWSGFormColumn(WSGFormTable.COLUMN_SWS2, wsgForm.sWS2toString());
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
            if (bi.ws203b.isChecked() || bi.ws206b.isChecked())
                startActivity(new Intent(this, SectionWSG5Activity.class));
            else
                startActivity(new Intent(this, SectionVHC3Activity.class).putExtra("sessionType", "WSG"));
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
        long rowid = db.addWSGForm(wsgForm);
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