package com.example.merzensumagaysay.beapandroid;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by merzensumagaysay on 04/10/2018.
 */

public class ViewPagerAdapter extends PagerAdapter {

    private final List<Presenter> presenterList = new ArrayList<>();

    @Override
    public int getCount() {
        return presenterList.size();
    }

    public void addView (Presenter presenter){
        presenterList.add(presenter);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        View currentView = presenterList.get(position).getView();
        return currentView;
    }
}
