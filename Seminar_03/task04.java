package Seminar_03;
// Каталог товаров книжного магазина сохранен в виде двумерного

// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        List<ArrayList<String>> dataBase = new ArrayList<ArrayList<String>>();
        InputData(dataBase);
        System.out.println(dataBase);
    }

    static void InputData(List<ArrayList<String>> dataBase) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество жанров: ");
        int number = Integer.parseInt(iScanner.nextLine());
        int colums;
        String str;
        String[][] data = new String[number][];
        for (int i = 0; i < number; i++) {
            System.out.println("Введите название жанра: ");
            str = iScanner.nextLine();
            System.out.println("Введите количество авторов: ");
            colums = Integer.parseInt(iScanner.nextLine());
            data[i] = new String[colums + 1];
            data[i][0] = str;
            for (int j = 1; j < colums + 1; j++) {
                System.out.println("Введите фамилию автора");
                data[i][j] = iScanner.nextLine();
            }
            dataBase.add(StringToList(data[i]));
        }
        System.out.println(dataBase);
        iScanner.close();
        return;
    }

    static ArrayList<String> StringToList(String[] str) {
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, str);
        return strList;
    }
}
