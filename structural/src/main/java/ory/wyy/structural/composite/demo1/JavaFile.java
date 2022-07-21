package ory.wyy.structural.composite.demo1;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/3/4 下午8:08
 **/
public class JavaFile extends File{
    public JavaFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is java. fileName="+name);
    }
}
