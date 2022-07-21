package ory.wyy.behavioral.observer.common.subject;

/**
 * 关机操作
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 10:47 下午
 **/
public class ShutdownSubject extends AbstractSubject{
    @Override
    public void trigger() {
        System.out.println("执行关机动作");
        notifyObservers();
    }
}
