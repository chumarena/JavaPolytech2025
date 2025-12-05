package ClassIMetody.Perechislenie;

public class Pract2 {
    public enum ChessPiece {
        PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING
    }

    
    public static int getPieceValue(ChessPiece piece) {
        int value;
        
        switch (piece) {
            case PAWN:
                value = 1;
                break;
            case KNIGHT:
            case BISHOP:
                value = 3;
                break;
            case ROOK:
                value = 5;
                break;
            case QUEEN:
                value = 9;
                break;
            case KING:
                value = 1000;
                break;
            default:
                value = 0;
        }
        return value;
    }
}
