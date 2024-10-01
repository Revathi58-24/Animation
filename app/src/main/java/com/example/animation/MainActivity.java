package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button fadeInButton, fadeOutButton, scaleButton, rotateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.im);
        fadeInButton = findViewById(R.id.button);
        fadeOutButton = findViewById(R.id.button2);
        scaleButton = findViewById(R.id.button3);
        rotateButton = findViewById(R.id.button4);

        // Fade In Animation
        fadeInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                imageView.startAnimation(fadeIn);
            }
        });

        // Fade Out Animation
        fadeOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadeOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fadeout);
                imageView.startAnimation(fadeOut);
            }
        });

        // Scale Animation
        scaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                imageView.startAnimation(scale);
            }
        });

        // Rotate Animation
        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                imageView.startAnimation(rotate);
            }
        });
    }
}
