package ory.wyy.creational.builder.demo2.buildMeal;

/**
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:59 上午
 **/
public class MainTest {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal1 = builder.buildType1();
        System.out.println(meal1.getCost());
        System.out.println(meal1.showItem());
        System.out.println("------------------");
        Meal meal2 = builder.buildType2();
        System.out.println(meal2.getCost());
        System.out.println(meal2.showItem());
    }
}
