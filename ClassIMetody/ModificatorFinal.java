package ClassIMetody;

public class ModificatorFinal {
    public class A {
    public final int a;

    //В конструкторе
    public A(int initialValue) {
        this.a = initialValue;
    }
}
    public class A1 {
    public final int a; 

    //До конструктора
    {
        a = 5; 
    }

    //Не меняет факт инициалмизации
    public A1() {
        
    }
}


}
