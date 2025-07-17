package com.corndel.trees.mark_all_done;

import com.corndel.trees.dto.Task;

import java.util.Stack;

public class MarkAllDone {
    public static void iterative(Task task) {
        Stack<Task> stack = new Stack<>();
        stack.push(task);

        while (!stack.isEmpty()) {
            Task node = stack.pop();
            node.setDone(true);
            for (Task child : node.getChildren()) {
                stack.push(child);
            }
        }

    }

    public static void recursive(Task task) {
        task.setDone(true);
        for (Task child : task.getChildren()) {
            recursive(child);
        }
    }
}