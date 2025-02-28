package dto;

import Entity.CalculatorRecord;

public class RecordDto<N extends Number> {
    private Integer id;
    private N firstNumber;
    private N secondNumber;
    private char operator;

    public Integer getId() {
        return id;
    }

    public double getResult() {
        return result;
    }

    private double result;

    public RecordDto(N firstNumber, N secondNumber, char operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public RecordDto(Integer id, N firstNumber, N secondNumber, char operator, double result) {
        this.id = id;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        this.result = result;
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
        return new CalculatorRecord((double) this.firstNumber, (double) this.secondNumber, this.operator, result);
    }

    public static RecordDto fromEntity(CalculatorRecord entity) {
        return new RecordDto(entity.getId(), entity.getFirstNumber(), entity.getSecondNumber(), entity.getOperator(), entity.getResult());
    }
}