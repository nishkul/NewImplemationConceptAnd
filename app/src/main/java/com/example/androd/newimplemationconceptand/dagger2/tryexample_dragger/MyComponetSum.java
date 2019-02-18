package com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger;

import android.app.Activity;


import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Singleton
@Component(modules = MyModuleSum.class)
public interface MyComponetSum {
    void inject(Activity activity);

}
