package TipyDannih.ClassyObolochky;

public class Pract1 {
    public static void main(String[] args) {
        
        //Десятичное представление
        String decimalStr = "100";
        Integer valDecimal = Integer.decode(decimalStr);
        
        //Шестнадцатеричное представление (Hexadecimal)
        String hexStr1 = "0x64"; 
        Integer valHex1 = Integer.decode(hexStr1); 
        
        //Восьмеричное представление
        String octalStr = "0144";
        Integer valOctal = Integer.decode(octalStr);
        
        //Отрицательные числа
        String negativeDec = "-123";
        Integer valNegative = Integer.decode(negativeDec); 
    }
    
}
