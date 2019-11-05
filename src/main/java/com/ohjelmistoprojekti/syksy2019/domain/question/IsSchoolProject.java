package com.ohjelmistoprojekti.syksy2019.domain.question;

import javax.persistence.*;
import java.util.List;

@Entity
public class IsSchoolProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long isSchoolProjectId;

    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isSchoolProject")
    private List<Question> questions;


    /* ************************************ */
    public IsSchoolProject() {}

    public IsSchoolProject(String value) {
        this.value = value;
    }

    public Long getIsSchoolProjectId() {
        return isSchoolProjectId;
    }

    public void setIsSchoolProjectId(Long isSchoolProjectId) {
        this.isSchoolProjectId = isSchoolProjectId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
