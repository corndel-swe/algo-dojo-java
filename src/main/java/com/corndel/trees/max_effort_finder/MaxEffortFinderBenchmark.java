package com.corndel.trees.max_effort_finder;

import com.corndel.benchmark.BenchmarkConfig;
import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class MaxEffortFinderBenchmark extends BenchmarkConfig {

    private Task task;

    @Setup(Level.Invocation)
    public void setupTrial() {
        task = TaskMapper.jsonToTask("task.json");
    }

    @Benchmark
    public void iterative(Blackhole bh) {
        new MaxEffortFinder().findIterative(task);
        bh.consume(task);
    }

    @Benchmark
    public void recursive(Blackhole bh) {
        new MaxEffortFinder().findRecursive(task);
        bh.consume(task);
    }

}
