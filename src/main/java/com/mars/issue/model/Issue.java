package com.mars.issue.model;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Issue {

    @Id
    private String id = UUID.randomUUID().toString();
    private String subscriber;
    private String title = "";
    private String description = "";
    @OneToMany(mappedBy = "issue")
    private List<Comment> commentList = Lists.newArrayList();


    public Issue(String subscriber, String title) {
        this.subscriber = subscriber;
        this.title = title;
    }

}
