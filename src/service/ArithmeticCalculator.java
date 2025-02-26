package calculator.service;

import calculator.dto.FormulaDto;

public class ArithmeticCalculator<N extends Number> {
    private FormulaDto dto;

    public ArithmeticCalculator(FormulaDto dto) {
        this.dto = dto;
    }

    public Double calculate() {
        Operator res = null;
        switch (dto.getOperator()) {
            case '+':
                res = Operator.ADD;
                break;
            case '-':
                res = Operator.SUBTRACT;
                break;
            case '*':
                res = Operator.MULTIPLY;
                break;
            case '/':
                res = Operator.DIVIDE;
                break;
            default:
        }

        return res.calculate((double) dto.getFirstNumber(), (double) dto.getSecondNumber());
    }

}
