package Seminar_02;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).
public class task03 {
    public static void main(String[] args) {
        String data = "123443621";
        System.out.println(Polindrom(data));
    }

    static boolean Polindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
}
