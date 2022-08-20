package lesson5;
//Answer the question: What is a public access? Create a simple program to demonstrate the public access.
        //You can use tips from the task 3.

    class Dog {
        public int legCount = 1;

        public void display() {
            System.out.println("I am an dog.");
            System.out.println("I have " + legCount + " legs.");
        }
    }
    public class  Task8{
        public static void main( String[] args ) {
            Dog animal = new Dog();
            animal.legCount = 4;
            animal.display();
        }
    }