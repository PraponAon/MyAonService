package com.vdevsoft.prapon.myaonservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vdevsoft.prapon.myaonservice.R;

/**
 * Created by Administrator on 18/11/2560.
 */

public class MainFragment extends Fragment{
//    Create main method ทำงานหลังจาก view เสร็จแล้ว


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //  Button controller
//         ctrl+space, shift+ctrl+enter เพิ่มเติม
//        alt+enter
        buttonController();

    } // main method

    private void buttonController() {
        Button button = getView().findViewById(R.id.btnGoToSecond);
//        alt+enter
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Replace fragement
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentFragmentMain, new SecondFragment())
                        .addToBackStack(null).commit();
            }
        });
    }

    //    Create view
// alt+ins เลือก method
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // class object
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
} //main class
