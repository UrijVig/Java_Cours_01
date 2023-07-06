package HomeWork.home_01;

// Вывести все простые числа от 1 до 1000
public class task02 {
    public static void main(String[] args) {
        int[] myArray = SimpleNumber();
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    static int[] SimpleNumber() {
        String str = "";
        boolean isSimple = true;
        for (int i = 2; i < 1000; i++) {
            isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                str += Integer.toString(i) + " ";
        }
        return StringToInt(str);
    }

    static int[] StringToInt(String str) {
        String[] result = str.split(" ");
        int[] res = new int[result.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(result[i]);
        }
        return res;
    }
}
