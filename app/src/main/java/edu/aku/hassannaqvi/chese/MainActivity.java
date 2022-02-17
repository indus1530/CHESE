package edu.aku.hassannaqvi.chese;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

import edu.aku.hassannaqvi.chese.core.AndroidManager;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.VHCForm;
import edu.aku.hassannaqvi.chese.data.model.WSGForm;
import edu.aku.hassannaqvi.chese.ui.ChangePasswordActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC1Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC3Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC4Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG1Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG41Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG5Activity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (MainApp.admin) {
            findViewById(R.id.adminView).setVisibility(View.VISIBLE);
        }
        TextView username = findViewById(R.id.username);
        username.setText(MainApp.user.getFullname().toUpperCase(Locale.ROOT));
    }


    public void sectionPress(View v) {
        Intent oF = null;
        switch (v.getId()) {
            case R.id.openVhcForm:
            case R.id.seca:
                MainApp.vhcForm = new VHCForm();
                startActivity(new Intent(this, SectionVHC1Activity.class));
                break;
            case R.id.openWsgForm:
            case R.id.wsg3:
                MainApp.wsgForm = new WSGForm();
                startActivity(new Intent(this, SectionWSG1Activity.class));
                break;
            case R.id.changePassword:
                startActivity(new Intent(this, ChangePasswordActivity.class));
                break;
            case R.id.vhc2:
                MainApp.vhcForm = new VHCForm();
                startActivity(new Intent(this, SectionVHC2Activity.class));
                break;
            case R.id.vhc3:
                MainApp.vhcForm = new VHCForm();
                startActivity(new Intent(this, SectionVHC3Activity.class));
                break;
            case R.id.vhc4:
                MainApp.vhcForm = new VHCForm();
                startActivity(new Intent(this, SectionVHC4Activity.class));
                break;
            case R.id.wsg2:
                MainApp.wsgForm = new WSGForm();
                startActivity(new Intent(this, SectionWSG2Activity.class));
                break;
            case R.id.wsg4:
                MainApp.wsgForm = new WSGForm();
                startActivity(new Intent(this, SectionWSG41Activity.class));
                break;
            case R.id.wsg5:
                MainApp.wsgForm = new WSGForm();
                startActivity(new Intent(this, SectionWSG5Activity.class));
                break;
            case R.id.openDBManager:
                startActivity(new Intent(this, AndroidManager.class));
                break;
        }
    }


}