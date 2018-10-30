package com.dex.letsjoke.app;

import android.content.Context;

import com.dex.letsjoke.app.databinding.ActivityMainBinding;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;


public final class AdHelper {
    public static void loadBannerAdForMainActivity(Context context, ActivityMainBinding dataBinding) {
        MobileAds.initialize(context, BuildConfig.AdMobKey);

        AdRequest adRequest =
                new AdRequest.Builder()
                        .build();

        dataBinding.adViewMainActivity.loadAd(adRequest);
    }
}
