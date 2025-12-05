package ClassIMetody;

class Potok{
    public void numStudents(){
        System.out.println("100");
    }
}

class Group1 extends Potok{
    @Override
    public void numStudents(){
        System.out.println("24");
    }
}
public class Metody {

    //Пример overload
    //Перегрузка -  в одном классе одно имя методов, разное колиство или разный тип аргументов
    

    public int sum(int a){
        return a + a;
    }

    public double sum(double a){
        return a + a;
    }

    public double sum(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        Potok potok = new Potok();
        Group1 g1 = new Group1();
        
        //Вызовется метод из Potok
        potok.numStudents();//100
        
        //override из Group1
        g1.numStudents();//24

        
        
        
    }
}
