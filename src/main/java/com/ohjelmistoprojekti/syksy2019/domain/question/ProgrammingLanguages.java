package com.ohjelmistoprojekti.syksy2019.domain.question;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProgrammingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long progammingLanguagesId;

    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programmingLanguages")
    private List<Question> questions;


    /* ************************************ */
    public ProgrammingLanguages() {}

    public ProgrammingLanguages(String value) {
        this.value = value;
    }

    public Long getProgammingLanguagesId() {
        return progammingLanguagesId;
    }

    public void setProgammingLanguagesId(Long progammingLanguagesId) {
        this.progammingLanguagesId = progammingLanguagesId;
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
