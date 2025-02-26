package com.yasminsz.todolist.dtos;

import com.yasminsz.todolist.entities.enuns.TaskCategory;
import com.yasminsz.todolist.entities.enuns.TaskStatus;

import java.time.LocalDate;

public record TaskResponseDTO(Long id, String name, TaskCategory category, LocalDate endDate, TaskStatus status) {
}
