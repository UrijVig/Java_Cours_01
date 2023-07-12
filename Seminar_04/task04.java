package Seminar_04;

// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().
public class task04 {

    static int[] myArray;
    static int top;

    public static void Stack(int size) {
        myArray = new int[size];
        top = -1;
    }

    public static boolean empty() {
        return top == -1;
    }

    public static int size() {
        return top + 1;
    }

    public static void push(int number) {
        myArray[++top] = number;
    }

    public static int peek() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст! ");
        }
        return myArray[top];
    }

    public static int pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст! ");
        }
        return myArray[top--];
    }

    public static void main(String[] args) {
        
    }
}
