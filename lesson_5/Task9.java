package lesson5;
//Answer the question: What is a private access? Create a simple program to demonstrate the private access.
//        Tips:
//        - Create two classes
//        - In on of them create private members
//        - In the second class create an object of the first class
// - Try to access the private members

public class Task9 {
    public static void main(String[] args) {
        Tas2 b = new Tas2();
//        b.r
//        b.printHaha

    }

}
class Tas2 {
   private String r = "how are you";
   private void printHaha(){
        System.out.println("haha");

    }
}

