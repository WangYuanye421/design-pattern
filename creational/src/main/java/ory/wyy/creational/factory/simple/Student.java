package ory.wyy.creational.factory.simple;

/**
 * 简单工厂模式：具体类 学生
 */
public class Student extends Human{
    @Override
    public void doSomething() {
        System.out.println("study");
    }
}
