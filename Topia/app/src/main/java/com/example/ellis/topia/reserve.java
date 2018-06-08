package com.example.ellis.topia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class reserve extends AppCompatActivity {


    static public DatePicker mDate;
    TextView mTxtDate;
    int add_date=0;
    static String phone=""; static String type=""; static String home_area=""; static String home_addr="";
    static String shop_area="", date_in="",date_out,status="";
    String[] district = {"gangnam", "gangdong", "gangbook", "gangseo", "kwanak", "kwangjin", "guro", "geumcheon",
            "nowon", "dobong", "dongdaemoon", "dongjak", "mapo", "seodaemoon", "seocho", "seongdong", "seongbook",
            "songpa", "yangcheon", "yongdeungpo", "yongsan", "ennpyeong", "jongro", "joonggu", "joonglang"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        Intent intentFromLogin = getIntent();
        phone = intentFromLogin.getStringExtra("phone");
        type = intentFromLogin.getStringExtra("type");
        home_area = intentFromLogin.getStringExtra("home_area");
        home_addr = intentFromLogin.getStringExtra("home_addr");

        final TextView textView3 = (TextView) findViewById(R.id.text3);
        final TextView textView4 = (TextView) findViewById(R.id.text4);
        final TextView textView5= (TextView)findViewById(R.id.text5);

        textView5.setText(home_addr);

        mDate = (DatePicker) findViewById(R.id.datepicker);
        mTxtDate = (TextView) findViewById(R.id.txtdate);

        ImageButton reserve_btn=(ImageButton)findViewById(R.id.resrve_btn);

        reserve_btn.setBackgroundDrawable(null);
        //처음 DatePicker를 오늘 날짜로 초기화한다.

        //그리고 리스너를 등록한다.

        mDate.init(mDate.getYear(), mDate.getMonth(), mDate.getDayOfMonth(),
                new DatePicker.OnDateChangedListener() {


                    //값이 바뀔때마다 텍스트뷰의 값을 바꿔준다.

                    @Override

                    public void onDateChanged(DatePicker view, int year, int monthOfYear,

                                              int dayOfMonth) {
                        //monthOfYear는 0값이 1월을 뜻하므로 1을 더해줌 나머지는 같다.
                        mTxtDate.setText(String.format("%d/%d/%d", year, monthOfYear + 1, dayOfMonth));

                    }

                });



        findViewById(R.id.btnnow).setOnClickListener(new View.OnClickListener() {


            //버튼 클릭시 DatePicker로부터 값을 읽어와서 Toast메시지로 보여준다.

            @Override

            public void onClick(View v) {
                // TODO Auto-generated method stub

                String result = String.format("%d-%d-%d", mDate.getYear(), mDate.getMonth() + 1, mDate.getDayOfMonth());
                date_in=result;
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }

        });

        reserve_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DAY_OF_YEAR,add_date);

                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                int month=mDate.getMonth()+1;
                int day=0;
                day=mDate.getDayOfMonth()+add_date;

                switch (month){
                    case 1:case 3:case 5:case 12:case 7:case 8:
                    case 10:
                        if(day>31){
                            month++;
                            day=day-31;
                        }
                        break;
                    case 2:
                        if(day>28){
                            month++;
                            day=day-28;
                        }
                        break;
                    case 4: case 6:case 9: case 11:
                        if(day>30){
                            month++;
                            day=day-30;
                        }
                        break;
                }
                status="접수 완료";
                date_out = String.format("%d-%d-%d", mDate.getYear(),month, day);

                Toast.makeText(getApplicationContext(), phone+" "+shop_area+" "+home_addr+" "+date_in+" "+date_out+" "+status, Toast.LENGTH_LONG).show();

                String customerPhone = phone;
                String shopArea = shop_area;
                String homeAddress = home_addr;
                String dateIn = date_in;
                String dateOut = date_out;
                String whatIsStatus = status;

                Response.Listener<String> responseListener2 = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            //중요: JSON파일을 불러온다!!
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if(success){
                                Toast.makeText(reserve.this,"정상적으로 접수 되었습니다.",Toast.LENGTH_LONG).show();
                                //Toast.makeText(getApplicationContext(), phone+" "+shop_area+" "+home_addr+" "+date_in+" "+date_out+" "+status, Toast.LENGTH_LONG).show();
                                finish();
                            }else{
                                // Toast.makeText(getApplicationContext(), phone+" "+shop_area+" "+home_addr+" "+date_in+" "+date_out+" "+status, Toast.LENGTH_LONG).show();
                                Toast.makeText(reserve.this, "회원이 존재하지 않습니다.", Toast.LENGTH_SHORT).show();
                            }

                        } catch (JSONException e) {
                            Toast.makeText(reserve.this, "Error: Failed to access server...", Toast.LENGTH_SHORT).show();
                            e.printStackTrace();
                        }
                    }
                };

                ReserveRequest reserveRequest = new ReserveRequest(customerPhone, shopArea, homeAddress, dateIn,dateOut,whatIsStatus ,responseListener2);
                RequestQueue queue = Volley.newRequestQueue(reserve.this);
                queue.add(reserveRequest);

            }

        });



        Spinner spinner3=(Spinner)findViewById(R.id.spinner3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = adapterView.getItemAtPosition(i).toString();
                if(str.equals("1일")) {textView3.setText("1일 뒤");add_date=1;}
                else if(str.equals("2일")) {textView3.setText("2일 뒤");add_date=2;} else if(str.equals("3일")) {textView3.setText("3일 뒤");add_date=3;}
                else if(str.equals("4일")) {textView3.setText("4일 뒤");add_date=4;} else if(str.equals("5일")) {textView3.setText("5일 뒤");add_date=5;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //데이터를 저장하게 되는 리스트
        List<String> spinner_items3 = new ArrayList<>();

        //스피너와 리스트를 연결하기 위해 사용되는 어댑터
        ArrayAdapter<String> spinner_adapter3=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, spinner_items3);

        spinner_items3.add(""); spinner_items3.add("1일"); spinner_items3.add("2일"); spinner_items3.add("3일");
        spinner_items3.add("4일"); spinner_items3.add("5일");

        spinner_adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //스피너의 어댑터 지정
        spinner3.setAdapter(spinner_adapter3);
        final Spinner spinner4=(Spinner)findViewById(R.id.spinner4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = adapterView.getItemAtPosition(i).toString();

                if(str.equals("강남구_푸른세탁")) {textView4.setText("강남구_푸른세탁"); shop_area=district[0];}
                else if(str.equals("강동구_백광세탁")) {textView4.setText("강동구_백광세탁");shop_area=district[1];}else if(str.equals("강북구_금성세탁")) {textView4.setText("강북구_금성세탁");shop_area=district[2];}
                else if(str.equals("강서구_짱구세탁")) {textView4.setText("강서구_짱구세탁");shop_area=district[3];}else if(str.equals("관악구_영일세탁")){ textView4.setText("관악구_영일세탁");shop_area=district[4];}
                else if(str.equals("광진구_유림세탁")) {textView4.setText("광진구_유림세탁");shop_area=district[5];}else if(str.equals("구로구_한신세탁")) {textView4.setText("구로구_한신세탁");shop_area=district[6];}
                else if(str.equals("금천구_나나세탁")) {textView4.setText("금천구_나나세탁");shop_area=district[7];}else if(str.equals("노원구_매직크린")) {textView4.setText("노원구_매직크린");shop_area=district[8];}
                else if(str.equals("도봉구_현대세탁")) {textView4.setText("도봉구_현대세탁");shop_area=district[9];}else if(str.equals("동대문구_부부수선")) {textView4.setText("동대문구_부부수선");shop_area=district[10];}
                else if(str.equals("동작구_더샵명품세탁")) {textView4.setText("동작구_더샵명품세탁");shop_area=district[11];}else if(str.equals("마포구_이안세탁")) {textView4.setText("마포구_이안세탁");shop_area=district[12];}
                else if(str.equals("서대문구_가재울세탁소")) {textView4.setText("서대문구_가재울세탁소");shop_area=district[13];}else if(str.equals("서초구_강남디오빌")) {textView4.setText("서초구_강남디오빌");shop_area=district[14];}
                else if(str.equals("성동구_한진세탁")) {textView4.setText("성동구_한진세탁");shop_area=district[15];;}else if(str.equals("성북구_우리동네세탁소")) {textView4.setText("성북구_우리동네세탁소");shop_area=district[16];}
                else if(str.equals("송파구_파인애플세탁소")) {textView4.setText("송파구_파인애플세탁소");shop_area=district[17];}else if(str.equals("양천구_맨하탄명품세탁소")) {textView4.setText("양천구_맨하탄명품세탁소");shop_area=district[18];}
                else if(str.equals("영등포구_선데이런드리")) {textView4.setText("영등포구_선데이런드리");shop_area=district[19];}else if(str.equals("용산구_더센트럴 명품세탁")) {textView4.setText("용산구_더센트럴 명품세탁");shop_area=district[20];}
                else if(str.equals("은평구_화이트데이")) {textView4.setText("은평구_화이트데이");shop_area=district[21];}else if(str.equals("종로구_세탁0k")) {textView4.setText("종로구_세탁0k");shop_area=district[22];}
                else if(str.equals("중구_브라운스톤세탁")) {textView4.setText("중구_브라운스톤세탁");shop_area=district[23];}else if(str.equals("중랑구_대주세탁")) {textView4.setText("중랑구_대주세탁");shop_area=district[24];}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //데이터를 저장하게 되는 리스트
        List<String> spinner_items4 = new ArrayList<>();
        //스피너와 리스트를 연결하기 위해 사용되는 어댑터
        ArrayAdapter<String> spinner_adapter4=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinner_items4);
        spinner_items4.add(""); spinner_items4.add("강남구_푸른세탁"); spinner_items4.add("강동구_백광세탁");
        spinner_items4.add("강북구_금성세탁"); spinner_items4.add("강서구_짱구세탁"); spinner_items4.add("관악구_영일세탁");
        spinner_items4.add("광진구_유림세탁"); spinner_items4.add("구로구_한신세탁"); spinner_items4.add("금천구_나나세탁");
        spinner_items4.add("노원구_매직크린"); spinner_items4.add("도봉구_현대세탁"); spinner_items4.add("동대문구_부부수선");
        spinner_items4.add("동작구_더샵명품세탁"); spinner_items4.add("마포구_이안세탁소"); spinner_items4.add("서대문구_가재울세탁소");
        spinner_items4.add("서초구_강남디오빌"); spinner_items4.add("성동구_한진세탁"); spinner_items4.add("성북구_우리동네세탁소");
        spinner_items4.add("송파구_파인애플세탁소"); spinner_items4.add("양천구_맨하탄명품세탁소"); spinner_items4.add("영등포구_선데이런드리");
        spinner_items4.add("용산구_더센트럴 명품세탁"); spinner_items4.add("은평구_화이트데이"); spinner_items4.add("종로구_세탁0k"); spinner_items4.add("중구_브라운스톤세탁");spinner_items4.add("중랑구_대주세탁");
        spinner_adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //스피너의 어댑터 지정
        spinner4.setAdapter(spinner_adapter4);

    }
}
