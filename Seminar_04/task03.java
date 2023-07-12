package Seminar_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди. 
public class task03 {
    public static void main(String[] args) {
        int[] myArray = randomArray(30, -20, 30);
        for (int i : myArray) {
            System.out.print(i + ", ");
        }
        System.out.println();
        printStack(myArray);
        System.out.println();
        printQueue(myArray);
    }

    private static int[] randomArray(int len, int min, int max) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max);
        }
        return arr;
    }

    public static void printStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void printQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }
    }
}
