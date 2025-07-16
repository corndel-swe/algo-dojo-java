package com.corndel.trees.task_counter;

import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskCounterTest {

    private final TaskCounter taskCounter = new TaskCounter();

    private final Task tasks = TaskMapper.jsonToTask("task.json");

    @Test
    public void countIterative() {
        int count = taskCounter.countIterative(tasks);
        assertEquals(16, count);
    }

    @Test
    public void countRecursive() {
        int count = taskCounter.countRecursive(tasks);
        assertEquals(16, count);
    }
}