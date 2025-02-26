package io;

import java.math.BigDecimal;

public class Output {
    public static void printResult(double result) {
        System.out.printf("결과: %s \n", formatDouble(result));

        System.out.println("----------------------------");
        System.out.println("새로운 계산: 'n' 입력");
        System.out.println("현재 결과를 이어서 계산: 'k' 입력");
        System.out.println("프로그램 종료: 'q' 입력");
        System.out.println("----------------------------");
    }

    private static String formatDouble(double value) {
        return new BigDecimal(value).stripTrailingZeros().toPlainString();
    }
}
