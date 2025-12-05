package IskluchIOshibki.IerarhIsklIosh;

public class Pract2 {
    
    public static void setAge(int age) {
        if (age < 0) {
            
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст установлен: " + age);
    }

    public static void main(String[] args) {

        System.out.println("1. ArithmeticException (Деление на ноль)");
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Генерация исключения
            System.out.println("Результат: " + result); 
        } catch (ArithmeticException e) {
            System.err.println("Обработка: Ошибка деления на ноль. " + e.getMessage());
        }
        


        System.out.println("2. ArrayIndexOutOfBoundsException");
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[3]; // Генерация исключения (индекс 3 вне границ [0, 2])
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Обработка: Попытка доступа за пределы массива. " + e.getMessage());
        }
        


        System.out.println("3. IllegalArgumentException (Недопустимый аргумент)");
        try {
            setAge(-5); // Генерация исключения
        } catch (IllegalArgumentException e) {
            System.err.println("Обработка: Недопустимый аргумент. " + e.getMessage());
        }
        


        System.out.println("4. ClassCastException (Недопустимое приведение типов)");
        try {
            Object obj = "Это строка";
            // Пытаемся привести String к Integer
            Integer num = (Integer) obj; // Генерация исключения
            System.out.println("Число: " + num);
        } catch (ClassCastException e) {
            System.err.println("Обработка: Недопустимое приведение типов. " + e.getMessage());
        }
        ;


        System.out.println("5. NullPointerException (Использование нулевой ссылки)");
        try {
            String text = null; 
            int length = text.length(); // Генерация исключения
            System.out.println("Длина строки: " + length);
        } catch (NullPointerException e) {
            System.err.println("Обработка: Попытка использовать нулевую ссылку. " + e.getMessage());
        }
        
    }
}
