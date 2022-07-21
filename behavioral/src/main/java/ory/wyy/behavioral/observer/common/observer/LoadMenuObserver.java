package ory.wyy.behavioral.observer.common.observer;


import ory.wyy.behavioral.observer.common.subject.AbstractSubject;

/**
 * 执行 菜单加载逻辑的 观察者
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 10:39 下午
 **/
public class LoadMenuObserver implements BaseObserver<AbstractSubject>{
    @Override
    public void subscript(AbstractSubject bootSubject) {
        bootSubject.add(this);
    }

    @Override
    public void handle() {
        System.out.println("执行加载菜单内容");
    }
}
