package com.corndel.trees.count_completed;

import com.corndel.benchmark.BenchmarkConfig;
import com.corndel.trees.dto.Task;
import com.corndel.trees.dto.TaskMapper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

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

    public Task task;

    @Setup(Level.Trial)
    public void setupTrial() {
        task = TaskMapper.jsonToTask("data.json");
    }

    @Benchmark
    public void benchmarkCountCompleted(Blackhole bh) {
        countCompleter.count(task);
        bh.consume(task);
    }

}
