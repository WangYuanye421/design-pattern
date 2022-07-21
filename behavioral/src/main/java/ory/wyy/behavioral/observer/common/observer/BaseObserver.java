package ory.wyy.behavioral.observer.common.observer;

/**
 * 观察者接口
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/8/21 5:53 下午
 **/
public interface BaseObserver<AbstractSubject> {

    /**
     * 订阅目标对象,目标执行特定方法时,依次"通知"所有的订阅者
     * @param t
     */
    void subscript (AbstractSubject t);

    /**
     * 观察者对象中的业务逻辑
     */
    void handle ();
}
