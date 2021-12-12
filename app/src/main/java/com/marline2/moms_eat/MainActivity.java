package com.marline2.moms_eat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.example.moms_eat.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<FoodData> foodDataList;

    private View emptyView;

    private MyAdapter adapter;

    private String preQuery = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView searchView = (SearchView) findViewById(R.id.searchView);
        emptyView = findViewById(R.id.emptyView);
        ListView list = (ListView) findViewById(R.id.listview1);

        this.InitializeFoodData();

        adapter = new MyAdapter(this);
        list.setAdapter(adapter);

        ImageButton menubtn = (ImageButton) findViewById(R.id.menu_btn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_left, R.anim.layout_view);
                finish();
            }
        });

        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                if (preQuery.trim().isEmpty()) return false;

                preQuery = "";
                emptyView.setVisibility(View.GONE);
                adapter.setFoods(new ArrayList<>());

                return false;
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (preQuery.equals(newText.trim())) return false;

                preQuery = newText.trim();

                ArrayList<FoodData> foods = new ArrayList<>();

                if (!preQuery.isEmpty()) {
                    for (FoodData food : foodDataList) {
                        if (food.getFoodName().contains(preQuery)) {
                            foods.add(food);
                        }
                    }

                    if (foods.isEmpty()) {
                        emptyView.setVisibility(View.VISIBLE);

                    } else {
                        emptyView.setVisibility(View.GONE);
                    }
                } else {
                    emptyView.setVisibility(View.GONE);
                }

                adapter.setFoods(foods);

                return false;
            }
        });
    }

    public void InitializeFoodData() {
        foodDataList = new ArrayList<FoodData>();


        foodDataList.add(new FoodData(R.drawable.egg1, "계란", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.meat1, "소고기", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.yuna1, "참치", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.yuna1, "다랑어류", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.sweetpotato1, "고구마", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.sea1, "미역", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.broco1, "브로콜리", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.chgum1, "시금치", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.abo1, "아보카도", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.gun1, "연근", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.toma1, "토마토", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.teaboy1, "보이차", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teasik1, "식혜", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "알코올성 음료", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "술", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "소주", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "맥주", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "와인", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teauul1, "율무차", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teachocomilk1, "초코우유", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.coffee1, "커피", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.coffee1, "카페인", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.greentea1, "녹차", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.greenice1, "녹차맛 아이스크림", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.gumcandy1, "사탕 &amp; 껌", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.duyu1, "두유", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "인스턴트 음식", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "치킨", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "피자", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "감자튀김", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.aloe1, "알로에", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.nockdu1, "녹두", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teauul1, "율무", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.redbean1, "붉은 팥", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.ginger1, "생강", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.energy1, "에너지 드링크", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teacombu1, "콤부차", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "탄산음료", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "콜라", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "사이다", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "환타", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "탄산수", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.teahong1, "홍차", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.banana1, "바나나", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.verry1, "베리류", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.verry1, "스트로베리", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.verry1, "블루베리", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.cham1, "참외", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.kiwi1, "키위", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.gam1, "감", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.pineapple1, "파인애플", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.zap1, "잡곡", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.zap1, "현미", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.hodu1, "호두", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.etcpill1, "진통제", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.etcpill1, "타이레놀", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.cookie1, "초코 쿠키", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.choco1, "초콜렛", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.etcice1, "커피맛 아이스크림", R.drawable.no));




    }

}