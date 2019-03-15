package iss.task.service;

import iss.task.domain.IssTask;
import iss.task.repository.IssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssService {

    @Autowired
    private IssRepository repository;

    public List<IssTask> getAllTasks() {
        return repository.findAll();
    }
}
