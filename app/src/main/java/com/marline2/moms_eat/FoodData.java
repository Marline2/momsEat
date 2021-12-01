package com.marline2.moms_eat;

public class FoodData {
    private int poster;
    private String foodName;
    private int eat;

    public FoodData(int poster, String foodName, int eat){
        this.poster = poster;
        this.foodName = foodName;
        this.eat = eat;
    }

    public int getPoster()
    {
        return this.poster;
    }

    public String getFoodName()
    {
        return this.foodName;
    }

    public int getEat()
    {
        return this.eat;
    }
}
