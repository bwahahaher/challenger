package com.example.myproject;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends Activity{
    NotificationManager notificationManager;
    Button addButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addActIntent = new Intent(MainActivity.this, addActivity.class);
                startActivity(addActIntent);
            }
        });

        notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        testnote.note(notificationManager, getApplicationContext(), "Привет!", "я!", 1);
        testnote.note(notificationManager, getApplicationContext(), "Вы давно не заходили в приложение", "Hey!", 2);
        ArrayList<Purpose> purpose = new ArrayList();
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        purpose.add(new Purpose("12 apr", "Карантин", "wait"));
        RecycleAdapter adapter = new RecycleAdapter(purpose);
        RecyclerView purposeList = findViewById(R.id.goalsRecycleView);
        purposeList.setLayoutManager(new GridLayoutManager(this, 1));
        purposeList.setAdapter(adapter);


    }
}
