package com.example.ellis.topia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class reserve extends AppCompatActivity {

    List<String> listview_items;
    ArrayAdapter<String> listview_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        final TextView textView1=(TextView)findViewById(R.id.text1);
        final TextView textView2=(TextView)findViewById(R.id.text2);
        final TextView textView3=(TextView)findViewById(R.id.text3);
        final TextView textView4=(TextView)findViewById(R.id.text4);
        /*
         * 스피너 관련
         */
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = adapterView.getItemAtPosition(i).toString();

                if(str.equals("1월")) textView1.setText("1월");
                else if(str.equals("2월")) textView1.setText("2월");
                else if(str.equals("3월")) textView1.setText("3월");
                else if(str.equals("4월")) textView1.setText("4월");
                else if(str.equals("5월")) textView1.setText("5월");
                else if(str.equals("6월")) textView1.setText("6월");
                else if(str.equals("7월")) textView1.setText("7월");
                else if(str.equals("8월")) textView1.setText("8월");
                else if(str.equals("9월")) textView1.setText("9월");
                else if(str.equals("10월")) textView1.setText("10월");
                else if(str.equals("11월")) textView1.setText("11월");
                else if(str.equals("12월")) textView1.setText("12월");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //데이터를 저장하게 되는 리스트
        List<String> spinner_items = new ArrayList<>();

        //스피너와 리스트를 연결하기 위해 사용되는 어댑터
        ArrayAdapter<String> spinner_adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, spinner_items);

        spinner_items.add("");
        spinner_items.add("1월");
        spinner_items.add("2월");
        spinner_items.add("3월");
        spinner_items.add("4월");
        spinner_items.add("5월");
        spinner_items.add("6월");
        spinner_items.add("7월");
        spinner_items.add("8월");
        spinner_items.add("8월");
        spinner_items.add("10월");
        spinner_items.add("11월");
        spinner_items.add("12월");

        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //스피너의 어댑터 지정
        spinner.setAdapter(spinner_adapter);





        Spinner spinner2=(Spinner)findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = adapterView.getItemAtPosition(i).toString();

                if(str.equals("1일")) textView2.setText("1일");
                else if(str.equals("2일")) textView2.setText("2일"); else if(str.equals("3일")) textView2.setText("3일");
                else if(str.equals("4일")) textView2.setText("4일"); else if(str.equals("5일")) textView2.setText("5일");
                else if(str.equals("6일")) textView2.setText("6일"); else if(str.equals("7일")) textView2.setText("7일");
                else if(str.equals("8일")) textView2.setText("8일"); else if(str.equals("9일")) textView2.setText("9일");
                else if(str.equals("10일")) textView2.setText("10일"); else if(str.equals("11일")) textView2.setText("11일");
                else if(str.equals("12일")) textView2.setText("12일"); else if(str.equals("13일")) textView2.setText("13일");
                else if(str.equals("14일")) textView2.setText("14일"); else if(str.equals("15일")) textView2.setText("15일");
                else if(str.equals("16일")) textView2.setText("16일"); else if(str.equals("17일")) textView2.setText("17일");
                else if(str.equals("18일")) textView2.setText("18일"); else if(str.equals("19일")) textView2.setText("19일");
                else if(str.equals("20일")) textView2.setText("20일"); else if(str.equals("21일")) textView2.setText("21일");
                else if(str.equals("22일")) textView2.setText("22일"); else if(str.equals("23일")) textView2.setText("23일");
                else if(str.equals("24일")) textView2.setText("24일"); else if(str.equals("25일")) textView2.setText("25일");
                else if(str.equals("26일")) textView2.setText("26일"); else if(str.equals("27일")) textView2.setText("27일");
                else if(str.equals("28일")) textView2.setText("28일"); else if(str.equals("29일")) textView2.setText("29일");
                else if(str.equals("30일")) textView2.setText("30일"); else if(str.equals("31일")) textView2.setText("31일");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //데이터를 저장하게 되는 리스트
        List<String> spinner_items2 = new ArrayList<>();

        //스피너와 리스트를 연결하기 위해 사용되는 어댑터
        ArrayAdapter<String> spinner_adapter2=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, spinner_items2);

        spinner_items2.add(""); spinner_items2.add("1일"); spinner_items2.add("2일"); spinner_items2.add("3일");
        spinner_items2.add("4일"); spinner_items2.add("5일"); spinner_items2.add("6일");spinner_items2.add("7일");
        spinner_items2.add("8일");spinner_items2.add("9일"); spinner_items2.add("10일");spinner_items2.add("11일");
        spinner_items2.add("12일");spinner_items2.add("13일");spinner_items2.add("14일");spinner_items2.add("15일");
        spinner_items2.add("16일");spinner_items2.add("17일");spinner_items2.add("18일");spinner_items2.add("19일");
        spinner_items2.add("20일");spinner_items2.add("21일");spinner_items2.add("22일");spinner_items2.add("23일");
        spinner_items2.add("24일");spinner_items2.add("25일");spinner_items2.add("26일");spinner_items2.add("27일");
        spinner_items2.add("28일");spinner_items2.add("29일");spinner_items2.add("30일");spinner_items2.add("31일");

        spinner_adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //스피너의 어댑터 지정
        spinner2.setAdapter(spinner_adapter2);






        Spinner spinner3=(Spinner)findViewById(R.id.spinner3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = adapterView.getItemAtPosition(i).toString();

                if(str.equals("1일")) textView3.setText("1일 뒤");
                else if(str.equals("2일")) textView3.setText("2일 뒤"); else if(str.equals("3일")) textView3.setText("3일 뒤");
                else if(str.equals("4일")) textView3.setText("4일 뒤"); else if(str.equals("5일")) textView3.setText("5일 뒤");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //데이터를 저장하게 되는 리스트
        List<String> spinner_items3 = new ArrayList<>();

        //스피너와 리스트를 연결하기 위해 사용되는 어댑터
        ArrayAdapter<String> spinner_adapter3=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, spinner_items3);

        spinner_items3.add(""); spinner_items3.add("1일"); spinner_items3.add("2일"); spinner_items3.add("3일");
        spinner_items3.add("4일"); spinner_items3.add("5일");

        spinner_adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //스피너의 어댑터 지정
        spinner3.setAdapter(spinner_adapter3);
        Spinner spinner4=(Spinner)findViewById(R.id.spinner4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = adapterView.getItemAtPosition(i).toString();

                if(str.equals("강남구_푸른세탁")) textView4.setText("강남구_푸른세탁");
                else if(str.equals("강동구_백광세탁")) textView4.setText("강동구_백광세탁");else if(str.equals("강북구_금성세탁")) textView4.setText("강북구_금성세탁");
                else if(str.equals("강서구_짱구세탁")) textView4.setText("강서구_짱구세탁");else if(str.equals("관악구_영일세탁")) textView4.setText("관악구_영일세탁");
                else if(str.equals("광진구_유림세탁")) textView4.setText("광진구_유림세탁");else if(str.equals("구로구_한신세탁")) textView4.setText("구로구_한신세탁");
                else if(str.equals("금천구_나나세탁")) textView4.setText("금천구_나나세탁");else if(str.equals("노원구_매직크린")) textView4.setText("노원구_매직크린");
                else if(str.equals("도봉구_현대세탁")) textView4.setText("도봉구_현대세탁");else if(str.equals("동대문구_부부수선")) textView4.setText("동대문구_부부수선");
                else if(str.equals("동작구_더샵명품세탁")) textView4.setText("동작구_더샵명품세탁");else if(str.equals("마포구_이안세탁")) textView4.setText("마포구_이안세탁");
                else if(str.equals("서대문구_가재울세탁소")) textView4.setText("서대문구_가재울세탁소");else if(str.equals("서초구_강남디오빌")) textView4.setText("서초구_강남디오빌");
                else if(str.equals("성동구_한진세탁")) textView4.setText("성동구_한진세탁");else if(str.equals("성북구_우리동네세탁소")) textView4.setText("성북구_우리동네세탁소");
                else if(str.equals("송파구_파인애플세탁소")) textView4.setText("송파구_파인애플세탁소");else if(str.equals("양천구_맨하탄명품세탁소")) textView4.setText("양천구_맨하탄명품세탁소");
                else if(str.equals("영등포구_선데이런드리")) textView4.setText("영등포구_선데이런드리");else if(str.equals("용산구_더센트럴 명품세탁")) textView4.setText("용산구_더센트럴 명품세탁");
                else if(str.equals("은평구_화이트데이")) textView4.setText("은평구_화이트데이");else if(str.equals("종로구_세탁0k")) textView4.setText("종로구_세탁0k");
                else if(str.equals("중구_브라운스톤세탁")) textView4.setText("중구_브라운스톤세탁");else if(str.equals("중랑구_대주세탁")) textView4.setText("중랑구_대주세탁");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //데이터를 저장하게 되는 리스트
        List<String> spinner_items4 = new ArrayList<>();

        //스피너와 리스트를 연결하기 위해 사용되는 어댑터
        ArrayAdapter<String> spinner_adapter4=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, spinner_items4);

        spinner_items4.add(""); spinner_items4.add("강남구_푸른세탁"); spinner_items4.add("강동구_백광세탁");
        spinner_items4.add("강북구_금성세탁"); spinner_items4.add("강서구_짱구세탁"); spinner_items4.add("관악구_영일세탁");
        spinner_items4.add("광진구_유림세탁"); spinner_items4.add("구로구_한신세탁"); spinner_items4.add("금천구_나나세탁");
        spinner_items4.add("노원구_매직크린"); spinner_items4.add("도봉구_현대세탁"); spinner_items4.add("동대문구_부부수선");
        spinner_items4.add("동작구_더샵명품세탁"); spinner_items4.add("마포구_이안세탁소"); spinner_items4.add("서대문구_가재울세탁소");
        spinner_items4.add("서초구_강남디오빌"); spinner_items4.add("성동구_한진세탁"); spinner_items4.add("성북구_우리동네세탁소");
        spinner_items4.add("송파구_파인애플세탁소"); spinner_items4.add("양천구_맨하탄명품세탁소"); spinner_items4.add("영등포구_선데이런드리");
        spinner_items4.add("용산구_더센트럴 명품세탁"); spinner_items4.add("은평구_화이트데이"); spinner_items4.add("종로구_세탁0k"); spinner_items4.add("중구_브라운스톤세탁");
        spinner_items4.add("중랑구_대주세탁");


        spinner_adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //스피너의 어댑터 지정
        spinner4.setAdapter(spinner_adapter4);

    }
}
