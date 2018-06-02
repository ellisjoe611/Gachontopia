package com.example.ellis.topia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.loopj.android.http.AsyncHttpClient;

import java.util.ArrayList;
import java.util.List;

public class OrderForClientActivity extends AppCompatActivity {

    List<Order> list;
    OrderForClientAdapter adapter;
    OrderForClientResponse response;
    ListView listView;

    AsyncHttpClient asyncHttpClient;
    private final String URL_JSON_ORDER = "http://ellisjoe.cafe24.com/getjson_order.php";
    static String phone, type, home_area, home_addr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_for_client);

        Intent intentFromMenu = getIntent();
        phone = intentFromMenu.getStringExtra("phone");
        type = intentFromMenu.getStringExtra("type");
        home_area = intentFromMenu.getStringExtra("home_area");
        home_addr = intentFromMenu.getStringExtra("home_addr");

        list = new ArrayList<Order>();
        adapter = new OrderForClientAdapter(this, R.layout.list_order, list);
        listView = findViewById(R.id.listView_order_client);

        listView.setAdapter(adapter);

        asyncHttpClient = new AsyncHttpClient();
        response = new OrderForClientResponse(this, adapter, phone);
    }

    /**
     * Dispatch onResume() to fragments.  Note that for better inter-operation
     * with older versions of the platform, at the point of this call the
     * fragments attached to the activity are <em>not</em> resumed.  This means
     * that in some cases the previous state may still be saved, not allowing
     * fragment transactions that modify the state.  To correctly interact
     * with fragments in their proper state, you should instead override
     * {@link #onResumeFragments()}.
     */
    @Override
    protected void onResume() {
        super.onResume();
        list.clear();
        asyncHttpClient.get(URL_JSON_ORDER, response);
    }
}