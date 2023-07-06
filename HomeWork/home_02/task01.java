package HomeWork.home_02;
// Дана строка sql-запроса "select * from students where ". 

// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.io.BufferedReader;
import java.io.FileReader;
import Mymethod.FindFilePath; // Класс написаный для поиска абсолютного пути к файлу // ссылка на код поиска пути https://github.com/UrijVig/Java_Cours_01/blob/main/Mymethod/FindFilePath.java

public class task01 {

    public static void main(String[] args) throws Exception {

        String path = FindFilePath.getFindeFilePath(".", "data.txt"); // получение абсолютного пути к искомому файлу с
                                                                      // помощью собственного класса FindFilePath //
                                                                      // ссылка на код поиска пути
                                                                      // https://github.com/UrijVig/Java_Cours_01/blob/main/Mymethod/FindFilePath.java
        System.out.println(path);

        String[] dataArray = FileToStringArray(path);

        for (String string : dataArray) {
            System.out.println(SelectWhere(string));
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

    static String SelectWhere(String str) {
        String[] strArray = str.split(",");
        String[] temp = new String[2];
        StringBuilder sb = new StringBuilder();
        for (String string : strArray) {
            temp = string.split(":");
            if (!temp[1].equals("null")) {
                if (sb.length() != 0) {
                    sb.append(" and ");
                }
                sb.append(temp[0]);
                sb.append(" = ");
                sb.append(temp[1]);
            }
        }
        return sb.toString();
    }

}