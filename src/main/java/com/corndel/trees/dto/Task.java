package com.corndel.trees.dto;

import java.util.List;

public record Task(String id, String title, boolean done, int effort, List<Task> children) {
}
