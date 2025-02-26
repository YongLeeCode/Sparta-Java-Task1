package service;

import dto.FormulaDto;

import java.math.BigDecimal;

public class ArithmeticCalculator<N extends Number> {
    private FormulaDto dto;

    public ArithmeticCalculator(FormulaDto dto) {
        this.dto = dto;
    }

    public Double calculate() {
        Operator op = null;
        switch (dto.getOperator()) {
            case '+':
                op = Operator.ADD;
                break;
            case '-':
                op = Operator.SUBTRACT;
                break;
            case '*':
                op = Operator.MULTIPLY;
                break;
            case '/':
                op = Operator.DIVIDE;
                break;
            default:
        }

        double result = op.calculate((double) dto.getFirstNumber(), (double) dto.getSecondNumber());
        formatDouble(result);
        return result;
    }

    private double formatDouble(double value) {
        return new BigDecimal(value)
                .stripTrailingZeros()
                .doubleValue();
    }
}
