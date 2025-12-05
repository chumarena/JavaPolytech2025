package Stroki.StringBuilderAStringBuffer;

public class Pract2 {
    public static void main(String[] args) {
        
        // --- Исходные объекты ---
        String originalString = "immutable_text";
        StringBuilder originalBuilder = new StringBuilder("mutable_builder");
        StringBuffer originalBuffer = new StringBuffer("thread_safe_buffer");

        //(String -> Builder/Buffer)
        
        // 1.1. String -> StringBuilder
        StringBuilder sbFromStr = new StringBuilder(originalString);
        System.out.println("1.1. String -> StringBuilder (Конструктор): " + sbFromStr);
        
        // 1.2. String -> StringBuffer
        StringBuffer sbfFromStr = new StringBuffer(originalString);
        System.out.println("1.2. String -> StringBuffer (Конструктор): " + sbfFromStr + "\n");
        

        //(Builder/Buffer -> String)
        
        // 2.1. StringBuilder -> String
        String strFromSb = originalBuilder.toString();
        System.out.println("2.1. StringBuilder -> String (toString()): " + strFromSb);
        
        // 2.2. StringBuffer -> String
        String strFromSbf = originalBuffer.toString();
        System.out.println("2.2. StringBuffer -> String (toString()): " + strFromSbf + "\n");
        

        //(Builder <-> Buffer)

        // 3.1. StringBuilder -> StringBuffer
        StringBuffer sbfFromSb = new StringBuffer(originalBuilder);
        System.out.println("3.1. StringBuilder -> StringBuffer (Конструктор): " + sbfFromSb);

        // 3.2. StringBuffer -> StringBuilder
        StringBuilder sbFromSbf = new StringBuilder(originalBuffer);
        System.out.println("3.2. StringBuffer -> StringBuilder (Конструктор): " + sbFromSbf);
    }
}
