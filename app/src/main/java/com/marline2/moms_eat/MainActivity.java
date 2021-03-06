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


        foodDataList.add(new FoodData(R.drawable.egg1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.meat1, "?????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.yuna1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.yuna1, "????????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.sweetpotato1, "?????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.sea1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.broco1, "????????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.chgum1, "?????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.abo1, "????????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.gun1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.toma1, "?????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.teaboy1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teasik1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "???????????? ??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "???", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teaacho1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teauul1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teachocomilk1, "????????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.coffee1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.coffee1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.greentea1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.greenice1, "????????? ???????????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.gumcandy1, "?????? &amp; ???", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.duyu1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "???????????? ??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.instant1, "????????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.aloe1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.nockdu1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teauul1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.redbean1, "?????? ???", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.ginger1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.energy1, "????????? ?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.teacombu1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "????????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.drinks1, "?????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.teahong1, "??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.banana1, "?????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.verry1, "?????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.verry1, "???????????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.verry1, "????????????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.cham1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.kiwi1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.gam1, "???", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.pineapple1, "????????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.zap1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.zap1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.hodu1, "??????", R.drawable.yes));
        foodDataList.add(new FoodData(R.drawable.etcpill1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.etcpill1, "????????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.cookie1, "?????? ??????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.choco1, "?????????", R.drawable.no));
        foodDataList.add(new FoodData(R.drawable.etcice1, "????????? ???????????????", R.drawable.no));




    }

}