package com.example.hq.manipulatestack.base;

import android.app.Activity;
import android.view.Menu;

import com.example.hq.manipulatestack.R;

/**
 * Created by HQ on 2014/9/5.
 */
public class BaseActivity extends Activity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.base, menu);
        return true;
    }



}
