package calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operator;
    private Double result;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public Double getResult() {
        return calculate();
    }

    private Double calculate() {
        switch (operator) {
            case '+':
                result = (double) (firstNumber + secondNumber);
                break;
            case '-':
                result = (double) (firstNumber - secondNumber);
                break;
            case '*':
                result = (double) (firstNumber * secondNumber);
                break;
            case '/':
                result = (double) (firstNumber / secondNumber);
                break;
            default:
        }
        return result;
    }
}
