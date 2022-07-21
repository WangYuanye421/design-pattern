package ory.wyy.creational.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Description :
 *  懒加载优化2: DCL 双重锁检查 double check lock
 *  通过加锁解决多线程问题,锁住方法 --> 锁住代码块,锁粒度降低,提高性能
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/13 下午8:48
 **/
public class LazyDemo03 {
    private static LazyDemo03 INSTANCE;
    private LazyDemo03(){};
    private static CountDownLatch latch = new CountDownLatch(1);

    public static LazyDemo03 getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            synchronized(LazyDemo03.class) {
                // 此处,可能进入多个线程,即使拿到锁,仍需做一次非空判断
                if (INSTANCE == null) {
                    Thread.sleep(1);
                    INSTANCE = new LazyDemo03();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception{
        // 启动50个线程,增加线程中单例的创建时间
        /*for (int i = 0; i < 50; i++) {
            new Thread(()->{
                try {
                    // 测试线程此处等待
                    latch.await();
                    LazyDemo03 target = LazyDemo03.getInstance();
                    System.out.println(target.hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        // 开门闩
        latch.countDown();
        System.out.println("over");*/

        Class<?> aClass = Class.forName("partten.creational.singleton.LazyDemo03");
        Object o1 = aClass.newInstance();
        System.out.println(o1);
    }
}
