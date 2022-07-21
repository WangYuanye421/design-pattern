package ory.wyy.creational.prototype.demo2;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/2 7:48 下午
 **/
public class Test {
    public static void main(String[] args) {
        SmallTree smallTree = new SmallTree("black",10);
        SmallTree copy = (SmallTree) smallTree.copy();
        copy.setColor("1");
        copy.setLength(11);
        SmallTree copy2 = (SmallTree) smallTree.copy();
        SmallTree copy3 = (SmallTree) smallTree.copy();
        SmallTree copy4 = (SmallTree) smallTree.copy();

        System.out.println(smallTree);
        System.out.println(copy);
        System.out.println(copy2);
        System.out.println(copy3);
        System.out.println(copy4);

    }
}
