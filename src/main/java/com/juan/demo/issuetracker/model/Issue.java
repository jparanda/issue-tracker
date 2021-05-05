package com.juan.demo.issuetracker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "issues")
public class Issue {

    @Id
    private String id;
    private final String description;
    private final int severity;
    private final String assignee;
}
