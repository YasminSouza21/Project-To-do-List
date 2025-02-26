package com.yasminsz.todolist.dtos;

import com.yasminsz.todolist.entities.enuns.TaskCategory;

import java.time.LocalDate;

public record TaskCreateDTO(String name, TaskCategory category, LocalDate endDate) {
}
