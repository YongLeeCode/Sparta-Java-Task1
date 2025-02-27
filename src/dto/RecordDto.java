package dto;

public class FormulaDto<N extends Number> {
    private N firstNumber;
    private N secondNumber;
    private char operator;

    public FormulaDto(N firstNumber, N secondNumber, char operator) {
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

    public void setFirstNumber(N firstNumber) {
        this.firstNumber = firstNumber;
    }

}