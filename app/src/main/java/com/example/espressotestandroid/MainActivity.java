package com.example.espressotestandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    private String tag="TAG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);

        Log.d(tag,"onCreate() Called");

    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.changeText:
                editText.setText("HsHsssss");
                break;
            case R.id.switchActivity:
                Intent intent=new Intent(this,SecondActivity.class);
                intent.putExtra("input",editText.getText().toString());
                startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy called");
    }
}
