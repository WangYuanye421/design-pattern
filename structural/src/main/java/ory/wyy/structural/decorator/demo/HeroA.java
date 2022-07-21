package ory.wyy.structural.decorator.demo;

/**
 * @description: 具体类 A
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 14:28
 **/
public class HeroA extends Heros {
    public HeroA(String name) {
        super(name);
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("我是一名辅助,记得那时很久以前。。。");
    }
}
