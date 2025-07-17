package com.corndel.trees.done_counter;

import com.corndel.trees.dto.Task;

import java.util.Stack;

public class DoneCounter {

    public static int countIterative(Task task) {
        int count = 0;
        Stack<Task> stack = new Stack<>();
        stack.push(task);

        while (!stack.isEmpty()) {
            Task node = stack.pop();

            if (node.isDone()) {
                count++;
            }

            for (Task child : node.getChildren()) {
                stack.push(child);
            }
        }

        return count;
    }

    public static int countRecursive(Task task) {
        int count = task.isDone() ? 1 : 0;
        for (Task child : task.getChildren()) {
            count += countRecursive(child);
        }
        return count;
    }

}
