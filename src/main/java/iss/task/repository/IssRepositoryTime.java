package iss.task.repository;

import iss.task.domain.IssTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface IssRepositoryTime extends CrudRepository<IssTime, Long> {

    @Autowired
    List<IssTime> getAll();
}
