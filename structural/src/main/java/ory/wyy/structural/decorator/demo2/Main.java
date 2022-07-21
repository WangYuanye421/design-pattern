package ory.wyy.structural.decorator.demo2;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 8:48 下午
 **/
public class Main {
    public static void main(String[] args) {
        MaLaTang mlt1 = new Shengcai(new XiangCai(new TangDi()));
        System.out.println(mlt1.getDesc());
        System.out.println(mlt1.cost());

        MaLaTang mlt2 = new FenTiao(new Shengcai(new XiangCai(new TangDi())));
        System.out.println(mlt2.getDesc());
        System.out.println(mlt2.cost());
    }
}
