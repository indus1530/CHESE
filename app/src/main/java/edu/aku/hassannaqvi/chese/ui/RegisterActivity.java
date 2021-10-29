package edu.aku.hassannaqvi.chese.ui;

import static edu.aku.hassannaqvi.chese.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.databinding.ActivityRegisterBinding;
import edu.aku.hassannaqvi.chese.ui.sections.SectionAActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionFActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionGActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionHActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG3Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG5Activity;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    ActivityRegisterBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_register);
        bi.setCallback(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: test1");
        if (form.getiStatus().equals("1")) {
            bi.btnContinue.setVisibility(View.GONE);
            bi.btnEnd.setVisibility(View.GONE);
        }
        updateSections();

    }

    private void updateSections() {

        try {
            if (!new JSONObject(form.sV2toString()).get("f106").equals("")) {
                bi.formA.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formAv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }

            if (!new JSONObject(form.sV3toString()).get("f203").equals("")) {
                bi.formB.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formBv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }

            if (!new JSONObject(form.sV4toString()).get("f342").equals("")) {
                bi.formC.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formCv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }

            if (!new JSONObject(form.sDtoString()).get("f419").equals("")) {
                bi.formD.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formDv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }

            if (!new JSONObject(form.sEtoString()).get("f516").equals("")) {
                bi.formE.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formEv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }

            if (!new JSONObject(form.sFtoString()).get("f603").equals("")) {
                bi.formF.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formFv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }

            if (!new JSONObject(form.sGtoString()).get("f705").equals("")) {
                bi.formG.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formGv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }

            if (!new JSONObject(form.sHtoString()).get("f8091").equals("")) {
                bi.formH.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formHv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
            }
            if (!bi.formA.isEnabled()
                    && !bi.formB.isEnabled()
                    && !bi.formC.isEnabled()
                    && !bi.formD.isEnabled()
                    && !bi.formE.isEnabled()
                    && !bi.formF.isEnabled()
                    && !bi.formG.isEnabled()
                    && !bi.formH.isEnabled()
            ) bi.btnEnd.setVisibility(View.GONE);

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnContinue() {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
    }


    public void BtnEnd() {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        //MainApp.endActivity(this, EndingActivity.class).putExtra("complete", false);

    }


    public void openRegister(View view) {
        Intent oF = new Intent();
        if (!MainApp.user.getUserName().equals("0000")) {
            switch (view.getId()) {
                case R.id.formA:
                    oF = new Intent(this, SectionAActivity.class);
                    break;
                case R.id.formB:
                    oF = new Intent(this, SectionWSG2Activity.class);
                    break;
                case R.id.formC:
                    oF = new Intent(this, SectionWSG3Activity.class);
                    break;
                case R.id.formD:
                    oF = new Intent(this, SectionWSG5Activity.class);
                    break;
                case R.id.formE:
                    oF = new Intent(this, SectionVHC2Activity.class);
                    break;
                case R.id.formF:
                    oF = new Intent(this, SectionFActivity.class);
                    break;
                case R.id.formG:
                    oF = new Intent(this, SectionGActivity.class);
                    break;
                case R.id.formH:
                    oF = new Intent(this, SectionHActivity.class);
                    break;
            }
            startActivityForResult(oF, 2);
        } else {
            Toast.makeText(this, "Please login Again!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult: test1");
        updateSections();
        if (requestCode == 2
                && !bi.formA.isEnabled()
                && !bi.formB.isEnabled()
                && !bi.formC.isEnabled()
                && !bi.formD.isEnabled()
                && !bi.formE.isEnabled()
                && !bi.formF.isEnabled()
                && !bi.formG.isEnabled()
                && !bi.formH.isEnabled()
                && !form.getiStatus().equals("1")
        ) {
            bi.btnContinue.setVisibility(View.VISIBLE);
        } else {
            bi.btnContinue.setVisibility(View.GONE);
            //Toast.makeText(this, "Enabled!", Toast.LENGTH_SHORT).show();

        }
    }

 /*@Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }*/

}
