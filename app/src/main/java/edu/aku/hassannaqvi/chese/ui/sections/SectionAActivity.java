package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.amitshekhar.DebugDB;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.data.model.Forms;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.chese.ui.RegisterActivity;
import edu.aku.hassannaqvi.chese.ui.TakePhoto;


public class SectionAActivity extends AppCompatActivity {
    ActivitySectionABinding bi;
    int photoCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a);
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.mhr_mainheading);
        bi.setCallback(this);
        bi.setForm(form);
        setupSkips();
        bi.test.setText(DebugDB.getAddressLog() + " \n " + getResources().getString(R.string.f1image));
    }


    private void setupSkips() {
        bi.imgcheck.setOnCheckedChangeListener((compoundButton, b) -> bi.f1image.setEnabled(!b));
    }


    private void saveDraft() {

        /*form.setMhr01(bi.mhr01.getText().toString().isEmpty() ? "-1" : bi.mhr01.getText().toString());
        form.setMhr0197(bi.mhr0197.isChecked() ? "97" : "-1");

        form.setMhr02(bi.mhr02.getText().toString().isEmpty() ? "-1" : bi.mhr02.getText().toString());
        form.setMhr0297(bi.mhr0297.isChecked() ? "97" : "-1");

        form.setMhr03(bi.mhr03.getText().toString().isEmpty() ? "-1" : bi.mhr03.getText().toString());
        form.setMhr0397(bi.mhr0397.isChecked() ? "97" : "-1");

        form.setMhr04(bi.mhr04.getText().toString().isEmpty() ? "-1" : bi.mhr04.getText().toString());
        form.setMhr0497(bi.mhr0497.isChecked() ? "97" : "-1");

        form.setMhr05(bi.mhr05.getText().toString().isEmpty() ? "-1" : bi.mhr05.getText().toString());
        form.setMhr0597(bi.mhr0597.isChecked() ? "97" : "-1");*/

    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Forms.FormsTable.COLUMN_SV2, form.sV2toString());
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
            startActivity(new Intent(this, RegisterActivity.class));
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, RegisterActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    private boolean addForm() {
        if (!form.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addForm(form);
        form.setId(String.valueOf(rowid));
        if (rowid > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(Forms.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, "Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void takePhoto(View view) {
        Intent intent = new Intent(this, TakePhoto.class);
        intent.putExtra("picID", form.getDistrictCode() + "_" + form.getHfCode() + "_" + form.getReportingMonth() + "_");
        intent.putExtra("imgName", getResources().getString(R.string.f1image) + "_" + photoCount);
        intent.putExtra("picView", getResources().getString(R.string.f1title));
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_CANCELED) {
            Toast.makeText(this, requestCode + "_" + resultCode, Toast.LENGTH_SHORT).show();
            String fileName = data.getStringExtra("FileName");
            if (requestCode == 1 && resultCode == 1) {
                photoCount++;
                if (photoCount > 0) bi.imgcheck.setVisibility(View.GONE);
                bi.txtf1image.setText(fileName + " - " + photoCount);
                bi.txtf1image.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                if (photoCount == 5) bi.f1image.setEnabled(false);
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();
            } else if (requestCode == 1 && resultCode != 1) {
                photoCount = 0;
                bi.f1image.setEnabled(true);
                bi.txtf1image.setText(bi.txtf1image.getText().toString());
                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();
            }
        } else {
            if (photoCount == 0) bi.imgcheck.setVisibility(View.VISIBLE);
            bi.txtf1image.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.camera_unchecked, 0, 0);
            bi.f1image.setEnabled(true);
            bi.txtf1image.setText(bi.txtf1image.getText().toString());
            Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


}