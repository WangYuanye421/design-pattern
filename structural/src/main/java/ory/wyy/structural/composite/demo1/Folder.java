package ory.wyy.structural.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote 文件夹类
 * @date : 2021/3/4 下午7:57
 **/
public class Folder extends File{
    private List<File> files;

    public Folder(String name) {
        super(name);
        this.files = new ArrayList<>();
    }

    public void addFile(File f) {
        files.add(f);
    }

    public void removeFile(File f) {
        files.remove(f);
    }


    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @Override
    public void display() {
        files.forEach(e -> {
            e.display();
        });
    }
}
