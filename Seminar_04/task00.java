package Seminar_04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.
public class task00 {
    public static void main(String[] args) {

        int len = 100000;

        long allast = getArralistAddLastLong(len);
        long lllast = getLinkedlisttAddLastLong(len);

        System.out.println("Add end " + allast);
        System.out.println("Add end " + lllast);

        long alfirst = getArralisttAddFirstLong(len);
        long llfirst = getLinkedlistAddFirstLong(len);

        System.out.println("Add start " + alfirst);
        System.out.println("Add start " + llfirst);

    }

    private static long getArralistAddLastLong(int len) {
        List<Integer> Alis = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            Alis.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedlisttAddLastLong(int len) {
        List<Integer> Llis = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            Llis.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getArralisttAddFirstLong(int len) {
        List<Integer> Alis = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            Alis.add(0, i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedlistAddFirstLong(int len) {
        List<Integer> Llis = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            Llis.add(0, i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }
}