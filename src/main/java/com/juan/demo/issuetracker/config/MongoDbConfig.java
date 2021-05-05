package com.juan.demo.issuetracker.config;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"com.juan.demo.issuetracker.repository"})
public class MongoDbConfig {
}
