package com.corndel.trees.effort_totaller;

import com.corndel.trees.dto.Task;

import java.util.Stack;

public class EffortTotaller {

    public static int totalIterative(Task task) {
        int total = 0;

        if (task == null) {
            return total;
        }

        Stack<Task> stack = new Stack<>();
        stack.push(task);

        while (!stack.isEmpty()) {
            Task node = stack.pop();
            total += node.getEffort();

            for (Task child : node.getChildren()) {
                stack.push(child);
            }
        }

        return total;
    }


    public static int totalRecursive(Task task) {
        int total = 0;

        if (task == null) {
            return 0;
        }

        total += task.getEffort();

        for (Task child : task.getChildren()) {
            total += totalRecursive(child);
        }

        return total;
    }

}
