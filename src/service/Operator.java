package calculator.service;

import java.util.function.DoubleBinaryOperator;

enum Operator {
    ADD('+', (x, y) -> x + y),
    SUBTRACT('-', (x, y) -> x - y),
    MULTIPLY('*', (x, y) -> x * y),
    DIVIDE('/', (x, y) -> x / y);

    private final char symbol;
    private final DoubleBinaryOperator operator;

    Operator(char symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    public double calculate(double x, double y) {
        return operator.applyAsDouble(x, y);
//        return operator.apply(x, y);
    }

    ;
}
