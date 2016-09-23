package com.sample.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



public class BannerActivity extends AppCompatActivity {
    //@BindView(R.id.adView) AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banner_layout);


        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        adView.loadAd(adRequest);
        //  adView.setAdSize(AdSize.FULL_BANNER);
        /// mAdView.setAdUnitId(YOUR_BANNER_ID);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                showMessage("cloase");
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                showMessage("onAdFailedToLoad");
                super.onAdFailedToLoad(i);
            }

            @Override
            public void onAdOpened() {
                showMessage("onAdOpened");
                super.onAdOpened();
            }

            @Override
            public void onAdLeftApplication() {
                showMessage("onAdLeftApplication");
                super.onAdLeftApplication();
            }

            @Override
            public void onAdLoaded() {
                showMessage("onAdLoaded");
                super.onAdLoaded();
            }
        });


    }

    private void showMessage(String msg) {
        Toast.makeText(BannerActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
