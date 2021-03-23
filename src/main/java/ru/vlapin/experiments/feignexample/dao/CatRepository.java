package ru.vlapin.experiments.feignexample.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.feignexample.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
