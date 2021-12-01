package com.marline2.moms_eat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moms_eat.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<FoodData> food = new ArrayList<>();


    public MyAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return food.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public FoodData getItem(int position) {
        return food.get(position);
    }

    public void setFoods(ArrayList<FoodData> foods) {
        this.food = foods;
        this.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.list_page, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.poster);
        TextView foodName = (TextView) view.findViewById(R.id.foodName);
        ImageView eat = (ImageView) view.findViewById(R.id.eat);

        imageView.setImageResource(food.get(position).getPoster());
        foodName.setText(food.get(position).getFoodName());
        eat.setImageResource(food.get(position).getEat());

        return view;
    }
}
