package com.example.androd.newimplemationconceptand.dagger2;

import com.example.androd.newimplemationconceptand.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(MainActivity mainActivity);

}