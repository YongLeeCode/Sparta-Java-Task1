package io;

import dto.RecordDto;

import java.math.BigDecimal;
import java.util.List;

public class OutputHandler {

    public static void printRecords(List<RecordDto> dtos) {
        System.out.println("조회:");
        dtos.stream().forEach(x -> {
            System.out.printf("%d : %s %c %s = %s \n", x.getId(), formatDouble((double) x.getFirstNumber()), x.getOperator(), formatDouble((double) x.getSecondNumber()), formatDouble(x.getResult()));
        });
    }
    public static void printResult(RecordDto dto) {
        System.out.println("---------------------------");
        System.out.printf("결과: %s %c %s = %s \n", formatDouble((double) dto.getFirstNumber()), dto.getOperator(), formatDouble((double) dto.getSecondNumber()), formatDouble(dto.getResult()));
        System.out.println("---------------------------");
    }

    private static String formatDouble(double value) {
        return new BigDecimal(value).stripTrailingZeros().toPlainString();
    }
}
