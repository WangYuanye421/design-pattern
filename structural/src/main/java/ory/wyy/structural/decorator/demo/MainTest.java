package ory.wyy.structural.decorator.demo;

import java.io.FileNotFoundException;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 14:41
 **/
public class MainTest {
    public static void main(String[] args) throws FileNotFoundException {
        // 没有装饰器时，只有主题部分：演讲
        Heros a = new HeroA("编号a");
        Heros b = new HeroB("编号b");
        a.selfIntroduction();
        b.selfIntroduction();

        System.out.println("\n\n");
        System.out.println("演讲开始之前，添加旁白");
        Aside aside1 = new AsideOfA();
        Aside aside2 = new AsideOfB();
        aside1.setHeros(a);
        aside2.setHeros(b);
        aside1.selfIntroduction();
        System.out.println();
        aside2.selfIntroduction();

        System.out.println("\n\n");
        System.out.println("演讲时，添加粉丝送花");
        Flower fa = new RedFlower();
        Flower fb = new YellowFlower();
        fa.setHeros(aside1);
        fb.setHeros(aside2);
        fa.selfIntroduction();
        fb.selfIntroduction();
    }
}
