package TipyDannih.Base;

public class Pract5 {
    public static void main(String[] args) {
        //правило byte -> short -> int -> long -> float -> double
        
        // int -> double 
        int numInt = 10;
        double numDouble = 3.5;
        double result1 = numInt + numDouble; // int < double
        
        // byte -> int
        byte numByte = 5;
        int numInt2 = 200;
        int result2 = numByte + numInt2; // byte < int
        
        // long -> float
        long numLong = 5000000000L;
        float numFloat = 1.5f;
        float result3 = numLong * numFloat; // long > float но во float из-за возможной потери дробной части
        
    
        
        
    }
}
