package com.example.hq.manipulatestack.payment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hq.manipulatestack.R;
import com.example.hq.manipulatestack.base.BaseActivity;

public class ProductListActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    ListView lvProduct;
    String[] productArray = {"Camera", "Zinc+", "Vitamin C", "Calcuim"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);


        lvProduct = (ListView) findViewById(R.id.lvProduct);
        lvProduct.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lvProduct.setOnItemClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productArray);
        lvProduct.setAdapter(adapter);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intentD = new Intent(this, ProductDetailActivity.class);
        startActivity(intentD);
    }
}
