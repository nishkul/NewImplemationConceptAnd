package com.example.androd.newimplemationconceptand.dagger2;

import java.util.Date;

public class MyExampleImpl implements MyExample {

    private long mDate;

    @Override
    public long getDate() {
        return mDate;
    }

    MyExampleImpl() {
        mDate = new Date().getTime();
    }
}
