package com.mars.issue.repo;

import com.mars.issue.model.Issue;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IssueRepository extends PagingAndSortingRepository<Issue, String> {

}
