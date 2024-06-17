package com.the.sportquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.the.sportquiz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    private LottieAnimationView ball, tenis, basketball, formulla, ball2, tenis2, f1_2, basketball2, ball3, basketball3, tenis3, f1_3, start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ball = findViewById(R.id.ball);
        tenis = findViewById(R.id.tenis);
        basketball = findViewById(R.id.basketball);
        formulla = findViewById(R.id.formulla);
        ball2 = findViewById(R.id.ball2);
        tenis2 = findViewById(R.id.tenis2);
        f1_2 = findViewById(R.id.f1_2);
        basketball2 = findViewById(R.id.basketball2);
        ball3 = findViewById(R.id.ball3);
        tenis3 = findViewById(R.id.tenis3);
        basketball3 = findViewById(R.id.basketball3);
        f1_3 = findViewById(R.id.f1_3);
        start = findViewById(R.id.start);




        ball.setMinProgress(0.0f);
        ball.setMaxProgress(0.59f);
        ball.setRepeatCount(LottieDrawable.INFINITE);
        ball.setRepeatMode(LottieDrawable.REVERSE);
        ball.playAnimation();

        tenis.setMinProgress(0.0f);
        tenis.setMaxProgress(0.59f);
        tenis.setRepeatCount(LottieDrawable.INFINITE);
        tenis.setRepeatMode(LottieDrawable.REVERSE);
        tenis.playAnimation();


        basketball.setMinProgress(0.0f);
        basketball.setMaxProgress(0.59f);
        basketball.setRepeatCount(LottieDrawable.INFINITE);
        basketball.setRepeatMode(LottieDrawable.REVERSE);
        basketball.playAnimation();

        formulla.setMinProgress(0.0f);
        formulla.setMaxProgress(0.59f);
        formulla.setRepeatCount(LottieDrawable.INFINITE);
        formulla.setRepeatMode(LottieDrawable.REVERSE);
        formulla.playAnimation();

        ball2.setMinProgress(0.0f);
        ball2.setMaxProgress(0.59f);
        ball2.setRepeatCount(LottieDrawable.INFINITE);
        ball2.setRepeatMode(LottieDrawable.REVERSE);
        ball2.playAnimation();

        basketball2.setMinProgress(0.0f);
        basketball2.setMaxProgress(0.59f);
        basketball2.setRepeatCount(LottieDrawable.INFINITE);
        basketball2.setRepeatMode(LottieDrawable.REVERSE);
        basketball2.playAnimation();

        f1_2.setMinProgress(0.0f);
        f1_2.setMaxProgress(0.59f);
        f1_2.setRepeatCount(LottieDrawable.INFINITE);
        f1_2.setRepeatMode(LottieDrawable.REVERSE);
        f1_2.playAnimation();


        tenis2.setMinProgress(0.0f);
        tenis2.setMaxProgress(0.59f);
        tenis2.setRepeatCount(LottieDrawable.INFINITE);
        tenis2.setRepeatMode(LottieDrawable.REVERSE);
        tenis2.playAnimation();

        ball3.setMinProgress(0.0f);
        ball3.setMaxProgress(0.59f);
        ball3.setRepeatCount(LottieDrawable.INFINITE);
        ball3.setRepeatMode(LottieDrawable.REVERSE);
        ball3.playAnimation();

        basketball3.setMinProgress(0.0f);
        basketball3.setMaxProgress(0.59f);
        basketball3.setRepeatCount(LottieDrawable.INFINITE);
        basketball3.setRepeatMode(LottieDrawable.REVERSE);
        basketball3.playAnimation();

        tenis3.setMinProgress(0.0f);
        tenis3.setMaxProgress(0.59f);
        tenis3.setRepeatCount(LottieDrawable.INFINITE);
        tenis3.setRepeatMode(LottieDrawable.REVERSE);
        tenis3.playAnimation();

        f1_3.setMinProgress(0.0f);
        f1_3.setMaxProgress(0.59f);
        f1_3.setRepeatCount(LottieDrawable.INFINITE);
        f1_3.setRepeatMode(LottieDrawable.REVERSE);
        f1_3.playAnimation();

        start.setMinProgress(0.0f);
        start.setMaxProgress(0.59f);
        start.setRepeatCount(LottieDrawable.INFINITE);
        start.setRepeatMode(LottieDrawable.REVERSE);
        start.playAnimation();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Football_Activity.class);
                startActivity(intent);

            }
        });

    }








}