package com.openclassrooms.myfragmentapp.Controllers.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.myfragmentapp.R;

public class ParamsFragment extends Fragment {

    // --------------

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_params, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

}
