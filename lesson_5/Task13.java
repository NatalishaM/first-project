package lesson5;

import lesson4.Task1;

//What is the different between static and non-static field of a class?
//        Create an example to demonstrate this concept.
public class Task13 {
    public int counter = 13;
    public static int staticCounter = 0;
    public Task13(){
        counter++;
        staticCounter++;
    }
    public static void main(String [] args) {
        Task13 tester = new Task13();
        System.out.println("Static Counter: " + Task13.staticCounter);
        System.out.println("Counter: " + tester.counter);
        Task13 tester1 = new Task13();
        System.out.println("Static Counter: " + Task13.staticCounter);
        System.out.println(" Counter: " + tester1.counter);
        Task13 tester2 = new Task13();
        System.out.println("Counter: " + tester2.counter);
        System.out.println("Static Counter: " + Task13.staticCounter);
    }
}

