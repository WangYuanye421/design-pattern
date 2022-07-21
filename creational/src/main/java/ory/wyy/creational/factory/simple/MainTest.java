package ory.wyy.creational.factory.simple;

/**
 * 简单工厂模式（静态工厂）：可以根据参数（type）不同返回不同类的实例
 * 简单工厂模式专门定义一个类（HumanFactory）来负责创建其他类(student,teacher...)的实例，
 * 被创建的实例通常都具有共同的父类(Human)
 */
public class MainTest {
    public static void main(String[] args) {

        Human human = null;
        human = HumanFactory.getHumanInstance("student");
        human.doSomething();

        human = HumanFactory.getHumanInstance("teacher");
        human.doSomething();

        human = HumanFactory.getHumanInstance("programmer");
        human.doSomething();
    }
}
