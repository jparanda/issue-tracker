package com.juan.demo.issuetracker.controller;

import com.juan.demo.issuetracker.model.Issue;
import com.juan.demo.issuetracker.service.IssueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@RestController
@RequestMapping("/issue-api/v1")
public class IssueController {

    @Autowired
    private IssueService issueService;

    @GetMapping("/issues")
    public List<Issue> getAllIssues() {
        log.info("Getting all issues from database");
        return issueService.findAllIssues();
    }

    @GetMapping(value = "/{issueId}")
    public Issue getIssueById(@PathVariable String issueId) {
        log.info("Getting issue with ID: {}.", issueId);
        return issueService.findIssueById(issueId)
                .orElseThrow(() -> new NoSuchElementException("Issue doesn't exists for ID :" + issueId));
    }

    @PostMapping(value = "/issues")
    public Issue addNewIssue(@RequestBody Issue issue) {
        log.info("Saving issue.");
        return issueService.createNewIssue(issue);
    }
}
