package com.ench.jaya.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView ed1,ed2;
    String sname22,sname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView ed1 = (TextView) findViewById(R.id.textView3);
        sname22=getIntent().getStringExtra("sno");
        ed1.setText(sname22);
        TextView ed2 = (TextView) findViewById(R.id.textView4);
        sname=getIntent().getStringExtra("username");
        ed2.setText(sname);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
