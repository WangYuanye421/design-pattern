package ory.wyy.behavioral.strategy.calculate.commission;


import ory.wyy.behavioral.strategy.calculate.behavior.IBelongBehavior;
import ory.wyy.behavioral.strategy.calculate.behavior.ICalculateBehavior;
import ory.wyy.behavioral.strategy.calculate.behavior.IQueryDataBehavior;
import ory.wyy.behavioral.strategy.calculate.behavior.impl.BelongBehaviorA;
import ory.wyy.behavioral.strategy.calculate.behavior.impl.CalculateBehaviorA;
import ory.wyy.behavioral.strategy.calculate.behavior.impl.QueryDataBehaviorA;

/**
 * @description: 收款类型佣金核算
 * 假设收款类型不需要 清空逻辑
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 16:04
 **/
public class ReceiveCommission {
    // 查询策略
    private IQueryDataBehavior queryDataBehavior;
    // 核算策略
    private ICalculateBehavior calculateBehavior;
    // 归属判定策略
    private IBelongBehavior belongBehavior;

    // 构造函数中自定义组合核算策略
    public ReceiveCommission() {
        this.queryDataBehavior = new QueryDataBehaviorA();
        this.calculateBehavior = new CalculateBehaviorA();
        this.belongBehavior = new BelongBehaviorA();
    }

    public void queryData() {
        queryDataBehavior.queryData();
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

    public void setCalculateBehavior(ICalculateBehavior calculateBehavior) {
        this.calculateBehavior = calculateBehavior;
    }

    public void setBelongBehavior(IBelongBehavior belongBehavior) {
        this.belongBehavior = belongBehavior;
    }
}
