package Stroki.ClassString;

public class Pract1 {
    public static void main(String[] args) {
        
        
        String originalString = "  Learning Java String Methods 5 ";
        String otherString = "methods";
        
        
        System.out.println("Оригинальная строка: \"" + originalString + "\"");

        // 1. length() - Возвращает длину строки
        int length = originalString.length();
        System.out.println("1. length(): " + length);
        
        // 2. trim() - Возвращает новую строку, удаляя начальные и конечные пробелы.
        String trimmedString = originalString.trim();
        System.out.println("2. trim(): \"" + trimmedString + "\"");
        
        // 3. charAt(int index) - Возвращает символ по указанному индексу (индексация с 0).
        char charAtIndex = trimmedString.charAt(5);
        System.out.println("3. charAt(5): " + charAtIndex);
        
        // 4. toUpperCase() - Преобразует все символы строки в верхний регистр.
        String upperCase = originalString.toUpperCase();
        System.out.println("4. toUpperCase(): " + upperCase);
        
        // 5. equals(Object anObject) - Сравнивает две строки на равенство, с учетом регистра.
        boolean strictEquals = otherString.equals("Methods"); 
        System.out.println("5. equals(\"Methods\"): " + strictEquals);

        // 6. contains(CharSequence s) - Проверяет, содержит ли строка указанную последовательность символов.
        boolean contains = originalString.contains("Java");
        System.out.println("6. contains(\"Java\"): " + contains);

        // 7. indexOf(String str) - Возвращает индекс первого вхождения указанной подстроки.
        int indexOf = trimmedString.indexOf("String");
        System.out.println("7. indexOf(\"String\"): " + indexOf);

        // 8. substring(int beginIndex) - Возвращает подстроку, начиная с beginIndex до конца строки.
        String subFromIndex = trimmedString.substring(indexOf);
        System.out.println("8. substring(indexOf(\"String\")): " + subFromIndex);

        // 9. replace(CharSequence target, CharSequence replacement) - Заменяет все вхождения target на replacement.
        String replaced = trimmedString.replace("Methods", "Features");
        System.out.println("9. replace(\"Methods\", \"Features\"): " + replaced);
        
        // 10. valueOf(int i) - Статический метод, преобразует примитивный тип (например, int) в строку.
        String valueOfInt = String.valueOf(12345);
        System.out.println("10. valueOf(12345): " + valueOfInt);
        
        // Исходная строка остается неизменной, все методы вернули новые строки
        System.out.println("Оригинальная строка после всех операций: \"" + originalString + "\"");
    }
}
