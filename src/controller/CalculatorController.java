package controller;

import dto.RecordDto;
import service.CalculatorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public RecordDto addRecord(RecordDto dto) {
        return calculatorService.save(dto);
    }

    public List<RecordDto> findAll() {
        return calculatorService.findAll();
    }

    public Double findPrev(int id) {
        return calculatorService.findPrevById(id);
    }

    public void deleteById(int id) {
        calculatorService.deleteById(id);
    }

}
