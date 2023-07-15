package Seminar_06;
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = randonArray(1000, 24, 0);
        // System.out.println(myArray);

        System.out.println(getHashSet(myArray));
        
    }

    private static ArrayList<Integer> randonArray(int len, int max, int min){
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr.add(random.nextInt(min,max));
        }
        return arr;
    }

    private static double getHashSet(ArrayList<Integer> myArray){
        HashSet<Integer> mySet = new HashSet<>(myArray);
        return (double)mySet.size() * 100 / myArray.size();
    }
}
