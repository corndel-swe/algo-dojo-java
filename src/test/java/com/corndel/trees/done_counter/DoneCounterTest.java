package com.corndel.trees.done_counter;

import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoneCounterTest {

    private final DoneCounter doneCounter = new DoneCounter();

    @Test
    void countIterative() {
        Task task = TaskMapper.jsonToTask("task.json");
        int count = doneCounter.countIterative(task);
        assertEquals(7, count);
    }

    @Test
    void countRecursive() {
        Task task = TaskMapper.jsonToTask("task.json");
        int count = doneCounter.countRecursive(task);
        assertEquals(7, count);
    }
}