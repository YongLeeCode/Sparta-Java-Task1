package service;

import Entity.CalculatorRecord;
import repository.RecordRepository;

import java.util.List;

public class CalculatorService {
    private RecordRepository recordRepository;

    public CalculatorService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<CalculatorRecord> findAll() {
        System.out.println(recordRepository.findAll());
        List<CalculatorRecord> calculatorRecords = recordRepository.findAll();
        System.out.println(calculatorRecords);
        return recordRepository.findAll();
    }

    public void save() {
        CalculatorRecord rec = new CalculatorRecord(0, 1, 2, '+', 3);
        recordRepository.save(rec);
        System.out.println(recordRepository.findAll());
    }
}
