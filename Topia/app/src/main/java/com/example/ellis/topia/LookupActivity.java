package com.example.ellis.topia;

import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class LookupActivity extends AppCompatActivity implements OnMapReadyCallback {

    ImageView cost;
    Spinner spinner;
    TextView address;
    LinearLayout boxMap;
    private GoogleMap mMap;
    private Geocoder geocoder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup);
        boxMap=(LinearLayout)findViewById(R.id.boxMap);
        cost=(ImageView)findViewById(R.id.cost);
        address=(TextView)findViewById(R.id.address);

        spinner=(Spinner)findViewById(R.id.spinner);
        spinner.setSelection(1);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);

        mapFragment.getMapAsync(this);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.basic));
                    address.setText("");
                }
                else if(position==1){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 강남구 일원동 719");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==2){

                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 강동구 성내3동 420_24");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==3){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 강북구 미아동 130_88");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==4){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type4));
                    address.setText("서울특별시 강서구 내발산동 717_1");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==5){
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type5));
                    address.setText("서울특별시 관악구 보라매동 690-2");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==6){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type5));
                    address.setText("서울특별시 광진구 구의동 222_55");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==7){
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type4));
                    address.setText("서울특별시 구로구 구로1동 642_9");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==8){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 금천구 독산4동 1014_4");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==9){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 노원구 상계2동 389_460");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==10){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 도봉구 방학동 720_1");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==11){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 동대문구 답십리동 488_70");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==12){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type4));
                    address.setText("서울특별시 동작구 상도동 521_1 포스코더샵 아파트 후문상가 101호");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==13){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type5));
                    address.setText("서울특별시 마포구 상암동 1654 이안오피스텔 1단지 204호");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==14){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 서대문구 북가좌동 144");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==15){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 서초구 서초4동 1309_1 디오빌강남오피스텔 1층 107호");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==16){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText(" 서울특별시 성동구 행당2동 346 한진타운상가 B1층");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==17){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type4));
                    address.setText("서울특별시 성북구 정릉동 396_3 1층");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==18){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type5));
                    address.setText("서울특별시 송파구 잠실동 19_9 잠실파인애플상가 지하1층 A60호");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==19){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 양천구 목동 907-10");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==20){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 영등포구 신길동 236_11 선데이런드리");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==21){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 용산구 한강로2가 342");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==22){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type4));
                    address.setText("서울특별시 은평구 진관동 101 은평뉴타운 박석고개 108동상가 104호");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==23){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type5));
                    address.setText("서울특별시 종로구 효자동 25");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==24){
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type5));
                    address.setText("서울특별시 중구 중림동 355 브라운스톤상가 2층 201호");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }
                else if(position==25) {
                    boxMap.setVisibility(View.VISIBLE);
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type4));
                    address.setText("서울특별시 중랑구 신내2동 650 상가 104호");
                    String addr=address.getText().toString();
                    List<Address> addressList=null;
                    try{
                        addressList=geocoder.getFromLocationName(addr,10);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    search(addressList);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    public void search(List addressList){
        System.out.println(addressList.get(0).toString());
        // 콤마를 기준으로 split
        String []splitStr = addressList.get(0).toString().split(",");
        String address = splitStr[0].substring(splitStr[0].indexOf("\"") + 1,splitStr[0].length() - 2); // 주소
        System.out.println(address);

        String latitude = splitStr[10].substring(splitStr[10].indexOf("=") + 1); // 위도
        String longitude = splitStr[12].substring(splitStr[12].indexOf("=") + 1); // 경도
        System.out.println(latitude);
        System.out.println(longitude);

        // 좌표(위도, 경도) 생성
        LatLng point = new LatLng(Double.parseDouble(latitude), Double.parseDouble(longitude));
        // 마커 생성
        MarkerOptions mOptions2 = new MarkerOptions();
        mOptions2.title("search result");
        mOptions2.snippet(address);
        mOptions2.position(point);
        // 마커 추가
        mMap.addMarker(mOptions2);
        // 해당 좌표로 화면 줌
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point,15));
    }
    @Override
    public void onMapReady(final GoogleMap googleMap){
        mMap=googleMap;
        mMap.clear();
        geocoder=new Geocoder(this);
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener(){
            @Override
            public void onMapClick(LatLng point) {
                MarkerOptions mOptions = new MarkerOptions();
                mOptions.title("Marker laundry");
                Double latitude = point.latitude;
                Double longitude = point.longitude;
                mOptions.snippet(latitude.toString() + ", " + longitude.toString());
                mOptions.position(new LatLng(latitude, longitude));
                googleMap.addMarker(mOptions);
            }});
    }

}
