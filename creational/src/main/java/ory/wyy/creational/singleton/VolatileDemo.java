package ory.wyy.creational.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Description :
 *  懒加载优化3: DCL带来的问题 --> 字节码指令重排,导致返回未被完全初始化的对象,其他线程获取到的可能就是这个半初始化对象
 *  通过添加volatile
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/13 下午8:48
 **/
public class VolatileDemo {

    private static volatile VolatileDemo INSTANCE;
    private VolatileDemo(){};


    public static VolatileDemo getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            synchronized(VolatileDemo.class) {
                // 此处,可能进入多个线程,即使拿到锁,仍需做一次非空判断
                if (INSTANCE == null) {
                    Thread.sleep(1);
                    INSTANCE = new VolatileDemo();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception{
        CountDownLatch latch = new CountDownLatch(1);
        // 启动50个线程,增加线程中单例的创建时间
        for (int i = 0; i < 500; i++) {
            new Thread(()->{
                try {
                    // 测试线程此处等待
                    latch.await();
                    VolatileDemo target = VolatileDemo.getInstance();
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
