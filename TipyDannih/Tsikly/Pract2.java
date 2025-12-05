package TipyDannih.Tsikly;

public class Pract2 {
    public static void main(String[] args) {
        int i = 0;

        while (true){
            if (i % 2 == 0){
                continue;
            }
            else if (i == 11){
                break;
            }
            i++;
        }
    }
}
