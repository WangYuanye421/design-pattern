package ory.wyy.creational.builder.demo2.buildMeal;


import java.util.ArrayList;
import java.util.List;

/**
 * 套餐类
 *
 * @author: Yuanye Wong
 * @version: v1.0
 * @date: 2021/1/9 2:47 上午
 **/
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost() {
        float cost = 0f;
        if (items.size() > 0) {
            for (Item item : items) {
                cost = cost + item.price();
            }
            return cost;
        }
        return 0;
    }

    public String showItem(){
        String msg = "";
        if (items.size() > 0) {
            for (Item item : items) {
                msg = "名称:"+item.name() + " 包装:"+item.packing().packing()+"\n"+msg;
            }
            return msg;
        }
        return "";
    }
}
