package ory.wyy.creational.prototype.demo;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-27 13:17
 **/
public class Client {
    public static void main(String[] args) {
        Student p1 = new Student();
        p1.setName("ztx");
        p1.setAge(25);
        p1.setSex("female");
        p1.setLikes(new Likes("sleep"));

        System.out.println(p1.toString());

        try {
            Student p2 = (Student) p1.clone();
            p2.setName("wyy");
            p2.setAge(29);
            p2.setSex("male");
            p2.setLikes(new Likes("swimming"));
            System.out.println(p2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(p1.toString());
    }
}
