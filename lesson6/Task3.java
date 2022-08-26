package lesson6;
//Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally, create another class, a specific type of Car that inherits from the Car class. You should be able to hand steering, changing gears, and moving(speed in other words). You will want to decide where to put the appropriate state and behaviours(fields and methods).
//        As mentioned above, changing gears, increasing/decreasing speed should be included. For you specific type of vehicle you will want to add something specific for that type of car.
public class Task3 {
    public static void main(String[] args) {
       Renaut renaut = new Renaut("big car", "10");
        System.out.println(renaut.getCurrentDirection());
        System.out.println(renaut.getCurrentVelocity());
        System.out.println(renaut.getName());
        System.out.println(renaut.getSize());
       renaut.move(26,0);
       renaut.steer(45);
       renaut.stop();






    }
}
