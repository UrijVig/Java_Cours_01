package HomeWork.home_04;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// В калькулятор добавьте возможность отменить последнюю операцию.
public class task03 {
    static Logger logger = Logger.getLogger(task03.class.getName());

    public static void main(String[] args) {
        startLoggerFile("LogFileArhive\\Home_04_Task_03_logfile.txt");
        logger.log(Level.INFO, "Начало работы в программе! ");
        Scanner iScanner = new Scanner(System.in);
        double number1, number2, result;
        String temp;
        char action;
        boolean flag = true;
        Stack<String> stack = new Stack<>();
        while (flag) {
            System.out.print("\033[H\033[J");
            do {
                temp = inputData("Введите первое число:", iScanner);
            } while (!isNumber(temp));
            stack.push(temp);
            do {
                temp = inputData("Введите второе число: \n для отмены предыдущей операции введите \"back\"", iScanner);                
                if (temp.equals("back")) {
                    do {
                        temp = inputData("Введите первое число:", iScanner);
                    } while (!isNumber(temp));
                    stack.push(temp);
                    continue;
                }
            } while (!isNumber(temp));
            stack.push(temp);
            System.out.println("Введите действие: ");
            System.out.println("\t  сложение: \"+\"");
            System.out.println("\t вычетание: \"-\"");
            System.out.println("\t умножение: \"*\"");
            System.out.println("\t   деление: \"/\"");
            do {
                temp = inputData("Введите действие: \n Для отмены предыдущей операции введите \"back\"", iScanner);
                System.out.println("Для отмены предыдущей операции введите \"back\"");
                if (temp.equals("back")) {
                    do {
                        temp = inputData("Введите второе число: \n для отмены предыдущей операции введите \"back\"", iScanner);                        
                        if (temp.equals("back")) {
                            do {
                                temp = inputData("Введите первое число:", iScanner);
                            } while (!isNumber(temp));
                            stack.push(temp);
                            continue;
                        }
                    } while (!isNumber(temp));
                    stack.push(temp);
                    continue;
                }
            } while (!temp.equals("+") && !temp.equals("-") && !temp.equals("*") && !temp.equals("/"));
            action = stack.pop().charAt(0);
            number1 = Double.parseDouble(stack.pop());
            number2 = Double.parseDouble(stack.pop());
            result = calk(number1, number2, action);
            logger.log(Level.INFO,
                    String.format("Результат операции: %.2f %c %.2f = %.2f \n", number1, action, number2, result));
            System.out.print("\033[H\033[J");
            System.out.printf("\t%.2f %c %.2f = %.2f \n", number1, action, number2, result);
            System.out.println("Хотите продолжить работу? ");
            System.out.println("\t \"N\" - закончить работу.");
            action = iScanner.nextLine().charAt(0);
            if (action == 'N')
                flag = false;
            else
                logger.log(Level.INFO, "Повтор операции! ");
        }

    }

    private static String inputData(String str, Scanner iScanner) {
        System.out.println(str);
        return iScanner.nextLine();
    }

    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double calk(double num1, double num2, char act) {
        switch (act) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }

    static void startLoggerFile(String path) {
        try {
            FileHandler fh = new FileHandler(path);
            SimpleFormatter sFormater = new SimpleFormatter();
            logger.addHandler(fh);
            fh.setFormatter(sFormater);
            logger.log(Level.INFO, "Лог файл успешно создан! ");
        } catch (IOException e) {
            System.out.println("Fail!" + e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}
