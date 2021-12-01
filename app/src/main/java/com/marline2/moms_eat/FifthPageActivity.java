package com.marline2.moms_eat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.moms_eat.R;


public class FifthPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_page);


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

        Button ZapPage = (Button) findViewById(R.id.zap);
        ZapPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthPageActivity.this, ZapPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button HoduPage = (Button) findViewById(R.id.hodu);
        HoduPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthPageActivity.this, HoduPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

    }
}