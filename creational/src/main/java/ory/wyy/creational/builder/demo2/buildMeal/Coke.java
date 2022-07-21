package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 可口可乐
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:45 上午
 **/
public class Coke extends Drink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 3;
    }
}
