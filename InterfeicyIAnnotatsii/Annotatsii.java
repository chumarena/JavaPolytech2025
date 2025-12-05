package InterfeicyIAnnotatsii;

public class Annotatsii {
    //@Deprecated - Отмечает класс, метод, поле или конструктор как устаревший

    @Deprecated
    public int calculateOld(int a, int b) {
        return a + b;
    }

    public int calculateNew(int a, int b) {
        return a * 2 + b * 2;
    }

    //Пример @Override - Указывает, что метод в подклассе
    //переопределяет (override) метод суперкласса или реализует метод интерфейса.
    
    
    private static class MyClass extends Object {
        
        @Override 
        public String toString() {
            return "Это экземпляр MyClass";
        }
    }

    //Пример @SuppressWarnings -Указывает компилятору подавить (проигнорировать)
    //определенные типы предупреждений, которые он обычно генерирует.

    @SuppressWarnings("deprecation")
    public void executeDeprecatedCalculation() {
        int result = calculateOld(10, 5); 
        System.out.println("Результат устаревшего расчета: " + result);
    }
    
}
