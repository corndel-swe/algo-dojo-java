# Algo Dojo Java

<p align="center">
  <img width="200px" src="src/main/resources/images/logo.png" />
</p>

Welcome, warrior!

This repo is all about algorithms and data structures.

## Sorting

The `sorting` directory doesn't have any work for you to do, however it does
demonstrate how we can benchmark different solutions to help choose the most
performant one.

Try running `node sorting/benchmark.js` to see how they perform. The one with
the highest operations per second is the best.

## Two pointers

The `two-pointers` directory has a bunch of problems than can be solved
"naively" (using nested loops) or using a two-pointer solution.

For each problem, the `instructions.md` gives a description of the nested loop
code and the two-pointer code. See if you can reproduce each algorithm, then run
`npm test` and also the `*.benchmark.js` script in each file to see the
different in performance.

## Trees

When working with trees, we often need to traverse the tree to modify nodes or
aggregate information.

Two possible approaches here are the "stack" approach and the "recursion"
approach. (Technically, the recursion appraoch will use a "call stack"
internally, so the two are effectively very similar but the code looks slightly
different.)

Again, the `instructions.md` gives a detailed description of each solution. See
if you can implement the solution, use `npm test` to check, and the
`*.benchmark.js` script to check the performance difference.

## Beyond

This repos gives a taster of taking different approaches to two different
classes of problems. After some experience of working with algorithms, you will
come to realise that the same few problems tend to turn up again and again.


## Todo

- [x] - Unit Tests working
  - CLI
    - `mvn test`
- [x] - Benchmark working
  - JMH Intellij Plugin
  - CLI
    - `mvn clean verify`
    - `java -jar target/benchmarks.jar BenchTester`
- [x] - Port Sort
- [x] - Port Trees
  - [x] - CONVERT DATA TO Ticket RECORD FOR TESTS - OBJECT MAPPER?
- x - Port Two Pointers
- [x] - Images
- [] - Maven wrapper
- [] - Readme & Instructions
- [] - Format
- [] - Remove solutions
