package ListHw;

import java.util.*;

public class Keep {


    public static Object Cont() {
        Animals got = new Animals("got");
        Animals wolf = new Animals("wolf");
        Animals bear = new Animals("bear");
        Animals pig = new Animals("pig");
        ArrayList<Object> animals = new ArrayList<Object>();
        animals.add(got);
        animals.add(wolf);
        animals.add(pig);
        animals.add(bear);
        return animals;
    }

    public static Object deleteAnimal() {
        LinkedList<Object> deleteAnimal = new LinkedList<Object>(Collections.singleton(Cont()));
        deleteAnimal.removeFirst();
        return deleteAnimal;
    }

    public static Object addAnimal() {
        LinkedList<Object> addAnimal = new LinkedList<Object>(Collections.singleton(Cont()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название животногокоторого хотите добавить: ");
        String an = scanner.nextLine();
        addAnimal.addLast(new Animals(an));
        return addAnimal;
    }
}
