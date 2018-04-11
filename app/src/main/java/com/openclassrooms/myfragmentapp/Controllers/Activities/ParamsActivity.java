package com.openclassrooms.myfragmentapp.Controllers.Activities;

import android.os.Bundle;

import com.openclassrooms.myfragmentapp.Controllers.Fragments.ParamsFragment;
import com.openclassrooms.myfragmentapp.R;

public class ParamsActivity extends BaseActivity {

    private ParamsFragment paramsFragment;

    @Override
    protected int getLayout() {
        return R.layout.activity_params;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        paramsFragment = (ParamsFragment) getSupportFragmentManager().findFragmentById(R.id.frame_layout_params);

        if (paramsFragment == null) {
            paramsFragment = new ParamsFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_layout_params, paramsFragment)
                    .commit();
        }
    }
}
