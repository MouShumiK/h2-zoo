package com.example.h2zoo.repository;

import com.example.h2zoo.model.Mammals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MammalsRepository extends CrudRepository<Mammals, Long> {
}
