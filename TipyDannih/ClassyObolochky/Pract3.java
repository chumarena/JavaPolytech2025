package TipyDannih.ClassyObolochky;

public class Pract3 {
    public static void main(String[] args) {
        //NullPointerException возникает во время автораспаковки, когда Java пытается автоматически извлечь
        //примитивное значение из объекта-оболочки, который является null.

        //Пример
        
        //Объект-оболочка явно инициализирован как null
        Integer integerObject = null;
        
        
        int primitiveValue = integerObject; // NullPointerException
            
            
    }
}
