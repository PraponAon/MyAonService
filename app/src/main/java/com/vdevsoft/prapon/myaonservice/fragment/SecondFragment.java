package com.vdevsoft.prapon.myaonservice.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vdevsoft.prapon.myaonservice.R;
import com.vdevsoft.prapon.myaonservice.utility.GetJSON;
import com.vdevsoft.prapon.myaonservice.utility.MyConstant;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Administrator on 18/11/2560.
 */

public class SecondFragment extends android.support.v4.app.Fragment{
//    exclicit
    private String jsonString, dateString,
        rateString, usdString, answerString;
    private String jsonRateString;
    private double rateADouble;

//    alt+ins
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        read Alll JSON to Class
        readJSON();

//      showrate

//      Show date, drag click ขวา extract สน้าง method
        showDate();


    } // main Method

    private void showDate() {
//        shit+ctrl+enter   สร้าง กรอบ { } completment
        TextView textView = getView().findViewById(R.id.txtShowDate);

        try {

            JSONArray jsonArray = new JSONArray("[" + jsonString + "]");
            JSONObject jsonObject = jsonArray.getJSONObject(0);

            dateString = jsonObject.getString("date");
            Log.d("19novV1","Date ==> " + dateString);

            textView.setText(getText(R.string.date) + dateString);

            jsonRateString = "[" + jsonObject.getString("rates") + "]";
            Log.d("19novV1","jsonRate ==> " + jsonRateString);



















































        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readJSON() {
        // alt+6
        String tag = "19novV1";
        MyConstant myConstant = new MyConstant();

        try {

            GetJSON getJSON = new GetJSON(getContext());
            getJSON.execute(myConstant.getUrlJSON());

            jsonString = getJSON.get();
            Log.d(tag, " JSON ==> " + jsonString);

        } catch (Exception e) {
            Log.d(tag, "e ==> " + e.toString());
        }
    }

    //    Create view คือการสร้างหน้ากาก
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_second,
                container,false);
        return view;
    }
//    crtl ค้างไว  warp

} // main class
