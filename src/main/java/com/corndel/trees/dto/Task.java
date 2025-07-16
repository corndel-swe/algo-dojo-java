package com.corndel.trees.dto;

import java.util.List;

public class Task {
    private String id;
    private String title;
    private boolean done;
    private int effort;
    private List<Task> children;

    public Task() {
    }

    public Task(String id, String title, boolean done, int effort, List<Task> children) {
        this.id = id;
        this.title = title;
        this.done = done;
        this.effort = effort;
        this.children = children;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public List<Task> getChildren() {
        return children;
    }

    public void setChildren(List<Task> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Task[" +
                "id=" + id + ", " +
                "title=" + title + ", " +
                "done=" + done + ", " +
                "effort=" + effort + ", " +
                "children=" + children + ']';
    }

}
