package com.example.klubhebat;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Nanang>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(NanangData.getListData());
        showRecylerCardView();

    }

    private void showRecylerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewNanangAdapter cardViewPresidentAdapter= new CardViewNanangAdapter(this);
        cardViewPresidentAdapter.setListNanang(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);

    }

}
