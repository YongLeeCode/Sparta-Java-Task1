import java.util.Scanner;

// Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        // 입력
        System.out.print("첫번째 숫자 입력: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("두번째 숫자 입력: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("사용할 사칙연산 기호: ");
        char operator = scanner.next().charAt(0);

        System.out.println(result);
    }
}