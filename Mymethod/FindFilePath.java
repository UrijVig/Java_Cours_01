package Mymethod;
import java.io.File;

public class FindFilePath {
    private static boolean flag;
    private static String findeFilePath;

    public static String getFindeFilePath(String startPath, String findFileName) {
        FindFilePath(startPath,findFileName);
        return findeFilePath;
    }

    private static void FindFilePath(String startPath, String fileName){        
        File dir = new File(startPath); 
        String[] dirArray = dir.list();
        for (String file : dirArray) {
            if (file.equals(fileName)){
                flag = true;                
                startPath += File.separator + file;
                findeFilePath = startPath;
                return;
            }
            if (!startPath.endsWith("\\")) startPath += File.separator;
            File tempDir = new File(startPath + file);
            
            if (!tempDir.toString().equals(startPath + ".git")){                
                if(tempDir.isDirectory()) {
                    // startPath += "\\" + file;                           
                    FindFilePath(startPath + file, fileName);       
                    if(flag) return;     
            }               
            }           
        }
        return;
    } 
    
}
