package com.developerfitri.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Cinta extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Sahabat> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinta);

        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(SahabatData.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewSahabatAdapter cardViewSahabatAdapter = new CardViewSahabatAdapter(this);
        cardViewSahabatAdapter.setListSahabat(list);
        rvCategory.setAdapter(cardViewSahabatAdapter);
    }

}
