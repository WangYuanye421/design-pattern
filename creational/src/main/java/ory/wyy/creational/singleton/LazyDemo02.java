package ory.wyy.creational.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Description :
 *  懒加载优化一:
 *  通过加锁解决多线程问题,锁住整个getInstance方法,效率降低,是否可以锁粒度细化?{@link LazyDemo03}
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/13 下午8:48
 **/
public class LazyDemo02 {
    private static LazyDemo02 INSTANCE;
    private LazyDemo02(){};
    private static CountDownLatch latch = new CountDownLatch(1);

    public static synchronized LazyDemo02 getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            // 执行之前,第二个线程进入,产生两个实例
            Thread.sleep(1);
            INSTANCE = new LazyDemo02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception{
        // 启动50个线程,增加线程中单例的创建时间
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                try {
                    // 测试线程此处等待
                    latch.await();
                    LazyDemo02 target = LazyDemo02.getInstance();
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
