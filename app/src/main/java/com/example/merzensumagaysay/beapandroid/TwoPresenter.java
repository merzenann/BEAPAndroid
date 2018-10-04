package com.example.merzensumagaysay.beapandroid;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by merzensumagaysay on 04/10/2018.
 */

public class TwoPresenter extends Presenter {

    private TextView textView;

    public TwoPresenter(View view, AppCompatActivity activity) {
        super(view, activity);
    }

    @Override
    public void onCreateView() {
        textView = (TextView) view.findViewById(R.id.page2txt);
    }
}
