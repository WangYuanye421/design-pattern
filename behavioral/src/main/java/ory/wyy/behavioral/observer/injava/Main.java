package ory.wyy.behavioral.observer.injava;

/**
 * JDK 中的观察者模式
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 4:39 下午
 **/
public class Main {
    public static void main(String[] args) {
        // 主题对象
        Subject subject = new Subject();
        // 观察者对象,并传入观察的主题
        new Customer1(subject);
        subject.notifyCustomer();
    }
}
