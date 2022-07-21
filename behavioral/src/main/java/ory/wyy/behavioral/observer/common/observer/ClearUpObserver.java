package ory.wyy.behavioral.observer.common.observer;


import ory.wyy.behavioral.observer.common.subject.AbstractSubject;

/**
 * 执行清理工作的观察者
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 10:48 下午
 **/
public class ClearUpObserver implements BaseObserver<AbstractSubject> {
    @Override
    public void subscript(AbstractSubject t) {
        t.add(this);
    }

    @Override
    public void handle() {
        System.out.println("执行系统相关清理工作");
    }
}
