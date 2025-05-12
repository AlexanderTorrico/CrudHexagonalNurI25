package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.task;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column    private boolean isDone;
}
