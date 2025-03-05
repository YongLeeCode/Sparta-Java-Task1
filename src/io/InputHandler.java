package io;

import dto.RecordDto;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public RecordDto playNew(int id) {
        // input
        System.out.print("첫번째 숫자 입력: ");
        double firstNumber = inputNumber();
        System.out.print("두번째 숫자 입력: ");
        double secondNumber = inputNumber();
        System.out.print("사용할 사칙연산 기호: ");
        char operator = inputOperator();

        return new RecordDto(id, firstNumber, secondNumber, operator);
    }

    public void printMenu() {
        System.out.println("----------------------------");
        System.out.println("새로운 계산: 'n' 입력");
        System.out.println("이전 계산 결과 사용해서 계산: 'k' 입력");
        System.out.println("모든 계산 조회: 'r' 입력");
        System.out.println("프로그램 종료: 'q' 입력");
        System.out.println("----------------------------");
    }

    public RecordDto playContinue(int id, double firstNumber) {
        // input
        System.out.println("계속 계산하겠습니다.");
        System.out.printf("첫번째 숫자 : %s \n", formatDouble(firstNumber));
        System.out.print("두번째 숫자 입력: ");
        Number secondNumber = inputNumber();
        System.out.print("사용할 사칙연산 기호: ");
        char operator = inputOperator();
        return new RecordDto(id, firstNumber, secondNumber, operator);
    }

    private double inputNumber() {
        String input = scanner.next();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다");
            return inputNumber();
        }
    }

    private char inputOperator() {
        char input = scanner.next().charAt(0);

        if (input == '+' || input == '-' || input == '*' || input == '/') {
            return input;
        }

        System.out.println("사용가능한 사칙연산: '+' '-' '*' '/' ");
        System.out.print("사용할 사칙연산 기호: ");
        return inputOperator();
    }

    private String formatDouble(double value) {
        return new BigDecimal(value).stripTrailingZeros().toPlainString();
    }
}
