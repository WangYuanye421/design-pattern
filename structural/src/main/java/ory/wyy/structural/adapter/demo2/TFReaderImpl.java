package ory.wyy.structural.adapter.demo2;

/**
 * @Description :
 * TF读卡器
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午4:03
 **/
public class TFReaderImpl implements Reader{

    @Override
    public void read(Type type) {
        if (Type.TF.equals(type)) {
            System.out.println(type.name() + ",reading ...");
        } else {
            System.out.println(type.name() + ",interfaceType no support ...");
        }
    }

}
