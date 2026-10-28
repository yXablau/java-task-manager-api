package br.com.pedro.java_task_manager_api.model;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private boolean completed;
    private String description;
    private LocalDateTime createdat;
    private LocalDateTime completedat;

    public Task(Long id, String title, boolean completed, String description, LocalDateTime createdat, LocalDateTime completedat) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.description = description;
        this.createdat = createdat;
        this.completedat = completedat;
    }
    public Task(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public LocalDateTime getCompletedat() {
        return completedat;
    }

    public void setCompletedat(LocalDateTime completedat) {
        this.completedat = completedat;
    }
}
