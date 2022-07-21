package ory.wyy.behavioral.iterator;

/**
 * @description: 迭代器实现类A
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-19 15:54
 **/
public class IteratorTypeA implements Iterator{

    private Aggregate aggregate;
    private int current = 0;

    public IteratorTypeA(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Object getFirst() {
        return null;
    }

    public Object getNext() {
        return null;
    }

    public Boolean hasNext() {
        return null;
    }

    public Object CurrentItem() {
        return null;
    }
}
