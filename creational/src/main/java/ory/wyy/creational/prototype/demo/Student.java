package ory.wyy.creational.prototype.demo;

/**
 * @description:具体原型类
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-27 13:04
 **/
public class Student extends Person{
    private Likes likes;

    public Student() {
    }

    public Student(Likes likes) {
        try {
            this.likes = (Likes) likes.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 使用单参构造重新创建实例，深拷贝
        Student stu = new Student(this.likes);
        stu.setName(this.getName());
        stu.setAge(this.getAge());
        stu.setSex(this.getSex());
        return stu;
    }

    @Override
    public String toString() {
        return super.toString()+
                "likes=" + likes.toString();
    }
}
