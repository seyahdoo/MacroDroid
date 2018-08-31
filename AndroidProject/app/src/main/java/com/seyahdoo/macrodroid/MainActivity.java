package com.seyahdoo.macrodroid;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    //private TextView mTextMessage;

    //private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
    //        = new BottomNavigationView.OnNavigationItemSelectedListener() {

    //    @Override
    //    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    //        switch (item.getItemId()) {
    //            case R.id.navigation_home:
    //                mTextMessage.setText(R.string.title_home);
    //                return true;
    //            case R.id.navigation_dashboard:
    //                mTextMessage.setText(R.string.title_dashboard);
    //                return true;
    //            case R.id.navigation_notifications:
    //                mTextMessage.setText(R.string.title_notifications);
    //                return true;
    //        }
    //        return false;
    //    }
    //};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Hide
        //Process proc = null;
        //String ProcID = "79"; //HONEYCOMB AND OLDER
        //if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH){
        //    ProcID = "42"; //ICS AND NEWER
        //}
        //try {
        //    proc = Runtime.getRuntime().exec(new String[] { "su", "-c", "service call activity "+ProcID+" s16 com.android.systemui" });
        //} catch (Exception e) {
        //    Log.w("Main","Failed to kill task bar (1).");
        //    e.printStackTrace();
        //}
        //try {
        //    proc.waitFor();
        //} catch (Exception e) {
        //    Log.w("Main","Failed to kill task bar (2).");
        //    e.printStackTrace();
        //}

        //Show
        //Process proc = null;
        //try {
        //    proc = Runtime.getRuntime().exec(new String[] { "su", "-c", "am startservice -n com.android.systemui/.SystemUIService" });
        //} catch (Exception e) {
        //    Log.w("Main","Failed to kill task bar (1).");
        //    e.printStackTrace();
        //}
        //try {
        //    proc.waitFor();
        //} catch (Exception e) {
        //    Log.w("Main","Failed to kill task bar (2).");
        //    e.printStackTrace();
        //}



        View decorView = getWindow().getDecorView();
        // Hide both the navigation bar and the status bar.
        // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
        // a general rule, you should design your app to hide the status bar whenever you
        // hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        //mTextMessage = (TextView) findViewById(R.id.message);
        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
