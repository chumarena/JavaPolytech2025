package ClassIMetody;

public class StatMetody {
   static class A {
        public static int a = 1;
        public static int b;

        public static void printVars() {
            System.out.println(a);
            System.out.println(b);
        }
        
        //1
        public static void anotherMethod() {
            printVars();
        }
    }

    public static void main(String[] args) {
        
        //2
        A.printVars(); 

        //3
        A obj = new A();
        obj.printVars();
    }
}
