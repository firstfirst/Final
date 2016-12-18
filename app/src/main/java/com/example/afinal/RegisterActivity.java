package com.example.afinal;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity  extends AppCompatActivity{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeractivity);

         Button btLogin = (Button) findViewById(R.id.button_login);
         btLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 EditText edtName = (EditText) findViewById(R.id.editText__regis_name);
                 EditText edtId = (EditText) findViewById(R.id.editText_regis_id);
                 EditText edtPass = (EditText) findViewById(R.id.editText_regis_pass);


                 String str_regis_Name = edtName.getText().toString();
                 String str_regis_Id = edtId.getText().toString();
                 String str_regis_Pass = edtPass.getText().toString();

                 if(str_regis_Id.equals("")||str_regis_Name.equals("")||str_regis_Pass.equals("")){

                     AlertDialog.Builder dialog = new AlertDialog.Builder(RegisterActivity.this);
                     dialog.setTitle("ReGISTRATION FAILED");
                     dialog.setMessage("User already exists");
                     dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                                    finish();
                         }
                     });
                     dialog.show();
                 }
                 //if(!str_regis_Id.equals("")||!str_regis_Name.equals("")||!str_regis_Pass.equals(""))
                 else{
                     Toast.makeText(getApplicationContext(),"CREATE ACCOUNT SUCCESSFULL",Toast.LENGTH_LONG).show();

                 }

             }
         });




    }
}
