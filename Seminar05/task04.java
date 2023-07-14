package Seminar05;

import java.util.HashMap;
import java.util.Map;

// Написать метод, который переведёт данное целое число в римский формат.
public class task04 {
    public static void main(String[] args) {
        
    }

    private static Map<Character,Integer> getArabicToRoman() {
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
}
