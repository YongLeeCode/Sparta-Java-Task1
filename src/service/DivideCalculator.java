package service;

public class DivideCalculator implements ArithmeticCalculator {
    public Double calculate(Number x, Number y) {
        return x.doubleValue() /  y.doubleValue();
    }

}
