package HomeWork.home_01;
//  (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
public class task04 {
    public static void main(String[] args) {
        String input = "2? + ?5 = 69";
        System.out.println(ResultCalc(input));
    }

    static String ResultCalc(String str){
        String[] data;
        int result, num1, num2;
        int idx1 = str.indexOf('?');
        int idx2 = str.lastIndexOf('?');
        char ch;
        char[] chars;
        for (int i = 0; i < 10; i++) {
            ch = Character.forDigit(i, 10);
            chars = str.toCharArray();
            chars[idx1] = ch;
            chars[idx2] = ch;
            str  = String.valueOf(chars);
            data = str.split(" ");
            num1 = Integer.parseInt(data[0]);
            num2 = Integer.parseInt(data[2]);
            result = Integer.parseInt(data[4]);
            if (num1 + num2 == result) return str;            
        }
        return "Решения нет!";
    }
}
