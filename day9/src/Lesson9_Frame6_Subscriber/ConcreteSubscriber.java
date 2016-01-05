package Lesson9_Frame6_Subscriber;

public class ConcreteSubscriber implements Subscriber {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public ConcreteSubscriber (String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(getName()+ " is  received information");
    }
}
