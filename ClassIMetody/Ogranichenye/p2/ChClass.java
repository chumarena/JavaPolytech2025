package ClassIMetody.Ogranichenye.p2;
import ClassIMetody.Ogranichenye.p1.PClass;

public class ChClass extends PClass {
    public void testInheritedAccess() {
        
        //Public: Доступен
        int a = publicVar; 
        
        //Protected: Доступен тк ChClass наследник PClass
        int b = protectedVar; 
        
        //Без спецификатора : Недоступен тк в другом пакете
        // int c = defaultVar; 
        
        //Private: Недоступен
        // int d = privateVar; 
    }
}
