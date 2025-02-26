package service;

import dto.FormulaDto;

import java.math.BigDecimal;
import java.util.Map;

public class Calculator<N extends Number> {
    private FormulaDto dto;

    private final Map<String, ArithmeticCalculator> map = Map.of(
            "PLUS", new PlusCalculator(),
            "SUBTRACT", new SubtractCalculator(),
            "MULTIPLY", new MultiplyCalculator(),
            "DIVIDE", new DivideCalculator()
    );

    public Calculator(FormulaDto dto) {
        this.dto = dto;
    }

    public Double calculate() {
        String symbol;
        double result = 0;
        switch (dto.getOperator()) {
            case '+':
                symbol = Operator.PLUS.name();
                break;
            case '-':
                symbol = Operator.SUBTRACT.name();
                break;
            case '*':
                symbol = Operator.MULTIPLY.name();
                break;
            case '/':
                symbol = Operator.DIVIDE.name();
                break;
            default:
                symbol = "Wrong";
        }
        if(symbol.equals("Wrong")) {
            throw new IllegalArgumentException("Wrong operator");
        }
        ArithmeticCalculator calculator = map.get(symbol);
        result = calculator.calculate(dto.getFirstNumber(), dto.getSecondNumber());

        System.out.println(symbol);
        formatDouble(result);
        return result;
    }

    private double formatDouble(double value) {
        return new BigDecimal(value)
                .stripTrailingZeros()
                .doubleValue();
    }
}
