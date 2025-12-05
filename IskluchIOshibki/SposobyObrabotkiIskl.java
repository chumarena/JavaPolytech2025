package IskluchIOshibki;

public class SposobyObrabotkiIskl {
    public static void main(String[] args) {
        
        //Пример с обработанным исключением (Перехвачено)
        try {
            System.out.println("Попытка деления на ноль ");
            int result = 50 / 0;
            System.out.println("Результат деления: " + result); // Эта строка не выполнится
        } catch (ArithmeticException e) {
            System.err.println("Перехваченное исключение: " + e.getClass().getName());
            System.err.println("Обработка: Деление на ноль невозможно. Работа программы продолжается.");
        }

        //Пример с необработанным исключением (Приведет к сбою)
        try {
            System.out.println("\nПопытка доступа к массиву за границами ");
            int[] data = {1, 2, 3};
            int value = data[5]; 
            System.out.println("Значение: " + value); // Эта строка не выполнится
            
        } 
        finally {
            System.out.println("Блок finally первого исключения всегда выполняется.");
        }

        System.out.println("\nНе будет выполнено");
    }
}
