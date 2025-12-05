package TipyDannih.Base;

public class Pract7 {
    //правило расширения byte -> short -> int -> long -> float -> double
    int a = 120;
    byte b = a + 10;//без явного приведения - ошибка
    byte c = (byte)(a + 10);//-126 - не вмещается в byte(тк берутся последние 8 бит)
    byte d = a + 1;//без явного приведения - ошибка
}
