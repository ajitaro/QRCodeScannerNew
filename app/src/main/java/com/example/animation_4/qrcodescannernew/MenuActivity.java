package com.example.animation_4.qrcodescannernew;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MenuActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost); // initiate TabHost
        TabHost.TabSpec spec;
        Intent intent;

        spec = tabHost.newTabSpec("Home");
        spec.setIndicator("Home");
        intent = new Intent (this, HomeActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Scan QR");
        spec.setIndicator("Scan QR");
        intent = new Intent (this, MainActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Information");
        spec.setIndicator("Information");
        intent = new Intent (this, DevPage.class);
        spec.setContent(intent);
        tabHost.addTab(spec);


    }
}
