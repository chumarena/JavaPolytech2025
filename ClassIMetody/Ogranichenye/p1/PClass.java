package ClassIMetody.Ogranichenye.p1;

public class PClass {
    //Доступен отовсюду
    public int publicVar = 10;
    
    //Доступен в p1 И в наследниках (везде)
    protected int protectedVar = 20; 
    
    //Доступен только в package1
    int defaultVar = 30; //Без спецификатора
    
    //Доступен только внутри PClass
    private int privateVar = 40; 
    
}
