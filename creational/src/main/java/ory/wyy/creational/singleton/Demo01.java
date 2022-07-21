package ory.wyy.creational.singleton;

/**
 * @Description :
 *      饿汉式单例
 *      优点: 类加载进JVM后就实例出一个单例,天生线程安全
 *      缺点: 类加载时就初始化,不管是否需要
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/13 下午8:09
 **/
public class Demo01 {
    private static final Demo01 INSTANCE = new Demo01();

    private Demo01(){};

    /**
     * 对外提供获取实例的方法
     * @return
     */
    public static Demo01 getInstance (){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Demo01 instance = Demo01.getInstance();
        Demo01 instance2 = Demo01.getInstance();
        System.out.println(instance == instance2);

    }
}
