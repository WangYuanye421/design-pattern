package ory.wyy.behavioral.template.demo2;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/2/25 下午7:31
 **/
public class VNShow extends LoLHeroShowTemplate{
    public VNShow(String heroName, String heroType) {
        super(heroName, heroType);
    }

    @Override
    void QSkillDesc() {
        System.out.println("翻滚");
    }

    @Override
    void WSkillDesc() {
        System.out.println("三环");
    }

    @Override
    void ESkillDesc() {
        System.out.println("订墙");
    }

    @Override
    void RSkillDesc() {
        System.out.println("狩猎");
    }
}
