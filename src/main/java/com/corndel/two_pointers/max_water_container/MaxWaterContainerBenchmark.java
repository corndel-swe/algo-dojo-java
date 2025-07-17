package com.corndel.two_pointers.max_water_container;

import com.corndel.benchmark.BenchmarkConfig;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Random;

@State(Scope.Benchmark)
public class MaxWaterContainerBenchmark extends BenchmarkConfig {

    @Param({"100", "10000"})
    public int N;

    private int[] heights;

    @Setup(Level.Trial)
    public void setup() {
        heights = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            heights[i] = random.nextInt(100) + 1; // Heights between 1 and 100
        }
    }

    @Benchmark
    public void mostWaterNestedLoop(Blackhole bh) {
        int result = MaxWaterContainer.mostWaterNestedLoop(heights);
        bh.consume(result);
    }

    @Benchmark
    public void mostWaterTwoPointers(Blackhole bh) {
        int result = MaxWaterContainer.mostWaterTwoPointers(heights);
        bh.consume(result);
    }
}
