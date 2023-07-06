package Seminar_01;

// Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".
public class Task04 {

    public static void main(String[] args) {
        String[] strArray = { "flower", "flow", "floight" };
        System.out.println(Pref(strArray));
    }

    static String Pref(String[] strArray) {
        String temp = "";
        Character ch;
        for (int i = 0; i < strArray[0].length(); i++) {
            ch = strArray[0].charAt(i);
            for (String string : strArray) {
                if (ch != string.charAt(i)) {
                    return temp;
                }
            }
            temp += ch;
        }
        return temp;
    }
}
