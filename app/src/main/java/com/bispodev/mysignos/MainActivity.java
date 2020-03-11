package com.bispodev.mysignos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner sn_month;
    Spinner sn_day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillSpinner();

    }


    private void fillSpinner(){

        sn_day = findViewById(R.id.sn_day);
        sn_month = findViewById(R.id.sn_month);

        ArrayAdapter<CharSequence> adapter_day = ArrayAdapter.createFromResource(this, R.array.array_day, R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter_month = ArrayAdapter.createFromResource(this, R.array.array_month, R.layout.support_simple_spinner_dropdown_item);

        adapter_day.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        adapter_month.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        sn_day.setAdapter(adapter_day);
        sn_month.setAdapter(adapter_month);
    }
}
