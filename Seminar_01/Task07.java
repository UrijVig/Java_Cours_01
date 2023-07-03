package Seminar_01;
// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть
// две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
// Написать программу, которая выдаёт набор команд, позволяющий число a
// превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 1, d = 3
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: “”. 

public class Task07 {
    public static void main(String[] args) {
        int a = -15; int b = -15; int c = -3; int d = -6;
        String str = Worker(a,b,c,d);
        System.out.println(str);
    }
    static String Worker(int a, int b, int c, int d){
        String result = "";
        if (a == b) return "Числа итак равны!";
        while (true) {
            if (a < b) {
                if (a * c > b || a * c < a && a + d > b || a + d < a){
                    result = "\"\"";
                    return result;
                } else if ((b - a * c > b - a + d) || a * c > b){
                    a += d;
                    result += "k1, ";
                } else if ((b - a * c < b - a + d) || a + d > b){
                    a *= c;
                    result += "k2, ";
                }
            } else if (a > b) {
                if (a * c < b || a * c > a && a + d < b  || a + d > a){
                    result = "\"\"";
                    return result;
                } else if ((b + a * c > b + a + d) || a * c < b ){
                    a += d;
                    result += "k1, ";
                } else if ((b - a * c < b - a + d) || a + d < b ){
                    a *= c;
                    result += "k2, ";
                }
            } else return result;
        }        
    }

    
}
