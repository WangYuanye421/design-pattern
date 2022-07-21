package ory.wyy.behavioral.template.demo2;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/2/25 下午7:28
 **/
public class GaiLunShow extends LoLHeroShowTemplate{

    public GaiLunShow(String heroName, String heroType) {
        super(heroName, heroType);
    }

    @Override
    void QSkillDesc() {
        System.out.println("沉默");
    }

    @Override
    void WSkillDesc() {
        System.out.println("抗性");
    }

    @Override
    void ESkillDesc() {
        System.out.println("转圈圈");
    }

    @Override
    void RSkillDesc() {
        System.out.println("大宝剑");
    }
}
