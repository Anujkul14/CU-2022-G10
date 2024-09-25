package lec49;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        String path = "G10.txt";
        File file = new File(path);

        try
        {
            FileOutputStream fos = new FileOutputStream(file);
            String text = "G10 Class,Chitkara University";
            fos.write(text.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try
        {
            FileInputStream fis = new FileInputStream(file);
            while(fis.read() != -1)
            {
                int content = fis.read();
                System.out.println((char)content);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
