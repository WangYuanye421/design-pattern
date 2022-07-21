package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 蔬菜汉堡
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:41 上午
 **/
public class BegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 15;
    }
}
