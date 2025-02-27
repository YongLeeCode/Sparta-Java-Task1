package dto;

import Entity.CalculatorRecord;

public class RecordDto<N extends Number> {
    private N firstNumber;
    private N secondNumber;
    private char operator;

    public RecordDto(N firstNumber, N secondNumber, char operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public N getFirstNumber() {
        return firstNumber;
    }

    public N getSecondNumber() {
        return secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public CalculatorRecord toEntity(double result) {
        return new CalculatorRecord(
                (double) this.firstNumber,
                (double) this.secondNumber,
                this.operator,
                result
        );
    }

}