package com.example.customadafter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countryName;
    private int[] flag={R.drawable.ind,R.drawable.rose};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName=getResources().getStringArray(R.array.country_name);
        listView=findViewById(R.id.ListViewId);
        CustomAdapter adapter=new CustomAdapter(this,countryName,flag);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valu=countryName[position];
                Toast.makeText(MainActivity.this,valu, Toast.LENGTH_SHORT).show();
            }
        });
    }
}