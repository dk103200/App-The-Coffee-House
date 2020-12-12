package com.example.thecoffeehouse;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    ImageView logoCup, logoText;
    Animation textAnim,logoAnim;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logoAnim = AnimationUtils.loadAnimation(this, R.anim.ani_trans);
        textAnim = AnimationUtils.loadAnimation(this, R.anim.ani_up);

        logoCup = findViewById(R.id.cup);
        logoCup.setAnimation(logoAnim);

        logoText = findViewById(R.id.text);
        logoText.setAnimation(textAnim);

//        try {
//            Thread.sleep(3000);
//            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
