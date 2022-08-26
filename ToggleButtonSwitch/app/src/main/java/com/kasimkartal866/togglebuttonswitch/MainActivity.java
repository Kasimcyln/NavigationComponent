package com.kasimkartal866.togglebuttonswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ToggleButton toggleButton;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        toggleButton = findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.switch1);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Log.e("Switch Button", "ON");
                }else {
                    Log.e("Switch Button", "OFF");
                }
            }
        });
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Log.e("Toggle Button", "ON");
                }else {
                    Log.e("Toggle Button", "OFF");
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean switchDurum = aSwitch.isChecked();
                Boolean toggleDurum = toggleButton.isChecked();

                Log.e("Switch Dur" +
                        "um", String.valueOf(switchDurum));
                Log.e("Toggle Button Durum", String.valueOf(toggleDurum));
            }
        });
    }
}