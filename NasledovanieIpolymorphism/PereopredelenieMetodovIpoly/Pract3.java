package NasledovanieIpolymorphism.PereopredelenieMetodovIpoly;


//Для примера, не идентичное имя.
//Также может быть несовпадение параметров или тип возвращаемого значения
public class Pract3 {
    class Animal {
    
    public void sound() {
        System.out.println("Звук");
    }
}


class Cat extends Animal {
    
    @Override
    public void soumnd() {//надо sound
       
        System.out.println("Мяу");
    }
}

}
