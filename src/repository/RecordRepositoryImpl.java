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
    public void save(CalculatorRecord calculatorRecord) {

        records.add(calculatorRecord
        );
    }
}
