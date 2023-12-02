package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.slider.RangeSlider;

public class FirstActivity extends AppCompatActivity {

    private Button myButton;
    private Boolean buttonPressed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView textView = findViewById(R.id.tv_res);
        RangeSlider slider = findViewById(R.id.slider);
        RangeSlider slider2 = findViewById(R.id.slider2);
        String text = getIntent().getStringExtra(MainActivity.KEY1);
        textView.setText(text);
        myButton = findViewById(R.id.myButton);
        slider.setValues(1.0f, 5.0f);
        slider2.setValues(1.0f, 5.0f);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonPressed = true;
                if (buttonPressed) {
                    myButton.setBackgroundResource(R.drawable.heart_style);
                }else if (buttonPressed = false){
                    myButton.setBackgroundResource(R.drawable.hearth_white_style);
                }
            }
        });
        nextClick(findViewById(R.id.next));
    }

    public void nextClick(View view) {
        findViewById(R.id.next).setOnClickListener(v -> {
            finishAffinity();
        });
    }
}