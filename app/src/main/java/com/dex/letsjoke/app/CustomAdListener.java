package com.dex.letsjoke.app;


public interface CustomAdListener {
    void onAdLoaded();

    void onAdFailedToLoad(int errorCode);

    void onAdOpened();

    void onAdLeftApplication();

    void onAdClosed();
}
