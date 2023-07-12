package Seminar_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Реализовать алгоритм перевода из инфиксной записи в постфиксную для
// арифметического выражения.
// http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181
// Вычислить запись если это возможно.
public class task05 {
    public static void main(String[] args) {
        String data = "5 * 6 + ( 2 - 9 ) ";
        System.out.println(data);
        String prefix = infixInPrefix(data);
        System.out.println(prefix);
        System.out.println(calculationString(prefix));

    }

    private static Double calculationString(String data) {
        Stack<Double> stack = new Stack<>();
        String[] arrOfData = data.split(" ");
        double num1, num2;
        for (String string : arrOfData) {
            if (isNumber(string)) {
                stack.push(Double.parseDouble(string));
            } else {
                num2 = stack.pop();
                num1 = stack.pop();
                switch (string) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    default:
                        break;
                }

            }
        }
        return stack.pop();
    }

    private static String infixInPrefix(String data) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String[] arrOfData = data.split(" ");
        String output = "";
        for (String string : arrOfData) {
            if (isNumber(string)) {
                queue.add(string);
            } else if (string.equals("(")) {
                stack.push(string);
            } else if (string.equals(")")) {
                while (!stack.peek().equals("(")) {
                    queue.add(stack.pop());
                }
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    stack.push(string);
                } else if (priority(string) > priority(stack.peek())) {
                    stack.push(string);
                } else {
                    while ((!stack.isEmpty() && priority(string) <= priority(stack.peek()))
                            || (!stack.isEmpty() && stack.peek().equals("("))) {
                        queue.add(stack.pop());
                    }
                    stack.push(string);
                }

            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (String string : queue) {
            output += string + " ";
        }
        return output;
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static int priority(String ch) {
        try {
            switch (ch) {
                case "+":
                    return 0;
                case "-":
                    return 0;
                case "*":
                    return 1;
                case "/":
                    return 1;
                default:
                    return -1;
            }
        } catch (Exception e) {
            return -1;
        }

    }
}
