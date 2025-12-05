package NasledovanieIpolymorphism.PereopredelenieMetodovIpoly;


class Animal {
    
    public void sound() {
        System.out.println("Звук");
    }
}


class Cat extends Animal {
    
    @Override
    public void sound() {
       
        System.out.println("Мяу");
    }
}


public class Pract2 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat(); 

        
        myAnimal.sound();

        
        myCat.sound(); 
    }
}
//Что будет, если у переопределенного и переопределяемого 
//(из суперкласса) методов не будет совпадать тип возвращаемого значения?

//Ошибка, тк правила для override
/*
    Идентичное имя метода
    Идентичный список параметров
    Идентичный тип возвращаемого значения
 */