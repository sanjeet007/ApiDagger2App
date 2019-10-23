package com.ezimax.apidagger2app;

import android.app.Application;

import com.ezimax.apidagger2app.dagger2.DaggerNetworkComponent;
import com.ezimax.apidagger2app.dagger2.NetworkComponent;
import com.ezimax.apidagger2app.dagger2.NetworksModule;

public class CustomApplication extends Application {
    private NetworkComponent networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        networkComponent = DaggerNetworkComponent.builder()
                .networksModule(new NetworksModule(Helper.URL))
                .build();
    }
    public NetworkComponent getNetworkComponent(){
        return networkComponent;
    }
}
