package lesson6;

public class Triangle extends Figure{
    Triangle (int height, int weight) {
        this.height = height;
        this.width = weight;
    }

    @Override
    int calculateArea() {
        return (int) (this.width *  this.height) / 2;
    }
}
