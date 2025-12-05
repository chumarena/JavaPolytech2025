package VnytrennieClassi;


public class VloshennieNestedClassi {
    public interface Messenger {
    


    class MessageHelper {
        
        public void printInfo() {
            System.out.println("Метод класса вложенного в интерфейс");
        }
        
        public static void staticAction() {
            System.out.println("Сатический метод вложенного класса");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        // Способ вызова 1: Создание экземпляра вложенного класса
        Messenger.MessageHelper helper = new Messenger.MessageHelper();
        helper.printInfo();

        // Способ вызова 2: Вызов статического метода (без создания экземпляра)
        Messenger.MessageHelper.staticAction();
    }
}
}
