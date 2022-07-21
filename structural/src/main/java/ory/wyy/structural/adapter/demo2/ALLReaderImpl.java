package ory.wyy.structural.adapter.demo2;

/**
 * @Description :
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午4:15
 **/
public class ALLReaderImpl implements Reader {
    @Override
    public void read(Type type) {
        System.out.println(type.name() + ",万能转接器,reading now");
    }
}
