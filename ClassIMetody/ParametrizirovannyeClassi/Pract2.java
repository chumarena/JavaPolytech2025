package ClassIMetody.ParametrizirovannyeClassi;

import java.util.ArrayList;
import java.util.List;

/*
    ? extends T
    Эта конструкция обеспечивает безопасность чтения. Она позволяет извлекать (читать) данные типа T или его суперкласса из коллекции,
    но запрещает добавлять (писать) новые элементы,
    так как компилятор не знает, какой именно подтип T сейчас находится в коллекции.

    ? super T
    Эта конструкция обеспечивает безопасность записи.
    Она позволяет добавлять (писать) элементы типа T или его подтипа в коллекцию,
    но запрещает читать данные, кроме базового класса Object
 */


class Animal {}
class Mammal extends Animal {} 
class Dog extends Mammal {} 
class Cat extends Animal {} 

public class Pract2 {

    public static void readMammals(List<? extends Mammal> mammals) {
        System.out.println("\n1. ? extends Mammal (Чтение)");
        System.out.println("Чтение разрешено:");
        
        for (Mammal m : mammals) {
            System.out.println("   Прочитано: " + m.getClass().getSimpleName());
        }
        
    }

    public static void writeDogs(List<? super Dog> dogs) {
        System.out.println("\n2. ? super Dog (Запись)");
        System.out.println("Запись разрешена:");
        
        
        dogs.add(new Dog());
        System.out.println("Добавлено: Dog");
        
        Object obj = dogs.get(0);
        System.out.println("Чтение как Object: " + obj.getClass().getSimpleName());
    }

    
    public static void main(String[] args) {
        
        
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        
        List<Mammal> mammalList = new ArrayList<>();
        mammalList.add(new Mammal());
        
        readMammals(dogList);    
        readMammals(mammalList); 
        
        List<Mammal> targetMammals = new ArrayList<>();
        writeDogs(targetMammals); 

        List<Animal> targetAnimals = new ArrayList<>();
        writeDogs(targetAnimals); 
        
        List<Object> targetObjects = new ArrayList<>();
        writeDogs(targetObjects); 
    }
}
