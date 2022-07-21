package ory.wyy.structural.decorator.demo;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 14:35
 **/
public class AsideOfA extends Aside {
    @Override
    public void selfIntroduction() {
        System.out.println("旁白：他是一位勇士，永不退缩，有请。");
        super.selfIntroduction();
    }
}
