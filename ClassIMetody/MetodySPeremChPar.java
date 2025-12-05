package ClassIMetody;

public class MetodySPeremChPar {
 
    public void printValues(int... numbers) {
        System.out.println("Длина массива для int" + numbers.length);
    }

    public void printValues(String... texts) {
        System.out.println("Длина массива для string" + texts.length);
    }
    
}
