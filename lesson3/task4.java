package lesson3;

import java.util.Locale;

public class task4 {
    public static void main(String[] args) {
        String a = "ABCDEFGHIJK";
        a=a.toLowerCase();
        a = a.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(a);
    }
}
