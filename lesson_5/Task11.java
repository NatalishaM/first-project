package lesson_5;
 //What is the difference between package-private access and protected access?


public class Task11 {
    public static void main(String[] args) {
        Mama k = new Mama();
        System.out.println(k.l);
        k.soul();
    }
}
class Papa {
    protected String l= "semya";
    protected void soul(){
        System.out.println(this.l);
    }
}
class Mama extends Papa {}

