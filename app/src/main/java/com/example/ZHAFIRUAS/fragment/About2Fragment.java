package com.example.ZHAFIRUAS.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ZHAFIRUAS.R;

// 10116368 ZHAFIR MAHDI IF-8  10/8/2019

public class About2Fragment extends Fragment {


    public About2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about2, container, false);
    }

    public interface OnFragmentInteractionListener {
    }
}
