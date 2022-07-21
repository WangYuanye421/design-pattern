package ory.wyy.behavioral.observer.injava;

import java.util.Observable;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 4:29 下午
 **/
public class Subject extends Observable {
    private String name = "data";

    public Subject() {
    }

    public void notifyCustomer(){
        setChanged();
        notifyObservers();
    }


    public String getName() {
        return name;
    }
}
