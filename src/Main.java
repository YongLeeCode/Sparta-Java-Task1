import calculator.Calculator;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new LinkedList<>();
        char play = 'p';

        while (play != 'q' && play == 'p') {
            // end condition
            if (play == 'q') {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            Calculator calculator = new Calculator();

            // input
            System.out.print("첫번째 숫자 입력: ");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.print("두번째 숫자 입력: ");
            calculator.setSecondNumber(scanner.nextInt());
            System.out.print("사용할 사칙연산 기호: ");
            calculator.setOperator(scanner.next().charAt(0));


            System.out.println("계산 결과: " + calculator.getResult());
            list.add(calculator.getResult());

            System.out.println("계산 리스트: ");
            list.stream().forEach((x) -> System.out.println(x));


            // decide to remove the result
            System.out.println("앞 결과를 삭제하시겠습니까? (y/n)");
            char decision = scanner.next().charAt(0);

            // output
            if(decision == 'y') {
                list.remove(0);
            }

            // decide keep playing or end program
            System.out.println("프로그램 종료를 원하시면, q를 입력하고 엔터, ");
            System.out.println("다른 계산을 원하시면, p를 입력하고 엔터");
            play = scanner.next().charAt(0);
        }

    }
}