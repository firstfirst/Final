package com.example.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);


        Button btLogin = (Button) findViewById(R.id.button_login);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edt_Id = (EditText) findViewById(R.id.editText_id);
                EditText edt_Pass = (EditText) findViewById(R.id.editText_pass);


                String str_Id = edt_Id.getText().toString();
                String str_Pass = edt_Pass.getText().toString();

                if(str_Id.equals("")|| str_Pass.equals("")){
                    Toast.makeText(getApplicationContext(),"Invalid Username orPassword",Toast.LENGTH_LONG).show();

                }

                else{
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });


        
        Button btRegis = (Button) findViewById(R.id.button_register);
        btRegis.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
