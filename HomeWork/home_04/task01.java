package HomeWork.home_04;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;
public class task01 {
    public static void main(String[] args) {
        LinkedList<Integer> linList = new LinkedList<>();
        linList.add(458);
        linList.add(456);
        linList.add(23);
        linList.add(5);
        linList.add(7458);
        linList.add(3);
        linList.add(745836);
        linList.add(45);
        linList.add(78);
        linList.add(9);
        linList.add(53);
        linList.add(32);
        linList.add(12);
        linList.add(1);

        // randomList(25, 0, 15, linList);
        System.out.println(linList);        
        System.out.println(revertList(linList));
    }

    public static void randomList(int len, int min, int max, LinkedList<Integer> ll ){
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            ll.add(random.nextInt(min,max));
        }
    }

    public static LinkedList<Integer> revertList(LinkedList<Integer> ll ){
        LinkedList<Integer> linList = new LinkedList<>();
        for (int i = 0; i < ll.size(); ) {
            
            linList.add(i, ll.pop());
            
        }
        return linList;
    }
}
