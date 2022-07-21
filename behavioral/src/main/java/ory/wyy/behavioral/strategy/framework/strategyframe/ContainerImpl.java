package ory.wyy.behavioral.strategy.framework.strategyframe;

import lombok.extern.slf4j.Slf4j;
import ory.wyy.behavioral.strategy.framework.entity.BaseEnum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * @author: mars
 * @version: v1.0
 * @data: 2020/6/5 5:44 下午
 **/
@Slf4j
public class ContainerImpl<C extends BaseEnum,S extends Strategy<C>> implements Container<C,S>{
    private final Map<C, S> strategyMap = new HashMap();

    public ContainerImpl() {
    }

    public S getStrategy(C type) {
        initStrategyImpl();
        return this.strategyMap.get(type);
    }

    private void initStrategyImpl(){
        if(this.strategyMap.size() > 0) {
            log.debug("该策略容器已完成初始化!");
            return;
        }
        // 初始化策略容器
        Collection<Strategy> beans = CustomContextAware.getBeans(Strategy.class).values();

        for (Strategy e : beans) {
            // strategyMap.put(e.getStrategyType(),e)
        }
    }
}
