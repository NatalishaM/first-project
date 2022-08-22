package lesson4;
//Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

public class Task10 {
    public static void main(String[] args) {

        Task10 forExample12 = new Task10();
        forExample12.test();
        forExample12.test("1param");
        forExample12.test(10.0);
        forExample12.test("2 argumenta", 10);
    }

    public void test() {
        System.out.println( "non argument");
    }

    public void test(String str) {
        System.out.println("1 argument string");
    }

    public void test(double d) {
        System.out.println("1 argument double");
    }

    public void test(String str, int i) {
        System.out.println("2 argument, string,int");
    }
}