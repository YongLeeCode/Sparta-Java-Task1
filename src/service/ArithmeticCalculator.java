package service;

public interface ArithmeticCalculator<T extends Number> {
    public Double calculate(T x, T y);
}
