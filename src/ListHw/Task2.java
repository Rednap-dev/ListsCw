package ListHw;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список животных:");
        System.out.println(Keep.Cont());
        System.out.println("выберите действие: 1-Добавить животное 2- Удалить");
        int choose = scanner.nextInt();
        if (choose == 1) {
            System.out.println(Keep.addAnimal());
        } else if (choose == 2) {

            System.out.println(Keep.deleteAnimal());
        } else {
            System.exit(0);
        }
    }
}

class Animals {
    String name;

    Animals(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal name - " + name;
    }
}

