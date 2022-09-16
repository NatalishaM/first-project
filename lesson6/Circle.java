package lesson6;

public class Circle extends Figure{
    Circle(int radius){
        this.height = radius * 2;
    }

    @Override
    int calculateArea() {
        return (int) 3.14 * this.height/2 * this.height/2;
    }
}
