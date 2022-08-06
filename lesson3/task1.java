package lesson3;

public class task1  {
    public static void main(String[] args) {
        String test="AE_1381";
        String test1="A";
        String test2="";
        if (test.length() > 2) {
            System.out.println(test.substring(0,2));
        }
        if (test.length() < 2) {
            System.out.println(test );
        }

        if (test1.length() > 2) {
            System.out.println(test1.substring(0,2) );
        }
        if (test1.length() < 2) {
            System.out.println(test1 );
        }

        if (test2.length() > 2) {
            System.out.println(test2.substring(0,2) );
        }
        if (test2.length() < 2) {
            System.out.println(test2 );
        }
    }
}
