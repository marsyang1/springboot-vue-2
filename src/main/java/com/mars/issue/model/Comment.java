package com.mars.issue.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Comment {

    @Id
    private String id = UUID.randomUUID().toString();
    private String subscriber;
    @ManyToOne
    @JoinColumn(name = "issue")
    private Issue issue;
    private String description = "";

    public Comment(String subscriber, Issue issue) {
        this.subscriber = subscriber;
        this.issue = issue;
    }

    public Comment(String subscriber, Issue issue, String description) {
        this.subscriber = subscriber;
        this.issue = issue;
        this.description = description;
    }
}
