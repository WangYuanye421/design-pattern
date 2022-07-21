package ory.wyy.creational.factory.abstrac;

/**
 * 当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象【一个工厂生产的不同类的产品】
 */
public class MainTest {
    public static void main(String[] args) {

        ThemeFactory themeFactory = null;
        ThemeBgColor color = null;
        ThemeButton button = null;
        //设置 a 主题
        System.out.println("设置 a 主题");

        //改变具体工厂的实例，就可以在某种程度上改变整个软件系统的行为
        themeFactory = new AThemeFactory();
        color = themeFactory.getBgColorInstance();
        button = themeFactory.getButtonInstance();
        color.showColor();
        button.showStyle();

        //切换 b 主题
        System.out.println("切换 b 主题");

        //改变具体工厂的实例，就可以在某种程度上改变整个软件系统的行为
        themeFactory = new BThemeFactory();
        color = themeFactory.getBgColorInstance();
        button = themeFactory.getButtonInstance();
        color.showColor();
        button.showStyle();
    }
}
