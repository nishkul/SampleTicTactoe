package com.sample.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by root on 22/9/16.
 */

public class AdsAcitivity extends AppCompatActivity {

  //  @BindView(R.id.intertial_ads) Button interrialBtn;
   // @BindView(R.id.banner_ads) Button bannerBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ads_layout);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.intertial_ads)
    public void intertialClick(View view){
        startActivity(new Intent(AdsAcitivity.this,InstertialActvity.class));
    }
    @OnClick(R.id.banner_ads)
    public void bannerClick(View view){
        startActivity(new Intent(AdsAcitivity.this,BannerActivity.class));
    }
}
