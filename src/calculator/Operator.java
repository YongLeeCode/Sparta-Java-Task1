package calculator;

import java.util.Arrays;

enum Operator {
    ADD('+') {
        public double calculate(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT('-') {
        public double calculate(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY('*') {
        public double calculate(double x, double y) {
            return x * y;
        }
    },
    DIVIDE('/') {
        public double calculate(double x, double y) {
            return x / y;
        }
    };

    Operator(char symbol) {}

    public abstract double calculate(double x, double y);
}
