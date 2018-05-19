package com.example.ellis.topia;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    final static private String URL_LOGIN = "http://ellisjoe.cafe24.com/login.php";
    private Map<String, String> parameters;

    public LoginRequest (String phone, String password, Response.Listener<String> listener){
        super(Method.POST, URL_LOGIN, listener, null);
        parameters = new HashMap<>();
        parameters.put("phone", phone);
        parameters.put("password", password);
    }

    public Map<String, String> getParams() {
        return parameters;
    }
}
