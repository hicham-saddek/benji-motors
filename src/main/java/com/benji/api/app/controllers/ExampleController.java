package com.benji.api.app.controllers;

import com.benji.api.app.data.ExamplePayload;
import com.benji.api.app.interfaces.ExamplesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/examples")
public class ExampleController {
    private final ExamplesService service;

    @Autowired
    public ExampleController(final ExamplesService service) {
        this.service = service;
    }

    /**
     * @return list of examples
     */
    @GetMapping
    public ResponseEntity<List<ExamplePayload>> index() {
        return ResponseEntity.ok(service.getAll());
    }

    /**
     * @param index Example id
     * @return example if found
     */
    @GetMapping("/{index}")
    public ResponseEntity<ExamplePayload> show(@PathVariable(name = "index") int index) {
        return service.getOne(index).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    /**
     * Create a new example
     *
     * @param payload example representation
     * @return list of all examples
     */
    @PostMapping
    public ResponseEntity<List<ExamplePayload>> create(ExamplePayload payload) {
        service.insert(payload);
        return ResponseEntity.ok(service.getAll());
    }

    /**
     * Delete an existing example
     *
     * @param index example id
     * @return list of all examples
     */
    @DeleteMapping("/{index}")
    public ResponseEntity<List<ExamplePayload>> destroy(@PathVariable(name = "index") int index) {
        service.delete(index);
        return ResponseEntity.ok(service.getAll());
    }
}
