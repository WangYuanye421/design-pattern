package ory.wyy.behavioral.observer.common.subject;

import org.assertj.core.util.Sets;
import ory.wyy.behavioral.observer.common.observer.BaseObserver;

import java.util.Iterator;
import java.util.Set;

/**
 * 被观察者抽象类
 *  抽取公共方法,子类具体实现交由子类实现
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 5:54 下午
 **/
public abstract class AbstractSubject<T extends BaseObserver> {
    private Set<T> observers = Sets.newHashSet();

    /**
     * 添加观察者
     * @param t
     */
    public void add(T t){
        observers.add(t);
    }

    /**
     * 删除观察者
     * @param t
     */
    public void remove(T t) {
        observers.remove(t);
    }

    /**
     * 获取观察者数量
     * @return
     */
    public int getObserverNum(){
        return observers.size();
    }

    /**
     * 循环遍历"通知"观察者(观察者模式的核心:目标对象的行为触发观察者执行相关操作)
     */
    public void notifyObservers(){
        Iterator<T> iterator = observers.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            next.handle();
        }
    }

    /**
     * 子类实现自定义的触发动作
     */
    public abstract void trigger();
}
