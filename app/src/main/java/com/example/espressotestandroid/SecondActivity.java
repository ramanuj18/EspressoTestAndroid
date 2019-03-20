package com.example.espressotestandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtResult=findViewById(R.id.txtResult);
        Bundle inputData=getIntent().getExtras();
        String input=inputData.getString("input");
        txtResult.setText(input);
    }
}
