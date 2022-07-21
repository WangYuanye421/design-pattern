package ory.wyy.creational.factory.abstrac;
/**
 * 具体工厂类： 主题B（小按钮 + 红色背景）
 * @author
 */
public class BThemeFactory extends ThemeFactory{
    @Override
    public ThemeButton getButtonInstance() {
        return new SmallButton();
    }

    @Override
    public ThemeBgColor getBgColorInstance() {
        return new RedColor();
    }
}
