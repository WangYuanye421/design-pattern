package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * 快餐品类
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:32 上午
 **/
public interface Item {
    String name();
    Packing packing();
    float price();
}
