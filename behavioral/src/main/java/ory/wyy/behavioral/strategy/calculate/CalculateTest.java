package ory.wyy.behavioral.strategy.calculate;


import ory.wyy.behavioral.strategy.calculate.behavior.impl.CalculateBehaviorC;
import ory.wyy.behavioral.strategy.calculate.commission.AnnualCommission;
import ory.wyy.behavioral.strategy.calculate.commission.ReceiveCommission;

/**
 * @description: 测试类
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 16:16
 **/
public class CalculateTest {
    public static void main(String[] args) {
        ReceiveCommission receiveType = new ReceiveCommission();
        AnnualCommission annualType = new AnnualCommission();

        System.out.println("收款佣金核算开始");
        receiveType.queryData();
        receiveType.calculate();
        receiveType.belongTo();

        // 动态更改策略实现
        System.out.println();
        System.out.println("政策变化,收款佣金核算逻辑更新为C");
        receiveType.queryData();
        receiveType.setCalculateBehavior(new CalculateBehaviorC());
        receiveType.calculate();
        receiveType.belongTo();

        System.out.println();
        System.out.println("==============");
        System.out.println("签单佣金核算开始");
        annualType.queryData();
        annualType.clear();
        annualType.calculate();
        annualType.belongTo();
    }
}
