package ory.wyy.structural.decorator.demo;

/**
 * @description:抽象类 英雄演讲
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 14:24
 **/
public class Heros {
    public String name;

    public Heros() {
    }

    public Heros(String name) {
        this.name = name;
    }

    public void selfIntroduction() {
        System.out.printf("大家好，我叫%s。", name);
    }
}
