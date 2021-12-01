package com.marline2.moms_eat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.moms_eat.R;


public class Fifth2PageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth2_page);


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

        Button EtcpillPage = (Button) findViewById(R.id.etcpill);
        EtcpillPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fifth2PageActivity.this, EtcpillPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button CookiePage = (Button) findViewById(R.id.cookie);
        CookiePage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fifth2PageActivity.this, CookiePage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button ChocoPage = (Button) findViewById(R.id.choco);
        ChocoPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fifth2PageActivity.this, ChocoPage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });

        Button EtcicePage = (Button) findViewById(R.id.etcice);
        EtcicePage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fifth2PageActivity.this, EtcicePage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_right, R.anim.layout_view);
                finish();
            }
        });
    }
}
