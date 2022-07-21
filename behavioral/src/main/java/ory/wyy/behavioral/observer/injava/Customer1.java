package ory.wyy.behavioral.observer.injava;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 4:31 下午
 **/
public class Customer1 implements Observer {
    private Subject subject;

    public Customer1(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            Subject subject = (Subject)o;
            System.out.println(subject.getName());
        }
    }
}
