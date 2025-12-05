package NasledovanieIpolymorphism.IspolzSuperThis;

public class Pract1 {
    
    public static class Parent {
        public String name = "ParentName";
        
        public Parent(String initialName) {
            this.name = initialName;
            System.out.println("Конструктор Parent: " + initialName);
        }

        public void display() {
            System.out.println("Метод Parent: " + this.name);
        }
    }

    
    public static class Child extends Parent {
        
        public String name = "ChildName";

        public Child(String nameForParent, String nameForChild) {
            //Доступ к конструктору суперкласса
            super(nameForParent); 
            this.name = nameForChild;
        }

        @Override
        public void display() {

            //Доступ к методу суперкласса
            super.display(); 
            
            //Доступ к полю суперкласса
            System.out.println("Поле суперкласса: " + super.name); 
            
        }
    }

    public static void main(String[] args) {
        Child child = new Child("Parent", "Child");
        child.display();
    }
}
