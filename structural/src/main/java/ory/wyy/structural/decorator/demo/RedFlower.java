package ory.wyy.structural.decorator.demo;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 14:39
 **/
public class RedFlower extends Flower {
    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("粉丝送上了红花");
    }
}
