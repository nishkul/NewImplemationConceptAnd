package com.example.androd.newimplemationconceptand;

import android.app.Application;

import com.example.androd.newimplemationconceptand.dagger2.DaggerMyComponent;
import com.example.androd.newimplemationconceptand.dagger2.MyComponent;
import com.example.androd.newimplemationconceptand.dagger2.MyModule;
import com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger.DaggerMyComponetSum;
import com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger.MyComponetSum;
import com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger.MyModuleSum;

public class MyApplication extends Application {
    private MyComponent mMyComponent;
    private MyComponetSum myComponetSum;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyComponent = createMyComponent();
        myComponetSum = createSumComponent();
    }

    MyComponent getMyComponent() {
        return mMyComponent;
    }

    MyComponetSum getMyComponentSum() {
        return myComponetSum;
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }

    private MyComponetSum createSumComponent() {
        return DaggerMyComponetSum.builder().myModuleSum(new MyModuleSum()).build();

    }
}
