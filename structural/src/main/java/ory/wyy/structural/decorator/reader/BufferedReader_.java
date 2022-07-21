package ory.wyy.structural.decorator.reader;

/**
 * @author Wyy
 * @version v1.0
 * @apiNote
 * @date : 2022/6/10 19:27
 **/
public class BufferedReader_ extends Reader_{
    private Reader_ reader;

    public BufferedReader_(Reader_ reader) {
        this.reader = reader;
    }

    @Override
    void read() {
        reader.read();
        System.out.println("其他处理");
    }
}
