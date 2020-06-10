package com.example.mytrip_test.ui.mytrip;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.mytrip_test.R;

public class PlaceList extends AppCompatActivity {
    private ListView listview;
    private MyAdapter adapter;
    private int[] img = {R.drawable.busan_1, R.drawable.busan_1, R.drawable.busan_1};
    private String [] Title = {"해운대 해수욕장", "관광지", "관광지"};
    private String [] Context = {"해운대 해수욕장에 대한 한줄 설명", "관광지 한 줄 설명", "관광지 한 줄 설명"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);

        adapter = new MyAdapter();
        listview = (ListView) findViewById(R.id.listView);

        listview.setAdapter(adapter);

        for (int i = 0 ; i < img.length ; i++){
            adapter.addItem(ContextCompat.getDrawable(this, img[i]), Title[i], Context[i]);
        }

    }
}
