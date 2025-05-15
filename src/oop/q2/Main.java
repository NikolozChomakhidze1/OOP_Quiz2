package oop.q2;

import java.util.ArrayList;
import java.util.List;
/**
 * This program performs a transformation based on two predefined lists:
 * - list1: a List of integers
 * - list2: a List of strings
 * 
 * The program generates a third list, list3, by applying a simple pattern:
 * For each integer value v in list1, it calculates an index as:
 *      index = v + (v - 1)
 * and uses this index to retrieve an element from list2 to place into list3.
 * 
 * The program handles index-out-of-bounds situations gracefully.
 * It is designed to work with any valid lists of integers and strings, not just the predefined values.
 * 
 * Package: oop.q2
 * 
 * Usage:
 *  Run the Main class, which prints the generated list3 to the console.
 */



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
