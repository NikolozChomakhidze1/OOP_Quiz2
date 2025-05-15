package oop.q2;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(8, 7, 9, 9, 5, 9, 3, 9, 2, 5, 8, 7, 2);
        List<String> list2 = List.of(
                "jqt4W", "aaVZ", "b41zS", "OxoOQ", "r0lAh", "zEBlG",
                "9DO", "dFRGD", "tfZl", "F51o", "hbog", "ANEw",
                "7EZK", "LSWDa", "R1Y", "hztz", "yvvfN", "rAF"
        );

        List<String> list3 = new ArrayList<>();

        for (int n : list1) {
            int index = (2 * n - 1) % list2.size();
            list3.add(list2.get(index));
        }

        System.out.println("Generated list3:");
        for (String value : list3) {
            System.out.println(value);
        }
    }
}
