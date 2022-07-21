package ory.wyy.structural.decorator.standard;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 13:52
 **/
public class Tshorts extends Colthes{

    @Override
    public void show() {
        System.out.print("T恤 ");
        super.show();
    }
}
