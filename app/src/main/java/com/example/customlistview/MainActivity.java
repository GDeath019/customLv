package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.lvSinhVien);

        ArrayList<data> list1 = new ArrayList<data>();
        list1.add(new data("Nguyen A", "1996", "C:\\Users\\Administrator\\AndroidStudioProjects\\customListview\\app\\src\\main\\res\\drawable-v24\\sstar_icon.png"));
        list1.add(new data("Nguyen A", "1998", "C:\\Users\\Administrator\\AndroidStudioProjects\\customListview\\app\\src\\main\\res\\drawable-v24\\sstar_icon.png"));

        ListAdapter adapter = new ListAdapter(MainActivity.this, R.layout.activity_main2,list1);

        listView.setAdapter(adapter);
    }
}
