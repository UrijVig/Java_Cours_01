package Seminar05;
// Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;
import java.util.Map;

public class task00 {
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>();
        employees.put("123456", "Иванов");
        employees.put("321456", "Васильев");
        employees.put("234561", "Петров");
        employees.put("234432", "Иванов");
        employees.put("654321", "Петрова");
        employees.put("345678", "Иванов");
        String name = "Иванов";
        for (Map.Entry<String,String> entry : employees.entrySet()) {
            if (entry.getValue().equals(name)){
                System.out.println("Номер паспорта: " + entry.getKey() + " Фамилия: " + entry.getValue());
            }
        }
    }
}
