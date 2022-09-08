package lesson_5;
//Create a class with two different methods and two fields. One of methods should be static, another - non-static.
//        The same thing should be done with class fields(first - static, second - non-static).
//        These two methods should change the corresponding fields of the class when called.
//        Create another class with main method to test your code.

public class Task15 {
        public static void main(String[] args) {
                System.out.println("was "  +  MyClass.staticField);
                MyClass.change(9);
                System.out.println("changed "  +   MyClass.staticField);

                MyClass n = new MyClass();
                System.out.println("no static was "  + n.dynamicField);
                n.anotherChange(8);
                System.out.println("no static changed "  + n.dynamicField);
        }
        }
        class MyClass{
                static int staticField;
                int dynamicField;

                static void change(int value) {
                        staticField = value;
                }

                void anotherChange(int value) {
                       this.dynamicField = value;
                }
        }