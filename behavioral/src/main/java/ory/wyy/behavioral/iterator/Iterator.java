package ory.wyy.behavioral.iterator;

/**
 * @description: 迭代器接口
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-19 15:48
 **/
public interface Iterator {
    // 获取聚合对象的第一个元素
    Object getFirst ();
    // 获取聚合对象中的下一个元素
    Object getNext ();
    // 是否遍历结束,即是否存在下一个
    Boolean hasNext ();
    // 获取迭代数组中的当前对象
    Object CurrentItem ();
}
