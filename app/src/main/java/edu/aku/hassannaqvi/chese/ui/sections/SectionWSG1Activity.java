package edu.aku.hassannaqvi.chese.ui.sections;

import static edu.aku.hassannaqvi.chese.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.chese.core.MainApp.wsgForm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.chese.ui.MainActivity;
import edu.aku.hassannaqvi.chese.R;
import edu.aku.hassannaqvi.chese.contracts.TableContracts.WSGFormTable;
import edu.aku.hassannaqvi.chese.core.MainApp;
import edu.aku.hassannaqvi.chese.data.model.WSGForm;
import edu.aku.hassannaqvi.chese.database.DatabaseHelper;
import edu.aku.hassannaqvi.chese.databinding.ActivitySectionWsg1Binding;
import edu.aku.hassannaqvi.chese.models.Districts;
import edu.aku.hassannaqvi.chese.models.LHW;
import edu.aku.hassannaqvi.chese.utils.AppUtilsKt;


public class SectionWSG1Activity extends AppCompatActivity {
    ActivitySectionWsg1Binding bi;
    private List<String> districtCode, tehsilCode, hfCode, lhwCode;
    private List<String> districtName, tehsilName, hfName, lhwName;
    private List<String> lhwSupervisor;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_wsg1);
        bi.setCallback(this);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        populateSpinner(this);
    }


    /*private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsTable.COLUMN_A101, form.getA101());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }*/


    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (addForm()) {
            setResult(2);
            finish();
            startActivity(new Intent(this, SectionWSG2Activity.class));
        }
    }


    private void saveDraft() {

        wsgForm = new WSGForm();
        wsgForm.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        wsgForm.setUserName(MainApp.user.getUserName());
        wsgForm.setDeviceId(MainApp.appInfo.getDeviceID());
        wsgForm.setDeviceTag(MainApp.appInfo.getTagName());
        wsgForm.setAppver(MainApp.appInfo.getAppVersion());

        wsgForm.setDistrictName(bi.a101.getSelectedItem().toString());
        wsgForm.setDistrictCode(districtCode.get(bi.a101.getSelectedItemPosition()));

        wsgForm.setTehsilName(bi.a101.getSelectedItem().toString());
        wsgForm.setTehsilCode(tehsilCode.get(bi.a102.getSelectedItemPosition()));

        wsgForm.setHfName(bi.a103.getSelectedItem().toString());
        wsgForm.setHfCode(hfCode.get(bi.a103.getSelectedItemPosition()));

        wsgForm.setLhwName(bi.a104n.getSelectedItem().toString());
        wsgForm.setLhwCode(lhwCode.get(bi.a104n.getSelectedItemPosition()));
        wsgForm.setLhwSupervisor(lhwSupervisor.get(bi.a104n.getSelectedItemPosition()));

    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    private boolean addForm() {
        if (!wsgForm.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addWSGForm(wsgForm);
        wsgForm.setId(String.valueOf(rowid));
        if (rowid > 0) {
            //wsgForm.setUid(wsgForm.getDeviceId() + wsgForm.getId());
            wsgForm.setUid(AppUtilsKt.generateUid());
            db.updatesWSGFormColumn(WSGFormTable.COLUMN_UID, wsgForm.getUid());
            return true;
        } else {
            Toast.makeText(this, "Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


    public void populateSpinner(final Context context) {

        districtName = new ArrayList<>();
        districtCode = new ArrayList<>();

        //Collection<HealthFacilities> dc = db.getAllTehsils(MainApp.DIST_ID);
        ArrayList<Districts> dc = db.getDistrictsByUser(MainApp.user.getDist_id());

        for (Districts d : dc) {
            districtName.add(d.getDistrictName());
            districtCode.add(d.getDistrictCode());
        }

        bi.a101.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, districtName));
        bi.a101.setEnabled(false);


        tehsilName = new ArrayList<>();
        tehsilCode = new ArrayList<>();
        tehsilName.add("....");
        tehsilCode.add("....");

        ArrayList<LHW> pc = db.getTehsilByDist(MainApp.user.getDist_id());
        for (LHW p : pc) {
            tehsilName.add(p.getTehsil_name());
            tehsilCode.add(p.getTehsil_code());
        }

        bi.a102.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, tehsilName));

        bi.a102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                hfName = new ArrayList<>();
                hfCode = new ArrayList<>();
                hfName.add("....");
                hfCode.add("....");

                ArrayList<LHW> pc = db.getHfByTehsil(tehsilCode.get(position));
                for (LHW p : pc) {
                    hfName.add(p.getHf_name());
                    hfCode.add(p.getHf_code());
                }

                bi.a103.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, hfName));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        bi.a103.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                lhwName = new ArrayList<>();
                lhwCode = new ArrayList<>();
                lhwSupervisor = new ArrayList<>();
                lhwName.add("....");
                lhwCode.add("....");
                lhwSupervisor.add("....");

                ArrayList<LHW> pc = db.getLhwByHf(hfCode.get(position));
                for (LHW p : pc) {
                    lhwName.add(p.getLhw_name());
                    lhwCode.add(p.getLhw_code());
                    lhwSupervisor.add(p.getLhw_supervisor());
                }

                bi.lhw.setVisibility(View.GONE);
                bi.a104c.setText("");
                bi.a105.setText("");
                bi.a104n.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, lhwName));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        bi.a104n.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                bi.lhw.setVisibility(View.VISIBLE);
                bi.a104c.setText(lhwCode.get(position));
                bi.a105.setText(lhwSupervisor.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }


}