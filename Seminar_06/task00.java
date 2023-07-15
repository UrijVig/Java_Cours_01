package Seminar_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
// 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
public class task00 {
    public static void main(String[] args) {
        HashSet<Integer> set = getSet(); 
        for (var num : set) {
            System.out.print(num + ", ");
        }
        System.out.println();
        LinkedHashSet<Integer> lSet = getLinSet();
        for (var num : lSet) {
            System.out.print(num + ", ");
        }
        System.out.println();
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(11, 225, 3, 72, 4, 15, 26, 3));
        for (var num : treeSet) {
            System.out.print(num + ", ");
        }
    }

    private static LinkedHashSet<Integer> getLinSet() {
        LinkedHashSet<Integer> linSet = new LinkedHashSet<>();
        linSet.add(1);
        linSet.add(62);
        linSet.add(334);
        linSet.add(22);
        linSet.add(84);
        linSet.add(15);
        return linSet;
    }

    private static HashSet<Integer> getSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(190);
        set.add(256);
        set.add(35);
        set.add(2);
        set.add(434);
        set.add(45);
        set.add(6);
        set.add(36);
        return set;
    }

}