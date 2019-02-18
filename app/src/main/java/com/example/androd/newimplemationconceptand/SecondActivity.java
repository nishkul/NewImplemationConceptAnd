package com.example.androd.newimplemationconceptand;

import android.app.Application;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.androd.newimplemationconceptand.dagger2.MyExample;
import com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger.ISum;
import com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger.SumImpl;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject
    ISum sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ISum iSum =new SumImpl();
        ((SumImpl) iSum).additionOftwoNo(5,4);
        ((MyApplication) getApplication()).getMyComponentSum().inject(this);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             //   ((TextView) findViewById(R.id.textView)).setText();
                Snackbar.make(view, "Replace with your own action"+sum.finalCaluation(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
