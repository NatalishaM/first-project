package lesson6;
//Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally, create another class, a specific type of Car that inherits from the Car class. You should be able to hand steering, changing gears, and moving(speed in other words). You will want to decide where to put the appropriate state and behaviours(fields and methods).
//        As mentioned above, changing gears, increasing/decreasing speed should be included. For you specific type of vehicle you will want to add something specific for that type of car.
public class Task3 {
    public static void main(String[] args) {
        Vehicle[] vehicleArray = {
                new Car(45, 100),
                new Track(0, 40),
                new Tractor(55,30)
        };

        for (Vehicle item : vehicleArray) {
            item.steer(10);
            item.move(5, 5);
            item.stop();
            System.out.println();
        }
    }
}






