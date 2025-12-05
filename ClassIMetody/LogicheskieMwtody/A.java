package ClassIMetody.LogicheskieMwtody;

public class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}
/* Вывод
    static logic
    logic (1) id= 0
    logic (2) id= 1
    ctor id= 100
    1. Статический метод(выполняется один раз при первом обрпщении к классу)
    2. Инициализация экземпляра(при создании объекта все поля и блоки инициализации выполняются перед телом конструктора, в порядке их объявления)
    3. Тело конмтруктора
 */