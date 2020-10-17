package com.example.designlayout;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    TextView login;
    EditText txtuser,txtpass;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtuser = (EditText) findViewById(R.id.user);
        txtpass = (EditText) findViewById(R.id.pass);
        login = (TextView) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                Bundle bun = new Bundle();
                String a = txtuser.getText().toString().trim();
                String b = txtpass.getText().toString().trim();

                bun.putString("user", a);
                bun.putString("pass", b);

                intent.putExtra("package", bun);
                startActivity(intent);
            }
        });
    }
}
