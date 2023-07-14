package Seminar05;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь
public class task02 {
    public static void main(String[] args) {
        // brackets();
        // System.out.println(bracketsCount("{a+]}{(d*3)}"));
        // String str = "a+(d*3)";
        // String str = "[a+(1*3)";
        // String str = "[6+(3*3)]";
        // String str = "{a}[+]{(d*3)}";
        // String str = "<{a}+{(d*3)}>";
        String str = "{a+]}{(d*3)}";

        System.out.println(getBrackets(str));

    }

    private static boolean getBrackets(String str1) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('>', '<');
        brackets.put('}', '{');
        brackets.put(']', '[');
        for (Character ch : str1.toCharArray()) {
            if (brackets.containsValue(ch)) {
                stack.push(ch);
            } else if (brackets.containsKey(ch)) {
                if (stack.isEmpty() || brackets.get(ch) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // public static Map<Character, Integer> brackets = new HashMap<>();
    // private static void brackets(){
    // brackets.put('(', 0);
    // brackets.put(')', 0);
    // brackets.put('<', 0);
    // brackets.put('>', 0);
    // brackets.put('{', 0);
    // brackets.put('}', 0);
    // brackets.put('[', 0);
    // brackets.put(']', 0);
    // }

    // private static boolean bracketsCount(String data){
    // char ch;
    // for (int i = 0; i < data.length(); i++) {
    // ch = data.charAt(i);
    // if(brackets.containsKey(ch)){
    // brackets.put(ch, brackets.get(ch) + 1);
    // }
    // }
    // if (brackets.get('(') != brackets.get(')') || brackets.get('<') !=
    // brackets.get('>') || brackets.get('{') != brackets.get('}') ||
    // brackets.get('[') != brackets.get(']')){
    // return false;
    // }
    // else return true;
    // }

}
