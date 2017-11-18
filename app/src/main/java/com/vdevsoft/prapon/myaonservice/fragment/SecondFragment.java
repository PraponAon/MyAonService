package com.vdevsoft.prapon.myaonservice.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vdevsoft.prapon.myaonservice.R;

/**
 * Created by Administrator on 18/11/2560.
 */

public class SecondFragment extends android.support.v4.app.Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_second,
                container,false);
        return view;
    }
} // main class
