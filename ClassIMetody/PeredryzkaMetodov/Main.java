package ClassIMetody.PeredryzkaMetodov;

public class Main {
     public static void main(String[] args) {
        A a = new A();
        Number[ ] num = {new Integer(1), 11, 1.11f, 11.11 };
        // цикл for (1)
        for (Number n : num) {
            a.printNum(n);
        }
        // (2)
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
