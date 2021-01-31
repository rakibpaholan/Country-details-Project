package com.example.listviewproject_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        imageView = (ImageView)findViewById(R.id.imageView);
        textView = (TextView)findViewById(R.id.textView_profile);


        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();


        if (bundle != null){
            String county_name = bundle.getString("key");

            show_details(county_name);
        }



    }

    public void show_details(String country_name){
        if (country_name.equals("Bangladesh")){
            imageView.setImageResource(R.drawable.index);
            textView.setText(R.string.afganisthan);
        }
    }
}