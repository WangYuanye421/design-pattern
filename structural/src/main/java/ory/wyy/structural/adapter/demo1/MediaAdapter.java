package ory.wyy.structural.adapter.demo1;

/**
 * @Description :
 * 播放器适配器
 *      适配器需要实现待适配的接口,
 *      通过注入的方式,持有了具有能力A的对象,
 *      在实现接口方法时,使用持有的对象来完成功能,从而使接口具有能力A;如:
 *      普通播放器只能播放MP3,通过往适配器传入增强型播放器,让增强型播放器完成播放功能.最终
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午3:36
 **/
public class MediaAdapter implements MediaPlayer{
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    @Override
    public void play(MediaType type, String fileName) {
        advanceMediaPlayer.playEverything(type,fileName);
    }
}
