package Seminar_04;

import java.util.LinkedList;
import java.util.Scanner;

// Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.
public class task01 {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку в формате \"text~num\" ");
        System.out.println("Для завершения программы введите \"exit\" ");
        System.out.println("Для Вывода строки на экран введите команду \"print~num\" ");
        getInputString(iScanner, data);
        System.out.println(data);
        iScanner.close();
    }

    private static void getInputString(Scanner iScanner, LinkedList<String> linlist) {
        String indata = "";
        while (true) {
            indata = iScanner.nextLine();
            String[] id = indata.split("~");
            if (indata.equals("exit")) {
                return;
            }
            int position = Integer.parseInt(id[1]);
            if (!id[0].equals("print")) {
                if (position <= linlist.size()) {
                    linlist.add(position, id[0]);
                } else {
                    System.out.println("Позиция не соответствует размеру списка! повторите ввод! ");
                }
            } else
                System.out.println(linlist.remove(position));
        }

    }

}
