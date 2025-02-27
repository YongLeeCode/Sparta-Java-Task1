package Entity;

public class Record {
    private final int id;
    private final double firstNumber;
    private final double secondNumber;
    private final char operator;
    private final double result;

    public Record(int id, double firstNumber, double secondNumber, char operator, double result) {
        this.id = id;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }
}
