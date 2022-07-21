package ory.wyy.structural.adapter.demo1;

/**
 * @Description :
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午3:24
 **/
public class MediaPlayerImpl implements MediaPlayer {
    @Override
    public void play(MediaType type, String fileName) {
        if (MediaType.MP3.equals(type)){
            System.out.println("play :"+ fileName);
        } else {
            System.out.println("fileName don't support!");
        }

    }
}
