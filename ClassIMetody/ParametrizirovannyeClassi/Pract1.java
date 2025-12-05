package ClassIMetody.ParametrizirovannyeClassi;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;

public class Pract1 {

    public static void main(String[] args) {
        
        List<String> listItems = new LinkedList<>();
        listItems.add("Apple");
        listItems.add("Banana");

        Set<Long> idSet = new HashSet<>();
        idSet.add(101L);
        idSet.add(202L);

        String simpleText = "Just a string value";

        System.out.println("Проверка List<String>");
        analyzeCollection(listItems);

        System.out.println("\nПроверка Set<Long>");
        analyzeCollection(idSet);
        
        System.out.println("\nПроверка простого String");
        analyzeCollection(simpleText);
    }

    
    public static void analyzeCollection(Object incomingObj) {

        
        if (incomingObj instanceof Collection<?>) {
            
            System.out.println("Объект является коллекцией!");

            
            Collection<?> collectionRef = (Collection<?>) incomingObj;

            System.out.println("Тип коллекции: " + collectionRef.getClass().getSimpleName());
            System.out.println("Количество элементов: " + collectionRef.size());

            if (!collectionRef.isEmpty()) {
                Object firstData = collectionRef.iterator().next();
                System.out.println("Данные первого элемента: " + firstData);
                System.out.println("Класс данных: " + firstData.getClass().getSimpleName());
            }
        } else {
            System.out.println("Это не коллекция, это объект типа: " + incomingObj.getClass().getSimpleName());
        }
    }
}
