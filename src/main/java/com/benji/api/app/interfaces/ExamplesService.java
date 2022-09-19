package com.benji.api.app.interfaces;

import com.benji.api.app.data.ExamplePayload;

import java.util.List;
import java.util.Optional;

public interface ExamplesService {
    List<ExamplePayload> getAll();

    Optional<ExamplePayload> getOne(int id);

    void insert(ExamplePayload payload);

    void delete(int index);
}
