package ory.wyy.creational.factory.normal;

public class StudentFactory extends AbstractFactory{
    // 实现
    @Override
    public AbstractHuman getHumanInstance() {
        return new Student();
    }
    // 重写
    @Override
    void test() {
        super.test();
    }
}
