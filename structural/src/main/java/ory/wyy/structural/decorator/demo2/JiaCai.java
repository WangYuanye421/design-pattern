package ory.wyy.structural.decorator.demo2;

/**
 * 加菜
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 8:40 下午
 **/
public interface JiaCai extends MaLaTang {
    @Override
    String getDesc ();

    @Override
    int cost ();
}
