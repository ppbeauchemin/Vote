package com.beauchemin.pp.vote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.common.collect.ImmutableMap;

public class MainActivity extends AppCompatActivity {

    private ImmutableMap<Integer, Integer> lighters = new ImmutableMap.Builder<Integer, Integer>()
            .put(R.id.red_lighter, R.drawable.red_lighter)
            .put(R.id.orange_lighter, R.drawable.orange_lighter)
            .put(R.id.green_lighter, R.drawable.green_lighter)
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayFull(View view) {
        Intent intent = new Intent(this, FullDisplayActivity.class);
        intent.putExtra("image", lighters.get(view.getId()));
        startActivity(intent);
    }

}
