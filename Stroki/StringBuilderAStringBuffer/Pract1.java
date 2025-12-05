package Stroki.StringBuilderAStringBuffer;


public class Pract1 {
    public static void main(String[] args) {
        
        
        StringBuilder sb = new StringBuilder("Start String"); 
        System.out.println("Исходная строка (StringBuilder): " + sb);
        
        
        
        // 1. append(String str): Добавляет указанную строку в конец последовательности
        sb.append(" and end.");
        System.out.println("1. append(): " + sb); 

        // 2. insert(int offset, String str): Вставляет строку по указанному смещению (индексу)
        sb.insert(6, "NEW "); 
        System.out.println("2. insert(): " + sb); 

        // 3. delete(int start, int end): Удаляет подстроку от начального индекса (включительно) до конечного (исключительно)
        sb.delete(0, 5); 
        System.out.println("3. delete(): " + sb); 

        // 4. replace(int start, int end, String str): Заменяет подстроку между start и end на новую строку
        sb.replace(1, 4, "OLD");
        System.out.println("4. replace(): " + sb); 
        
        // 5. reverse(): Меняет последовательность символов на обратную
        sb.reverse();
        System.out.println("5. reverse(): " + sb); 
        
        // 6. charAt(int index): Возвращает символ по указанному индексу
        char firstChar = sb.charAt(0);
        System.out.println("6. charAt(0): " + firstChar); 
        
        // 7. length(): Возвращает текущую длину последовательности (количество символов)
        int len = sb.length();
        System.out.println("7. length(): " + len); 
        
        // 8. setCharAt(int index, char ch): Устанавливает символ 'ch' по указанному индексу
        sb.setCharAt(0, '!');
        System.out.println("8. setCharAt(): " + sb); 
        
        // 9. substring(int start, int end): Возвращает НОВУЮ строку, содержащую подстроку от start до end (исключительно)
        String sub = sb.substring(15, 18);
        System.out.println("9. substring(15, 18): " + sub); 
        
        // 10. capacity(): Возвращает текущую емкость буфера
        // Емкость всегда больше или равна длине
        int cap = sb.capacity(); 
        System.out.println("10. capacity(): " + cap); 
    }
}
