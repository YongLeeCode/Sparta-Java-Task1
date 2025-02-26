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
        if (decision == 'y') {
            removeResult();
            System.out.println("삭제된 결과입니다.");
            return result;
        } else {
            return calculate();
        }
    }

    private Double calculate() {
        Operator res = null;
        switch (operator) {
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

        result = res.calculate(firstNumber, secondNumber);
        return result;
    }

    private void removeResult() {
        result = null;
    }
}
