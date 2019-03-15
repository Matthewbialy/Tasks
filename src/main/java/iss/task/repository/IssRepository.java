package iss.task.repository;

import iss.task.domain.IssTask;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IssRepository extends CrudRepository<IssTask, Long> {
    @Override
    List<IssTask> findAll();
}
