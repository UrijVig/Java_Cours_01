package Seminar_01;
// Записать в файл следующие данные:
// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23 

import java.io.FileWriter;

public class Task09 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("file.txt", false);
        fw.write("Name Surname Age \n");
        fw.write("Kate Smith 20 \n");
        fw.write("Paul Green 25 \n");
        fw.write("Mike Black 23 \n");
        fw.flush();
        fw.close();
    }


}
