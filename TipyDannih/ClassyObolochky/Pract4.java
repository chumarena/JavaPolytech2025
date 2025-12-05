package TipyDannih.ClassyObolochky;

// Пометка
// == сравнивает ссылки

public class Pract4 {
    public static void main(String[] args) {
    int i1 = 128;
    Integer a1 = i1;
    Integer b1 = i1;
    System.out.println("a1==i1 " + (a1 == i1));// a1 неявно преобразуется в int - true
    System.out.println("b1==i1 " + (b1 == i1));// b1 неявно преобразуется в int - true
    System.out.println("a1==b1 " + (a1 == b1));// 128 - вне стандартного диапазона кэширования, создается новый объект - false
    System.out.println("a1.equals(i1) -> " + a1.equals(i1));// везде true в коде(где equals) тк сравнивает значения
    System.out.println("b1.equals(i1) -> " + b1.equals(i1));// true 
    System.out.println("a1.equals(b1) -> " + a1.equals(b1));// true

    int i2 = 127;
    Integer a2 = i2;
    Integer b2 = i2;
    System.out.println("a2==i2 " + (a2 == i2));// a2 преобразуется в int - true
    System.out.println("b2==i2 " + (b2 == i2));// b2 преобразуется в int - true
    System.out.println("a2==b2 " + (a2 == b2));// 127 - внутри стандартного диапазона кэширования обе ссылки указывают на один объект в памяти - true
    System.out.println("a2.equals(i2) -> " + a2.equals(i2));// true
    System.out.println("b2.equals(i2) -> " + b2.equals(i2));// true
    System.out.println("a2.equals(b2) -> " + a2.equals(b2));// true
    }
}

// IntegerCache используется для кэширования объектов Integer в диапазоне от -128 до 127.
