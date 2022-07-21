package ory.wyy.structural.adapter.demo2;

/**
 * @Description :
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午3:57
 **/
public class UsbImpl implements Usb {
    @Override
    public void read(Type interfaceType) {
        if(Type.USB.equals(interfaceType)) {
            System.out.println(interfaceType.name() + ",reading ...");
        } else {
            System.out.println(interfaceType.name() + ",interfaceType no support ...");
        }
    }
}
