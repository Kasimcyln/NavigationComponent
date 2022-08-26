package com.kasimkartal866.timepickerdatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTime,editTextDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTime = findViewById(R.id.editTextTime);
        editTextDate = findViewById(R.id.editTextDate);


        editTextTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int time = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePicker;

                timePicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        editTextTime.setText(i+" : "+i1);
                    }
                },time,minute,true);
                timePicker.setTitle("Enter Time");
                timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Save",timePicker);
                timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel",timePicker);

                timePicker.show();
            }
        });
        editTextDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker;

                datePicker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        editTextDate.setText(i2+"/"+i1+"/"+i);
                    }
                },year,month,day);
                datePicker.setTitle("Enter Date");
                datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Save",datePicker);
                datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel",datePicker);
                datePicker.show();
            }
        });
    }
}