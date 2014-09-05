package com.example.hq.manipulatestack.payment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hq.manipulatestack.R;
import com.example.hq.manipulatestack.base.BaseActivity;

public class ProductDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
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

        switch (item.getItemId()){
            case R.id.action_next:
                gotoCheckout();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void gotoCheckout() {
        Intent intentC = new Intent(this, CheckoutActivity.class);
        intentC.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intentC.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intentC);

    }
}
