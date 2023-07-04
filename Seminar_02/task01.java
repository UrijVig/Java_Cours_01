package Seminar_02;
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
public class task01 {
    public static void main(String[] args) {
        int number = 16;
        char c1 = 't';
        char c2 = 's';
        System.out.println(Build(number, c1, c2));
    }

    static String Build(int num, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num/2; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        return sb.toString();
    }
}
