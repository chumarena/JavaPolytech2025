package NasledovanieIpolymorphism.Nasledovanie;

public class Pract2 {
    class A {
        
        int a1; 
        public int a2;
        protected int a3;
        private int a4; //Приватный, только в A

        void method1() { 
            
         } 
        public void method2() { 

         }
        protected void method3() { 
            
         }
        private void method4() { 
            //Приватный, только в А
         } 
    }

    class B extends A {
        /*  Из А доступны
         Переменные: a1, a2, a3
         Методы: method1(), method2(), method3()
         */
    }

    class C extends B {
        // Из А доступны
        // Переменные: a1, a2, a3
        // Методы: method1(), method2(), method3()

    }
}
