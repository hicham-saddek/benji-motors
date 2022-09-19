package com.benji.api.app.repositories;

import com.benji.api.app.models.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Long> {
}
