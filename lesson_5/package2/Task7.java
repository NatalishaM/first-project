package lesson_5.package2;
//Answer the question: What is a package-private access? Create a simple program to demonstrate the package-private access.
//        Tips:
//        - Create two different packages
//        - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
//        - Create in one of the classes some package-private members(fields or methods).
//        - In another two classes create objects of the class with package-private members and try to access its members.

import lesson_5.package1.Class1;
import lesson_5.package1.Class2;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(new Class2().testMethod());
//        System.out.println(new Class1().getTestField());
    }
}

