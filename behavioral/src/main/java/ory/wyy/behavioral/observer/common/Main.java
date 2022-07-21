package ory.wyy.behavioral.observer.common;

import ory.wyy.behavioral.observer.common.observer.ClearUpObserver;
import ory.wyy.behavioral.observer.common.observer.LoadAdObserver;
import ory.wyy.behavioral.observer.common.observer.LoadMenuObserver;
import ory.wyy.behavioral.observer.common.subject.AbstractSubject;
import ory.wyy.behavioral.observer.common.subject.BootSubject;
import ory.wyy.behavioral.observer.common.subject.ShutdownSubject;

/**
 * 测试类
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 10:35 下午
 **/
public class Main {
    public static void main(String[] args) {
        // 被观察者1
        AbstractSubject boot = new BootSubject();
        // 观察者订阅(订阅后,目标类调用trigger方法时,触发观察者中的相应方法)
        new LoadAdObserver().subscript(boot);
        new LoadMenuObserver().subscript(boot);
        boot.trigger();
        System.out.println("==================");

        // 被观察者2
        AbstractSubject shutdown = new ShutdownSubject();
        // 观察者订阅
        new LoadAdObserver().subscript(shutdown);
        new ClearUpObserver().subscript(shutdown);
        shutdown.trigger();

    }
}
