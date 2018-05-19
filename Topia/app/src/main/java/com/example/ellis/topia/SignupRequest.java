package com.example.ellis.topia;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SignupRequest extends StringRequest {
    final static private String URL_REGISTER = "http://ellisjoe.cafe24.com/register.php";
    private Map<String, String> parameters;

    public SignupRequest(String phone, String password, String type, String home_area, String home_addr, Response.Listener<String> listener){
        super(Method.POST, URL_REGISTER, listener, null);
        parameters = new HashMap<>();
        parameters.put("phone", phone);
        parameters.put("password", password);
        parameters.put("type", type);
        parameters.put("home_area", home_area);
        parameters.put("home_addr", home_addr);
    }

    public Map<String, String> getParams() {
        return parameters;
    }
}
