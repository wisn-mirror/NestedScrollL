package com.wisn.nestedscrolll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wisn.nestedscrolll.simple.SampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, SampleActivity.class));

    }

    public void demoClick(View view) {
        int id = view.getId();
        if (id == R.id.simple) {
            startActivity(new Intent(this, SampleActivity.class));
        } else if (id == R.id.wangyiyun) {

        } else if (id == R.id.productdetail) {

        } else if (id == R.id.taobaomain) {

        }
    }
}
