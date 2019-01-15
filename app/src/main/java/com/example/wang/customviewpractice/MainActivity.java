package com.example.wang.customviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvProducts;
    ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProducts = findViewById(R.id.lvProducts);
        list = new ArrayList<Product>();

        Product product1 = new Product("Dell","The world's most secure","Laptop",14500.99,true);
        Product product2 = new Product("Del","The world's most secur","Memory",14500.99,false);
        Product product3 = new Product("De","The world's most secu","Screen",14500.99,true);

        list.add(product1);
        list.add(product2);
        list.add(product3);

        ProductAdapter adapter = new ProductAdapter(this,list);

        lvProducts.setAdapter(adapter);
    }
}
