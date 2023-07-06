package Seminar_02;

import java.util.Arrays;

// Напишите метод, который сжимает строку.
// Пример.
//  вход: aaaabbbcdd
//  результат: a4b3c1d2
public class task02 {
    public static void main(String[] args) {
        String string = "aaaabbbcdda";
        System.out.println(CompressString(string));
    }

    private static String CompressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = String.valueOf(chars);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) == str.charAt(i))
                count++;
            else {
                sb.append(String.format("%s%d", str.charAt(i), count));
                count = 1;
            }
        }
        sb.append(String.format("%s%d", str.charAt(str.length() - 1), count));
        return sb.toString();
    }
}
