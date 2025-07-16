package com.corndel.trees.mark_all_done;

import com.corndel.benchmark.BenchmarkConfig;
import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class MarkAllDoneBenchmark extends BenchmarkConfig {

    private Task task;

    @Setup(Level.Invocation)
    public void setupTrial() {
        task = TaskMapper.jsonToTask("task.json");
    }

    @Benchmark
    public void iterative(Blackhole bh) {
        new MarkAllDone().iterative(task);
        bh.consume(task);
    }

    @Benchmark
    public void recursive(Blackhole bh) {
        new MarkAllDone().recursive(task);
        bh.consume(task);
    }

}
