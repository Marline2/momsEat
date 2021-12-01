package com.marline2.moms_eat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.moms_eat.R;


public class SweetpotatoPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sweetpotato_page);

        ImageButton backBtn = (ImageButton) findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SweetpotatoPage.this, SecondPageActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.load_fade_in, R.anim.load_fade_out);
                finish();
            }
        });

    }

}