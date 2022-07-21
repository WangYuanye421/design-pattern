package ory.wyy.behavioral.strategy.framework.strategyframe;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * @author: mars
 * @version: v1.0
 * @data: 2020/6/10 1:19 下午
 **/
public class CustomContextAware implements ApplicationContextAware {
    private static ApplicationContext context;

    public CustomContextAware() {
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> requiredType) {
        return context.getBean(requiredType);
    }

    public static <T> Map<String,T> getBeans(Class<T> requiredType) {
        return context.getBeansOfType(requiredType);
    }


}
