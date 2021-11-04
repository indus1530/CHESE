package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.vhc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.chese.MainActivity;
import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.VHCTable;
import edu.aku.hassannaqvi.chese.data.model.VHC;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionVhc2Binding;
import edu.aku.hassannaqvi.chese.utils.DateUtilsKt;


public class SectionVHC2Activity extends AppCompatActivity {
    ActivitySectionVhc2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_vhc2);
        bi.setCallback(this);
        if (vhc == null) vhc = new VHC();
        bi.setVhc(vhc);
        bi.v201.setMinDate(DateUtilsKt.getMonthsBack("yyyy/MM/dd", -1));
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesVHCColumn(VHCTable.COLUMN_SV2, vhc.sV2toString());
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
        if (!vhc.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addVHC(vhc);
        vhc.setId(String.valueOf(rowid));
        if (rowid > 0) {
            vhc.setUid(vhc.getDeviceId() + vhc.getId());
            db.updatesVHCColumn(VHCTable.COLUMN_UID, vhc.getUid());
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