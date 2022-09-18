package lesson6;

abstract class Vehicle {
    public abstract void steer(int direction);
    public abstract void move(int velocity, int direction);
    public abstract void stop();
}
