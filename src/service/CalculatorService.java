package service;

import dto.RecordDto;

import java.util.List;

public interface CalculatorService {
    List<RecordDto> findAll();

    RecordDto save(RecordDto dto);

    Double findPrevById(int id);

    void deleteById(int id);
}
