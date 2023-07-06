package HomeWork.home_01;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализовать простой калькулятор
public class task03 {
    static Logger logger = Logger.getLogger(task03.class.getName());

    public static void main(String[] args) {
        StartLoggerFile("LogFileArhive\\Home_01_Task_03_logfile.txt");
        logger.log(Level.INFO, "Начало работы в программе! ");
        Scanner iScanner = new Scanner(System.in);
        double number1;
        double number2;
        double result;
        char action;
        boolean flag = true;

        while (flag) {
            System.out.print("\033[H\033[J");
            number1 = InputNumber("Введите первое число:", iScanner);
            number2 = InputNumber("Введите второе число:", iScanner);
            action = Action(iScanner);
            result = Calk(number1, number2, action);
            logger.log(Level.INFO,
                    String.format("Результат операции: %.2f %c %.2f = %.2f \n", number1, action, number2, result));
            System.out.printf("\t%.2f %c %.2f = %.2f \n", number1, action, number2, result);
            System.out.println("Хотите продолжить работу? ");
            System.out.println("\t \"N\" - закончить работу.");
            action = iScanner.nextLine().charAt(0);
            if (action == 'N')
                flag = false;
            else
                logger.log(Level.INFO, "Повтор операции! ");
        }
        iScanner.close();
        logger.log(Level.INFO, "Завершение работы в программе! ");
    }

    static void StartLoggerFile(String path) {
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

    private static double InputNumber(String str, Scanner iScanner) {
        System.out.println(str);
        String input;
        while (true) {
            input = iScanner.nextLine();
            if (IsNumber(input)) {
                double number = Double.parseDouble(input);
                logger.log(Level.INFO, String.format("Было введено число %.2f", number));
                System.out.print("\033[H\033[J");
                return number;
            } else {
                logger.log(Level.WARNING, String.format("Были введены некорректные данные %s", input));
                System.out.print("\033[H\033[J");
                System.out.println("Введены некорректные данные, пожалуйста повторите ввод");
            }
        }
    }

    private static boolean IsNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static char Action(Scanner iScanner) {
        while (true) {

            System.out.println("Введите действие: ");
            System.out.println("\t  сложение: \"+\"");
            System.out.println("\t вычетание: \"-\"");
            System.out.println("\t умножение: \"*\"");
            System.out.println("\t   деление: \"/\"");
            char ch = iScanner.nextLine().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                logger.log(Level.INFO, String.format("Выбрана операция %c", ch));
                System.out.print("\033[H\033[J");
                return ch;
            } else {
                logger.log(Level.WARNING, String.format("Были введены некорректные данные %c", ch));
                System.out.print("\033[H\033[J");
                System.out.println("Введена неизвестная операция, пожалуйста, повторите выбор!");
            }
        }
    }

    private static double Calk(double num1, double num2, char act) {
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
}
