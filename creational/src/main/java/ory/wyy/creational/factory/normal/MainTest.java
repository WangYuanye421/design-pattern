package ory.wyy.creational.factory.normal;

/**
 * 工厂方法模式：
 *      优点：本例中，增加新的类型，不用修改现有代码，符合开闭原则。如新增司机，新建司机类，新建司机工厂即可
 *      缺点：类的个数成对增加（具体类和相应工厂），一定程度上增加了系统复杂度和开销
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        //获取学生工厂类，创建学生
        factory = new StudentFactory();
        factory.test();
        AbstractHuman student = factory.getHumanInstance();
        student.doSomething();


        factory = new ProgrammerFactory();
        factory.getHumanInstance().doSomething();

        factory = new TeacherFactory();
        factory.getHumanInstance().doSomething();
    }
}
