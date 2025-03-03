package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.vhcForm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.VHCFormTable;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.VHCForm;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionVhc2Binding;
import edu.aku.hassannaqvi.chese.utils.AppUtilsKt;
import edu.aku.hassannaqvi.chese.utils.DateUtilsKt;


public class SectionVHC2Activity extends AppCompatActivity {
    ActivitySectionVhc2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_vhc2);
        bi.setCallback(this);
        MainApp.sno = 0;
        if (vhcForm == null) vhcForm = new VHCForm();
        bi.setVhcForm(vhcForm);
        bi.v201.setMinDate(DateUtilsKt.getMonthsBack("dd/MM/yyyy", -1));
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesVHCFormColumn(VHCFormTable.COLUMN_SV2, vhcForm.sV2toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        //if (!addForm()) return;
        if (updateDB()) {
            setResult(2);
            finish();
            if (bi.v203b.isChecked()) startActivity(new Intent(this, SectionVHC4Activity.class));
            else
                startActivity(new Intent(this, SectionVHC3Activity.class).putExtra("sessionType", "VHC"));
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
        if (!vhcForm.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addVHCForm(vhcForm);
        vhcForm.setId(String.valueOf(rowid));
        if (rowid > 0) {
            //vhcForm.setUid(vhcForm.getDeviceId() + vhcForm.getId());
            vhcForm.setUid(AppUtilsKt.generateUid());
            db.updatesVHCFormColumn(VHCFormTable.COLUMN_UID, vhcForm.getUid());
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