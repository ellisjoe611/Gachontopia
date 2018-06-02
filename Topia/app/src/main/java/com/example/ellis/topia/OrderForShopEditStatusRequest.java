package com.example.ellis.topia;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class OrderForShopEditStatusRequest extends StringRequest {
    final static private String URL_EDIT_STATUS = "http://ellisjoe.cafe24.com/order_edit.php";
    private Map<String, String> parameters;


    public OrderForShopEditStatusRequest(String client_phone, String shop_area, String home_addr, String date_in, String date_out, String status, String new_status, Response.Listener<String> listener) {
        super(Method.POST, URL_EDIT_STATUS, listener, null);
        parameters = new HashMap<>();
        parameters.put("client_phone", client_phone);
        parameters.put("shop_area", shop_area);
        parameters.put("home_addr", home_addr);
        parameters.put("date_in", date_in);
        parameters.put("date_out", date_out);
        parameters.put("status", status);
        parameters.put("new_status", new_status);
    }

    @Override
    protected Map<String, String> getParams() {
        return parameters;
    }
}