package Stroki.ClassString;
import java.util.StringJoiner;
import java.util.Arrays;
import java.util.List;

public class Pract2 {
    public static void main(String[] args) {
        
        // 1. Базовое использование StringJoiner (с разделителем)
        StringJoiner basicJoiner = new StringJoiner(", ");
        basicJoiner.add("Java");
        basicJoiner.add("Python");
        basicJoiner.add("C#");
        
        
        // Результат: Java, Python, C#
        System.out.println("Пример 1 результат: " + basicJoiner.toString());

        // 2. Использование StringJoiner с префиксом и суффиксом
        StringJoiner styledJoiner = new StringJoiner(" - ", "[", "]");
        styledJoiner.add("One");
        styledJoiner.add("Two");
        styledJoiner.add("Three");

        
        // Результат: [One - Two - Three]
        System.out.println("Пример 2 результат: " + styledJoiner.toString());

        // 3. Использование статического метода String.join() (удобная обертка)
        List<String> colors = Arrays.asList("Красный", "Зеленый", "Синий");
        
        
        // Результат: Красный | Зеленый | Синий
        String joinedColors = String.join(" | ", colors); 
        System.out.println("Пример 3 результат: " + joinedColors);
    }
}
