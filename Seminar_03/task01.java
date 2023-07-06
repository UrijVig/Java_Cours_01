package Seminar_03;
// Заполнить список десятью случайными числами.

// Отсортировать список методом sort() и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomArray(10, -30, 30);

        System.out.println(list);
        System.out.println();
        list.sort(null);
        System.out.println(list);

    }

    static ArrayList<Integer> RandomArray(int len, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            arrayList.add(i, random.nextInt(min, max));
        }
        return arrayList;
    }
}
