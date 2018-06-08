package com.example.myapplication;

        import android.content.Context;
        import android.location.GpsStatus;
        import android.location.Location;
        import android.location.LocationListener;
        import android.location.LocationManager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLocationService();
            }
        });


    }
    /**
     * 리스너 클래스 정의
     */
    private class GPSListener implements LocationListener {
        /**
         * 위치 정보가 확인될 때 자동 호출되는 메소드
         */
        public void onLocationChanged(Location location) {
            Double latitude = location.getLatitude();
            Double longitude = location.getLongitude();

            String msg = "Latitude : "+ latitude + "\nLongitude:"+ longitude;
            Log.i("GPSListener", msg);

            textView.setText("내 위치 : " + latitude + ", " + longitude);
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
        }

        public void onProviderDisabled(String provider) {
        }

        public void onProviderEnabled(String provider) {
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
        }
    }




    public void startLocationService(){
        LocationManager manager =(LocationManager)getSystemService(Context.LOCATION_SERVICE);

        GPSListener gpsListener = new GPSListener();
        long minTime=10000;
        float minDistance =0;

        try {
            manager.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,
                    minTime,
                    minDistance,
                    gpsListener
            );

            Location lastLocation=manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if(lastLocation!=null){
                Double latitude=lastLocation.getLatitude();
                Double longtitude=lastLocation.getLongitude();

                textView.setText("내 위치 : "+latitude+", "+longtitude);
                Toast.makeText(getApplicationContext(), "Last Known loc : "+ "Latitude: "+latitude+"\nLongtitude"+longtitude,Toast.LENGTH_LONG).show();
            }

        }
            catch(SecurityException ex){
            ex.printStackTrace();
            }

            Toast.makeText(getApplicationContext(),"위치 확인 됨. 로그 확인",Toast.LENGTH_LONG);

        }

    }







