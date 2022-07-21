package ory.wyy.creational.factory.abstrac;

/**
 * 具体背景色类： 红色
 */
public class RedColor extends ThemeBgColor{
    @Override
    public void showColor() {
        System.out.println("红色背景");
    }
}
