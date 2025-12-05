package VnytrennieClassi.InnerClassi;

//внутренний класс иимеет доступ ко всем полям внешнего класса

//Едиснтвенное
//Статический вложенный класс не имеет доступа к нестатическим полям
//и методам внешнего класса, включая приватные, но может обращаться
//к статическим членам внешнего класса, независимо от их спецификатора доступа
public class Pract2 {
    // Приватное поле
    private String privateField = "private поле";

    // Поле с доступом по умолчанию 
    String defaultField = "default поле";

    // Защищенное поле 
    protected int protectedField = 42;

    // Публичный метод
    public void publicMethod() {
        System.out.println("public метод");
    }
    
    // Приватный метод
    private void privateMethod() {
        System.out.println("private метод");
    }

    
    public class InnerClass {
        public void accessOuterMembers() {
            
            //Доступ к приватному полю 
            System.out.println("Доступ к privateField: " + privateField);

            //Доступ к полю по умолчанию 
            System.out.println("Доступ к defaultField: " + defaultField);

            //Доступ к protected полю 
            System.out.println("Доступ к protectedField: " + protectedField);
            
            //Вызов публичного метода 
            publicMethod(); 
            
            //Вызов приватного метода 
            privateMethod();
        }
    }

    
    public static void main(String[] args) {
        Pract2 outer = new Pract2();
        Pract2.InnerClass inner = outer.new InnerClass();
        
        inner.accessOuterMembers();
    }
}
