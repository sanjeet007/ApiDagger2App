package com.ezimax.apidagger2app.dagger2;

import com.ezimax.apidagger2app.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworksModule.class})
public interface NetworkComponent {
    public void inject(MainActivity activity);
}

