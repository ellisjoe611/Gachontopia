package com.example.ellis.topia;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ReserveRequest extends StringRequest{

    final static private String URL_ADD = "http://ellisjoe.cafe24.com/order_add.php";
    private Map<String, String> parameters;

    public ReserveRequest (String client_phone, String shop_area,String home_addr, String date_in, String date_out,String status, Response.Listener<String> listener){
        super(Method.POST, URL_ADD, listener, null);
        parameters = new HashMap<>();
        parameters.put("client_phone", client_phone);
        parameters.put("shop_area", shop_area);
        parameters.put("home_addr", home_addr);
        parameters.put("date_in", date_in);
        parameters.put("date_out",date_out);
        parameters.put("status",status);
    }

    @Override
    protected Map<String, String> getParams() {
        return parameters;
    }
}
