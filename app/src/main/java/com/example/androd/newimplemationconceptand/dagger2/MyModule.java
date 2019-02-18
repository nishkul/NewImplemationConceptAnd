package com.example.androd.newimplemationconceptand.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    @Singleton
    static MyExample provideMyExample() {
        return new MyExampleImpl();
    }

}
