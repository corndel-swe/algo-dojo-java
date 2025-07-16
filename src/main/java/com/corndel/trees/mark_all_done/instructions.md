# Mark All Done

## The problem

You are given a tree of tasks. Each task has a `done` property that is either
`true` or `false`.

Complete the two methods on the `MarkAllDone` class that updates the given task and all its subtasks
so that every `done` value is set to `true`.

These methods should mutate the original given data structure in place.

You should write two versions:

- `MarkAllDone.iterative`: uses an iterative approach
- `MarkAllDone.recursive`: uses recursion

---

## Iterative approach: `MarkAllDone.iterative`

Use a stack to walk through the tree and mutate each node.

Steps:

1. Create a stack with the root node in it.
2. While the stack is not empty:
    - Remove the top node from the stack.
    - Set `done` to `true` on that node.
    - Add each of its children to the stack.

---

## Recursive approach: `MarkAllDone.recursive`

Use a recursive function to update each node and its children.

Steps:

1. Set `done` to `true` on that node.

2. Call the function recursively on each child.
