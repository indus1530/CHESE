package edu.aku.hassannaqvi.chese;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.chese.core.AndroidManager;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.Forms;
import edu.aku.hassannaqvi.chese.ui.sections.SectionAActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionFActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionGActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionHActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionIdentificationActivity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG3Activity;
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
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionIdentificationActivity.class));
                break;
            case R.id.seca:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionAActivity.class));
                break;
            case R.id.secb:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionWSG2Activity.class));
                break;
            case R.id.secc:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionWSG3Activity.class));
                break;
            case R.id.secd:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionWSG5Activity.class));
                break;
            case R.id.sece:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionVHC2Activity.class));
                break;
            case R.id.secf:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionFActivity.class));
                break;
            case R.id.secg:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionGActivity.class));
                break;
            case R.id.sech:
                MainApp.form = new Forms();
                startActivity(new Intent(this, SectionHActivity.class));
                break;
            case R.id.openDBManager:
                MainApp.form = new Forms();
                startActivity(new Intent(this, AndroidManager.class));
                break;
        }
    }


}