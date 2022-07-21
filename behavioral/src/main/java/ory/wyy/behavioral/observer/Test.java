package ory.wyy.behavioral.observer;


import ory.wyy.behavioral.observer.observer.ClearUpObserver;
import ory.wyy.behavioral.observer.observer.LoadAdObserver;
import ory.wyy.behavioral.observer.observer.LoadMenuObserver;
import ory.wyy.behavioral.observer.observer.Observer;
import ory.wyy.behavioral.observer.subscript.BootSubject;
import ory.wyy.behavioral.observer.subscript.ShutdownSubject;
import ory.wyy.behavioral.observer.subscript.Subject;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 3:18 下午
 **/
public class Test {

    public static void main(String[] args) {
        // 生成对象
        Subject boot = new BootSubject();
        Subject shutdown = new ShutdownSubject();

        // 观察者订阅对象
        Observer loadMenuObserver = new LoadMenuObserver();
        loadMenuObserver.subscription(boot);
        Observer loadAd = new LoadAdObserver();
        loadAd.subscription(boot);

        Observer clearUp = new ClearUpObserver();
        clearUp.subscription(shutdown);


        // 目标对象触发
        boot.doTriger();

        shutdown.doTriger();
    }
}
