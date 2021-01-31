package com.example.listviewproject_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listViewId);
        String [] countryName = getResources().getStringArray(R.array.country_information);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(MainActivity.this,R.layout.list_view_data_source,R.id.list_view_data_structure,countryName);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected_country_name = countryName[position];
                Toast.makeText(MainActivity.this,selected_country_name,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Information.class);
                intent.putExtra("key",selected_country_name);
                startActivity(intent);
            }
        });
    }
}