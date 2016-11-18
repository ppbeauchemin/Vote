package com.beauchemin.pp.vote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FullDisplayActivity extends AppCompatActivity {

    @BindView(R.id.full) ImageView full;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_display);
        ButterKnife.bind(this);
        full.setImageResource(getIntent().getIntExtra("image", R.mipmap.ic_launcher));
    }


}
