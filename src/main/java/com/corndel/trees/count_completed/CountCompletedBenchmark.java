package com.corndel.trees.count_completed;

import com.corndel.benchmark.BenchmarkConfig;
import com.corndel.trees.dto.Task;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.Arrays;

@State(Scope.Benchmark)
public class CountCompletedBenchmark extends BenchmarkConfig {

    public enum CountCompleteType {
        COUNT_COMPLETE_ITERATIVE {
            @Override
            public void count(Task task) {
                new CountCompleted().countCompletedA(task);
            }
        },
        COUNT_COMPLETE_RECURSIVE {
            @Override
            public void count(Task task) {
                new CountCompleted().countCompletedB(task);
            }
        };

        public abstract void count(Task task);

    }

    @Param
    public CountCompleteType countCompleter;

    // CAN NOT RUN ON PRIMITIVES
    @Param
    public Task task;

    @Setup(Level.Invocation)
    public void setupInvocation() {
        // TODO: READ DATA
        task = new Task("id", "title", false, 5, new ArrayList<>());
    }

    @Benchmark
    public void benchmarkCountCompleted(Blackhole bh) {
        countCompleter.count(task);
        bh.consume(task);
    }

}
