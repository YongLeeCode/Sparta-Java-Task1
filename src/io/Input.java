package calculator.io;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static double inputNumber() {
        System.out.print("첫번째 숫자 입력: ");
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        } else if(scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("정수 혹은 실수만 입력 가능합니다.");
            return 0;
        }
    }

    public static char inputOperator() {
        return scanner.next().charAt(0);
    }

}
