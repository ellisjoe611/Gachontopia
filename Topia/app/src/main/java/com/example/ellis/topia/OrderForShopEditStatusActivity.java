package com.example.ellis.topia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class OrderForShopEditStatusActivity extends AppCompatActivity {
    ImageButton load,complete,delivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_for_shop_edit_status);
        load=findViewById(R.id.button_editStatus_onProcess);
        complete=findViewById(R.id.button_editStatus_processComplete);
        delivery=findViewById(R.id.button_editStatus_deliveryComplete);
        load.setBackgroundDrawable(null);
        complete.setBackgroundDrawable(null);
        delivery.setBackgroundDrawable(null);
    }
}
