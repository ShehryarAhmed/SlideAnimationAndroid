package com.logic.tech.animations;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slide =  new Intent(SecondActivity.this,MainActivity.class);
                Bundle animation = ActivityOptions.makeCustomAnimation(SecondActivity.this,
                        R.anim.secondstart,R.anim.scondstop).toBundle();
                startActivity(slide,animation);
            }
        });
    }
}
