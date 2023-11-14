package dz14;
/*Д/з создать приложение побайтового копирования графического файла. Например, файл формата png*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:/Users/sobst/OneDrive/Рабочий стол/Java23-26/Lesson14/src/dz14/foto.png");
             FileOutputStream fileOutputStream = new FileOutputStream("foto_new.png")
        ) {
            byte[] bytes = new byte[3_250_000];
            int count;
            while ((count = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, count);
            }
            System.out.println("DONE");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
