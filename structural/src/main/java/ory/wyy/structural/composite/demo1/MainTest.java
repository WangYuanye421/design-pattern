package ory.wyy.structural.composite.demo1;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/3/4 下午8:05
 **/
public class MainTest {
    public static void main(String[] args) {
        Folder work = new Folder("办公");

        PNGFIle pngfIle = new PNGFIle("美女图片.png");
        MP3File mp3File = new MP3File("晴天.mp3");
        Folder code = new Folder("代码");

        work.addFile(pngfIle);
        work.addFile(mp3File);
        work.addFile(code);

        JavaFile javaFile = new JavaFile("demo1.java");
        JavaFile javaFile1 = new JavaFile("demo2.java");
        code.addFile(javaFile);
        code.addFile(javaFile1);

        // 通过组合模式,客户端不用区分是文件还是文件夹,同一调用file的API即可
        work.display();
        System.out.println("--------------------");
        pngfIle.display();
        System.out.println("--------------------");
        code.display();
    }
}
