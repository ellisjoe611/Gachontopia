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

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    String[] district = {"강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구",
            "노원구", "도봉구", "동대문구", "동작구", "마포구", "서대문구", "서초구", "성동구", "성북구",
            "송파구", "양천구", "영등포구", "용산구", "은평구", "종로구", "중구", "중랑구"};
    EditText editText_newPhone, editText_newPW, editText_checkPW, editText_newAddress;
    String selectedDistrict;
    Spinner spinner_newDistrict;
    Button button_createAccount;

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
                selectedDistrict = district[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedDistrict = "";
            }
        });

        button_createAccount.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if(foundEmpty()){
            Toast.makeText(this, "Error: Enter all inputs...", Toast.LENGTH_SHORT).show();
        }
        else{
            //계정 추가 하기

            
        }
    }

    public boolean foundEmpty(){
        boolean result = false;
        if(editText_newPhone.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        if(editText_newPW.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        if(editText_checkPW.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        if(editText_newAddress.getText().toString().equalsIgnoreCase("")){
            result = true;
        }
        if(selectedDistrict.equalsIgnoreCase("")){
            result = true;
        }
        return result;
    }
}
