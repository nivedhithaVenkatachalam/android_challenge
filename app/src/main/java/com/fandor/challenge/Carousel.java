package com.fandor.challenge;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nivedhithav on 6/11/16.
 */
public class Carousel {
    ArrayList<String> arr;
    TextView tv;

    public Carousel(){
        arr=new ArrayList<String>();
    }

    public void setArr(ArrayList<String> arr){
        this.arr=arr;
    }

    public ArrayList<String> getArr(){
        return arr;
    }

    public void setTv(TextView tv){
        this.tv=tv;
    }

    public TextView getTv(){
        return tv;
    }

    public void addIntroDescription(String desc) {
        arr.add(desc);
    }
}
