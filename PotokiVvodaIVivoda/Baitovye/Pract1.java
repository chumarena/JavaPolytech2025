package PotokiVvodaIVivoda.Baitovye;

import java.io.FileInputStream;
import java.io.IOException;

public class Pract1 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\rajus\\OneDrive\\Desktop\\JavaPolytech\\PotokiVvodaIVivoda\\Baitovye\\test.txt"; 

        
        int data = 0; 

        
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            data = inputStream.read(); 

            if (data != -1) {
                System.out.println("Успешно считан байт из файла: " + fileName);
                System.out.println("Значение байта (как int): " + data);
                System.out.println("Значение байта (как char): " + (char) data); 
            } else {
                System.out.println("Файл пуст или достигнут конец файла.");
            }

        } catch (IOException e) {
            System.err.println("Произошла ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
