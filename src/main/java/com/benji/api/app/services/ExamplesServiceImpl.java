package com.benji.api.app.services;

import com.benji.api.app.data.ExamplePayload;
import com.benji.api.app.interfaces.ExamplesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ExamplesServiceImpl implements ExamplesService {
    private final List<ExamplePayload> list = new ArrayList<>();

    @Override
    public List<ExamplePayload> getAll() {
        return list;
    }

    @Override
    public Optional<ExamplePayload> getOne(int id) {
        if (list.size() > id)
            return Optional.of(list.get(id));
        return Optional.empty();
    }

    @Override
    public void insert(ExamplePayload payload) {
        list.add(payload);
    }

    @Override
    public void delete(int index) {
        if (list.size() > index)
            list.remove(index);
    }
}
