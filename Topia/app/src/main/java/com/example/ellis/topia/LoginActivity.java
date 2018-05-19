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

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    Button button_signup, button_login;
    EditText editText_phone, editText_pw;
    CheckBox checkBox_autoLogin;


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
                //회원가입 시작
                Intent signUpIntent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(signUpIntent);
                break;
            case R.id.button_login:
                String input_Phone = editText_phone.getText().toString();
                String input_PW = editText_pw.getText().toString();

                if(input_Phone.equalsIgnoreCase("")){
                    Toast.makeText(this, "폰번호 입력하세요", Toast.LENGTH_SHORT).show();
                }else if(input_PW.equalsIgnoreCase("")){
                    Toast.makeText(this, "비밀번호 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    //로그인 프로세스 시작
                    Response.Listener<String> responseListener = new Response.Listener<String>() {

                        @Override
                        public void onResponse(String response) {
                            try{
                                //중요: JSON파일을 불러온다!!
                                JSONObject jsonResponse = new JSONObject(response);
                                boolean success = jsonResponse.getBoolean("success");

                                if(success){
                                    String phone = jsonResponse.getString("phone");
                                    String type = jsonResponse.getString("type");
                                    String home_area = jsonResponse.getString("home_area");
                                    String home_addr = jsonResponse.getString("home_addr");

                                    Intent intentToMenu = new Intent(getApplicationContext(), MenuActivity.class);
                                    intentToMenu.putExtra("phone", phone);
                                    intentToMenu.putExtra("type", type);
                                    intentToMenu.putExtra("home_area", home_area);
                                    intentToMenu.putExtra("home_addr", home_addr);

                                    LoginActivity.this.startActivity(intentToMenu);
                                }else{
                                    Toast.makeText(LoginActivity.this, "회원이 존재하지 않습니다.", Toast.LENGTH_SHORT).show();
                                }

                            } catch (JSONException e) {
                                Toast.makeText(LoginActivity.this, "Error: Failed to access server...", Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    };

                    LoginRequest loginRequest = new LoginRequest(input_Phone, input_PW, responseListener);
                    RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                    queue.add(loginRequest);

                    //로그인 프로세스 끝
                    break;
                }
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }

}
