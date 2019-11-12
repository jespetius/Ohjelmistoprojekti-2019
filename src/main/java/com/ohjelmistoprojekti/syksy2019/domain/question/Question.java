package com.ohjelmistoprojekti.syksy2019.domain.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id", nullable = false, unique = true)
    private Long id;

    /**
     * Onko kouluprojekti vai ei?
     *  [Radiobutton: Kyllä/Ei]
     */
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "isSchoolProjectId")
    private IsSchoolProject isSchoolProject;

    /**
     * "Jos vastasit edelliseen kysymykseen ei, kerro alla tarkemmin"
     *  [Textbox]
     */
    @Column(name = "description", nullable = true, unique = false)
    private String description;

    /**
     * Deadline
     *  TODO: koita saada date-formaattiin (toistaiseksi pelkkä String)
     *      => https://medium.com/@grokwich/spring-boot-thymeleaf-html-form-handling-762ef0d51327
     *  [Text]
     */
    @Column(name = "deadline", nullable = true, unique = false)
    private String deadline;

    /**
     * Aikataulu
     *  [Textbox]
     */
    @Column(name = "schedule", nullable = true, unique = false)
    private String schedule;

    /**
     * Ongelman kuvaus
     *  [Textbox]
     */
    @Column(name = "pescription", nullable = true, unique = false)
    private String pescription;

    /**
     * Kysyjän tietotaito
     *  [Textbox]
     */
    @Column(name = "skills", nullable = true, unique = false)
    private String skills;

    /**
     * Kysymyksen ohjelmointikielet
     *  [Checkbox]
     */
    @ManyToMany // ManyToOne
    @JsonIgnore
    @JoinColumn(name = "prorgammingLanguagesId")
    private List<ProgrammingLanguages> programmingLanguages;


    /* ************************************ */
    public Question() {}

    public Question(
            IsSchoolProject isSchoolProject,
            String description,
            String deadline,
            String schedule,
            String pescription,
            String skills,
            List<ProgrammingLanguages> programmingLanguages) {
        this.isSchoolProject = isSchoolProject;
        this.description = description;
        this.deadline = deadline;
        this.schedule = schedule;
        this.pescription = pescription;
        this.skills = skills;
        this.programmingLanguages = programmingLanguages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IsSchoolProject getIsSchoolProject() {
        return isSchoolProject;
    }

    public void setIsSchoolProject(IsSchoolProject isSchoolProject) {
        this.isSchoolProject = isSchoolProject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getpescription() {
        return pescription;
    }

    public void setpescription(String pescription) {
        this.pescription = pescription;
    }

    public String getskills() {
        return skills;
    }

    public void setskills(String skills) {
        this.skills = skills;
    }

    public List<ProgrammingLanguages> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<ProgrammingLanguages> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}

