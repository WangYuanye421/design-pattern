package ory.wyy.behavioral.strategy.framework;


import ory.wyy.behavioral.strategy.framework.enums.CalculateTypeEnum;
import ory.wyy.behavioral.strategy.framework.service.CalculateStrategy;
import ory.wyy.behavioral.strategy.framework.strategyframe.ContainerImpl;

/**
 * @author: mars
 * @version: v1.0
 * @data: 2020/6/5 5:42 下午
 **/
public class Main {
    public static void main(String[] args) {
        ContainerImpl<CalculateTypeEnum, CalculateStrategy> container = new ContainerImpl();
        CalculateStrategy strategy = container.getStrategy(CalculateTypeEnum.ADD);
        Integer execute = strategy.execute(1, 2);
        System.out.println(execute);
    }



}
