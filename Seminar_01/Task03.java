package Seminar_01;

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
public class Task03 {

    public static void main(String[] args) {
        int[] myArray = { 3, 2, 4, 3, 5, 4, 3, 2, 3, 6 };
        myArray = NewArray(myArray, 3);
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    public static int[] NewArray(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length - count; i++) {
            if (arr[i] == value) {
                count++;
                for (int j = i; j < arr.length - count; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - count] = value;
            }
        }
        return arr;
    }

}