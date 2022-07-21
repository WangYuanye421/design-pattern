package ory.wyy.creational.prototype.demo2;

/**
 * 原型类
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/2 7:42 下午
 **/
public abstract class Tree implements Cloneable{
    public String color;
    public int length;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract Object copy();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
