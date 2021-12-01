package com.marline2.moms_eat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.moms_eat.R;


public class FourthPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_page);


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

        Button BananaPage = (Button) findViewById(R.id.banana);
        BananaPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPageActivity.this, BananaPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button VerryPage = (Button) findViewById(R.id.verry);
        VerryPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPageActivity.this, VerryPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button ChamPage = (Button) findViewById(R.id.cham);
        ChamPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPageActivity.this, ChamPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button KiwiPage = (Button) findViewById(R.id.kiwi);
        KiwiPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPageActivity.this, KiwiPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });
    }
}