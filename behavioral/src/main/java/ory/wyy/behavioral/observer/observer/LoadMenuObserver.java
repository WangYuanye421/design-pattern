package ory.wyy.behavioral.observer.observer;


import ory.wyy.behavioral.observer.subscript.Subject;

/**
 * 加载系统菜单
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 3:14 下午
 **/
public class LoadMenuObserver implements Observer{
    @Override
    public void subscription(Subject subject) {
        subject.add(this);
    }

    @Override
    public void doLogic() {
        System.out.println("加载菜单");
    }
}
