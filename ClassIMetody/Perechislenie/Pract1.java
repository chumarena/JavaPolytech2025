package ClassIMetody.Perechislenie;


public class Pract1 {
    public enum Chess {
        KING(1000), 
        QUEEN(9), 
        ROOK(5), 
        BISHOP(3),
        PAWN(1); 

        
        private final int value;

        
        Chess(int value) {
            this.value = value;
        }
    }
}
