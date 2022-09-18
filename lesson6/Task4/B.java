package lesson6.Task4;

public class B extends A{
    B (String nata, int name) {
    super(nata, name);
    };
    @Override
    void lesson2() {
        System.out.println("second method from class B");
        System.out.println("second method from class B");
    }
        @Override
        String lesson() {
            return this.b + "Add B";
        }




}
