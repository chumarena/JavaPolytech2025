package FunctsionalInterface.DefaultIstatic;


interface LoggerA {
    default void log(String message) {
        System.out.println("LoggerA: " + message);
    }
}


interface LoggerB {
    default void log(String message) {
        System.out.println("LoggerB: " + message);
    }
}


class ConflictingClass implements LoggerA, LoggerB {

    //Класс обязан переопределить метод log(), чтобы выбрать реализацию
    @Override
    public void log(String message) {
        
        //Явно вызвать реализацию из InterfaceB (или любого другого)
        LoggerB.super.log("InterfaceB: " + message);

        // Или:
        // LoggerA.super.log("Сообщение из InterfaceA: " + message);
        
    }
}

public class Pract2 {
    public static void main(String[] args) {
        ConflictingClass c = new ConflictingClass();
        
        // Вызывается реализация, предоставленная в ConflictingClass
        c.log("Hello Java!"); 
    }
}
