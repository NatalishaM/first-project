package lesson4;
//Write your own example of the recursive function. You can find a lot of examples on the Internet.

public class Task9 {
    public static void main(String[] args) {
       rec(1);
    }

    public static void rec(int number) {
        System.out.println(number);
        number++;
        if (number < 10) {
            rec(number);
        }
    }

}
