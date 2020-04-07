package com.example.myproject;

//import android.app.Activity;
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.CompoundButton;
//import android.widget.TextView;
//
//public class MainActivity_copy extends Activity implements View.OnClickListener {
//    TextView textView,textView2, sum;
//    Button btnSave, back, next;
//    CheckBox checkBox,secondCheck, checkBox3, checkBox4, checkBox5;
//    SharedPreferences sPref;
//    final String SAVED_TEXT = "saved_text";
//    final String SAVED_TEXT_TWO = "saved_text_two";
//    final String SAVED_TEXT_3 = "saved_text_3";
//    final String SAVED_TEXT_4 = "saved_text_4";
//    final String SAVED_TEXT_5 = "saved_text_5";
//
//
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        checkBox = findViewById(R.id.checkBox);
//        checkBox3 = findViewById(R.id.checkBox3);
//        checkBox4 = findViewById(R.id.checkBox4);
//        checkBox5 = findViewById(R.id.checkBox5);
//        secondCheck = findViewById(R.id.checkBox2);
//        textView=findViewById(R.id.textView);
//        back = findViewById(R.id.back);
//        next=findViewById(R.id.next);
//        textView2=findViewById(R.id.textView2);
//        btnSave = findViewById(R.id.btnSave);
//        btnSave.setOnClickListener(this);
//        back.setOnClickListener(this);
//        next.setOnClickListener(this);
//
//        sum = findViewById(R.id.sum);
//        loadText();
//        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked)
//                    textView.setText("Флажок выбран");
//                else {
//                    textView.setText("Флажок не выбран");
//                }
//            }
//        });
//
//    }
//
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btnSave:
//                saveText();
//                break;
//            case R.id.back:
//                sum.setText(""+(Integer.parseInt(sum.getText().toString())-1));
//                break;
//            case R.id.next:
//
//                sum.setText(""+(Integer.parseInt(sum.getText().toString())+1));
//                break;
//            default:
//                break;
//        }
//    }
//
//    void saveText() {
//        sPref = getPreferences(MODE_PRIVATE);
//        SharedPreferences.Editor ed = sPref.edit();
//        Boolean saved = checkBox.isChecked();
//        Boolean saved3 = checkBox3.isChecked();
//        Boolean saved4 = checkBox4.isChecked();
//        Boolean saved5 = checkBox5.isChecked();
//
//        Boolean saved2 = secondCheck.isChecked();
//        ed.putBoolean(SAVED_TEXT, saved);
//        ed.putBoolean(SAVED_TEXT_TWO, saved2);
//        ed.putBoolean(SAVED_TEXT_3, saved3);
//        ed.putBoolean(SAVED_TEXT_4, saved4);
//        ed.putBoolean(SAVED_TEXT_5, saved5);
//        ed.commit();
//
//
//    }
//
//
//    void loadText() {
//        sPref = getPreferences(MODE_PRIVATE);
//        Boolean savedText = sPref.getBoolean(SAVED_TEXT, true);
//        Boolean savedText2 = sPref.getBoolean(SAVED_TEXT_TWO, true);
//        Boolean savedText3 = sPref.getBoolean(SAVED_TEXT_3, true);
//        Boolean savedText4 = sPref.getBoolean(SAVED_TEXT_4, true);
//        Boolean savedText5 = sPref.getBoolean(SAVED_TEXT_5, true);
//        if (savedText){
//            checkBox.setChecked(true);
//        }
//        if (savedText2){
//            secondCheck.setChecked(true);
//        }
//        if (savedText3){
//            checkBox3.setChecked(true);
//        }
//        if (savedText4){
//            checkBox4.setChecked(true);
//        }
//        if (savedText5){
//            checkBox5.setChecked(true);
//        }
//        textView.setText(savedText.toString());
//        textView2.setText(savedText2.toString());
//    }
//
//    @Override
//    protected void onDestroy() {
//        saveText();
//        super.onDestroy();
//
//    }
//
//}