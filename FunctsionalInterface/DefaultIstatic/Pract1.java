package FunctsionalInterface.DefaultIstatic;

interface Calculation {

    
    public abstract double calculate(double x, double y);

    public static double getPi() {
        return 3.14159;
    }
}


class AreaCalculator implements Calculation {

    // Обязательная реализация абстрактного метода
    @Override
    public double calculate(double radius, double ignored) {
        return Calculation.getPi() * radius * radius;
    }
}

public class Pract1 {
    public static void main(String[] args) {
        
        // Создание экземпляра реализующего класса
        AreaCalculator calculator = new AreaCalculator();
        double radius = 5.0;


        //Вызов абстрактного метода (через экземпляр класса или ссылку на интерфейс):
        double area = calculator.calculate(radius, 0.0);
        System.out.println("Площадь круга (вызов абстрактного метода): " + area);
        
        //Вызов статического метода (только через имя интерфейса):
        double pi = Calculation.getPi();
        System.out.println("Значение Pi (вызов статического метода): " + pi);
        
    }
}
