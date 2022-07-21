package ory.wyy.behavioral.iterator;

/**
 * @description: 抽象聚合类
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-19 15:58
 **/
public abstract class Aggregate {
    //获取迭代器
    abstract Iterator createIterator();
}
