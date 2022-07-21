package ory.wyy.behavioral.observer.subscript;


import org.assertj.core.util.Sets;
import ory.wyy.behavioral.observer.observer.Observer;

import java.util.Iterator;
import java.util.Set;

/**
 * 目标对象(被观察者)
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 3:00 下午
 **/
public abstract class Subject<T extends Observer> {
    // 观察者集合
    private   Set<T> observers = Sets.newHashSet();

    public void add(T o){
        observers.add(o);
    }

    public void remove(T o){
        observers.remove(o);
    }

    public int getLength(){
        return observers.size();
    }

    public void notifyObservers(){
        Iterator<T> iterator = observers.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            next.doLogic();
        }
    }

    // 触发操作
    public abstract void doTriger();
}
