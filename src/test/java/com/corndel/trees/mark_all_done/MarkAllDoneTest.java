package com.corndel.trees.mark_all_done;

import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarkAllDoneTest {

    private Task tasks;
    private final Task expected = TaskMapper.jsonToTask("completed-task.json");
    private final MarkAllDone markAllDone = new MarkAllDone();

    @BeforeEach
    public void setUp() {
        tasks = TaskMapper.jsonToTask("task.json");
    }

    @Test
    void iterative() {
        markAllDone.iterative(tasks);
        assertEquals(expected, tasks);
    }

    @Test
    void recursive() {
        markAllDone.recursive(tasks);
        assertEquals(expected, tasks);
    }
}