import controller.CalculatorController;
import dto.RecordDto;
import io.InputHandler;
import io.OutputHandler;
import repository.RecordRepository;
import repository.RecordRepositoryImpl;
import service.CalculatorServiceImpl;
import utils.DelayUtil;

import java.util.List;
import java.util.Scanner;

public class Play {
    DelayUtil delayUtil = new DelayUtil();
    RecordRepository repository = new RecordRepositoryImpl();
    CalculatorServiceImpl service = new CalculatorServiceImpl(repository);
    CalculatorController controller = new CalculatorController(service);
    InputHandler input = new InputHandler();
    RecordDto dto;
    Scanner scanner = new Scanner(System.in);

    public void runProgram() {
        char play = 'n';

        do {
            switch (play) {
                case 'n' -> addNew();
                case 'k' -> addWithPrevious();
                case 'r' -> read();
                case 'd' -> delete();
                default -> typeWrong();
            }

            play = scanner.next().charAt(0);
        } while (play != 'q');
    }

    private void typeWrong() {
        System.out.println("잘못된 입력입니다!");
        delayUtil.deplay();
        input.printMenu();
    }

    private void read() {
        List<RecordDto> dtos = controller.findAll();
        OutputHandler.printRecords(dtos);
        delayUtil.deplay();
        input.printMenu();
    }

    private void addNew() {
        dto = input.playNew();
        OutputHandler.printResult(controller.addRecord(dto));
        delayUtil.deplay();
        input.printMenu();
    }

    private void delete() {
        System.out.println("---------------------------");
        System.out.println("삭제할 데이터의 id는 무엇인가요? ");
        int id = scanner.nextInt();
        System.out.println("---------------------------");
        controller.deleteById(id);
        System.out.println("정상적으로 삭제되었습니다.");
    }

    private void addWithPrevious() {
        System.out.println("---------------------------");
        List<RecordDto> dtos = controller.findAll();
        OutputHandler.printRecords(dtos);
        System.out.print("몇번째 계산 결과를 사용하시겠습니까? ");
        int id = scanner.nextInt();
        System.out.println("---------------------------");
        dto = input.playContinue(controller.findPrev(id));
        OutputHandler.printResult(controller.addRecord(dto));
        delayUtil.deplay();
        input.printMenu();
    }
}
