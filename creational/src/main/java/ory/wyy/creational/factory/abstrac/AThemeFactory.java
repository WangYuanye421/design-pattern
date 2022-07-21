package ory.wyy.creational.factory.abstrac;

/**
 * 具体工厂类： 主题A（大按钮 + 粉色背景）
 * @author
 */
public class AThemeFactory extends ThemeFactory{
    @Override
    public ThemeButton getButtonInstance() {
        return new BigButton();
    }

    @Override
    public ThemeBgColor getBgColorInstance() {
        return new PinkColor();
    }
}
