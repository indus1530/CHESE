package edu.aku.hassannaqvi.chese.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.util.Locale;

import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.core.AndroidManager;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.VHCForm;
import edu.aku.hassannaqvi.chese.data.model.WSGForm;
import edu.aku.hassannaqvi.chese.database.AndroidDatabaseManager;
import edu.aku.hassannaqvi.chese.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC1Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC3Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionVHC4Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG1Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG2Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG41Activity;
import edu.aku.hassannaqvi.chese.ui.sections.SectionWSG5Activity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        if (MainApp.admin) {
            findViewById(R.id.adminView).setVisibility(View.VISIBLE);
        }
        TextView username = findViewById(R.id.username);
        username.setText(MainApp.user.getFullname().toUpperCase(Locale.ROOT));

    }


    public void sectionPress(View v) {
        Class<?> nextActivity = null;

        switch (v.getId()) {
            case R.id.openVhcForm:
            case R.id.seca:
                MainApp.vhcForm = new VHCForm();
                nextActivity = SectionVHC1Activity.class;
                break;
            case R.id.openWsgForm:
            case R.id.wsg3:
                MainApp.wsgForm = new WSGForm();
                nextActivity = SectionWSG1Activity.class;
                break;
            case R.id.changePassword:
                nextActivity = ChangePasswordActivity.class;
                break;
            case R.id.vhc2:
                MainApp.vhcForm = new VHCForm();
                nextActivity = SectionVHC2Activity.class;
                break;
            case R.id.vhc3:
                MainApp.vhcForm = new VHCForm();
                nextActivity = SectionVHC3Activity.class;
                break;
            case R.id.vhc4:
                MainApp.vhcForm = new VHCForm();
                nextActivity = SectionVHC4Activity.class;
                break;
            case R.id.wsg2:
                MainApp.wsgForm = new WSGForm();
                nextActivity = SectionWSG2Activity.class;
                break;
            case R.id.wsg4:
                MainApp.wsgForm = new WSGForm();
                nextActivity = SectionWSG41Activity.class;
                break;
            case R.id.wsg5:
                MainApp.wsgForm = new WSGForm();
                nextActivity = SectionWSG5Activity.class;
                break;
            case R.id.openDBManager:
                nextActivity = AndroidManager.class;
                break;
        }
        if (nextActivity != null) {
            finish();
            startActivity(new Intent(this, nextActivity));
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Class<?> nextActivity = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                nextActivity = AndroidDatabaseManager.class;
                break;
            case R.id.onSync:
                nextActivity = SyncActivity.class;
                break;
            case R.id.changePassword:
                nextActivity = ChangePasswordActivity.class;
                break;
        }
        if (nextActivity != null) {
            finish();
            startActivity(new Intent(this, nextActivity));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;

    }


}