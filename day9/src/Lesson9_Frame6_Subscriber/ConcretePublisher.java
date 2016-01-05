package Lesson9_Frame6_Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ConcretePublisher implements Publisher{
    private String name;
    List<Subscriber>subscribes;

    public ConcretePublisher (String name) {
        subscribes= new ArrayList<>();
        this.name = name;
    }

    public void newNumber () {
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Subscriber s) {
        subscribes.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribes.remove(s);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s : subscribes) {
            s.update();
            System.out.println(s.getName()+" is notifed: a new issue " +this.name +  " is released");
        }
    }
}
