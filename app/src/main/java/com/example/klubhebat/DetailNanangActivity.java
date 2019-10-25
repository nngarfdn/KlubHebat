package com.example.klubhebat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;



public class DetailNanangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_nanang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Nanang nanangditerima = getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);



        Glide.with(this).load(nanangditerima.getPhoto()).into(gamabar);
        name.setText(nanangditerima.getName());
        remarks.setText(nanangditerima.getRemarks());
        deskripsi.setText(nanangditerima.getDeskripsi());



        Log.i("photo", nanangditerima.getPhoto());
        Log.i("deskripsi", nanangditerima.getDeskripsi());
    }


}
