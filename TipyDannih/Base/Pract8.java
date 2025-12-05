package TipyDannih.Base;



interface Action {
    void execute();
}


class Runner implements Action {
    @Override
    public void execute() {
        System.out.println("Бежим");
    }
}

public class Pract8 {

    public static void main(String[] args) {
        
        //Без var - явно указыкаем к5акого типа
        Runner runner1 = new Runner();
        runner1.execute();
        
        System.out.println("");
        
        //Компилятор сам види тип при помощи var
        var runner2 = new Runner();
        runner2.execute();
        
        System.out.println("");
        
        
        //Компилятор знает что реализует объект, поэтому можно так
        var genericAction = new Runner(); 
        genericAction.execute();
    }
}
