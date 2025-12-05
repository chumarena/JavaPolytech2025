package TipyDannih.OperatorVibora;

public class Pract1 {

    public static void main(String[] args) {
        
        //Примитивные типы (int, byte, short, char)
        int intValue = 2;
        switch (intValue) { 
            case 1: 
                break; 
            case 2: intValue = 3;
                break; 
        }

        char charValue = 'B';
        switch (charValue) {
            case 'A':
                break;
            case 'B': 
                charValue = 'C';
                break;
        }

        //Классы-оболочки (Integer, Character, Byte, Short)
        Integer integerWrapper = 3;
        switch (integerWrapper) { 
            case 3: 
                System.out.println(")");
                break; 
        }

        //Тип String @since java 7
        String command = "START";
        switch (command) {
            case "STOP": 
                break;
            case "START":
                System.out.println(")"); 
                break;
        }
        
        //Тип enum
        Chess fig = Chess.PAWN;
        switch (fig) {
            case KING: 
                break;
            case PAWN: 
                System.out.println(")"); 
                break; 
        }
    }
    
}

enum Chess {
    PAWN, QUEEN, KING
}