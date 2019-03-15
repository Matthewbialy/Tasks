package iss.task.repository;

import iss.task.domain.IssVelocity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IssRepositoryVelocity extends CrudRepository<IssVelocity, Long> {

    @Autowired
    List<IssVelocity> getIssVelocity();
}
