package com.example.ellis.topia;
<<<<<<< HEAD

=======
import android.media.Image;
>>>>>>> b2882b049811e9e3bceee059473cfa6bc59d1c15
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
<<<<<<< HEAD
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class LookupActivity extends AppCompatActivity {
    ImageView map,cost;
    Spinner spinner;
    TextView address;

=======
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class LookupActivity extends AppCompatActivity {
    TextView tv;
    Spinner s;
    ImageView gangnam;
    ImageView gangdong;
    ImageView gangbok;
    ImageView gangseo;
    ImageView gwanak;
    ImageView gwangjin;
    ImageView guro;
    ImageView gumcheon;
    ImageView nowon;
    ImageView dobong;
    ImageView dong;
    ImageView dzac;
    ImageView mapo;
    ImageView seo;
    ImageView sucho;
    ImageView sungdong;
    ImageView sungbok;
    ImageView songpa;
    ImageView yang;
    ImageView young;
    ImageView yongsan;
    ImageView eunpung;
    ImageView jong;
    ImageView jung;
    ImageView julang;
    ImageView cost1;
    ImageView cost2;
    ImageView cost3;
    Button back;
>>>>>>> b2882b049811e9e3bceee059473cfa6bc59d1c15
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup);

<<<<<<< HEAD
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
=======
        s=(Spinner)findViewById(R.id.spinner);
        gangnam=(ImageView) findViewById(R.id.gangnam);
        gangdong=(ImageView)findViewById(R.id.gangdong);
        gangbok=(ImageView)findViewById(R.id.gangbok);
        gangseo=(ImageView)findViewById(R.id.gangseo);
        gwanak=(ImageView)findViewById(R.id.gwanak);
        gwangjin=(ImageView)findViewById(R.id.gwangjin);
        guro=(ImageView)findViewById(R.id.guro);
        gumcheon=(ImageView)findViewById(R.id.gumcheon);
        nowon=(ImageView)findViewById(R.id.nowon);
        dobong=(ImageView)findViewById(R.id.dobong);
        dong=(ImageView)findViewById(R.id.dong);
        dzac=(ImageView)findViewById(R.id.dzac);
        mapo=(ImageView)findViewById(R.id.mapo);
        seo=(ImageView)findViewById(R.id.seo);
        sucho=(ImageView)findViewById(R.id.sucho);
        sungdong=(ImageView)findViewById(R.id.sungdong);
        songpa=(ImageView)findViewById(R.id.songpa);
        sungbok=(ImageView)findViewById(R.id.sungbok);
        yang=(ImageView)findViewById(R.id.yang);
        young=(ImageView)findViewById(R.id.young);
        yongsan=(ImageView)findViewById(R.id.yongsan);
        eunpung=(ImageView)findViewById(R.id.eunpung);
        jong=(ImageView)findViewById(R.id.jong);
        jung=(ImageView)findViewById(R.id.jung);
        julang=(ImageView)findViewById(R.id.julang);
        cost1=(ImageView )findViewById(R.id.cost1);
        cost2=(ImageView)findViewById(R.id.cost2);
        cost3=(ImageView)findViewById(R.id.cost3);
        back=(Button)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                onBackPressed();
            }
        });
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id){
                if(position==0){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==1){
                    gangnam.setVisibility(View.VISIBLE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);

                }
                else if(position==2){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.VISIBLE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost2.setVisibility(View.VISIBLE);
                    cost1.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);

                }
                else if(position==3){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.VISIBLE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==4) {
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.VISIBLE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==5){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.VISIBLE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.VISIBLE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==6){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.VISIBLE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==7){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.VISIBLE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==8) {
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==9){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    nowon.setVisibility(View.VISIBLE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==10){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    dobong.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost2.setVisibility(View.VISIBLE);
                    cost1.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==11) {
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    dong.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==12){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    dzac.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);;
                }
                else if(position==13){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    mapo.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost2.setVisibility(View.VISIBLE);
                    cost1.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==14){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    seo.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==15){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    sucho.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==16){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    sungdong.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==17){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    sungbok.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost2.setVisibility(View.VISIBLE);
                    cost1.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==18){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    songpa.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==19){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    yang.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==20){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    young.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost2.setVisibility(View.VISIBLE);
                    cost1.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==21){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    yongsan.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==22){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    eunpung.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==23){gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    jong.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost2.setVisibility(View.VISIBLE);
                    cost1.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
                else if(position==24){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    jung.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    julang.setVisibility(View.GONE);
                    cost1.setVisibility(View.GONE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.VISIBLE);
                }
                else if(position==25){
                    gangnam.setVisibility(View.GONE);
                    gangdong.setVisibility(View.GONE);
                    gangbok.setVisibility(View.GONE);
                    gangseo.setVisibility(View.GONE);
                    gwanak.setVisibility(View.GONE);
                    gwangjin.setVisibility(View.GONE);
                    guro.setVisibility(View.GONE);
                    gumcheon.setVisibility(View.GONE);
                    julang.setVisibility(View.VISIBLE);
                    nowon.setVisibility(View.GONE);
                    dzac.setVisibility(View.GONE);
                    dobong.setVisibility(View.GONE);
                    dong.setVisibility(View.GONE);
                    mapo.setVisibility(View.GONE);
                    seo.setVisibility(View.GONE);
                    sucho.setVisibility(View.GONE);
                    sungdong.setVisibility(View.GONE);
                    sungbok.setVisibility(View.GONE);
                    songpa.setVisibility(View.GONE);
                    yang.setVisibility(View.GONE);
                    young.setVisibility(View.GONE);
                    yongsan.setVisibility(View.GONE);
                    eunpung.setVisibility(View.GONE);
                    jong.setVisibility(View.GONE);
                    jung.setVisibility(View.GONE);
                    cost1.setVisibility(View.VISIBLE);
                    cost2.setVisibility(View.GONE);
                    cost3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?>parent){}
        });
    }
}


>>>>>>> b2882b049811e9e3bceee059473cfa6bc59d1c15
