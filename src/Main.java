import java.util.Scanner;

// Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        char play = 'p';

        while (play != 'q' && play == 'p') {
            // end condition
            if(play == 'q') {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            // input
            System.out.print("첫번째 숫자 입력: ");
            int num1 = scanner.nextInt();
            System.out.print("두번째 숫자 입력: ");
            int num2 = scanner.nextInt();
            System.out.print("사용할 사칙연산 기호: ");
            char operator = scanner.next().charAt(0);

            // find correct operator
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                }
                result = (double) num1 / num2;
            } else {
                System.out.println("잘못된 기호입니다.");
            }

            // output
            System.out.println(result);

            // decide keep playing or end program
            System.out.println("프로그램 종료를 원하시면, q를 입력하고 엔터, ");
            System.out.println("다른 계산을 원하시면, p를 입력하고 엔터");
            play = scanner.next().charAt(0);
        }

    }
}