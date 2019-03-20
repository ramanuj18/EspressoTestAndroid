package com.example.espressotestandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity  {

    private EditText edtUserName,edtPassword;
    private TextView txtResult;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName=findViewById(R.id.edtUserName);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);

        txtResult=findViewById(R.id.txtResult);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               LoginActivity.this.onClick();
            }
        });

    }

    public void onClick(){
        String userName=edtUserName.getText().toString().trim();
        String password=edtPassword.getText().toString().trim();

        if(userName.length()!=0 && password.length()!=0){
            if(userName.equals("Ramanuj") && password.equals("123456")){
                txtResult.setText("success");
            }else {
                Log.d("TAG","username or password incorrect");
            }
        }else {
            Log.d("TAG","please enter username and password");
        }
    }
}
