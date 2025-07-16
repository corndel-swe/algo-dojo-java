package com.corndel.trees.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TaskMapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static String taskToString(Task task) {
        try {
            return objectMapper.writeValueAsString(task);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Task jsonToTask(String fileName) {

        String json = readJsonFromResourcesData(fileName);

        try {
            return objectMapper.readValue(json, Task.class);
        } catch (JsonProcessingException | RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readJsonFromResourcesData(String fileName) {
        Path path = Paths.get("src", "main", "resources", "data", fileName);

        try {
            return String.join("", Files.readAllLines(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
