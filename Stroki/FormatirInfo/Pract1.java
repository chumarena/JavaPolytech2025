package Stroki.FormatirInfo;

public class Pract1 {
    public static void main(String[] args) {
        
        // 1. %s - Строковое представление аргумента
        String name = "Alice";
        String sResult = String.format("Привет, %s!%n", name);
        
        // 2. %d - Десятичное целое значение аргумента
        int count = 42;
        String dResult = String.format("Количество: %d единиц.%n", count);
        
        // 3. %f - Десятичное значение с плавающей точкой
        double price = 19.9987;
        String fResult = String.format("Цена товара: %.2f руб.%n", price);
        
        // 4. %b - Логическое значение аргумента (true/false)
        boolean isActive = true;
        String bResult = String.format("Статус активен: %B.%n", isActive); 
        
        // 5. %n - Вставка символа новой строки (платформонезависимо)
        // %n уже используется в каждом примере для переноса строки
        
        // Результат
        String finalOutput = sResult + dResult + fResult + bResult;
        
        System.out.println(finalOutput);
    }
}
