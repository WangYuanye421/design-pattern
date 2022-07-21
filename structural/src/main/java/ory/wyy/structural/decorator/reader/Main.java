package ory.wyy.structural.decorator.reader;

/**
 * @author Wyy
 * @version v1.0
 * @apiNote
 * @date : 2022/6/10 19:33
 **/
public class Main {
    public static void main(String[] args) {
        Reader_ reader = new BufferedReader_(new StringReader_());
        reader.read();
        reader = new BufferedReader_(new FileReader_());
        reader.read();


        // 与代理模式很类似,区别:
        /**
         *  代理模式是为了控制原始对象的访问,装饰模式是为了增加被装饰对象的功能
         * 1. 对于调用者而言,代理模式中是感知不到被代理对象的(原始对象),而装饰者模式需要明确知道原始对象,即谁要被装饰
         * 2. 被代理对象在编译期确定,而被装饰者在运行期被构造
         *
         *
         */
    }
}
