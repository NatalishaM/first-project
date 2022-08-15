package lesson4;
//Find the information about the order of initialization, when you create a new object of a class:
//        When constructors, initialization blocks are being executed.
//        When fields are initialized with default values.

public class Task8 {  public static void main(String[] args) {
    Sun s  = new Sun();
}
}

class Sun {
    public static String stfield= "(Static field initialization)";

    public String field = "(Field initialization)";

    static {
        System.out.println( "static block:" + stfield);
        stfield = "(Static  block)";
    }

    {
        System.out.println("constructor" + field);
        field = "(Constructor)";
    }

    public Sun() {
        System.out.println("The parent constructor block:" + field);
        field = "(Constructor assignment)";
    }
}

