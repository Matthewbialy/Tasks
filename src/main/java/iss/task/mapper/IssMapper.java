package iss.task.mapper;

import iss.task.domain.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class IssMapper {
    public IssTask mapToTask(final IssTask issTask) {
        return new IssTask(
                issTask.getName(),
                issTask.getSurname());

    }

    public IssTaskDto mapToTaskDto(final IssTaskDto issTaskDto) {
        return new IssTaskDto(
                issTaskDto.getName(),
                issTaskDto.getSurname());
    }

    public IssVelocity mapToVelocity(final IssVelocity issVelocity) {
        return new IssVelocity(issVelocity.getVelocity());
    }

    public IssTime mapToTime(final IssTime issTime) {
        return new IssTime(issTime.getIssTime());
    }

    public IssDistance mapToDistance(final IssDistance issDistance) {
        return new IssDistance(issDistance.getDistance());
    }

    public List<IssTaskDto> mapToTaskDtoList(final List<IssTask> issTaskList) {
        return issTaskList.stream()
                .map(t-> new IssTaskDto(t.getName(), t.getSurname()))
                .collect(Collectors.toList());
    }
}
