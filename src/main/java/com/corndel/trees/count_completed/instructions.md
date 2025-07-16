# Count Completed Tasks

## The problem

You are given a tree of tasks. Each task has a `done` property that is either
`true` or `false`, and a `children` property that is a list of `Task`.

Complete the two methods on the `CountCompleted` class, the methods should return the number of completed
tasks in the given tree, including the root and all descendants.

With each method take a different approach:

- `CountCompleted.countCompletedIterative`: uses an iterative approach
- `CountCompleted.countCompletedB()`: uses recursion
---

## Iterative approach: `CountCompleted.countCompletedIterative`

Use a stack to simulate walking through the tree.

Steps:

1. Create a counter (start at 0).
2. Create a stack with the root node in it.
3. While the stack is not empty:
   - Remove the top node from the stack.
   - If the node's `done` property is true, increment the counter.
   - Add each of the node's children to the stack.
4. Return the counter.

This version avoids recursion by managing your own stack with a loop.

---

## Recursive approach: `CountCompleted.countCompletedB`

Let the function call itself for each node’s children.

Steps:

1. Create your base case, if the current node is done, count 1. Otherwise, count 0.
2. For each child in the node’s children, call the function recursively and add
   the result to your count.
3. Return the total count.

This version is shorter and easier to follow, but depends on the call stack
instead of a manual one.
