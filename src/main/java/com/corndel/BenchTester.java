package com.corndel;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;


import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 1)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 2, time = 2, timeUnit = TimeUnit.SECONDS)
public class BenchTester {

    @Benchmark
    public void benchmark(Blackhole bh) {
        int res = new Tester().test();
        bh.consume(res);
    }

}
