package ory.wyy.behavioral.observer.common.observer;


import ory.wyy.behavioral.observer.common.subject.AbstractSubject;

/**
 * 执行加载广告的观察者
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 6:04 下午
 **/
public class LoadAdObserver implements BaseObserver<AbstractSubject>{
    @Override
    public void subscript(AbstractSubject bootSubject) {
        bootSubject.add(this);
    }

    @Override
    public void handle() {
        System.out.println("执行加载广告内容");
    }
}
