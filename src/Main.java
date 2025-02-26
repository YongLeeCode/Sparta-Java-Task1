import dto.FormulaDto;
import service.Calculator;

import io.Input;
import io.Output;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char play = 'n';
        double result = 0;
        FormulaDto dto = null;

        do {
            if (play != 'n' && play != 'k') {
                continue;
            }

            if (play == 'n') {
                dto = Input.playNew();
            } else if (play == 'k') {
                dto = Input.playContinue(result);
            }

            Calculator<Double> calculator = new Calculator<>(dto);

            result = calculator.calculate();
            Output.printResult(result);
            play = scanner.next().charAt(0);
        } while (play != 'q');
    }
}