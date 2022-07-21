package ory.wyy.structural.decorator.demo2;

/**
 * 汤底
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 8:31 下午
 **/
public class TangDi implements MaLaTang {
    @Override
    public String getDesc() {
        return "汤底";
    }

    @Override
    public int cost() {
        return 5;
    }
}
