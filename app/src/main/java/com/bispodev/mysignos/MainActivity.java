package com.bispodev.mysignos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.bispodev.mysignos.model.VerifyInput;

public class MainActivity extends AppCompatActivity {

    private VerifyInput verifyInput = new VerifyInput();
    private EditText input_day;
    private EditText input_month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
