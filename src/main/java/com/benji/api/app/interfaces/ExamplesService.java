package com.benji.api.app.interfaces;

import com.benji.api.app.data.ExamplePayload;
import com.benji.api.app.models.Example;

import java.util.List;
import java.util.Optional;

public interface ExamplesService {
    List<Example> getAll();

    Optional<ExamplePayload> getOne(int id);

    void insert(ExamplePayload payload);

    void delete(int index);
}
