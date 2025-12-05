package PotokiVvodaIVivoda.ClassScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        File inputFile = new File("C:\\Users\\rajus\\OneDrive\\Desktop\\JavaPolytech\\PotokiVvodaIVivoda\\ClassScanner\\data.txt"); 

        
        try (Scanner fileScanner = new Scanner(inputFile)) {
            
            
            
            while (fileScanner.hasNextLine()) {
                
                String line = fileScanner.nextLine();
                try (Scanner lineScanner = new Scanner(line)) {
                    
                    String name = lineScanner.next();        
                    int age = lineScanner.nextInt();         
                    double height = lineScanner.nextDouble(); 
                    if (name.equals("Настя")) {name = name + "-полторашка"; }
                    System.out.printf("Имя: %s, Возраст: %d, Рост: %.1f%n", name, age, height);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл " + inputFile.getName() + " не найден!");
        }
    }
}
