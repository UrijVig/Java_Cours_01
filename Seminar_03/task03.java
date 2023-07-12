package Seminar_03;
// Создать список типа ArrayList<String>.

// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;

public class task03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        String[] str = { "2", "235", "asgasg", "2345", "asdg", "234", "sdfgs", "sdfg", "sfg", "2", "asg", "25", "as",
                "569", "sdf" };
        for (int i = 0; i < str.length; i++) {
            list1.add(i, str[i]);
        }
        System.out.println(list1);
        RemoveList(list1);
        System.out.println(list1);
    }

    private static void RemoveList(ArrayList<String> data) {
        for (int i = data.size() - 1; i >= 0; i--) {
            if (TryInt(data.get(i)))
                data.remove(i);
        }
        return;
    }

    private static boolean TryInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
