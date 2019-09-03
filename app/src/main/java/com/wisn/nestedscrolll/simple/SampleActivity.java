package com.wisn.nestedscrolll.simple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.wisn.nestedscrolll.R;
import com.wisn.nestedscrolll.comm.ComAdapter;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        RecyclerView rv_recycle= findViewById(R.id.rv_recycle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        rv_recycle.setLayoutManager(linearLayoutManager);
        ComAdapter comAdapter= new ComAdapter();
        comAdapter.setTestData();
        rv_recycle.setAdapter(comAdapter);

    }
}
