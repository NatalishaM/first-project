package lesson6.Task4;
//Create a class A. Add several fields, two methods and parameterized
// constructors to it. Create a class B that extends class A.
// Demonstrate in you program how class's B constructor should call
// class's A constructor to create a new object.
// Override one method of the class A to fully change it's behavior.
// Override another method to add some extra functionality to it,
// but it should then call class's A method. Create a test class and
// create several objects of class A and class B and call their methods.

public class Task4 {
    public static void main(String[] args) {
        A n = new A("nata", 9);
        B k = new B("----", 67);
        n.lesson2();
        System.out.println(n.lesson());
        System.out.println("ooooo");
        k.lesson2();
        System.out.println(k.lesson());
    }

}
