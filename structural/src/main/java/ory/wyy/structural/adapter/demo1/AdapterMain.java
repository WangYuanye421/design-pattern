package ory.wyy.structural.adapter.demo1;

/**
 * @Description :
 * 适配器测试
 * @Version : v1.0
 * @Author : Wang Yuanye
 * @Date : 2021/1/22 下午3:26
 **/
public class AdapterMain {
    public static void main(String[] args) {
        System.out.println("普通播放器++++++++++");
        MediaPlayer player = new MediaPlayerImpl();
        player.play(MediaType.MP3,"i don't let you down.mp3");
        player.play(MediaType.MP4,"i don't let you down.mp4");

        System.out.println("增强器播放器+++++++++++");
        AdvanceMediaPlayer advanceMediaPlayer = new AdvanceMediaPlayerImpl();
        advanceMediaPlayer.playEverything(MediaType.MP3,"i don't let you down.mp3");
        advanceMediaPlayer.playEverything(MediaType.MP4,"i don't let you down.mp4");

        System.out.println("普通播放器通过适配器后++++++++++++");
        MediaPlayer adapter = new MediaAdapter(new AdvanceMediaPlayerImpl());
        adapter.play(MediaType.MP3,"i don't let you down.mp3");
        adapter.play(MediaType.MP4,"i don't let you down.mp4");
    }
}
