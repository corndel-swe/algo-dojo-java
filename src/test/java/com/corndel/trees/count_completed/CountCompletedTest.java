package com.corndel.trees.count_completed;

import com.corndel.trees.dto.Task;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CountCompletedTest {

    private final CountCompleted countCompleted = new CountCompleted();

    //    TODO : CONVERT DATA.JSON AS TICKET

    @Test
    void countCompletedIterative() {
        Task task = new Task("id", "title", false, 5, new ArrayList<>());
        int count = countCompleted.countCompletedA(task);
        // EXPECTED 7
        assertEquals(0, count);
    }

    @Test
    void countCompletedRecursive() {
        Task task = new Task("id", "title", false, 5, new ArrayList<>());
        int count = countCompleted.countCompletedB(task);
        // EXPECTED 7
        assertEquals(0, count);
    }
}