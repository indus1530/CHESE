package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.data.model.Forms;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionHBinding;
import edu.aku.hassannaqvi.chese.ui.RegisterActivity;
import edu.aku.hassannaqvi.chese.ui.TakePhoto;


public class SectionHActivity extends AppCompatActivity {
    ActivitySectionHBinding bi;
    int photoCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h);
        bi.setCallback(this);
        bi.setForm(form);
        setupSkips();
    }


    private void setupSkips() {
        bi.imgcheck.setOnCheckedChangeListener((compoundButton, b) -> bi.f8image.setEnabled(!b));
    }


    private void saveDraft() {
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Forms.FormsTable.COLUMN_SH, form.sHtoString());
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


    private boolean bothValueCheck(EditTextPicker edx1, EditTextPicker edx2) {
        if (!edx1.getText().toString().isEmpty() || !edx2.getText().toString().isEmpty()) {
            if (Integer.parseInt(edx1.getText().toString()) + Integer.parseInt(edx2.getText().toString()) == 0)
                return Validator.emptyCustomTextBox(this, edx1, "Both Values Can't be Zero");
            else return true;
        }
        return true;
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!bothValueCheck(bi.f8012d, bi.f8012m)) return false;
        if (!bothValueCheck(bi.f8022d, bi.f8022m)) return false;
        if (!bothValueCheck(bi.f8032d, bi.f8032m)) return false;
        if (!bothValueCheck(bi.f8042d, bi.f8042m)) return false;
        if (!bothValueCheck(bi.f8052d, bi.f8052m)) return false;
        if (!bothValueCheck(bi.f8062d, bi.f8062m)) return false;
        if (!bothValueCheck(bi.f8072d, bi.f8072m)) return false;
        if (!bothValueCheck(bi.f8082d, bi.f8082m)) return false;
        return bothValueCheck(bi.f8092d, bi.f8092m);
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
        intent.putExtra("imgName", getResources().getString(R.string.f8image) + "_" + photoCount);
        intent.putExtra("picView", getResources().getString(R.string.f8title));
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
                bi.txtf8image.setText(fileName + " - " + photoCount);
                bi.txtf8image.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                if (photoCount == 5) bi.f8image.setEnabled(false);
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();
            } else if (requestCode == 1 && resultCode != 1) {
                photoCount = 0;
                bi.f8image.setEnabled(true);
                bi.txtf8image.setText(bi.txtf8image.getText().toString());
                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();
            }
        } else {
            if (photoCount == 0) bi.imgcheck.setVisibility(View.VISIBLE);
            bi.txtf8image.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.camera_unchecked, 0, 0);
            bi.f8image.setEnabled(true);
            bi.txtf8image.setText(bi.txtf8image.getText().toString());
            Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


}