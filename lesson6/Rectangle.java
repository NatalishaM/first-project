package lesson6;

public class Rectangle extends Figure{
    Rectangle(int h, int w){
        this.height = h;
        this.width = w;
    }

    @Override
    int calculateArea() {
        return (int) this.height * this.width;
    }
}
