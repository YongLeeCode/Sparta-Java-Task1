package service.calculate;

public interface ArithmeticCalculator<T extends Number> {
    public Double calculate(T x, T y);
}
