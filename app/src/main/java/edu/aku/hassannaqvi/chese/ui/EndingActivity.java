package edu.aku.hassannaqvi.chese.ui;

import static edu.aku.hassannaqvi.chese.core.MainApp.vhcForm;
import static edu.aku.hassannaqvi.chese.core.MainApp.wsgForm;
import static edu.aku.hassannaqvi.chese.utils.extension.ActivityExtKt.gotoActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.chese.MainActivity;
import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivityEndingBinding;


public class EndingActivity extends AppCompatActivity {

    ActivityEndingBinding bi;
    String sesstionType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending);
        //bi.setForm(MainApp.form);
        setSupportActionBar(bi.toolbar);

        boolean check = getIntent().getBooleanExtra("complete", false);
        sesstionType = getIntent().getStringExtra("sessionType");

        if (check) {
            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(false);
            /*bi.istatusc.setEnabled(false);*/
        } else {
            bi.istatusa.setEnabled(false);
            bi.istatusb.setEnabled(true);
            /*bi.istatusc.setEnabled(true);*/
            bi.btnEnd.setBackgroundColor(getResources().getColor(R.color.redLight));
        }

    }

    private void saveDraft() {

        if (sesstionType.equals("VHC")) {
            vhcForm.setiStatus(bi.istatusa.isChecked() ? "1"
                    : bi.istatusb.isChecked() ? "2"
                    /*: bi.istatusc.isChecked() ? "3"*/
                    : "-1");
            vhcForm.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
        }

        if (sesstionType.equals("WSG")) {
            wsgForm.setiStatus(bi.istatusa.isChecked() ? "1"
                    : bi.istatusb.isChecked() ? "2"
                    /*: bi.istatusc.isChecked() ? "3"*/
                    : "-1");
            wsgForm.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
        }
    }


    public void BtnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
            finish();
            gotoActivity(this, MainActivity.class);
        } else {
            Toast.makeText(this, "Error in updating db!!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        //int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_ISTATUS, form.getiStatus());
        int updcount = sesstionType.equals("VHC") ? db.updateVHCEnding() : db.updateWSGEnding();
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}
