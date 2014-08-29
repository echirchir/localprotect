package com.juan.elisha.localprotect.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.juan.elisha.localprotect.R;

/**
 * Created by master on 8/29/14.
 */
public class HomeFragment extends Fragment {


    @Override public void onAttach(Activity activity){ super.onAttach(activity);}

    public static HomeFragment getInstance()
    {
        return new HomeFragment();
    }

    @Override public void onActivityCreated(Bundle saveInstanceState){ super.onActivityCreated(saveInstanceState); }

    @Override public void onCreate(Bundle saveInstanceState){ super.onCreate(saveInstanceState); }

    @Override public void onSaveInstanceState(Bundle saveInstanceState){ super.onSaveInstanceState(saveInstanceState); }

    @Override public void onDestroy(){ super.onDestroy(); }

    @Override public void onResume() { super.onResume(); }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        return inflater.inflate(R.layout.main, container, false);
    }
}
