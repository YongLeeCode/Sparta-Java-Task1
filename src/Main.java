import controller.CalculatorController;
import dto.RecordDto;
import repository.RecordRepository;
import repository.RecordRepositoryImpl;

import io.InputHandler;
import io.OutputHandler;
import service.CalculatorServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Play play = new Play();
        play.runProgram();
    }
}