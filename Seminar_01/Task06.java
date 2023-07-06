package Seminar_01;
// Реализовать функцию возведения числа а в степень b. a, b из Z.

// Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

public class Task06 {
    public static void main(String[] args) {
        double a = 3;
        double b = 2;

        double result = Math.pow(a, b);
        System.out.println(result);
        result = MathPow(a, b);
        System.out.println(result);
    }

    static double MathPow(double a, double b) {
        double result = 1;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        } else if (b < 0) {
            for (int i = 0; i < -b; i++) {
                result /= a;
            }
            return result;
        } else
            return result;
    }
}
