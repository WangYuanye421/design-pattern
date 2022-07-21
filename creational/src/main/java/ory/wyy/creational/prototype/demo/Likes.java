package ory.wyy.creational.prototype.demo;

/**
 * @description: 爱好类
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-27 13:06
 **/
public class Likes implements Cloneable{
    private String name;

    public Likes(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
