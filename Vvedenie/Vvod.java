package Vvedenie;


import java.util.Scanner;


public class Vvod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя");
        String name = scan.next(); 
        System.out.println("Привет, " + name); 
        
        scan.close();
    }
}