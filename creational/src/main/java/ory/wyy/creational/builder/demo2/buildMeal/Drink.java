package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 饮料
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:44 上午
 **/
public abstract class Drink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }


}
