package lesson7;

public class MyDevice implements Volume, State {
    @Override
    public void on(){
        System.out.println("is on");
    }
    @Override
    public void off () {
        System.out.println("is off");

    }
    @Override
    public void changeVolume(double value){
        System.out.println("chancged" + value);
    }
}
