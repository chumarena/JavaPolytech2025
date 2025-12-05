package NasledovanieIpolymorphism.ClassyIMetodiFinal;

public class Pract1 {
    
    
    public static class Parent {
        
        //final
        public final void finalext() {
            System.out.println("Final");
        }
        
        //не final
        public void notfinal() {
            System.out.println("Не Final Parent");
        }
    }

    
    public static class Child extends Parent {
        
        
        //Ошибка
        /* 
        @Override
        public final void finalext() { 
            System.out.println("Final Child");
        }
        */

        //Норм(метод без final)
        @Override
        public void notfinal() {
            System.out.println("Не final Child");
        }
    }
}
