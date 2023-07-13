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
        String msg1 = "Введите первое число: ";
        String msg2 = "Введите второе число: ";
        String msg3 = "\nДля отмены последней операции введите \"back\"";
        String temp;
        startLoggerFile("LogFileArhive\\Home_04_Task_03_logfile.txt");
        logger.log(Level.INFO, "Начало работы в программе! ");
        Scanner iScanner = new Scanner(System.in);
        double number1, number2, result;
        char action;
        boolean flag = true;
        Stack<String> inData = new Stack<>();
        while (flag) {
            System.out.print("\033[H\033[J");
            while (inData.size() != 3) {
                switch (inData.size()) {
                    case 0:
                        inData.add(inputNumber(msg1, iScanner));
                        break;
                    case 1:
                        temp = inputNumber(msg2 + msg3, iScanner);
                        if (temp.equals("back")) {
                            inData.pop();
                        } else {
                            inData.add(temp);
                        }
                        break;
                    case 2:
                        temp = action(msg3, iScanner);
                        if (temp.equals("back")) {
                            inData.pop();
                        } else {
                            inData.add(temp);
                        }
                        break;
                }
                if (inData.size() == 3) {
                    System.out.println(msg3);
                    temp = iScanner.nextLine();
                    if (temp.equals("back")) {
                        inData.pop();
                    }
                }
            }
            action = inData.pop().charAt(0);
            number2 = Integer.parseInt(inData.pop());
            number1 = Integer.parseInt(inData.pop());
            result = Calk(number1, number2, action);
            logger.log(Level.INFO,
                    String.format("Результат операции: %.2f %c %.2f = %.2f \n", number1, action, number2, result));
            System.out.print("\033[H\033[J");
            System.out.printf("\t%.2f %c %.2f = %.2f \n", number1, action, number2, result);
            System.out.println("Хотите продолжить работу? ");
            System.out.println("\t\"Exit\" - закончить работу.");
            temp = iScanner.nextLine();
            if (temp.equals("Exit"))
                flag = false;
            else
                logger.log(Level.INFO, "Повтор операции! ");
        }
        iScanner.close();
        logger.log(Level.INFO, "Завершение работы в программе! ");
    }

    private static String inputNumber(String str, Scanner iScanner) {
        System.out.println(str);
        String input;
        while (true) {
            input = iScanner.nextLine();
            if (isNumber(input)) {
                logger.log(Level.INFO, String.format("Было введено число %s", input));
                // System.out.print("\033[H\033[J");
                return input;
            } else if (input.equals("back")) {
                logger.log(Level.INFO, "Отмена последней операции! ");
                return input;
            } else {
                logger.log(Level.WARNING, String.format("Были введены некорректные данные %s", input));
                // System.out.print("\033[H\033[J");
                System.out.println("Введены некорректные данные, пожалуйста повторите ввод");
            }
        }
    }

    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String action(String str, Scanner iScanner) {
        System.out.println(str);
        while (true) {
            System.out.println("Введите действие: ");
            System.out.println("\t  сложение: \"+\"");
            System.out.println("\t вычетание: \"-\"");
            System.out.println("\t умножение: \"*\"");
            System.out.println("\t   деление: \"/\"");
            String ch = iScanner.nextLine();
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                logger.log(Level.INFO, String.format("Выбрана операция %s", ch));
                // System.out.print("\033[H\033[J");
                return ch;
            } else if (ch.equals("back")) {
                logger.log(Level.INFO, "Отмена последней операции! ");
                return ch;
            } else {
                logger.log(Level.WARNING, String.format("Были введены некорректные данные %s", ch));
                // System.out.print("\033[H\033[J");
                System.out.println("Введена неизвестная операция, пожалуйста, повторите выбор!");
            }
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
