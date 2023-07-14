package Seminar_05;
// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022

import java.util.HashMap;
import java.util.Map;

public class task03 {
    public static void main(String[] args) {

        System.out.println(arabicDigit("MMXXII"));

    }

    private static Map<Character,Integer> getRomanToArabic() {
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);        
        return roman;
    }

    private static Integer arabicDigit(String data){
        int result = 0;
        Map<Character,Integer> roman = getRomanToArabic();
        for (Character ch : data.toCharArray()) {
            result += roman.get(ch);
        }
        return result;
    }
}
