package ory.wyy.behavioral.observer.common.subject;


import ory.wyy.behavioral.observer.common.observer.BaseObserver;

/**
 * 开机动作
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 6:03 下午
 **/
public class BootSubject extends AbstractSubject<BaseObserver> {

    @Override
    public void trigger() {
        System.out.println("执行开机动作");
        // 通知观察者
        notifyObservers();
    }
}
