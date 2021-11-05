package edu.aku.hassannaqvi.chese;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.chese.core.AndroidManager;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.VHCForm;
import edu.aku.hassannaqvi.chese.data.model.WSGForm;
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
    }


    /*public void sectionPress(View view) {
        finish();
        startActivity(new Intent(this, SectionIdentificationActivity.class));
    }*/


    public void sectionPress(View v) {
        Intent oF = null;
        switch (v.getId()) {
            case R.id.openForm:
                /*MainApp.form = new Forms();
                startActivity(new Intent(this, SectionIdentificationActivity.class));
                break;*/
            case R.id.seca:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionVHC1Activity.class));
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
            case R.id.wsg3:
                MainApp.wsgForm = new WSGForm();
                startActivity(new Intent(this, SectionWSG1Activity.class));
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
                MainApp.form = new Forms();
                startActivity(new Intent(this, AndroidManager.class));
                break;
        }
    }


}