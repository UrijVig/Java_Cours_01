package HomeWork.home_06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:

    // 1 - ОЗУ
    // 2 - Объем ЖД
    // 3 - Операционная система
    // 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class task {
    public static void main(String[] args) {
        HashSet<Laptop> db = DataBase.createDataBase();
        // System.out.println(db);
        Scanner iScanner = new Scanner(System.in);
        createFilter(db, iScanner);

        iScanner.close();
    }

    private static void createFilter(HashSet<Laptop> db, Scanner iScanner){
        HashMap<Integer,String> parametrs = new HashMap<>();
        parametrs.put(1, "RAM");
        parametrs.put(2, "HDD");
        parametrs.put(3, "GPU memory");
        parametrs.put(4, "CPU frequency");
        parametrs.put(5, "number Of cores");
        System.out.println("Пожалуйста выберите параметры для фильтрации!");
        System.out.println("Для того, чтобы выбрать несколько параметров, введите их номера через пробел! ");
        for (Map.Entry<Integer,String> item : parametrs.entrySet()) {
            System.out.printf("%d : %s \n", item.getKey(), item.getValue());
            
        }
        String temp = iScanner.nextLine();
        String[] params = temp.split(" ");
        int[] parami = new int[params.length];
        for (int i = 0; i < parami.length; i++) {
            parami[i] = Integer.parseInt(params[i]);
        }
        System.out.println("Полный список: ");
        System.out.println(db);
        System.out.println("Укажите минимальное значение для каждого из выбранных параметров: ");
        double[] filtr = new double[parami.length];
        for (int i = 0; i < filtr.length; i++) {
            System.out.println(parametrs.get(parami[i]) + " :");
            filtr[i] = iScanner.nextDouble();
        }
        boolean flag;
        System.out.println("Ноутбуки соответствующие условиям: \n");
        for (Laptop d : db) {            
            flag = true;
            for (int i = 0; i < filtr.length; i++) {
                switch (parami[i]) {
                    case 1:
                        if ((int)filtr[i] > d.volumeRAM) flag = false;
                        break;
                    case 2:
                        if ((int)filtr[i] > d.volumeHDD) flag = false;
                        break;
                    case 3:
                        if ((int)filtr[i] > d.gpu.memory) flag = false;
                        break;
                    case 4:
                        if (filtr[i] > d.cpu.frequency) flag = false;
                        break;
                    case 5:
                        if ((int)filtr[i] > d.cpu.numberOfCores) flag = false;
                        break;                
                    default:
                        break;
                }
            }
            if(flag) System.out.println(d);
        }

    }
}
