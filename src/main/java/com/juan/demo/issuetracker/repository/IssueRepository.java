package com.juan.demo.issuetracker.repository;

import com.juan.demo.issuetracker.model.Issue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IssueRepository extends MongoRepository<Issue, String> {
}
