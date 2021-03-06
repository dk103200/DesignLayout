package com.example.designlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtuser, txtpass;
    TextView signUp;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtuser = (EditText) findViewById(R.id.user);
        txtpass = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.btn_sign);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        signUp = (TextView) findViewById(R.id.lb_sign_up);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    public void login(){
        if (txtuser.getText().length() != 0 && txtpass.getText().length() != 0 ){
            if (txtuser.getText().toString().trim().equals("admin") && txtpass.getText().toString().equals("123") ){
                Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(getApplicationContext(),"Thông tin đăng nhập không hợp lệ",Toast.LENGTH_SHORT).show();
            }
        }
        else
            Toast.makeText(getApplicationContext(),"Vui lòng nhập thông tin đăng nhập",Toast.LENGTH_SHORT).show();

    }

}