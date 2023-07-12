package Seminar_04;

import java.util.Scanner;
import java.util.Stack;

// Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
public class task02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Stack<String> data = new Stack<>();
        String input;
        boolean flag = true;
        while (flag) {
            input = getInpuString(iScanner);
            switch (input) {
                case "exit":
                    flag = false;
                    break;
                case "revert":
                    revertStack(data);
                    break;
                case "print":
                    printStack(data);
                    break;
                default:
                    addStack(data, input);
                    break;
            }
        }
        iScanner.close();
    }

    private static String getInpuString(Scanner iScanner) {

        System.out.println("Введите строку.");
        System.out.println("Для вывода списка введите print! ");
        System.out.println("Для завершения программы введите exit!");
        String inpuString = iScanner.nextLine();
        System.out.print("\033[H\033[J");

        return inpuString;
    }

    private static void addStack(Stack<String> stack, String str) {
        stack.push(str);
    }

    private static void printStack(Stack<String> stack) {
        int count = stack.size() - 1;
        while (count >= 0) {
            System.out.println(stack.get(count));
            count--;
        }

    }

    private static void revertStack(Stack<String> stack) {
        stack.pop();
    }
}
