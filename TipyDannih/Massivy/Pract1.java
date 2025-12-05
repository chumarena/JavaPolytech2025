package TipyDannih.Massivy;

public class Pract1 {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};
        a1 = a2;//выполняет копирование ссылки, а не данных
        //Теперь a1 и a2 указывают на один и тот же массив {6,7,8,9,10}
    }
}
