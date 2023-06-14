package ListHw;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] line = str.split(" ");
        HashSet<String> hashSet = new HashSet<String>(List.of(line));
        for (String e : hashSet) {
            System.out.println(e);
        }
    }
}
