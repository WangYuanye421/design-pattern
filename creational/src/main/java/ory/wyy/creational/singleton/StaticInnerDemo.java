package ory.wyy.creational.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Description :
 * 静态内部类单例
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/14 上午12:07
 **/
public class StaticInnerDemo {

    private StaticInnerDemo() {}

    private static class InnerClass{
        private static final StaticInnerDemo instance = new StaticInnerDemo();
    }

    public static StaticInnerDemo getInstance(){
        return InnerClass.instance;
    }

    public static void main(String[] args) throws Exception{
        CountDownLatch latch = new CountDownLatch(1);
        // 启动50个线程,增加线程中单例的创建时间
        for (int i = 0; i < 500; i++) {
            new Thread(()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                StaticInnerDemo target = StaticInnerDemo.getInstance();
                System.out.println(target.hashCode());
            }).start();
        }
        latch.countDown();
    }
}
