package com.example.merzensumagaysay.beapandroid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */

public class HomeFragment extends Fragment {


    public HomeFragment()
    {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((MainActivityUser)getActivity()).setActionBarTitle("Home");

        return inflater.inflate(R.layout.view_home, container, false);


    }

}
