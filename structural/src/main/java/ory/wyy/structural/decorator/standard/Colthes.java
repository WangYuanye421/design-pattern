package ory.wyy.structural.decorator.standard;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-25 13:48
 **/
public class Colthes extends Person{
    public Person person;

    public void setPerson(Person person) {
        if(person != null) {
            this.person = person;
        }
    }

    @Override
    public void show() {
        person.show();
    }
}
