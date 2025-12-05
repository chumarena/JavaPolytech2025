package TipyDannih.ClassyObolochky;

public class Pract2 {
    public static void main(String[] args) {
        
        //Из примитивного типа boolean
        Boolean b1 = Boolean.valueOf(true);
        
        //Из строки "true" регистр не важен
        Boolean b2 = Boolean.valueOf("TRUE"); 
        
        //Из строки кроме "true")
        Boolean b3 = Boolean.valueOf("Yes"); //false

    }
    
}
