package ory.wyy.creational.factory.abstrac;

/**
 * 具体按钮类： 大按钮
 */
public class BigButton extends ThemeButton{
    @Override
    public void showStyle() {
        System.out.println("大按钮");
    }
}
