package lesson5;
//ake the classes from the task 1. Create a new test class.
//        Import everything (*) from your created packages.
//        Now try to create objects of your classes without specifying the packages in front of the class names.
//        What happened? How can we avoid this?

//import lesson5.test01.*;
import lesson5.test02.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(new lesson5.test01.Test01());
        System.out.println(new Test01());
    }
}
