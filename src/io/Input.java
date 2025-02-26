package io;

import dto.FormulaDto;

import java.math.BigDecimal;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static FormulaDto playNew() {
        // input
        System.out.print("첫번째 숫자 입력: ");
        Number firstNumber = inputNumber();
        System.out.print("두번째 숫자 입력: ");
        Number secondNumber = inputNumber();
        System.out.print("사용할 사칙연산 기호: ");
        char operator = inputOperator();
        return new FormulaDto(firstNumber, secondNumber, operator);
    }

    public static FormulaDto playContinue(double firstNumber) {
        // input
        System.out.println("계속 계산하겠습니다.");
        System.out.printf("첫번째 숫자 : %s \n", formatDouble(firstNumber));
        System.out.print("두번째 숫자 입력: ");
        Number secondNumber = inputNumber();
        System.out.print("사용할 사칙연산 기호: ");
        char operator = inputOperator();
        return new FormulaDto(firstNumber, secondNumber, operator);
    }

    private static Number inputNumber() {
        try {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("정수 혹은 실수만 입력 가능합니다.");
        }
        return 0;
    }

    private static char inputOperator() {
        return scanner.next().charAt(0);
    }

    private static String formatDouble(double value) {
        return new BigDecimal(value).stripTrailingZeros().toPlainString();
    }
}
