package service;

public class SubtractCalculator implements ArithmeticCalculator {
    public Double calculate(Number x, Number y) {
        return x.doubleValue() - y.doubleValue();
    }

}
