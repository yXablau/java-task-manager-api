package br.com.pedro.java_task_manager_api.model;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private boolean completed;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    public Task(String title, String description) {
        setTitle(title);
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
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
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("Titulo invalido");
        }
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

  //  public void setCompleted(boolean completed) {
//        this.completed = completed;
  //  }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void concluir() {
        this.completed = true;
        this.completedAt = LocalDateTime.now();
    }

    public void reabrir() {
        this.completed = false;
        this.completedAt = null;
    }

}
