package ory.wyy.structural.adapter.demo1;

/**
 * @Description :
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午3:31
 **/
public class AdvanceMediaPlayerImpl implements AdvanceMediaPlayer {
    @Override
    public void playEverything(MediaType type, String fileName) {
        System.out.println("mediaType is"+ type + ",playing: " + fileName);
    }
}
