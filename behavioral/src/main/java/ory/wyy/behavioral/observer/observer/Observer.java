package ory.wyy.behavioral.observer.observer;


import ory.wyy.behavioral.observer.subscript.Subject;

/**
 * 观察者接口
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 2:59 下午
 **/
public interface Observer {

    // 订阅subject
    void subscription (Subject subject);

    // 执行观察者logic
    void doLogic ();
}
