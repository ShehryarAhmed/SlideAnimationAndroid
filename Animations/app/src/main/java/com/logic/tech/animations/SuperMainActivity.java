package com.logic.tech.animations;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class SuperMainActivity extends AppCompatActivity {
    TextView txt;
    TextView txt2;
    private Animation mAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_main);
        Button slide = (Button) findViewById(R.id.SlideActivty);
      txt = (TextView) findViewById(R.id.txt);
      txt2 = (TextView) findViewById(R.id.txt2);
        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slide = new Intent(SuperMainActivity.this,MainActivity.class);
                startActivity(slide);
            }
        });
        mAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.start);
        txt.setVisibility(View.VISIBLE);
        txt.startAnimation(mAnimation);
        delay();

    }

    private void delay() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                txt2.setVisibility(View.VISIBLE);
                txt2.animate().alpha(0).setDuration(3000).start();
            }
        }, 1500);
    }

}
