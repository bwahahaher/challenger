package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class addActivity extends AppCompatActivity {
TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        date = findViewById(R.id.date);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date.setPaintFlags(date.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        });
    }
}
