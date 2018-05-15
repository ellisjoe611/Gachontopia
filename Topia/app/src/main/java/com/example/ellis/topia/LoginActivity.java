package com.example.ellis.topia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    Button button_signup, button_login;
    EditText editText_phone, editText_pw;
    CheckBox checkBox_autoLogin;

    AsyncHttpClient client;
    HttpResponse httpResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button_signup = findViewById(R.id.button_signup);
        button_login = findViewById(R.id.button_login);
        editText_phone = findViewById(R.id.editText_phone);
        editText_pw = findViewById(R.id.editText_pw);
        checkBox_autoLogin = findViewById(R.id.checkBox_autoLogin);

        button_signup.setOnClickListener(this);
        button_login.setOnClickListener(this);
        checkBox_autoLogin.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_signup:
                Intent signUpIntent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivityForResult(signUpIntent, 1);
                break;
            case R.id.button_login:

                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }

    public class HttpResponse extends AsyncHttpResponseHandler{
        @Override
        public void onSuccess(String content) {
            if (content.equalsIgnoreCase("OK")){
                
            }else if(content.equalsIgnoreCase("NONE")){
                Toast.makeText(getApplication(), "Error: the account does not exist...", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onFailure(int statusCode, Throwable error, String content) {
            Toast.makeText(getApplication(), "Error: ", Toast.LENGTH_SHORT).show();
        }
    }
}
