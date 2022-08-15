package lesson4;

public class Human {
    double weight;
    double age;
    String firstName;
    String lastName;
    double height;
public Human (double weight1, int age1, String firstname,String lastname, double height1 ){
    this.weight = weight1;
    this.age = age1;
    this.firstName = firstname;
    this.lastName = lastname;
    this.height=height1;}
    @Override
    public String toString(){return "Name is" + " " +  this.firstName + "\n"+"`Surname is"+ " " + this.lastName + "\n"+ "weight" + " " + this.weight + "\n" + "height" + " " + this.height;

    }





}
