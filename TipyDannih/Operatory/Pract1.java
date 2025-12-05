package TipyDannih.Operatory;

 /**
    @author - Renata
    @version -java 25.0.1 
*/

public class Pract1 {
   
    public static void main(String[] args) {
        // Исходные переменные
        int a = 10;
        int b = 5;
        boolean x = true;
        boolean y = false;
        String s1 = "Hello";
        String s2 = " World";
        String s3 = "Hello";

        //Арифметические операторы (+, -, *, /, %)
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        
        //Операторы конкатенации
        // Конкатенация строк
        String resultString = s1 + s2;
        String stringWithInt = s1 + a;
        
        //Операторы присваивания (=, +=, -=, *=, /=, %=)
        int c = a; 
        c += 2;    
        c -= 3;    
        c *= 5;
        c /= 3;
        c %= 7;
        c *= 2;
        
        //Унарные операторы (++, --, +, -, !)
        int i = 5;
        int prefixIncrement = ++i; //префикс
        int j = 5;
        int postfixIncrement = j++; //постфикс

        int unaryMinusA = -a;
        boolean notX = !x;
        
        //Операторы сдвига (>>, >>>, <<)
        int shiftLeft = a << 1;
        int shiftRight = a >> 1; 
        int negA = -10; 
        int unsignedShift = negA >>> 1;
        
        //Операторы сравнения (>, >=, <, <=, ==, !=)
        boolean aGreaterThanB = a > b;
        boolean aEqualsB = a == b;
        boolean s1EqualsS3Reference = s1 == s3;
        boolean s1NotEqualsS2Reference = s1 != s2;
        
        //Побитовые операторы (&, ^, |)
        int bitwiseAND = a & b;
        int bitwiseOR = a | b;
        int bitwiseXOR = a ^ b;

        //Логические операторы (&&, ||)
        boolean logicAND = x && y;
        boolean logicOR = x || y;
        
        //Тернарный оператор
        String message = (a > b) ? "a больше b" : "a не больше b";
        
        //() и []
        int resultPriority = (a + b) * 2;
        int[] numbers = new int[3];

        //Побитовое отрицание ~
        int resultTilde = ~a;
    }
}
