package edu.cibertec.fistclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.cibertec.fistclass.view.createAccountActivity;

public class MainActivity extends AppCompatActivity {

    EditText et_name;
    EditText et_pass;
    Button bt_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.userName);
        et_pass = findViewById(R.id.userPass);

        bt_ingresar = findViewById(R.id.loginButton);
    }


    public void goCreateAccount(View view){

        Intent intent = new Intent(this, createAccountActivity.class);
        startActivity(intent);

    }
}