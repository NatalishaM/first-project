package lesson5;
//Create a new class. Make it impossible to create a new object of this class using a constructor.
//        Provide an appropriate public method that will allow clients of your class create a new object.


public class Task10 {
    public static void main(String[] args) {
       E e =  E.getE();
    }

}
class E {
private E (){
    System.out.println("Kaka");
}
    static E getE(){return new E();}

}
