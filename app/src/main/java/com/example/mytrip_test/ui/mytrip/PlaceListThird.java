package com.example.mytrip_test.ui.mytrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.core.content.ContextCompat;

import com.example.mytrip_test.R;

public class PlaceListThird extends AddSecondTripActivity implements
View.OnClickListener{


    Button btn_thirdok;
    Spinner trip_location;
    private String mLocation;
    private ListView listview;
    private MyAdapter adapter;
    private int[] img = {R.drawable.haeundae_1_1, R.drawable.haeundae_1_2, R.drawable.haeundae_1_3,R.drawable.haeundae_1_4,R.drawable.haeundae_1_5,
            R.drawable.haeundae_1_6,R.drawable.haeundae_1_7,R.drawable.haeundae_1_8,R.drawable.haeundae_1_9,R.drawable.haeundae_1_10,
            R.drawable.haeundae_1_11,R.drawable.haeundae_1_12,R.drawable.haeundae_1_13,R.drawable.haeundae_1_14,R.drawable.haeundae_1_15,
            R.drawable.haeundae_1_16,R.drawable.haeundae_1_17};
    private String [] Title = {
            "달맞이길 & 문탠로드", "부산아쿠아리움", "삼포해안길", "송정해수욕장", "어촌마을 청사포와 미포"
            ,"이터널저니", "해운대동백섬", "해운대해수욕장", "40계단거리","동래읍성"
            ,"범어사", "보수동책방골목", "해동용궁사", "부네치아 장림포구", "부평깡통시장"
            ,"초량이바구길", "흰여울문화마을"};
    private String [] Context = {
            "달맞이길에 있는 해월정에서 정월 달빛을 받으며 사랑의 언약을 나눈 남녀는 그 사랑이 이루어진다는 전설이 있다."
            , "실내를 더 좋아하는 당신이라면 실내 휴가지 부산아쿠아리움을 소개한다."
            , "삼포해안길은 부산 대표 포구 미포, 청사포, 구덕포를 연이어 따라 걷는다해 이름 붙었다."
            , "지는 노을의 색을 비추고 있는 붉은 파도의 매력을 만나고 싶다면 송정해수욕장으로 가보자."
            , "멀리 떨어진 어촌마을로 온 듯한 기분을 선사해주는 청사포와 미포, 그 소박한 풍경 속으로 떠난다."
            , "호텔과 리조트로 여행을 가는 트렌드에 맞춰 지어진 대표적인 곳이, 바로 힐튼 부산의 ‘이터널저니’다."
            , "동백섬 내부에 있는 동백해안산책로는 풍경을 바라보며 가볍게 걷기 좋다."
            , "부산 바다의 정석으로 불리는 곳은 단연 해운대해수욕장이다."
            , "모든 피난민의 삶의 터전, 그들이 남긴 삶의 애환을 느끼며 40계단을 걸어보자."
            , "여유와 한적함이 넘쳐나는 편안한 산책길 곳곳에 동래의 역사와 아픔이 고스란히 느껴지는 바로 이곳"
            , "부산 금정구 범어사는 해인사, 통도사와 함께 영남의 3대 사찰로 꼽힌다."
            , "보수동책방골목은 한국전쟁 당시 부산이 임시수도가 되었을 때 조성된 곳이다. "
            , "해동용궁사는 정암화상(晸庵和尙)이 바닷가에서 용을 타고 승천하는 관세음보살을 꿈에 보았다는 이야기에서 이름이 유래되었다. "
            , "김 생산지로 유명했던 작고 조용한 포구가 공단이 들어서며 그 기능이 약화되었지만, 새로운 사람들이 찾아오는 곳으로 변화를 일구었다."
            , "어떤 종류의 음식이건 몽땅 모여 있는 곳이 바로 부평깡통시장!"
            , "부산의 원도심인 동구의 168계단을 중심으로 산복도로 이야기를 전해주는 초량이바구길"
            , "피난민들의 애잔한 삶이 시작된 곳이자 현재는 마을주민과 함께하는 문화마을공동체 흰여울문화마을이 자리한 곳이다."
            };

    ArrayAdapter<CharSequence> spinnerAdapter;
    boolean mInitSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_thirdlist);

        adapter = new MyAdapter();
        listview = (ListView) findViewById(R.id.listView);
        trip_location = findViewById(R.id.spinner_location);

        spinnerAdapter = ArrayAdapter.createFromResource(this,R.array.prompt_gu, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trip_location.setAdapter(spinnerAdapter);

        listview.setAdapter(adapter);

        for (int i = 0 ; i < img.length ; i++){
            adapter.addItem(ContextCompat.getDrawable(this, img[i]), Title[i], Context[i]);
        }

        // 초기화
        btn_thirdok = findViewById(R.id.btn_thirdok);
        btn_thirdok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceListThird.this, AddThirdTripActivity.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.spinner_location:
                trip_location.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        trip_location.setSelection(0);

                        if (!mInitSpinner) {
                            mInitSpinner = true;
                        }

                        mLocation = trip_location.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
        }
    }

}
