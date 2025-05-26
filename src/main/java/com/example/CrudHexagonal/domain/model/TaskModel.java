package com.example.CrudHexagonal.domain.model;


import lombok.Getter;

@Getter
public  class TaskModel {
    private final long id;
    private final String title;
    private final String description;
    private final boolean isDone;

    public TaskModel(long id, String title, String description, boolean isDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isDone = isDone;
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
