package com.example.ellis.topia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class SignupActivity extends AppCompatActivity {

    String[] district = {"gangnam", "gangdong", "gangbook", "gangseo", "kwanak", "kwangjin", "guro", "geumcheon",
            "nowon", "dobong", "dongdaemoon", "dongjak", "mapo", "seodaemoon", "seocho", "seongdong", "seongbook",
            "songpa", "yangcheon", "yongdeungpo", "yongsan", "ennpyeong", "jongro", "joonggu", "joonglang"};
    EditText editText_newPhone, editText_newPW, editText_checkPW, editText_newAddress;
    Spinner spinner_newDistrict;
    Button button_createAccount;

    String phone, password, home_area, home_addr; //DB에 있는 변수 이름과 동일
    String type = "client"; //DB에 있는 변수 이름과 동일, 기본적인 회원 type = "client"


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editText_newPhone = findViewById(R.id.editText_newPhone);
        editText_newPW = findViewById(R.id.editText_newPW);
        editText_checkPW = findViewById(R.id.editText_checkPW);
        editText_newAddress = findViewById(R.id.editText_newAddress);

        spinner_newDistrict = findViewById(R.id.spinner_newDistrict);
        button_createAccount = findViewById(R.id.button_createAccount);

        ArrayAdapter<String> districtAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, district);
        districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_newDistrict.setAdapter(districtAdapter);

        spinner_newDistrict.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                home_area = district[position]; //지역 이름을 DB명의 string에다가 기입
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                home_area = "";
            }
        });


        button_createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //나머지 DB명의 값들을 기입
                phone = editText_newPhone.getText().toString();
                password = editText_newPW.getText().toString();
                home_addr = editText_newAddress.getText().toString();

                if(foundEmpty()){
                    Toast.makeText(SignupActivity.this, "모든 부분을 채워주세요.", Toast.LENGTH_SHORT).show();
                }
                else if (!(editText_newPW.getText().toString().equals(editText_checkPW.getText().toString()))) {
                    Toast.makeText(SignupActivity.this, "비밀번호를 다르게 입력하셨습니다.", Toast.LENGTH_SHORT).show();
                }
                else if(editText_newPW.getText().toString().length() < 5){
                    Toast.makeText(SignupActivity.this, "PW는 5글자 이상 가능합니다.", Toast.LENGTH_SHORT).show();
                }
                else{
                    //계정 추가 하기 프로세스 시작
                    Response.Listener<String> responseListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                //중요: JSON을 불러온다
                                JSONObject jsonResponse = new JSONObject(response);
                                boolean success = jsonResponse.getBoolean("success");   //변수 이름: "success" (true / false)
                                if(success){
                                    Toast.makeText(SignupActivity.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
                                    finish();
                                }else{
                                    Toast.makeText(SignupActivity.this, "Error: Failed to create account...", Toast.LENGTH_SHORT).show();
                                }
                            }catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    };

                    SignupRequest signupRequest = new SignupRequest(phone, password, type, home_area, home_addr, responseListener);
                    RequestQueue queue = Volley.newRequestQueue(SignupActivity.this);
                    queue.add(signupRequest);

                    //계정 추가 하기 프로세스 끝
                }
            }
        });
    }


    public boolean foundEmpty(){
        boolean result = false;
        if(editText_newPhone.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        else if(editText_newPW.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        else if(editText_checkPW.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        else if(editText_newAddress.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        else if(home_area.equalsIgnoreCase("")){
            result = true;
        }
        return result;
    }
}
