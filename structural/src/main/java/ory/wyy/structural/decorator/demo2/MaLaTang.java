package ory.wyy.structural.decorator.demo2;

/**
 * 麻辣烫
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/6 8:29 下午
 **/
public interface MaLaTang {

    /**
     * 获取描述
     * @return
     */
    String getDesc ();

    /**
     * 付钱
     * @return
     */
    int cost ();
}
