package com.example.ellis.topia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class OrderForShopEditStatusActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_editStatus_phone, textView_editStatus_dateIn, textView_editStatus_dateOut, textView_editStatus_address, textView_editStatus_status;
    ImageButton button_editStatus_onProcess, button_editStatus_processComplete, button_editStatus_deliveryComplete;
    static String clientPhone, dateIn, dateOut, clientAddr, shopArea, status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_for_shop_edit_status);

        Intent intentFromOrderForShop = getIntent();
        clientPhone = intentFromOrderForShop.getStringExtra("clientPhone");
        dateIn = intentFromOrderForShop.getStringExtra("dateIn");
        dateOut = intentFromOrderForShop.getStringExtra("dateOut");
        clientAddr = intentFromOrderForShop.getStringExtra("clientAddr");
        shopArea = intentFromOrderForShop.getStringExtra("shopArea");
        status = intentFromOrderForShop.getStringExtra("status");

        textView_editStatus_phone = findViewById(R.id.textView_editStatus_phone);
        textView_editStatus_dateIn = findViewById(R.id.textView_editStatus_dateIn);
        textView_editStatus_dateOut = findViewById(R.id.textView_editStatus_dateOut);
        textView_editStatus_address = findViewById(R.id.textView_editStatus_address);
        textView_editStatus_status = findViewById(R.id.textView_editStatus_status);

        textView_editStatus_phone.setText(clientPhone);
        textView_editStatus_dateIn.setText(dateIn);
        textView_editStatus_dateOut.setText(dateOut);
        textView_editStatus_address.setText(clientAddr);
        textView_editStatus_status.setText(status);

        button_editStatus_onProcess = findViewById(R.id.button_editStatus_onProcess);
        button_editStatus_processComplete = findViewById(R.id.button_editStatus_processComplete);
        button_editStatus_deliveryComplete = findViewById(R.id.button_editStatus_deliveryComplete);

        button_editStatus_onProcess.setOnClickListener(this);
        button_editStatus_processComplete.setOnClickListener(this);
        button_editStatus_deliveryComplete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String statusUpdate = "";
        String sms = "";
        switch (v.getId()){
            case R.id.button_editStatus_onProcess:
                statusUpdate = "세탁 진행중";
                sms = "고객님의 빨래 신청이 접수 되었습니다.";
                break;
            case R.id.button_editStatus_processComplete:
                statusUpdate = "세탁 완료";
                sms = "고객님이 신청하신 세탁을 완료하였습니다. 금일 귀하의 자택으로 배달될 예정 입니다.";
                break;
            case R.id.button_editStatus_deliveryComplete:
                statusUpdate = "배달 완료";
                sms = "고객님의 빨래를 배달 완료되었습니다. 귀하주소:\n" + clientAddr;
                break;
        }

        if(statusUpdate.equalsIgnoreCase(status)){
            Toast.makeText(this, "이미 같은 상태입니다...", Toast.LENGTH_SHORT).show();
        }
        else{
            //처리 상태 업데이트 시작
            final String finalSms = sms;
            Response.Listener<String> responseListener = new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try{
                        JSONObject jsonResponse = new JSONObject(response);
                        boolean success = jsonResponse.getBoolean("success");   //변수 이름: "success" (true / false)
                        if(success){
                            Toast.makeText(OrderForShopEditStatusActivity.this, "상태 수정 성공", Toast.LENGTH_SHORT).show();
                            Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + clientPhone));
                            smsIntent.putExtra("sms_body", finalSms);
                            startActivity(smsIntent);
                            finish();
                        }else{
                            Toast.makeText(OrderForShopEditStatusActivity.this, "Error: 업데이트 실패..", Toast.LENGTH_SHORT).show();
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            };

            OrderForShopEditStatusRequest request = new OrderForShopEditStatusRequest(clientPhone, shopArea, clientAddr, dateIn, dateOut, status, statusUpdate, responseListener);
            RequestQueue queue = Volley.newRequestQueue(OrderForShopEditStatusActivity.this);
            queue.add(request);

            //처리 상태 업데이트 종료

        }
    }
}