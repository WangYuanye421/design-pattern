package ory.wyy.creational.singleton;

/**
 * @Description :
 * 枚举单例
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/14 上午12:16
 **/
public enum EnumDemo {
    INSTANCE;

    EnumDemo() {
        System.out.println("执行对象创建相关逻辑");
    }

    public static void main(String[] args) throws Exception{
        /*CountDownLatch latch = new CountDownLatch(1);
        // 启动50个线程,增加线程中单例的创建时间
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnumDemo target = EnumDemo.INSTANCE;
                System.out.println(target.hashCode());
            }).start();
        }
        latch.countDown();*/
        Class<?> aClass = Class.forName("partten.creational.singleton.EnumDemo");
        Object o1 = aClass.newInstance();
        /*Constructor<?> constructor = aClass.getConstructor(null);
        Object o = constructor.newInstance();*/
        System.out.println(o1);
    }
}
