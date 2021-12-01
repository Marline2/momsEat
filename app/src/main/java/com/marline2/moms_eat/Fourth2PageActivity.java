package com.marline2.moms_eat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.moms_eat.R;


public class Fourth2PageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth2_page);


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

        Button GamPage = (Button) findViewById(R.id.gam);
        GamPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fourth2PageActivity.this, GamPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button PineapplePage = (Button) findViewById(R.id.pineapple);
        PineapplePage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fourth2PageActivity.this, PineapplePage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });
    }
}
