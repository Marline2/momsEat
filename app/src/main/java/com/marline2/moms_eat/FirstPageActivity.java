package com.marline2.moms_eat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.moms_eat.R;


public class FirstPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);


        ImageButton menuBtn = (ImageButton) findViewById(R.id.menu_btn);
        menuBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_left, R.anim.layout_view);
                finish();
            }
        });

        Button EggPage = (Button) findViewById(R.id.egg);
        EggPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPageActivity.this, EggPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button MeatPage = (Button) findViewById(R.id.meat);
        MeatPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPageActivity.this, MeatPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });
    }




}