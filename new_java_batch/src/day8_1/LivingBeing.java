package day8_1;

public class LivingBeing {
    public static void main(String[] args) {
  
    //anp1 is a refrance of animal class
    //tiger is a object of tiger subclass
         Animal anp1= new Tiger();
        Animal anp2 = new Elephant();

       anp1.eat();
        anp2.eat();  
    }
}
