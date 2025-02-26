package com.yasminsz.todolist.entities;

import com.yasminsz.todolist.entities.enuns.TaskCategory;
import com.yasminsz.todolist.entities.enuns.TaskStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private TaskCategory category;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;
}
