package TipyDannih.Operatory;

/**
    @author - Renata
    @version -java 25.0.1 
*/

public class Pract2 {
    public static void main(String[] args) {
        
        // Объект, который мы проверяем
        Object testObject = "Hello Java"; 
        Object nullReference = null;
        
        // isString будет равно true, так как "Hello Java" является объектом String
        boolean isString = testObject instanceof String;
        
        
        // isNullString будет равно false. instanceof всегда возвращает false для null.
        boolean isNullString = nullReference instanceof String;
        

    }
    
}
