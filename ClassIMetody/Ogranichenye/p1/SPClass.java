package ClassIMetody.Ogranichenye.p1;

public class SPClass {
    public void testAccess() {
        PClass parent = new PClass();
        
        //Public: Доступен
        int a = parent.publicVar; 
        
        //Protected: Доступен тк в этом же пакете
        int b = parent.protectedVar; 
        
        //Без спецификатора: Доступен тк в этом же пакете
        int c = parent.defaultVar; 
        
        //Private недоступен из другого класса.
        //int d = parent.privateVar; 
    }
}
