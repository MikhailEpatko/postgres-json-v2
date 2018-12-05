package ru.epatko.postgresjsonv2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.epatko.postgresjsonv2.model.MyNewModel;

@Repository
public interface MyRepository extends CrudRepository<MyNewModel, Long> {
}
