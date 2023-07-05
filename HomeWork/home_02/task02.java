package HomeWork.home_02;

import java.util.Random;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class task02 {
    static Logger logger = Logger.getLogger(task02.class.getName());
    public static void main(String[] args) {
        StartLoggerFile("LogFileArhive\\Home_02_Task_02_logfile.txt");
        int[] myArray = RandomArray(20, -15, 15);
        for (int item : myArray) {
            System.out.print(item + ", ");
        }
        System.out.println("\n");
        Sort(myArray);
        for (int item : myArray) {
            System.out.print(item + ", ");
        }
    }

    static int[] RandomArray(int len, int min, int max){
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max);
        }
        return arr;
    }

    static void StartLoggerFile(String path){
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

    static void Sort(int [] arr){
        int temp;
        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j + 1] = temp;
                    logger.log(Level.INFO, String.format("Замена местами %d и %d ", arr[j], arr[j + 1]));
                }
                logger.log(Level.INFO, String.format("%d и %d не нуждаются в перестановке! ", arr[j], arr[j + 1]));
            }
            logger.log(Level.INFO, String.format("Элемент %d поставлен на своё место согласно размеру! ", arr.length - i));
        }
        return;
    }
}
