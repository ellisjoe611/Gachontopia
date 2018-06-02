package com.example.ellis.topia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class LookupActivity extends AppCompatActivity {
    ImageView map,cost;
    Spinner spinner;
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup);

        map=(ImageView)findViewById(R.id.map);
        cost=(ImageView)findViewById(R.id.cost);
        address=(TextView)findViewById(R.id.address);

        spinner=(Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.basic));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.basic));
                    address.setText("");
                }
                else if(position==1){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.gangnam));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 강남구 일원동 719");
                }
                else if(position==2){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.gangdong));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 강동구 성내3동 420_24");
                }
                else if(position==3){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.gangbok));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 강북구 미아동 130_88");
                }
                else if(position==4){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.gangseo));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 강서구 내발산동 717_1");
                }
                else if(position==5){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.gwanak));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 관악구 보라매동 690-2");
                }
                else if(position==6){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.gwangjin));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 광진구 구의동 222_55");
                }
                else if(position==7){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.guro));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 구로구 구로1동 642_9");
                }
                else if(position==8){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.gumcheon));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 금천구 독산4동 1014_4");
                }
                else if(position==9){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.nowon));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 노원구 상계2동 389_460");
                }
                else if(position==10){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.dobong));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 도봉구 방학동 720_1");
                }
                else if(position==11){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.dong));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 동대문구 답십리동 488_70");
                }
                else if(position==12){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.dzac));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 동작구 상도동 521_1 포스코더샵 아파트 후문상가 101호");
                }
                else if(position==13){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.mapo));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 마포구 상암동 1654 이안오피스텔 1단지 204호");
                }
                else if(position==14){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.seo));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 서대문구 북가좌동 144");
                }
                else if(position==15){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.sucho));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 서초구 서초4동 1309_1 디오빌강남오피스텔 1층 107호");
                }
                else if(position==16){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.sungdong));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText(" 서울특별시 성동구 행당2동 346 한진타운상가 B1층");
                }
                else if(position==17){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.sungbok));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 성북구 정릉동 396_3 1층");
                }
                else if(position==18){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.songpa));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 송파구 잠실동 19_9 잠실파인애플상가 지하1층 A60호");
                }
                else if(position==19){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.yang));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 양천구 목동 907-10");
                }
                else if(position==20){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.young));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 영등포구 신길동 236_11 선데이런드리");
                }
                else if(position==21){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.yongsan));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 용산구 한강로2가 342");
                }
                else if(position==22){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.eunpung));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 은평구 진관동 101 은평뉴타운 박석고개 108동상가 104호");
                }
                else if(position==22){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.jong));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type3));
                    address.setText("서울특별시 종로구 효자동 25");
                }
                else if(position==23){
                    map.setImageDrawable(getResources().getDrawable(R.drawable.jung));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type1));
                    address.setText("서울특별시 중구 중림동 355 브라운스톤상가 2층 201호");
                }
                else if(position==24) {
                    map.setImageDrawable(getResources().getDrawable(R.drawable.julang));
                    cost.setImageDrawable(getResources().getDrawable(R.drawable.type2));
                    address.setText("서울특별시 중랑구 신내2동 650 상가 104호");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}