package service;

import Entity.CalculatorRecord;
import dto.RecordDto;
import repository.RecordRepository;
import service.calculate.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CalculatorServiceImpl implements CalculatorService {
    private RecordRepository recordRepository;

    public CalculatorServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<RecordDto> findAll() {
        List<CalculatorRecord> calculatorRecords = recordRepository.findAll();
        List<RecordDto> dtos = new ArrayList<>();
        calculatorRecords.stream()
                .forEach(record -> {
                    dtos.add(RecordDto.fromEntity(record));
                });
        return dtos;
    }

    public RecordDto save(RecordDto dto) {
        CalculatorRecord rec = dto.toEntity(calculate(dto));
        CalculatorRecord result = recordRepository.save(rec);
        return RecordDto.fromEntity(result);
    }

    public Double findPrevById(int id) {
        Optional<CalculatorRecord> rec = recordRepository.findById(id);
        if (rec.isPresent()) {
            return rec.get().getResult();
        }
        return null;
    }

    public void deleteById(int id) {
        recordRepository.deleteById(id);
    };

    private double calculate(RecordDto dto) {
        Operator op = Operator.fromSymbol(dto.getOperator());
        ArithmeticCalculator arithmeticCalculator = map.get(op.toString());
        return arithmeticCalculator.calculate(dto.getFirstNumber(), dto.getSecondNumber());
    }

    private final Map<String, ArithmeticCalculator> map = Map.of(
            "PLUS", new PlusCalculator(),
            "SUBTRACT", new SubtractCalculator(),
            "MULTIPLY", new MultiplyCalculator(),
            "DIVIDE", new DivideCalculator()
    );
}
