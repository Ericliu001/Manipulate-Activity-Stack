package com.example.hq.manipulatestack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hq.manipulatestack.base.BaseActivity;
import com.example.hq.manipulatestack.payment.ProductDetailActivity;
import com.example.hq.manipulatestack.payment.ProductListActivity;


public class HomeActivity extends BaseActivity implements View.OnClickListener {

    private Button btOneProduct;
    private Button btGoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btOneProduct = (Button) findViewById(R.id.btOneProduct);
        btGoList = (Button) findViewById(R.id.btGoList);

        btOneProduct.setOnClickListener(this);
        btGoList.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btOneProduct:
                gotoOneProduct();
                break;

            case R.id.btGoList:
                gotoProductList();
                break;

            default:
                break;

        }
    }

    private void gotoProductList() {
        Intent intentL = new Intent(this, ProductListActivity.class);
        intentL.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intentL);

    }

    private void gotoOneProduct() {
        Intent intentD = new Intent(this, ProductDetailActivity.class);
        intentD.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intentD);
    }




}
