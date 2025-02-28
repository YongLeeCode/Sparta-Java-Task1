package repository;

import Entity.CalculatorRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RecordRepositoryImpl implements RecordRepository {
    private static List<CalculatorRecord> records = new ArrayList<>();

    // findAll
    public List<CalculatorRecord> findAll() {
        return records;
    }

    // findOneById
    public Optional<CalculatorRecord> findById(int id) {
        return records.stream()
                .filter((x) -> x.getId() == id)
                .findFirst();
    }

    // addNew
    public CalculatorRecord save(CalculatorRecord calculatorRecord) {
        records.add(calculatorRecord);
        return calculatorRecord;
    }

    // delete Data
    public void deleteById(int id) {
        records.remove(id - 1);
    }

}
