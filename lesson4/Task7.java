package lesson4;

//. Create a simple class with some fields.
//        Demonstrate in your class how we can use initialization blocks.
class Task7 {

    int speed;


    Task7() {


        System.out.println("Speed of " + speed);
        this.speed = 90;
        System.out.println("reinitialization speed in constructor "  + this.speed);
    }

    {
        speed = 60;
    }

    public static void main(String[] args) {

        Task7 obj = new Task7();
    }
}
