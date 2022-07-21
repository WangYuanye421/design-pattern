package ory.wyy.structural.decorator.demo2;

/**
 * 香菜
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 8:44 下午
 **/
public class XiangCai implements JiaCai {
    private MaLaTang maLaTang;

    public XiangCai() {
    }

    public XiangCai(MaLaTang maLaTang) {
        this.maLaTang = maLaTang;
    }

    @Override
    public String getDesc() {
        return maLaTang.getDesc()+",香菜";
    }

    @Override
    public int cost() {
        return maLaTang.cost() + 1;
    }
}
