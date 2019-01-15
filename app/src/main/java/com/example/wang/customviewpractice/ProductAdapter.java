package com.example.wang.customviewpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {

    private final Context context;
    private final ArrayList<Product> values;

    public ProductAdapter(Context context, ArrayList<Product> list) {
        super(context, R.layout.row_layout,list);
        this.context = context;
        this.values = list;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout,parent,false);

        TextView tvProduct = (TextView) rowView.findViewById(R.id.tvProduct);
        TextView tvPrice = (TextView) rowView.findViewById(R.id.tvPrice);
        TextView tvDescription = (TextView) rowView.findViewById(R.id.tvDescription);

        ImageView ivProduct = (ImageView) rowView.findViewById(R.id.ivProduct);
        ImageView ivSale = (ImageView) rowView.findViewById(R.id.ivSale);

        tvProduct.setText(values.get(position).getTitle());
        tvPrice.setText("R"+values.get(position).getPrice());
        tvDescription.setText(values.get(position).getDescription());

        if(values.get(position).getSale()){
            ivSale.setImageResource(R.mipmap.test);
        }else {
            ivSale.setImageResource(R.mipmap.test_round);
        }

        if(values.get(position).getType().equals("Laptop")){

            ivProduct.setImageResource(R.mipmap.test_round);

        }else if(values.get(position).getType().equals("Memory")){

            ivProduct.setImageResource(R.mipmap.ic_launcher);

        }else if(values.get(position).getType().equals("Screen")){

            ivProduct.setImageResource(R.mipmap.ic_launcher_foreground);

        }else {

            ivProduct.setImageResource(R.mipmap.ic_launcher_round);

        }


        return rowView;
    }
}
