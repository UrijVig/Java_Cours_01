package HomeWork.home_03;

// Реализовать алгоритм сортировки слиянием
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        List<Integer> myList = RandomArray(35, -60, 60);
        System.out.println(myList);

        MergerSort(myList);
        System.out.println(myList);
    }

    static ArrayList<Integer> RandomArray(int len, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            arrayList.add(i, random.nextInt(min, max));
        }
        return arrayList;
    }

    static void MergerSort(List<Integer> list2) {
        if (list2.size() > 1) {
            int mid = list2.size() / 2;
            List<Integer> right = new ArrayList<>();
            right.addAll(list2.subList(0, mid));
            List<Integer> left = new ArrayList<>();
            left.addAll(list2.subList(mid, list2.size()));
            MergerSort(left);
            MergerSort(right);
            int i = 0;
            int k = 0;
            int j = 0;
            while (i < left.size() && j < right.size()) {
                if (left.get(i) < right.get(j)) {
                    list2.set(k, left.get(i));
                    i++;
                } else {

                    list2.set(k, right.get(j));
                    j++;
                }
                k++;
            }
            while (i < left.size()) {

                list2.set(k, left.get(i));
                i++;
                k++;
            }
            while (j < right.size()) {

                list2.set(k, right.get(j));
                j++;
                k++;
            }
        }

    }

}
