package ory.wyy.creational.factory.normal;

public class ProgrammerFactory extends AbstractFactory{
    @Override
    public AbstractHuman getHumanInstance() {
        return new Programmer();
    }
}
