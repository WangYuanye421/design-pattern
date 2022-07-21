package ory.wyy.creational.factory.normal;

public class TeacherFactory extends AbstractFactory{
    @Override
    public AbstractHuman getHumanInstance() {
        return new Teacher();
    }
}
