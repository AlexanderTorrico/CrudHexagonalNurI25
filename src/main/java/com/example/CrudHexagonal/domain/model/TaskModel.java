package com.example.CrudHexagonal.domain.model;


import lombok.Getter;

@Getter
public  class TaskModel {
    private final Long id;
    private final String title;
    private final String description;
    private final boolean isDone;
    private final Long userId;

    public TaskModel(Long id, String title, String description, boolean isDone, Long userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isDone = isDone;
        this.userId = userId;
    }



    @Override
    public String toString() {
        return "TaskModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
