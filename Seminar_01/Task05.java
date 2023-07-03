package Seminar_01;
// Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.

public class Task05 {
    public static void main(String[] args) {
        String data = "Добро пожаловать на курс по Java";
        data = Revers(data);
        System.out.println(data);
    }

    static String Revers(String str){
        String[] strArray = str.split(" ");
        String temp;
        for (int i = 0; i < strArray.length / 2; i++) {
            temp = strArray[i];
            strArray[i] = strArray[strArray.length - 1 - i];
            strArray[strArray.length - 1 - i] = temp;
        }
        str = "";
        for (String string : strArray) {
            str += (string + " ");
        }
        return str;
    }
}
