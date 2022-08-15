package lesson4;

public class Dog{
    double weight;
    double age;
    String firstName;
    public Dog (double weight1, int age1, String firstname){
        this.weight = weight1;
        this.age = age1;
        this.firstName = firstname;}
    @Override
    public String toString(){return "Name is" + " " +  this.firstName +  "\n"+ "weight" + " " + this.weight + "\n"+"age"+this.age;
    }}

