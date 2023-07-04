package HomeWork.home_01;

import java.util.Scanner;

// Реализовать простой калькулятор
public class task03 {
    public static void main(String[] args) {
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
            System.out.printf("\t%.2f %c %.2f = %.2f \n",number1, action, number2, result);
            System.out.println("Хотите продолжить работу? ");
            System.out.println("\t \"N\" - закончить работу.");
            action = iScanner.nextLine().charAt(0);
            if (action == 'N') flag = false;
        }
        iScanner.close();
    }
    
    static double InputNumber(String str, Scanner iScanner){        
        System.out.println(str);
        String input;
        while (true) {
            input = iScanner.nextLine();
            if (IsNumber(input)){
                double number = Double.parseDouble(input);
                System.out.print("\033[H\033[J");
                return number;
            } else{
                System.out.print("\033[H\033[J");
                System.out.println("Введены некорректные данные, пожалуйста повторите ввод");
            }
        }       
    }

    static boolean IsNumber(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static char Action(Scanner iScanner){        
        while (true) {
            
            System.out.println("Введите действие: ");
            System.out.println("\t  сложение: \"+\"");
            System.out.println("\t вычетание: \"-\"");
            System.out.println("\t умножение: \"*\"");
            System.out.println("\t   деление: \"/\"");
            char ch = iScanner.nextLine().charAt(0);
            if (ch =='+' || ch =='-' || ch =='*' || ch =='/') {  
                System.out.print("\033[H\033[J");              
                return ch;
            } else {
                System.out.print("\033[H\033[J");
                System.out.println("Введена неизвестная операция, пожалуйста, повторите выбор!");
            }
        }
    }

    static double Calk(double num1, double num2, char act){        
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
