package com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModuleSum {

    @Singleton
    @Provides
    static ISum finalOutput() {

        return new SumImpl();
    }
}
