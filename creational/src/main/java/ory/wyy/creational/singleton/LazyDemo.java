package ory.wyy.creational.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Description :
 * 懒汉式单例
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/13 下午8:23
 **/
public class LazyDemo {
    private static LazyDemo INSTANCE;
    private LazyDemo(){};
    private static CountDownLatch latch = new CountDownLatch(1);

    public static LazyDemo getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            // 执行之前,第二个线程进入,产生两个实例
            Thread.sleep(1);
            INSTANCE = new LazyDemo();
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception{
        // 此处初始化后,instance不为null,后续线程不再创建
        // LazyDemo origin = LazyDemo.getInstance();
        System.out.println("CountDownLatch :"+latch.getCount());
        // 启动50个线程,增加线程中单例的创建时间
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                try {
                    // 测试线程此处等待
                    latch.await();
                    LazyDemo target = LazyDemo.getInstance();
                    System.out.println(target.hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        // 开门闩
        latch.countDown();
        System.out.println("over");
    }
}
