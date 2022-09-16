package lesson7;


//Create a new interface "Converter". This interface should have one method "convert(double celsius)".
//        Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
//        which convert celsius degrees to kelvins or fahrenheits accordingly.
public class Task2 {
    public static void main(String[] args) {
        double celsius = 5;
        Converter kelvinConvecter = new KelvinConverter();
        Converter fahrenheiConverter = new FahrenheitConverter();
        System.out.println("celsius" + celsius);
        System.out.println("kelvin" + kelvinConvecter.convert(celsius));
        System.out.println("fahrenheit" + fahrenheiConverter.convert(celsius));
    }
}
