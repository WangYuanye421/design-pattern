package ory.wyy.behavioral.observer.subscript;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 3:13 下午
 **/
public class ShutdownSubject extends Subject{
    @Override
    public void doTriger() {
        System.out.println("关机");
        getLength();
        notifyObservers();
    }
}
