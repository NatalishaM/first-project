package lesson6;

class Tractor extends Vehicle{
    private int currentDirection;
    private int currentVelocity;

    public Tractor(int currentDirection, int currentVelocity) {
        this.currentDirection = currentDirection;
        this.currentVelocity = currentVelocity;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Tractor.steer(): Steering at " + currentDirection + "degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Tractor.move(): Moving at " + currentVelocity + "in direction " + currentDirection);

    }
    public void stop(){
        this.currentVelocity = 0;

    }
}
