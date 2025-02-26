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

    public Double getResult(char decision) {
        if(decision == 'y') {
            removeResult();
            System.out.println("삭제된 결과입니다.");
            return result;
        } else {
            return calculate();
        }
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

    private void removeResult() {
        result = null;
    }
}
