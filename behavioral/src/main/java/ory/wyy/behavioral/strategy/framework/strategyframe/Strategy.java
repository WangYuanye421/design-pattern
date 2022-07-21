package ory.wyy.behavioral.strategy.framework.strategyframe;

/**
 * 抽象策略接口
 *
 * @author: mars
 * @version: v1.0
 * @data: 2020/6/5 3:16 下午
 * T 返回结果的class类型
 * C 限定具体策略的枚举类
 **/
public interface Strategy<C> {

    /**
     * 获取策略类型参数,用于容器生成具体策略
     * @return
     */
    C getStrategyType ();

}
