package TipyDannih.Massivy;

import java.util.Arrays;

public class Pract2 {
    public static void main(String[] args) {
        
        
        int[] originalArray = {5, 2, 8, 1, 9};
        int[] sortedArray = {1, 2, 5, 8, 9};
        int[] anotherArray = {1, 2, 5, 8, 9};
        int[] differentArray = {1, 2, 3, 4, 5};
        
        
        int[] arrayToSort = {50, 10, 40, 20, 30};

        //String toString(...)
        //Преобразует массив в строковое представление
        String arrayAsString = Arrays.toString(originalArray);
         
        
        //int binarySearch(...)
        // Ищет элемент в отсортированном массиве, используя алгоритм бинарного поиска
        // Если элемент найден, возвращает его индекс (>= 0)
        // Если не найден, возвращает отрицательное число: -(точка_вставки(где бы элемент должен был бы находиться для соблюдения сортировки)) - 1.
        int searchResult = Arrays.binarySearch(sortedArray, 5);// = 2
        
        
        //boolean equals(...)
        // Сравнивает два массива на равенство по длине и соотв элементам
        boolean areEqual = Arrays.equals(sortedArray, anotherArray);//true

        
        
        //boolean compare(...)
        // Сравнивает два массива лексикографически (поэлементно).
        int compareResult1 = Arrays.compare(sortedArray, anotherArray); // 0
        int compareResult2 = Arrays.compare(sortedArray, differentArray); //(5 > 3) вернет разницу между большим и меньшим соотв первым отличающимся элементом

        //void sort(...)
        // Сортирует массив на в порядке возрастания.
        Arrays.sort(arrayToSort);// {10, 20, 30, 40, 50}
        

    }
}
