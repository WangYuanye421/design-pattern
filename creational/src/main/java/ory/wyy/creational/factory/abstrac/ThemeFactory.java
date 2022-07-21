package ory.wyy.creational.factory.abstrac;

/**
 * 抽象工厂模式：
 *      抽象工厂类：主题工厂抽象类
 * @author wangyuanye
 */
public abstract class ThemeFactory {

    public abstract ThemeButton getButtonInstance();

    public abstract ThemeBgColor getBgColorInstance();
}
