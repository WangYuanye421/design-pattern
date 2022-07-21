package ory.wyy.creational.factory.abstrac;

/**
 * 具体按钮类： 小按钮
 */
public class SmallButton extends ThemeButton{
    @Override
    public void showStyle() {
        System.out.println("小按钮");
    }
}
