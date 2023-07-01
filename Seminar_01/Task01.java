package Seminar_01;
import java.util.Calendar;
import java.util.Scanner;
// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Calendar date = Calendar.getInstance();
        int time = date.get(Calendar.HOUR_OF_DAY);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        String hello;
        if (time >= 5 && time < 12){
            hello = "Доброе утро";            
        }
        else if (time >=12 && time < 18){
            hello = "Добрый день";            
        }
        else if (time >= 18 && time < 23){
            hello = "Добрый вечер";            
        }
        else{
            hello = "Доброй ночи";            
        }        
        System.out.printf("%s, %s !\n", hello, name);
        iScanner.close();
    }
}
