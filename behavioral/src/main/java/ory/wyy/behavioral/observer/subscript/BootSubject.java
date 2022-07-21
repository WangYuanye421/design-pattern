package ory.wyy.behavioral.observer.subscript;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 3:11 下午
 **/
public class BootSubject extends Subject{
    @Override
    public void doTriger() {
        System.out.println("开机");
        getLength();
        notifyObservers();
    }
}
