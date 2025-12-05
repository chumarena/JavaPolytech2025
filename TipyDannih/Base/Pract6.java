package TipyDannih.Base;

public class Pract6 {
    
    double valueDouble = 55.99;
    int valueInt1 = (int) valueDouble; //55

    // 130 > max byte, max byte = 127
    int valueInt = 130; 
    byte valueByte = (byte) valueInt; //-126

    long largeLong = 12345678912345678L;
    float valueFloat = (float) largeLong; //теряется точность

}
