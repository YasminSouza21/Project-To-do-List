package com.yasminsz.todolist.dtos;

import com.yasminsz.todolist.entities.enuns.TaskCategory;
import com.yasminsz.todolist.entities.enuns.TaskStatus;

import java.time.LocalDate;

public record TaskUpdateDTO(String name, TaskCategory category, LocalDate endDatem, TaskStatus status) {
}
