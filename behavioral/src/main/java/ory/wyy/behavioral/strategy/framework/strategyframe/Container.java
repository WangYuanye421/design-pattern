package ory.wyy.behavioral.strategy.framework.strategyframe;

/**
 * 策略容器
 *
 * @author: mars
 * @version: v1.0
 * @data: 2020/6/5 3:17 下午
 **/
public interface Container<C,S extends Strategy<C>> {

    /**
     * 根据参数决定返回的策略类型
     * @param type
     * @return
     */
    S getStrategy (C type);
}
