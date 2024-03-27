package me.dio.sdw24.ports;

import me.dio.sdw24.model.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    List<Champions> findAll();

    Optional<Champions> findById(long id);
}
