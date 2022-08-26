package com.kasimkartal866.radiobuttoncheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxJava,checkBoxKotlin;
    private RadioButton radioButtonBarcelona,radioButtonRealMadrid;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxJava = findViewById(R.id.checkBoxJava);
        checkBoxKotlin = findViewById(R.id.checkBoxKotlin);
        radioButtonBarcelona = findViewById(R.id.radioButtonBarcelona);
        radioButtonRealMadrid = findViewById(R.id.radioButtonRealMadrid);
        button = findViewById(R.id.button);

        radioButtonRealMadrid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Congratulations Real Madrid :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBoxJava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Congratulations Java :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean java = checkBoxJava.isChecked();
                Boolean kotlin = checkBoxKotlin.isChecked();
                Boolean barcelona = radioButtonBarcelona.isChecked();
                Boolean realMadrid = radioButtonRealMadrid.isChecked();

                Log.e("Java Durum",String.valueOf(java));
                Log.e("Kotlin Durum",String.valueOf(kotlin));
                Log.e("Barcelona Durum",String.valueOf(barcelona));
                Log.e("Real Madrid Durum",String.valueOf(realMadrid));
            }
        });
    }
}