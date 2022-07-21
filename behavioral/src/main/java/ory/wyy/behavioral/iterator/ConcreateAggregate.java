package ory.wyy.behavioral.iterator;

import java.util.List;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-19 16:01
 **/
public class ConcreateAggregate extends Aggregate{
    private List<Object> list;


    @Override
    Iterator createIterator() {
        return new IteratorTypeA(null);
    }
    public int count(){
        return list.size();
    }


    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
