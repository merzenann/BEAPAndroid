package com.example.merzensumagaysay.beapandroid;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by merzensumagaysay on 04/10/2018.
 */

public abstract class Presenter {

    protected View view;
    private AppCompatActivity activity;

    public Presenter(View view, AppCompatActivity activity)
    {
        this.view = view;
        this.activity = activity;
        onCreateView(); 
    }

    public View getView() {
        return view;
    }

    public abstract void onCreateView();
}
