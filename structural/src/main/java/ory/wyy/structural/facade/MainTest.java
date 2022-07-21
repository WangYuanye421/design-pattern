package ory.wyy.structural.facade;

/**
 * @description: 客户端 测试类
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-29 15:55
 **/
public class MainTest {
    public static void main(String[] args) {
        Facade f = new Facade();
        // 客户端对子系统的调用全部由外观类进行转发调用,减少耦合（类似模块之间为了降低耦合，通过API接口来访问）
        // 客户端无需知道有哪些系统，或者外观类做了什么。各个子系统的组合和调用由外观类来管理
        f.IdServer();
        f.getMoneyServer();
        f.cityServer();
    }
}
