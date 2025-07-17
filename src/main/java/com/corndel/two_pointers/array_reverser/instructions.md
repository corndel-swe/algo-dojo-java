# ArrayReverser

## The Problem

You're given an integer array. Your task is to complete the two methods on the `ArrayReverser` class they should return a new array with the elements in reverse order.

## Brute Force Solution: `ArrayReverser.reverseNestedLoop`

Use a loop that starts from the end of the array and `push()` each element to a
new array.

- Time complexity: O(n)
- Space complexity: O(n) (due to the new array)

## Two-Pointer Solution: `ArrayReverser.reverseTwoPointers`

1. Copy the array to avoid modifying the input directly.
2. Use two pointers:
   - `left = 0`
   - `right = arr.length - 1`
3. While `left < right`, swap the elements at those positions.
4. Move both pointers inward until they meet.

- Time complexity: O(n)
- Space complexity: O(n) for the copy, but no extra allocations during swaps
