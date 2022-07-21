package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 瓶子
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:40 上午
 **/
public class Bottle implements Packing{
    @Override
    public String packing() {
        return "Bottle";
    }
}
