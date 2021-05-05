package com.juan.demo.issuetracker.service;

import com.juan.demo.issuetracker.model.Issue;
import com.juan.demo.issuetracker.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssueService {

    @Autowired
    private IssueRepository issueRepository;

    public List<Issue> findAllIssues() {
        return issueRepository.findAll();
    }

    public Optional<Issue> findIssueById(String id) {
        return issueRepository.findById(id);
    }

    public Issue createNewIssue(Issue issue) {
        return issueRepository.save(issue);
    }



}
