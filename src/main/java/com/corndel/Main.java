package com.corndel;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Options opt = new OptionsBuilder()
                .include(String.join(File.separator, args))
                .build();
        try {
            new Runner(opt).run();
        } catch (RunnerException e) {
            System.out.println("Unable to match : " + Arrays.toString(args));
        }
    }
}
