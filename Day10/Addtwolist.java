package Day10;

import java.util.*;

public class Addtwolist {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Dinesh", "Prince", "Aryan");
        List<String> list2 = Arrays.asList("Aryan", "Anand", "Eklove");

        List<String> list3 = new ArrayList<>();

        for (String s : list1) {
            if (!list3.contains(s)) {
                list3.add(s);
            }
        }

        for (String s : list2) {
            if (!list3.contains(s)) {
                list3.add(s);
            }
        }

        System.out.println("Merged List: " + list3);
    }
}