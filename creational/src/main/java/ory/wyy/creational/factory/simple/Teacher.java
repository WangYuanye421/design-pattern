package ory.wyy.creational.factory.simple;

/**
 * 简单工厂模式：具体类 教师
 */
public class Teacher extends Human{
    @Override
    public void doSomething() {
        System.out.println("teaching ..");
    }
}
