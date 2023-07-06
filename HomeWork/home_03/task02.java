package HomeWork.home_03;
// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = RandomArray(35, -60, 60);
        System.out.println(myList);
        DeleteEven(myList);
        System.out.println(myList);
    }

    static ArrayList<Integer> RandomArray(int len, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            arrayList.add(i, random.nextInt(min, max));
        }
        return arrayList;
    }

    static void DeleteEven(ArrayList<Integer> data) {
        for (int i = data.size() - 1; i >= 0; i--) {
            if (data.get(i) % 2 == 0) {
                data.remove(i);
            }
        }
    }
}
