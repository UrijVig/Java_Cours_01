package Seminar_01;
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
public class Task02 {

    public static void main(String[] args) {
        byte[] myArray = {1,1,1,0,1,1,1,1,0,1,1,1,1,1};        
        System.out.println(MaxCount(myArray));        
    }

    static int MaxCount(byte[] arr){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count1++;                
            }
            else {
                count1 = 0;
                if (count2 < count1) count2 = count1;
            }
        }
        if (count2 < count1) count2 = count1;
        return count2;
        
    }
}
