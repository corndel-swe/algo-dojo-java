package com.corndel.trees.max_effort_finder;

import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxEffortFinderTest {

    private final MaxEffortFinder maxEffortFinder = new MaxEffortFinder();
    private Task task;

    @BeforeEach
    void setUp() {
        task = TaskMapper.jsonToTask("task.json");
    }

    @Test
    void findIterative() {
        int max = maxEffortFinder.findIterative(task);
        assertEquals(20, max);
    }

    @Test
    void findRecursive() {
        int max = maxEffortFinder.findRecursive(task);
        assertEquals(20, max);
    }
}