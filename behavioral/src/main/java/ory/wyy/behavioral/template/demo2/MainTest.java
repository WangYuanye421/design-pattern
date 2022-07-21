package ory.wyy.behavioral.template.demo2;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/2/25 下午7:33
 **/
public class MainTest {
    public static void main(String[] args) {
        LoLHeroShowTemplate gaiLun = new GaiLunShow("盖伦","战士");
        LoLHeroShowTemplate vn = new VNShow("VN","射手");

        gaiLun.showHero();
        System.out.println("=====================");
        vn.showHero();
    }
}
