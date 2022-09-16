package lesson6;
//Create an abstract class Figure. Add fields width and height to it.
// Add an abstract method "calculateArea" which should be overridden by
// the concrete figures to calculate its area.
//        Figures: Rectangle, Triangle, Circle

public class Task5 {
    public static void main(String[] args) {
        Circle a = new Circle(9);
        Triangle b = new Triangle(9, 5);
        Rectangle r = new Rectangle(9, 7);
        System.out.println(a.calculateArea());
        System.out.println(b.calculateArea());
        System.out.println(r.calculateArea());
    }
}
