package com.corndel.trees.task_counter;

import com.corndel.trees.dto.Task;

import java.util.Stack;

public class TaskCounter {

    public int countIterative(Task task) {
        int count = 0;
        Stack<Task> stack = new Stack<>();
        stack.push(task);

        while (!stack.isEmpty()) {
            Task node = stack.pop();
            count++;
            for (Task child : node.getChildren()) {
                stack.push(child);
            }
        }

        return count;
    }


    public int countRecursive(Task task) {
        int count = 1;
        for (Task child : task.getChildren()) {
            count += countRecursive(child);
        }
        return count;
    }
}
