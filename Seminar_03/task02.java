package Seminar_03;
// Заполнить список названиями планет Солнечной

// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.

import java.util.ArrayList;
import java.util.Random;

// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

public class task02 {
    public static void main(String[] args) {
        String[] planet = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        ArrayList<String> planList = DataPlanet(planet, 6);
        System.out.println(planList);
        PrintSortList(planList);
        RemoveList(planList);
    }

    static ArrayList<String> DataPlanet(String[] data, int len) {
        Random random = new Random();
        ArrayList<String> planetList = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            planetList.add(i, data[random.nextInt(0, 8)]);
        }
        return planetList;
    }

    static void PrintSortList(ArrayList<String> data) {
        int count = 1;
        data.sort(null);
        System.out.println(data);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i).equals(data.get(i - 1))) {
                count++;
            } else {
                System.out.printf("%s встречается %d раз \n", data.get(i - 1), count);
                count = 1;
            }
        }
        System.out.printf("%s встречается %d раз \n", data.get(data.size() - 1), count);
        return;
    }

    static void RemoveList(ArrayList<String> data) {
        data.sort(null);
        System.out.println(data);
        for (int i = data.size() - 1; i >= 1; i--) {
            if (data.get(i).equals(data.get(i - 1))) {
                data.remove(i);
            }
        }
        System.out.println(data);
        return;
    }
}
