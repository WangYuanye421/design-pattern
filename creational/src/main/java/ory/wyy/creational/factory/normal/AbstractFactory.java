package ory.wyy.creational.factory.normal;

/**
 * 工厂方法模式：抽象工厂（父类），定义创建产品对象的公共接口
 * 在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，而工厂子类则负责生成具体的产品对象，
 * 目的:将具体产品类的创建 延迟到 工厂子类中完成，即通过工厂子类来确定究竟应该实例化哪一个具体产品类
 */
public abstract class AbstractFactory {

    public abstract AbstractHuman getHumanInstance();

    void test(){
        System.out.println("test");
    }
}
