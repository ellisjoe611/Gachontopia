package com.example.ellis.topia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OrderForShopResponse extends AsyncHttpResponseHandler {
    Activity activity;
    OrderForShopAdapter adapter;
    ProgressDialog dialog;
    static String shop_area;

    public OrderForShopResponse(Activity activity, OrderForShopAdapter adapter, String shop_area) {
        this.activity = activity;
        this.adapter = adapter;
        this.shop_area = shop_area;
    }

    @Override
    public void onStart() {
        dialog  = new ProgressDialog(activity);
        dialog.setMessage("Just a sec...");
        dialog.setCancelable(false);
        dialog.show();
    }

    /**
     * @param content
     * @deprecated
     */
    @Override
    public void onSuccess(String content) {
        try{
            //First, get json array data from server via 'OrderForShopAdapter'
            JSONObject json = new JSONObject(content);
            JSONArray order = json.getJSONArray("order");

            //Second, get all data from json array
            for(int i=0; i<order.length(); i++){
                JSONObject item = order.getJSONObject(i);   //get 'i'th item of 'order' array(json)
                String clientPhone = item.getString("client_phone");
                String shopArea = item.getString("shop_area");
                String homeAddress = item.getString("home_addr");
                String dateIn = item.getString("date_in");
                String dateOut = item.getString("date_out");
                String status = item.getString("status");

                if(shopArea.equalsIgnoreCase(shop_area)){
                    adapter.add(new Order(clientPhone, shopArea, homeAddress, dateIn, dateOut, status));
                }
            }

        }catch (JSONException exception){
            exception.printStackTrace();
        }
    }

    /**
     * @param statusCode
     * @param error
     * @param content
     * @deprecated
     */
    @Override
    public void onFailure(int statusCode, Throwable error, String content) {
        Toast.makeText(activity, error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFinish() {
        dialog.dismiss();
        dialog = null;
        super.onFinish();
    }
}