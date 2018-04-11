package com.openclassrooms.myfragmentapp.Controllers.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import icepick.Icepick;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getLayout();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        // Handling Bundle Restoration
        Icepick.restoreInstanceState(this, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Handling Bundle Save
        Icepick.saveInstanceState(this, outState);
    }
}
