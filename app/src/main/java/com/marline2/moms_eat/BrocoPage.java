package com.marline2.moms_eat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moms_eat.R;

public class BrocoPage extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.broco_page);

            ImageButton backBtn = (ImageButton) findViewById(R.id.back_btn);
            backBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BrocoPage.this, SecondPageActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.load_fade_in, R.anim.load_fade_out);
                    finish();
                }
            });

        }

    }
