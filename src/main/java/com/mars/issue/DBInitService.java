package com.mars.issue;

import com.mars.issue.model.Person;
import com.mars.issue.repo.IssueRepository;
import com.mars.issue.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DBInitService {

    final IssueRepository issueRepository;
    final PersonRepository personRepository;

    @Autowired
    public DBInitService(IssueRepository issueRepository, PersonRepository personRepository) {
        this.issueRepository = issueRepository;
        this.personRepository = personRepository;
    }

    @PostConstruct
    void init(){
        Person person = new Person();

    }
}
