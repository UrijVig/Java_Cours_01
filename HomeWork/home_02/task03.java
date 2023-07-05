package HomeWork.home_02;

import java.io.BufferedReader;
import java.io.FileReader;

import Mymethod.FindFilePath;

// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class task03 {
    public static void main(String[] args) throws Exception {
        String path = FindFilePath.getFindeFilePath(".", "data_of_task03.txt");
        System.out.println(path);
        String[] dataOfFile = FileToStringArray(path);
        
        for (String string : dataOfFile) {
            System.out.println(SelectStudent(string));
        }
    }

    static String[] FileToStringArray(String FilePath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(FilePath));
        int idx = 0;
        String string;
        while ((string = br.readLine()) != null) {
            idx++;
        }
        br.close();
        BufferedReader br1 = new BufferedReader(new FileReader(FilePath));
        String[] strArray = new String[idx];
        idx = 0;
        while ((string = br1.readLine()) != null) {
            string = string.replace("{", "");
            string = string.replace("\"", "");
            string = string.replace("}", "");
            string = string.replace(" ", "");
            strArray[idx] = string;
            idx++;
        }
        br1.close();
        return strArray;
    }

    static String SelectStudent(String str) {
        String[] arr = { "Студент ", " Получил(а) ", " по предмету " };
        String[] strArray = str.split(",");
        String[] temp = new String[2];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            temp = strArray[i].split(":");
            if (!temp[1].equals("null")) {
                sb.append(arr[i]);
                sb.append(temp[1]);
            }
        }
        if (sb.length() != 0) {
            sb.append(".");
        }
        return sb.toString();
    }

}
