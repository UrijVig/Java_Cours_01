package HomeWork.home_05;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре 
// будут повторяющиеся имена с разными телефонами, их необходимо 
// считать, как одного человека с разными телефонами. Вывод должен 
// быть отсортирован по убыванию числа телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PhoneBook {

    static Map<String, LinkedList<Integer>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, int phone) {
        if (!phoneBook.containsKey(name)) {
            LinkedList<Integer> phoneList = new LinkedList<>();
            phoneList.add(phone);
            phoneBook.put(name, phoneList);
        } else {
            phoneBook.get(name).add(phone);
            phoneBook.put(name, phoneBook.get(name));
        }
    }

    public void print() {
        ArrayList<String> tempList = new ArrayList<>();
        String temp;
        for (Map.Entry<String, LinkedList<Integer>> item : phoneBook.entrySet()) {
            temp = String.format("%d%s", item.getValue().size(), item.getKey());
            tempList.add(temp);
        }
        Integer chi, chj;
        for (int i = 0; i < tempList.size(); i++) {
            for (int j = i + 1; j < tempList.size(); j++) {
                chi = Integer.parseInt(String.valueOf(tempList.get(i).charAt(0)));
                chj = Integer.parseInt(String.valueOf(tempList.get(j).charAt(0)));
                if (chi > chj) {
                    temp = tempList.remove(j);
                    tempList.add(i, temp);
                }
            }
        }
        for (int i = tempList.size() - 1; i >= 0; i--) {
            temp = tempList.get(i).substring(1);
            System.out.println("Name: " + temp);
            System.out.println("Phone: " + phoneBook.get(temp));
        }
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Ivanov", 785469123);
        pb.add("Petrov", 254145365);
        pb.add("Pavlov", 548695325);
        pb.add("Ivanov", 584758623);
        pb.add("Sergeev", 986256325);
        pb.add("Ivanov", 213658974);
        pb.add("Ivanov", 985674123);
        pb.add("Pavlov", 145632897);
        pb.add("Gauda", 854796321);
        pb.add("Petrov", 856923147);
        pb.add("Stail", 256983147);
        pb.add("Stain", 123456789);
        pb.add("Petrov", 856932147);
        pb.add("Ivanov", 745896321);

        pb.print();
    }
}
