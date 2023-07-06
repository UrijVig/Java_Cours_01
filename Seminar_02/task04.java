package Seminar_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
public class task04 {
    public static void main(String[] args) {
        String data = "TEST";
        Writhe(Build(data));
    }

    static String Build(String str) {
        return Build(str, 100);
    }

    static String Build(String str, int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(String.format("%d : %s \n", i, str));
        }
        return sb.toString();
    }

    static void Writhe(String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Test.txt"))) {
            writer.write(str);
            System.out.println("Файл был успешно обновлён! ");
        } catch (IOException e) {
            System.out.println("Что-то пошлло не так! " + e.getMessage());
        }
    }
}
