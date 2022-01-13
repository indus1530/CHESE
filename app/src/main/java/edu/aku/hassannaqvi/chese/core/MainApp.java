package edu.aku.hassannaqvi.chese.core;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import net.sqlcipher.database.SQLiteDatabase;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

import java.io.File;
import java.util.List;
import java.util.Random;

import edu.aku.hassannaqvi.chese.data.model.Attendees;
import edu.aku.hassannaqvi.chese.data.model.VHCForm;
import edu.aku.hassannaqvi.chese.data.model.WSGForm;
import edu.aku.hassannaqvi.chese.models.Users;

public class MainApp extends Application {

    public static final String PROJECT_NAME = "CHESE";
    public static final String DIST_ID = null;
    public static final String SYNC_LOGIN = "sync_login";
    //public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    public static final String _IP = "https://cls-pae-fp51764";// .TEST server
    //public static final String _IP = "http://f38158/smk_hfa";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/uen_ph2/api/";// .TEST server;
    public static final String _SERVER_URL = "sync.php";
    public static final String _SERVER_GET_URL = "getData.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/uen_ph2/app/smk_rsd";
    public static final String DeviceURL = "devices.php";
    private static final String TAG = "MainApp";
    public static String IBAHC = "";

    public static final int HOUSEHOLDS_TO_RANDOMISE = 10;
    public static final int MIN_MWRA = 14;
    public static final int MAX_MWRA = 50;

    public static final int MIN_ADOL = 10;
    public static final int MAX_ADOL = 19;
    public static int sno = 0;

    public static File sdDir;
    public static String[] downloadData;

    public static WSGForm wsgForm;
    public static VHCForm vhcForm;
    public static Attendees attendees;
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static int fmCount;
    public static String fmPosition;
    public static Integer versionCode;
    public static String versionName;
    public static String userName;
    public static boolean permissionCheck = false;
    public static int[] randHHNo;
    public static int randHHNoIndex;
    @NotNull
    public static int selectedFemale;
    SharedPreferences.Editor editor;
    SharedPreferences sharedPref;
    public static String deviceid;
    String[] marker = new String[HOUSEHOLDS_TO_RANDOMISE];

    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public static void genBlockRand() {

        int total = 123;
        Long blockSize = Long.valueOf(total / 10);
        int randQuat = new Random().nextInt((int) (blockSize - 1)) + 1;

        System.out.println("Q: " + blockSize + "\n");
        int c = 0;
        for (int i = 1; i < total; i += blockSize) {
            c++;
            Long high = (blockSize * c);
            int low = i;
            System.out.println(c + " - " + high + "-" + low + "\r");
            System.out.println(c + " -> " + (new Random().nextInt((int) (high - low)) + low) + "\n");

        }
    }

    public static void genSysRand() {


        int total = 123;
        Long blockSize = Long.valueOf(total / 10);
        int randQuat = new Random().nextInt((int) (blockSize - 1)) + 1;


        for (int i = 1; i <= 10; i++) {


            System.out.println(i + " -> " + randQuat + "\n");
            //    System.out.println(c+" -> "+(new Random().nextInt((int) (high-low))+low)+"\n");
            randQuat += blockSize;

        }

    }

    public static int[] genNum3(int gn) {
        int total = gn;
        System.out.println(" Total: " + total + "\n");


        Long blockSize = Long.valueOf(total / 10);
        System.out.println(" blockSize: " + blockSize + "\n");

        int randQuat = new Random().nextInt((int) (blockSize - 1)) + 1;
        System.out.println(" randQuat: " + randQuat + "\n");

        int[] hhno = new int[10];
        for (int i = 0; i < 10; i++) {
            hhno[i] = randQuat;


            System.out.println(i + " -> " + randQuat + "\n");
            //    System.out.println(c+" -> "+(new Random().nextInt((int) (high-low))+low)+"\n");
            randQuat += blockSize;

        }
        return hhno;
    }

    public static void genRandNum(int gn) {
        int total = gn;
        System.out.println(" Total: " + total + "\n");


        Double blockSize = Double.valueOf(total) / Double.valueOf(HOUSEHOLDS_TO_RANDOMISE);
        System.out.println(" blockSize: " + blockSize + "\n");

        int randQuat = new Random().nextInt((int) (blockSize - 1)) + 1;
        System.out.println(" randQuat: " + randQuat + "\n");

        int[] hhno = new int[HOUSEHOLDS_TO_RANDOMISE];
        int c = 0;
        for (int i = 1; c < HOUSEHOLDS_TO_RANDOMISE; i += blockSize) {
            c++;
            int high = (int) (blockSize * c);
            int low = i;
            hhno[c - 1] = new Random().nextInt(high - low) + low;
            System.out.println(c + " - " + low + "-" + high + "\r");
            System.out.println(c + " -> " + hhno[c - 1] + "\n");

        }
        MainApp.randHHNo = new int[HOUSEHOLDS_TO_RANDOMISE];
        MainApp.randHHNo = hhno;
    }

    @Override
    public void onCreate() {
        super.onCreate();

         /*
        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }*/

        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(PROJECT_NAME, MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        initSecure();
    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);

        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            int TRATS = bundle.getInt("YEK_TRATS");
            IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Boolean isNetworkAvailable(Context c) {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network nw = connectivityManager.getActiveNetwork();
            if (nw == null) return false;
            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
            return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
            return nwInfo != null && nwInfo.isConnected();
        }
    }


}
