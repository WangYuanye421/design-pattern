package ory.wyy.structural.adapter.demo2;

/**
 * @Description :
 * USB适配器
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午4:07
 **/
public class UsbAdapter implements Usb{
    private Reader reader;

    public UsbAdapter(Reader reader) {
        this.reader = reader;
    }

    @Override
    public void read(Type interfaceType) {
        reader.read(interfaceType);
    }
}
