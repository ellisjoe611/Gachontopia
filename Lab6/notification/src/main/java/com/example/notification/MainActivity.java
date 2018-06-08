package com.example.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int notificationID=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button)findViewById(R.id.btn_displaynotif);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             displayNotification();
            }
        });



    }

    public  void displayNotification(){
        Intent i =new Intent(this, NotificationView.class);
        i.putExtra("notificationID",notificationID);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,i,PendingIntent.FLAG_ONE_SHOT);

        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Notification.Builder mBuilder=new Notification.Builder(this).setSmallIcon(R.drawable.dog_standing)
                .setContentTitle("내 알림")
                .setContentText("집에 가고 싶다");
        mBuilder.setContentIntent(pendingIntent);

        mBuilder.setVibrate(new long[]{100,250,100,500});
         nm.notify(notificationID,mBuilder.build());
    }

}
