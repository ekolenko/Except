package lesson_1L;

import java.io.File;

public class App {

    public static void main(String[] args) {

        System.out.println(divide(2, 0)); 
    }

    public static int divide(int a1, int a2) {

    if (a2 == 0) {

        throw new RuntimeException("Делить на 0 нельзя");
    
    }
        return a1/a2;

    }

    public static long getFileSize(File file) {

        if (!file.exists()) {
            
            return -1;
        
        }

        return file.length();
    }

}
