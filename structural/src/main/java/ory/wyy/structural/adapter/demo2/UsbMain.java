package ory.wyy.structural.adapter.demo2;

/**
 * @Description :
 * 测试类
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午3:58
 **/
public class UsbMain {
    public static void main(String[] args) {
        System.out.println("普通USB");
        Usb usb = new UsbImpl();
        usb.read(Type.USB);
        usb.read(Type.TF);

        System.out.println("读卡器");
        Reader tfReader = new TFReaderImpl();
        tfReader.read(Type.TF);
        tfReader.read(Type.USB);


        System.out.println("万能转接器");
        Reader readerAll = new ALLReaderImpl();
        readerAll.read(Type.TF);
        readerAll.read(Type.USB);
        readerAll.read(Type.OTHER);

    }
}
