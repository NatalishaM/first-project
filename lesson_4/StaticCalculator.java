package lesson4;

public class StaticCalculator {
    double firstValue;
    double secondValue;
    String operation ="a";

    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;

    }
    public StaticCalculator() {}

    public String calculate() {

        if (this.operation.equals("-")) {
            return this.firstValue-this.secondValue+"";
        }
      return "improper operation";
    }
}
