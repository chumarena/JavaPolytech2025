package IskluchIOshibki.ObrabNeskIskl;

class Ex1 extends Exception {
    public Ex1(String message) { super(message); }
}

class Ex2 extends Ex1 {
    public Ex2(String message) { super(message); }
}

class Ex3 extends Ex2 {
    public Ex3(String message) { super(message); }
}

public class Pract1 {
    
    public static void processMultiCatch(int type) throws ArithmeticException, NullPointerException {
        if (type == 1) {
            System.out.println("Генерируем ArithmeticException");
            int result = 10 / 0; 
        } else if (type == 2) {
            System.out.println("Генерируем NullPointerException");
            String s = null;
            s.length(); 
        }
    }

    
    public static void throwHierarchy(int level) throws Ex1, Ex2, Ex3 {
        if (level == 3) {
            throw new Ex3("Ошибка уровня 3 (самая специфичная)");
        } else if (level == 2) {
            throw new Ex2("Ошибка уровня 2");
        } else if (level == 1) {
            throw new Ex1("Ошибка уровня 1 (самая общая)");
        }
    }

    public static void main(String[] args) {

        
        // 1. Демонстрация Multi-Catch (Идентичная обработка)
        
        System.out.println("1. Multi-Catch Demo");
        
        // Попытка сгенерировать NullPointerException (type=2)
        try {
            processMultiCatch(2); 
        } 
        // Обработка двух несвязанных исключений одним блоком
        catch (ArithmeticException | NullPointerException e) {
            System.err.println("Обработано Multi-Catch: " + e.getClass().getSimpleName());
            System.err.println("Логика обработки: Единое журналирование и продолжение работы.");
        }
        
        // Попытка сгенерировать ArithmeticException (type=1)
        try {
            processMultiCatch(1); 
        } 
        // Обработка с использованием того же блока Multi-Catch
        catch (ArithmeticException | NullPointerException e) {
            System.err.println("Обработано Multi-Catch: " + e.getClass().getSimpleName());
            System.err.println("Логика обработки: Единое журналирование и продолжение работы.");
        }
        


        
        // 2. Демонстрация Иерархии исключений
        
        System.out.println("2. Иерархия исключений Demo (Ex3 -> Ex2 -> Ex1)");

        // Попытка сгенерировать Ex3 (самое специфичное)
        try {
            throwHierarchy(3); 
        } 
        
        catch (Ex3 e) { // Ловит Ex3
            System.out.println("Перехват Ex3: Сработал самый специфичный обработчик.");
        } catch (Ex2 e) { // Ловит Ex2
            System.out.println("Ошибка логики: Сработал Ex2, хотя должно быть Ex3."); 
        } catch (Ex1 e) { // Ловит Ex1
            System.out.println("Ошибка логики: Сработал Ex1, хотя должно быть Ex3.");
        }
        
        

        // Попытка сгенерировать Ex1 (самое общее)
        try {
            throwHierarchy(1); 
        } 
        
        catch (Ex3 e) {
            System.out.println("Перехват Ex3: Не сработает для Ex1.");
        } catch (Ex2 e) {
            System.out.println("Перехват Ex2: Не сработает для Ex1."); 
        } catch (Ex1 e) { // Сработает самый общий обработчик
            System.out.println("Перехват Ex1: Сработал самый общий обработчик.");
        }
        
    }
}
