package com.corndel.trees.count_completed;

import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCompletedTest {

    private final CountCompleted countCompleted = new CountCompleted();

    @Test
    void countCompletedIterative() {
        Task task = TaskMapper.jsonToTask("data.json");
        int count = countCompleted.countCompletedA(task);
        assertEquals(7, count);
    }

    @Test
    void countCompletedRecursive() {
        Task task = TaskMapper.jsonToTask("data.json");
        int count = countCompleted.countCompletedB(task);
        assertEquals(7, count);
    }
}