package lec49;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) {
        File file = new File("G10.txt");
        try
        {
            if(file.createNewFile())
            {
                System.out.println("File Created");
            }
            else {
                System.out.println("file already exist");
            }
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
