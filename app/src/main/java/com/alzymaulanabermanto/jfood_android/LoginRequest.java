package com.alzymaulanabermanto.jfood_android;

import com.android.volley.AuthFailureError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    private static final String URL = "http://192.168.100.31:8080/customer/login";
    //private static final String URL = "http://172.20.10.13:8080/customer/login";
    private Map<String, String> params;

    public LoginRequest(String email, String password, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
