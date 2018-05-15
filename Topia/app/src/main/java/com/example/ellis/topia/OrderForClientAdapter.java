package com.example.ellis.topia;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class OrderForClientAdapter extends ArrayAdapter<Order> {

    Activity activity;
    int resource;

    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public OrderForClientAdapter(@NonNull Context context, int resource, @NonNull List<Order> objects) {
        super(context, resource, objects);
        activity = (Activity) context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null){
            itemView = activity.getLayoutInflater().inflate(resource, null);
        }

        Order item = getItem(position);
        if(item != null){
            TextView itemClientPhone = (TextView) itemView.findViewById(R.id.textView_item_clientPhone);
            TextView itemDateIn = (TextView) itemView.findViewById(R.id.textView_item_dateIn);
            TextView itemDateOut = (TextView) itemView.findViewById(R.id.textView_item_dateOut);
            TextView itemStatus = (TextView) itemView.findViewById(R.id.textView_item_status);
            TextView itemHomeAddress = (TextView) itemView.findViewById(R.id.textView_item_homeAddress);

            itemClientPhone.setText(item.getClientPhone());
            itemDateIn.setText(item.getDateIn());
            itemDateOut.setText(item.getDateOut());
            itemStatus.setText(item.getStatus());
            itemHomeAddress.setText(item.getHomeAddress());

        }

        return itemView;
    }
}
