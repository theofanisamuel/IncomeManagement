package com.tsl.android.incomemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material_Dialog);
        setContentView(R.layout.activity_about_dialog);
    }
}
