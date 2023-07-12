package HomeWork.home_03;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class task03 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = RandomArray(30, -10, 10);
        System.out.println(myList);
        System.out.println(FindeMax(myList));
        System.out.println(FindeMin(myList));
        System.out.println(FindeMidle(myList));
    }

    static ArrayList<Integer> RandomArray(int len, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            arrayList.add(i, random.nextInt(min, max));
        }
        return arrayList;
    }

    static int FindeMax(ArrayList<Integer> data) {
        int max = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) > max)
                max = data.get(i);
        }
        return max;
    }

    static int FindeMin(ArrayList<Integer> data) {
        int min = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) < min)
                min = data.get(i);
        }
        return min;
    }

    static double FindeMidle(ArrayList<Integer> data) {
        int midle = 0;
        for (int i = 1; i < data.size(); i++) {
            midle += data.get(i);
        }
        return midle / data.size();
    }

}
