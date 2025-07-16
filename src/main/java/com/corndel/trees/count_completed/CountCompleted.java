package com.corndel.trees.count_completed;

import com.corndel.trees.dto.Task;

import java.util.Stack;

public class CountCompleted {

    public int countCompletedA(Task task) {
        int count = 0;
        Stack<Task> stack = new Stack<>();
        stack.push(task);

        while (!stack.isEmpty()) {
            Task node = stack.pop();

            if (node.done()) {
                count++;
            }

            for (Task child : node.children()) {
                stack.push(child);
            }
        }

        return count;
    }

    public int countCompletedB(Task task) {
        int count = task.done() ? 1 : 0;
        for (Task child : task.children()) {
            count += countCompletedB(child);
        }
        return count;
    }

}
