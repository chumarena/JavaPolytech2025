package PotokiVvodaIVivoda.Baitovye;

import java.io.IOException;

/*
    AutoCloseable нужен для того, чтобы класс можно было использовать в конструкции try-with-resources,
    обеспечивая автоматическое и надежное закрытие ресурсов сразу после завершения блока try.
*/

class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("Ресурс" + name + " открыт/создан.");
    }

    public void doWork() {
        System.out.println("Ресурс " + name + " выполняет работу.");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Ресурс " + name + " автоматически закрыт.");
        //очистка
    }
}

public class Pract4 {
    public static void main(String[] args) {
        

        try (MyResource res1 = new MyResource("Поток1");
             MyResource res2 = new MyResource("Соединение2")) {
            
            System.out.println("Начало работы");
            res1.doWork();
            res2.doWork();
            System.out.println("Завершение работы");
            
        } catch (Exception e) {
            System.err.println("Обработка исключения: " + e.getMessage());
        } 
        
        System.out.println("Программа завершена. close() был вызван автоматически.");
    }
}
