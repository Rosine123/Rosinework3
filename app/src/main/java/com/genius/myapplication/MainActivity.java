package com.genius.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText TextUsername,TextPassword;
    Button LoginButton;
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextUsername = findViewById(R.id.EditUsername);
        TextPassword = findViewById(R.id.EditPassword);
        LoginButton = findViewById(R.id.ButtonLogin);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_LONG).show();
                String Username,Password;
                Username = TextUsername.getText().toString();
                Password = TextPassword.getText().toString();

                if (Username.equals("") && Password.equals("")){
                    Toast.makeText(MainActivity.this,"Empty  Field",Toast.LENGTH_LONG).show();
                }else if(Username.equals("Admin") && Password.equals("12")){
                    Intent intent = new Intent(MainActivity.this,welcome.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Invalid Username or Password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
