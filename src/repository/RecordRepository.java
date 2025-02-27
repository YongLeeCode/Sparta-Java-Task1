package repository;

import Entity.CalculatorRecord;

import java.util.List;
import java.util.Optional;

public interface RecordRepository {
    List<CalculatorRecord> findAll();

    void save(CalculatorRecord calculatorRecord);

    Optional<CalculatorRecord> findById(int id);
}
