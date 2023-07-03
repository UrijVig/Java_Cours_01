package Seminar_01;

// Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива
// такой, что сумма элементов с индексами < i равна сумме
// элементов с индексами > i. 

public class Task08 {
    public static void main(String[] args) {
        int[] myArray = {1,7,8,2,5,1};
        
        System.out.println(Index(myArray));
    }

    static int Index(int[] arr){
        int sumJ;
        int sumK;
        for (int i = 0; i < arr.length; i++) {
            sumJ = 0;
            sumK = 0;
            for (int j = 0; j < i; j++) {
                sumJ += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                sumK += arr[k];
            }
            if (sumJ == sumK) return i;
        }
        return -1;        
    }
}
