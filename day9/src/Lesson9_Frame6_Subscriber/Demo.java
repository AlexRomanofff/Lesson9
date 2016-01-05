package Lesson9_Frame6_Subscriber;

public class Demo {
    public static void main(String[] args) {
        ConcretePublisher newspaper = new ConcretePublisher("newspaper");
        ConcretePublisher magazine = new ConcretePublisher("magazine");

        Subscriber sub = new ConcreteSubscriber("Alex");
        Subscriber sub1 = new ConcreteSubscriber("Nadya");
        Subscriber sub2 = new ConcreteSubscriber("Masha");
        Subscriber sub3 = new ConcreteSubscriber("Katya");

        newspaper.addSubscriber(sub);
        newspaper.addSubscriber(sub1);

        magazine.addSubscriber(sub2);
        magazine.addSubscriber(sub3);

        newspaper.newNumber();
        System.out.println();
        magazine.newNumber();
}
}
