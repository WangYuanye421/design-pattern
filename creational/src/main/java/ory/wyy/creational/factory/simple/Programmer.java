package ory.wyy.creational.factory.simple;

/**
 * 简单工厂模式：具体类 码农
 */
public class Programmer extends Human{
    @Override
    public void doSomething() {
        System.out.println("coding..");
    }
}
