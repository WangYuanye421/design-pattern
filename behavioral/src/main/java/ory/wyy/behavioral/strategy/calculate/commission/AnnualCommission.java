package ory.wyy.behavioral.strategy.calculate.commission;


import ory.wyy.behavioral.strategy.calculate.behavior.IBelongBehavior;
import ory.wyy.behavioral.strategy.calculate.behavior.ICalculateBehavior;
import ory.wyy.behavioral.strategy.calculate.behavior.IClearDataBehavior;
import ory.wyy.behavioral.strategy.calculate.behavior.IQueryDataBehavior;
import ory.wyy.behavioral.strategy.calculate.behavior.impl.BelongBehaviorB;
import ory.wyy.behavioral.strategy.calculate.behavior.impl.CalculateBehaviorB;
import ory.wyy.behavioral.strategy.calculate.behavior.impl.ClearBehaviorC;
import ory.wyy.behavioral.strategy.calculate.behavior.impl.QueryDataBehaviorC;

/**
 * @description: 签单类型佣金核算
 * 策略使用者
 * 不使用继承，这样就不会限定使用者的行为，需要哪些行为，就引入相应的策略即可
 * 将策略以组合的形式聚合到类中，形成了丰富的策略组合
 * 新的核算方式出现时，不用修改原有代码，生成新的策略实现或创建新的行为接口
 *
 *
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 16:04
 **/
public class AnnualCommission{
    // 查询策略
    private IQueryDataBehavior queryDataBehavior;
    // 清空策略
    private IClearDataBehavior clearDataBehavior;
    // 核算策略
    private ICalculateBehavior calculateBehavior;
    // 归属判定策略
    private IBelongBehavior belongBehavior;

    // 构造函数中自定义组合核算策略
    public AnnualCommission() {
        this.queryDataBehavior = new QueryDataBehaviorC();
        this.clearDataBehavior = new ClearBehaviorC();
        this.calculateBehavior = new CalculateBehaviorB();
        this.belongBehavior = new BelongBehaviorB();
    }

    public void queryData() {
        queryDataBehavior.queryData();
    }

    public void clear() {
        clearDataBehavior.clearAndReset();
    }

    public void calculate() {
        calculateBehavior.calculate();
    }

    public void belongTo() {
        belongBehavior.belongTo();
    }

    public void setQueryDataBehavior(IQueryDataBehavior queryDataBehavior) {
        this.queryDataBehavior = queryDataBehavior;
    }

    public void setClearDataBehavior(IClearDataBehavior clearDataBehavior) {
        this.clearDataBehavior = clearDataBehavior;
    }

    public void setCalculateBehavior(ICalculateBehavior calculateBehavior) {
        this.calculateBehavior = calculateBehavior;
    }

    public void setBelongBehavior(IBelongBehavior belongBehavior) {
        this.belongBehavior = belongBehavior;
    }
}
