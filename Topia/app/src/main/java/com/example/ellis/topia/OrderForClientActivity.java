package com.example.ellis.topia;

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
    private final String URL_JSON = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_for_client);

        list = new ArrayList<Order>();
        adapter = new OrderForClientAdapter(this, R.layout.list_order, list);
        listView = findViewById(R.id.listView_order_client);

        listView.setAdapter(adapter);

        asyncHttpClient = new AsyncHttpClient();
        response = new OrderForClientResponse(this, adapter);
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
        asyncHttpClient.get(URL_JSON, response);
    }
}
