package com.sample.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by root on 22/9/16.
 */

public class InstertialActvity extends AppCompatActivity {
//    @BindView(R.id.loadIntertial)
//    Button loadIntertial;
//    @BindView(R.id.intertialNotReady)
//    Button intertialNotReady;

    private InterstitialAd mInterstitialAd;
    private Button loadIntertial;
    private Button intertialNotReady;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interstitial_layout);
       // ButterKnife.bind(this);
        loadIntertial = (Button) findViewById(R.id.loadIntertial);
        intertialNotReady = (Button) findViewById(R.id.intertialNotReady);
    }


    public void LoadInterstialClick(View view){
        intertialNotReady.setEnabled(false);
        intertialNotReady.setText("Loading Interstitial");

        mInterstitialAd=new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                intertialNotReady.setText("error Interstitial");
            }

            @Override
            public void onAdLeftApplication() {
                super.onAdLeftApplication();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {

                super.onAdLoaded();
                intertialNotReady.setEnabled(true);
                intertialNotReady.setText("Show Interstitial");
            }
        });

        AdRequest adRequest=new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }
    @OnClick(R.id.intertialNotReady)
    public void intertialNotReadyClick(View view){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();

    }
        intertialNotReady.setEnabled(false);
        intertialNotReady.setText(" Interstitial not ready");

        
    }
}
