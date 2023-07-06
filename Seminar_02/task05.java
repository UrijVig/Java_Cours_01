package Seminar_02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.
public class task05 {
    static Logger logger = Logger.getLogger(task05.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("LogFileArhive\\log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.log(Level.INFO, "Успешное обновление файла логирования! \n");
        } catch (Exception e) {
            System.out.println("Ошибка создания файла! " + e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        }

        String fileName = ".";
        String[] allFiles = GetList(fileName);
        WriteFile(allFiles);
    }

    static String[] GetList(String fileName) {
        File file = new File(fileName);
        String[] strPath = file.list();
        return strPath;
    }

    static void WriteFile(String[] data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("LogFileArhive\\Directori.txt"))) {
            for (String string : data) {
                writer.write(string + "\n");
            }
            System.out.println("Файл был успешно создан! ");
            logger.log(Level.INFO, "Успешное обновление файла Directori.txt! \n");
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}
