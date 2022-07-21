package ory.wyy.structural.decorator.demo;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 14:28
 **/
public class HeroB extends Heros {
    public HeroB(String name) {
        super(name);
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("我是一名法师,记得那时很久以前。。。");
    }
}
