package VnytrennieClassi.InnerClassi;


//Внешний класс имеет полный доступ к полям и методам внутреннего класса
//но напрямую нельзя обратитьтся к this, надо создать экземпляр
public class Pract3 {
    private int outerData = 100;

    public class InnerClass {
        private String privateInnerField = "Приватное поле внутреннего класса";

        public void publicInnerMethod() {
            System.out.println("Внутренний класс видит outerData: " + outerData); 
        }

        private String privateInnerMethod() {
            return "Результат приватного метода внутреннего класса";
        }
    }


    public void accessInnerMembers() {

        InnerClass inner = this.new InnerClass(); 
        
        
        //Доступ к публичному методу
        inner.publicInnerMethod(); 
        
        //доступ к приватному полю
        System.out.println("Попытка доступа к privateInnerField: " + inner.privateInnerField); 
        
        //доступ к приватному методу
        System.out.println("Попытка доступа к privateInnerMethod: " + inner.privateInnerMethod()); 
        
        
        
    }

    public static void main(String[] args) {
        Pract3 outer = new Pract3();
        outer.accessInnerMembers(); 
        
    }
    
    

}

