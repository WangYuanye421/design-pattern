package ory.wyy.behavioral.observer.observer;


import ory.wyy.behavioral.observer.subscript.Subject;

/**
 * 系统清理
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 3:15 下午
 **/
public class ClearUpObserver implements Observer{
    @Override
    public void subscription(Subject subject) {
        subject.add(this);
    }

    @Override
    public void doLogic() {
        System.out.println("关机清理");
    }
}
