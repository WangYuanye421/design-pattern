package ory.wyy.structural.decorator.demo;

/**
 * @description: 装饰器类  旁白
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 14:31
 **/
public class Aside extends Heros {
    private Heros heros;

    public void setHeros(Heros heros) {
        this.heros = heros;
    }

    @Override
    public void selfIntroduction() {
        heros.selfIntroduction();
    }
}
