package lesson6;

public class A {
    private B b;
    private C c;

    public A() {
        this.b = new B();
        this.c = new C();
        this.b.setSalary(189);
        this.c.setId(56);
    }

    public long getSalary() {
        return this.b.getSalary();
    }
    public int getId() {
        return this.c.getId();
}}
