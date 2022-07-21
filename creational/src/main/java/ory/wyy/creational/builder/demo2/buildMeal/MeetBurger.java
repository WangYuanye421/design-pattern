package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 肉汉堡肉汉堡
 * @author Yuanye Wang
 * @date 2022/7/21 19:34
 **/
public class MeetBurger extends Burger{
    @Override
    public String name() {
        return "肉汉堡";
    }

    @Override
    public float price() {
        return 20;
    }
}
