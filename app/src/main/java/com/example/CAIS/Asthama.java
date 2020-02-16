package com.example.CAIS;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Asthama extends AppCompatActivity {

    RecyclerView mRecyclerView;
    int[] mPlaceList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthama);
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(Asthama.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mPlaceList = new int[]{R.drawable.asthama1,R.drawable.asthama2};

        asthama_custom_layout myAdapter = new asthama_custom_layout(Asthama.this, mPlaceList) {
            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                
            }
        };
        mRecyclerView.setAdapter(myAdapter);
    }
}
