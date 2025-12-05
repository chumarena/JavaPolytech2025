package PotokiVvodaIVivoda.Baitovye;

import java.io.FileOutputStream;
import java.io.IOException;

public class Pract2 {
    public static void main(String[] args) {
        
        String fileName = "C:\\Users\\rajus\\OneDrive\\Desktop\\JavaPolytech\\PotokiVvodaIVivoda\\Baitovye\\output.txt"; 

        int byteToWrite = 65; 


        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            
            outputStream.write(byteToWrite); 

            System.out.println("Успешно записан байт в файл: " + fileName);
            System.out.println("Записанное значение (int): " + byteToWrite);
            System.out.println("Записанный символ (char): " + (char) byteToWrite); 

        } catch (IOException e) {
            System.err.println("Произошла ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
