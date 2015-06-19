package com.example.jqiu.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jqiu on 6/19/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
