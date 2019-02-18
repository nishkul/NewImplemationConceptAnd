package com.example.androd.newimplemationconceptand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import com.example.androd.newimplemationconceptand.dagger2.MyExample;

import java.util.Date;

import javax.inject.Inject;

import dagger.Component;

//import com.example.androd.newimplemationconceptand.dragger.BattleComponent;


public class MainActivity extends AppCompatActivity {
    @Inject
    MyExample mMyExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dateTextView = findViewById(R.id.tvDate);
        ((MyApplication) getApplication())
                .getMyComponent()
                .inject(MainActivity.this);
        dateTextView.setText((new Date(mMyExample.getDate())).toString());
      //  BattleComponentq component = DaggerBattleComponentq.create();
//        War war = component.getWar();
//        war.prepare();
//        war.report();
    }



}
