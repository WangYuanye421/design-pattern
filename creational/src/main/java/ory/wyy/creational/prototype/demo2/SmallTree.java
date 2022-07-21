package ory.wyy.creational.prototype.demo2;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/2 7:43 下午
 **/
public class SmallTree extends Tree {

    public SmallTree(String color,int length) {
        this.color = color;
        this.length = length;
    }

    @Override
    public Object copy() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
