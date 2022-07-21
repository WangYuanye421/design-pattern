package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 百事可乐
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:45 上午
 **/
public class Pepsi extends Drink{
    public String name() {
        return "百事可乐";
    }

    public float price() {
        return 3;
    }
}
