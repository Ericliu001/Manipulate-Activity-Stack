package com.example.hq.manipulatestack;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hq.manipulatestack.base.BaseActivity;

public class ReceiptActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);

        MenuItem item = menu.findItem(R.id.action_next);
        item.setVisible(true);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_next) {

            Intent intentOther = new Intent(this, DoOtherStuffActivity.class);
            startActivity(intentOther);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
