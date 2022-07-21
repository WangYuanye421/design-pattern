package ory.wyy.structural.composite.demo1;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote 抽象文件类, 文件夹和具体文件都继承该类,组合模式的关键就是要实现同一接口,此时处理文件和文件夹就可以同一处理
 * 忽略整体与部分的差异
 * @date : 2021/3/4 下午7:55
 **/
public abstract class File {
    public String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
