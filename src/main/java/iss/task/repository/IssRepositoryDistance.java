package iss.task.repository;

import iss.task.domain.IssDistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IssRepositoryDistance extends CrudRepository<IssDistance, Long> {
    @Autowired
    List<IssDistance> getIssDistance();
}
