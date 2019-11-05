package com.ohjelmistoprojekti.syksy2019.domain.question;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProgrammingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long programmingLanguagesId;

    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "programmingLanguages")   // OneToMany
    private List<Question> questions;


    /* ************************************ */
    public ProgrammingLanguages() {}

    public ProgrammingLanguages(String value) {
        this.value = value;
    }

    public Long getProgrammingLanguagesId() {
        return programmingLanguagesId;
    }

    public void setProgrammingLanguagesId(Long programmingLanguagesId) {
        this.programmingLanguagesId = programmingLanguagesId;
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
