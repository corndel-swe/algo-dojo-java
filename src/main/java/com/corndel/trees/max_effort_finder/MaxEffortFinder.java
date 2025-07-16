package com.corndel.trees.max_effort_finder;

import com.corndel.trees.dto.Task;

import java.util.Stack;

public class MaxEffortFinder {

    public int findIterative(Task task) {
        int maxEffort = task.getEffort();
        Stack<Task> stack = new Stack<>();
        stack.push(task);

        while (!stack.isEmpty()) {
            Task node = stack.pop();
            if (node.getEffort() > maxEffort) {
                maxEffort = node.getEffort();
            }
            for (Task child : node.getChildren()) {
                stack.push(child);
            }
        }

        return maxEffort;
    }

    public int findRecursive(Task task) {
        int maxEffort = task.getEffort();
        for (Task child : task.getChildren()) {
            int childMax = findRecursive(child);
            if (childMax > maxEffort) {
                maxEffort = childMax;
            }
        }
        return maxEffort;
    }
}
