package com.todo.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String briefDescription;
    private String description;
    private LocalDate deadline;

    public TodoItem(String briefDescription, String description, LocalDate deadline) {
        this.briefDescription = briefDescription;
        this.description = description;
        this.deadline = deadline;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
