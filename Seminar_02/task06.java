package Seminar_02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Напишите метод, который определит тип (расширение) файлов из
// текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg
public class task06 {
    public static void main(String[] args) {
        String fileName = ".";
        String[] allFiles = GetList(fileName);
        WriteFile(allFiles);
    }

    static String[] GetList(String fileName) {
        File file = new File(".");
        String[] strPath = file.list();
        return strPath;
    }

    static void WriteFile(String[] data) {
        String str = "Расширение файла ";
        int idx;
        String result;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("extension.txt"))) {
            for (String string : data) {
                try {
                    idx = string.lastIndexOf('.');
                    result = String.format("%s %s: %s", str, string.substring(0, idx), string.substring(idx + 1));
                    writer.write(result + '\n');
                } catch (Exception e) {
                    writer.write(String.format("У папки %s нет расширения", string) + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
