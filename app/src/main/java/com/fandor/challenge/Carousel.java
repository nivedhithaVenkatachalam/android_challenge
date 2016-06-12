package com.fandor.challenge;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nivedhithav on 6/11/16.
 */
public class Carousel {
    protected static final long TIME_DELAY = 6000;
    ArrayList<String> arr;
    TextView tv;
    Handler handler=new Handler();
    int arrSize=0;
    int count=0;

    public Carousel(){
        arr=new ArrayList<String>();
    }

    public void setArr(ArrayList<String> arr){
        this.arr=arr;
        arrSize=arr.size();
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
        arrSize++;
    }

    public void updateDescContinuously(){

        handler.post(updateTextRunnable);
    }

    Runnable updateTextRunnable=new Runnable(){
        public void run() {
            if(count<arrSize) {
                tv.setText(arr.get(count));
                count++;
            }
            else{
                tv.setText(arr.get(0));
                count=1;

            }
            handler.postDelayed(this, TIME_DELAY);
        }
    };
}
