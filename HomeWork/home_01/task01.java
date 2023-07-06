package HomeWork.home_01;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class task01 {

    public static void main(String[] args) {
        int number = 7;
        System.out.printf("Треугольное число числа %d это %d, его факториал равен %d", number, Triangul(number),
                Factorial(number));
    }

    static int Triangul(int num) {
        int summ = 0;
        for (int i = 1; i <= num; i++) {
            summ += i;
        }
        return summ;
    }

    static int Factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

}
