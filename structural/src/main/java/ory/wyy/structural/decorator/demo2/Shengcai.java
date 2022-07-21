package ory.wyy.structural.decorator.demo2;

/**
 * 生菜
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 8:44 下午
 **/
public class Shengcai implements JiaCai {
    private MaLaTang maLaTang;

    public Shengcai() {
    }

    public Shengcai(MaLaTang maLaTang) {
        this.maLaTang = maLaTang;
    }

    @Override
    public String getDesc() {
        return maLaTang.getDesc()+",生菜";
    }

    @Override
    public int cost() {
        return maLaTang.cost() + 1;
    }
}
