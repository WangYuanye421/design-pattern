package ory.wyy.behavioral.template.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote LoL英雄展示模板
 * @date : 2021/2/25 下午7:20
 **/
@Slf4j
public abstract class LoLHeroShowTemplate {
    String heroName;
    String heroType;

    public LoLHeroShowTemplate(String heroName, String heroType) {
        this.heroName = heroName;
        this.heroType = heroType;
    }

    abstract void QSkillDesc();
    abstract void WSkillDesc();
    abstract void ESkillDesc();
    abstract void RSkillDesc();


    protected final void showHero(){
        log.info("英雄名称: {}",this.heroName);
        log.info("英雄类型: {}",this.heroType);
        this.QSkillDesc();
        this.WSkillDesc();
        this.ESkillDesc();
        this.RSkillDesc();
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }
}
