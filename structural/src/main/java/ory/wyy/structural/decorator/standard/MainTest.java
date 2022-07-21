package ory.wyy.structural.decorator.standard;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 13:43
 **/
public class MainTest {
    public static void main(String[] args) {
        Person p = new Person("mars");
        Colthes t = new Tshorts();
        Colthes s = new Shores();

        t.setPerson(p);
        s.setPerson(t);
        s.show();

    }
}
