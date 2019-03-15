package iss.task.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "task")
public class IssTask {

    @Id
    @Column(name = "name")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    @Column(name = "surname")
    private String surname;

}
