package ory.wyy.structural.decorator.standard;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 13:38
 **/
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.printf("装扮的%s\n",name);
    }
}
