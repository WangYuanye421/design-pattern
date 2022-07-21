package ory.wyy.structural.composite.demo1;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/3/4 下午8:02
 **/
public class MP3File extends File{

    public MP3File(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is mp3 file,fileName = "+name);
    }
}
