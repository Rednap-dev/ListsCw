import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<>(); // быстро отдает элемент, может хранить дубликаты, хранят элемнты в порядке добавления
        for (int i = 0; i < 10; i++) {
            list.add("hi"+ i);
        }
        boolean f = list.remove("hi0");// удаяет первый повторяющийся элемент коллекции
        list.set(1,"new_Value");// заменяет по индексу на новое значение
        String[] resultList = list.toArray(list.toArray(new String[list.size()])); // коллекцию в массив
        System.out.println(list);
        System.out.println(f);*/

//        --------------------------------------
/*        ArrayList<String> list = new ArrayList<>();
        list.add("Belarus");
        list.add("Russia");
        list.add("Poland");
        System.out.println(list);
        list.set(1,"Brasil");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("Poland");
        System.out.println(list);
        System.out.println(list.indexOf("Belarus"));
        System.out.println(list.contains("Belarus"));
        ArrayList<String> list1 = new ArrayList<>(list);
//        ArrayList<String> list2 = (ArrayList<String>) Arrays.asList("1","2");
        System.out.println(list1);*/
//        ---------------------------------------
     /*   ArrayList<String> list = new ArrayList<>();
        list.add("Belarus");
        LinkedList<String> list2 = new LinkedList<>(list); //ссылается на следующий и предыдущий
        list2.addFirst("Poland");
        list2.addFirst("Brasil");
        list2.addLast("Argentina");
        list2.addLast("Russia");
        System.out.println(list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2);
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());*/
//        ------------------------------------------------
        HashSet<Person> hashSet = new HashSet<>();// основан на hesh таблицах - быстрый поиск элементов/хранит уникальные элементы/хаотично все добавляет
        //TreeSet<Integer> сортирует под капотом цифры от 0+ буквы по алфавиту
        //LinkedHashSet<Integer> сохраняет последовательность добавления
        Person tom = new Person("Tom");
        Person dan = new Person("Dan");
        Person mark = new Person("Mark");
        hashSet.add(tom);
        hashSet.add(dan);
        hashSet.add(mark);
        for (Person n : hashSet) {
            System.out.println(n.toString());
        }
        System.out.println("--------------");
        hashSet.remove(tom);
        hashSet.remove(mark);
        for (Person n : hashSet) {
            System.out.println(n.toString());
        }
    }
}
