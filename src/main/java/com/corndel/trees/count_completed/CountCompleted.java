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

            if (node.isDone()) {
                count++;
            }

            for (Task child : node.getChildren()) {
                stack.push(child);
            }
        }

        return count;
    }

    public int countCompletedB(Task task) {
        int count = task.isDone() ? 1 : 0;
        for (Task child : task.getChildren()) {
            count += countCompletedB(child);
        }
        return count;
    }

}
