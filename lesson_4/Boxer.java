package lesson4;
//Implement the method fight() depending on weight, strength and age of the boxer:
//        You should write the dependency by yourself. The method should return true or false if our boxer won or lost.
//public class Boxer {
//    public int age;
//    public int weight;
//    public int strength;
//
//    public Boxer(int age, int weight, int strength) {
//        this.age = age;
//        this.weight = weight;
//        this.strength = strength;
//    }
//
//    public boolean fight(Boxer anotherBoxer) {
//        // write your code here
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
//
//Requirements:
//        a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
//

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        if (this.age < anotherBoxer.age) {
            return true;

        } else {
            return false;


        }


    }

    public static void main(String[] args) {
        Boxer a = new Boxer(45, 67, 12);
        Boxer b = new Boxer(30, 98, 87);
        System.out.println(a.fight(b));


    }
}

