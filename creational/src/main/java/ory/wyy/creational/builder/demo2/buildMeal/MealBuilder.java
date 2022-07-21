package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 套餐构建者
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:56 上午
 **/
public class MealBuilder {

    // type1 套餐
    public Meal buildType1(){
        Meal meal = new Meal();
        meal.addItem(new MeetBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    // type2 套餐
    public Meal buildType2(){
        Meal meal = new Meal();
        meal.addItem(new BegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
