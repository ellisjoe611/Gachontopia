package com.example.ellis.topia;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton, imageButton2, imageButton3, imageButton4, imageButton5;
    static String phone, type, home_area, home_addr;

    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //LoginActivity로부터 intent 데이터를 부른다
        Intent intentFromLogin = getIntent();
        phone = intentFromLogin.getStringExtra("phone");
        type = intentFromLogin.getStringExtra("type");
        home_area = intentFromLogin.getStringExtra("home_area");
        home_addr = intentFromLogin.getStringExtra("home_addr");

        imageButton = findViewById(R.id.imageButton);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);

        imageButton.setBackgroundDrawable(null);
        imageButton2.setBackgroundDrawable(null);
        imageButton3.setBackgroundDrawable(null);
        imageButton4.setBackgroundDrawable(null);
        imageButton5.setBackgroundDrawable(null);

        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton:
                if(type.equalsIgnoreCase("client")) {
                    Intent intentToRequest = new Intent(getApplicationContext(), reserve.class);
                    intentToRequest.putExtra("phone", phone);
                    intentToRequest.putExtra("type", type);
                    intentToRequest.putExtra("home_area", home_area);
                    intentToRequest.putExtra("home_addr", home_addr);
                    startActivity(intentToRequest);
                }else {
                    Toast.makeText(this, "For clients only...", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.imageButton2:
                Intent lookup = new Intent(getApplicationContext(), LookupActivity.class);
                startActivity(lookup);
                break;

            case R.id.imageButton3:     //여기는 사용자 페이지이므로, type = "client"만 접근 허용한다.
                if(type.equalsIgnoreCase("client")) {
                    Intent intentToOrderForClient = new Intent(getApplicationContext(), OrderForClientActivity.class);
                    intentToOrderForClient.putExtra("phone", phone);
                    intentToOrderForClient.putExtra("type", type);
                    intentToOrderForClient.putExtra("home_area", home_area);
                    intentToOrderForClient.putExtra("home_addr", home_addr);
                    startActivity(intentToOrderForClient);
                }else {
                    Toast.makeText(this, "For clients only...", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.imageButton4:     //여기는 관리자 페이지이므로, type = "shop"만 접근 허용한다.
                if(type.equalsIgnoreCase("shop")) {
                    Intent intentToOrderForShop = new Intent(getApplicationContext(), OrderForShopActivity.class);
                    intentToOrderForShop.putExtra("phone", phone);
                    intentToOrderForShop.putExtra("type", type);
                    intentToOrderForShop.putExtra("home_area", home_area);
                    intentToOrderForShop.putExtra("home_addr", home_addr);
                    startActivity(intentToOrderForShop);
                }else {
                    Toast.makeText(this, "세탁소 관리자만 접근 가능합니다...", Toast.LENGTH_SHORT).show();
                }
                
                break;

            case R.id.imageButton5:
                String infoMessage = "세탁소 등록 문의:\n010-2479-5477\n월 39,800원으로 가천 토피아에 등록하세요!";
                AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
                builder.setMessage(infoMessage).setPositiveButton("알겠습니다!", null).create().show();
                break;
        }
    }



    //뒤로가기 버튼: 두번 연속으로 클릭하면 로그아웃한다.
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if (pressedTime == 0){
            Toast.makeText(this, "한번 더 누르면 로그아웃됩니다.", Toast.LENGTH_SHORT).show();
            pressedTime = System.currentTimeMillis();
        } else{
            int seconds = (int) (System.currentTimeMillis() - pressedTime);

            //2000: 2000밀리초 (= 2초)
            if(seconds > 2000){
                pressedTime = 0;
            }else{
                finish();   //intentFromLogin 을 종료한다.
            }
        }
    }
}
