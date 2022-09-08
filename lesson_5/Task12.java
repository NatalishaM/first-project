package lesson_5;
//Create a new class. Add 5 private fields. Add getter and setters to all the fields.
public class Task12 {
    public static void main(String[] args) {
        Puppy d = new Puppy ();
        System.out.println(d.getLegCount());
        d.setLegCount(4);
        System.out.println(d.getLegCount());
        System.out.println(d.getLegCount2());
        d.setLegCount2(5);
        System.out.println(d.getLegCount2());
        System.out.println(d.getLegCount3());
        d.setLegCount3(6);
        System.out.println(d.getLegCount3());
        System.out.println(d.getLegCount4());
        d.setLegCount4(7);
        System.out.println(d.getLegCount4());
        System.out.println(d.getLegCount5());
        d.setLegCount5(8);
        System.out.println(d.getLegCount5());
    }
}
class Puppy {
    private int legCount = 1;
    private int legCount2 = 1;
    private int legCount3 = 1;
    private int legCount4 = 1;
    private int legCount5 = 1;

    public int getLegCount() {
        return legCount;
    }
    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
    public int getLegCount2() {
        return legCount2;
    }
    public void setLegCount2(int legCount2) {
        this.legCount2 = legCount2;
    }
    public int getLegCount3() {
        return legCount3;
    }
    public void setLegCount3(int legCount3) {
        this.legCount3 = legCount3;
    }
    public int getLegCount4() {
        return legCount4;
    }
    public void setLegCount4(int legCount4) {
        this.legCount4 = legCount4;
    }
    public int getLegCount5() {
        return legCount5;
    }
    public void setLegCount5(int legCount5) {
        this.legCount5 = legCount5;
    }
}