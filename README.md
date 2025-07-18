# Algo Dojo Java

<p align="center">
  <img width="200px" src="src/main/resources/images/logo.png" />
</p>

Welcome, warrior!

This repo is all about algorithms and data structures.

## Getting started

Clone the repo so you have it locally.

The next two steps are optional, you do not need to run the CLI commands if you are using IntelliJ. You do not need to
use intellij you can use a combination of vscode and the CLI if you prefer.

### Using IntelliJ

1. Get the application's dependencies by executing the maven goals `clean` & `compile` separately.
    - Toolbar -> Help -> Find Action -> Execute Maven Goal
2. Install the [JMH Benchmarking Plugin](https://plugins.jetbrains.com/plugin/7529-jmh-java-microbenchmark-harness)
    - Once installed classes configured for Benchmarking will be runnable. Classes within a package with Benchmark in
      their name.
    - To run click the orange play button next to the icon of a clock.
    - You are able to run the class or the individual method.
3. The project uses Junit to run the tests navigate to the corresponding test class and click the green play button to
   run tests.

### Using the CLI

1. Run the following to get the application's dependencies:

    ```bash
    ./mvnw clean
    ./mvnw compile
    ```
2. To run the benchmarks you will need to build the jar file for the project and then run the jar passing the benchmark
   class as an argument.
    - You will want to do this step each time you work on the repo to keep the jar up to date.

```bash
    ./mvnw clean verify
    java -jar target/benchmarks.jar SortingBenchmark
```

3. The project uses Junit to run the tests run the following in the cli. You can change the `-Dtest=` flag to specify
   spefic tests to run.

```bash
./mvnw test -Dtest=DoneCounterTest
```

## BenchMarking?

JMH stands for the Java Microbenchmark Harness. It's a specialized toolkit designed to help you accurately measure the performance (speed) of small pieces of Java code.

##  Charlie Todo

- [x] 
    - Unit Tests working
    - CLI
        - `mvn test`
- [x] 
    - Benchmark working
    - JMH Intellij Plugin
    - CLI
        - `mvn clean verify`
        - `java -jar target/benchmarks.jar BenchTester`
- [x] 
    - Port Sort
- [x] 
    - Port Trees
    - [x] 
        - CONVERT DATA TO Ticket RECORD FOR TESTS - OBJECT MAPPER?
- x - Port Two Pointers
- [x] 
    - Images
- [x] 
    - Maven wrapper
- [] - Readme & Instructions
- [] - Format
- [] - Remove solutions
