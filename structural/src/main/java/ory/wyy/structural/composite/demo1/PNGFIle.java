package ory.wyy.structural.composite.demo1;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/3/4 下午8:01
 **/
public class PNGFIle extends File{

    public PNGFIle(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is png,fileName = " +name);
    }
}
