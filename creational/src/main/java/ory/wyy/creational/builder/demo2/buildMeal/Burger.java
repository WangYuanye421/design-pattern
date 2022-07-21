package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 汉堡
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:36 上午
 **/
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
