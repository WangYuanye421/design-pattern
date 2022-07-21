package ory.wyy.creational.factory.simple;

/**
 * 简单工厂模式：工厂类：负责创建实例
 */
public class HumanFactory {

    /**
     *
     * @param type
     * @return
     */
    public static Human getHumanInstance(String type){
        if("student".equals(type)){
            return new Student();
        }else if("teacher".equals(type)){
            return new Teacher();
        }else if("programmer".equals(type)){
            return new Programmer();
        }else{
            return null;
        }
    }
}
