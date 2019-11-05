package com.ohjelmistoprojekti.syksy2019.domain.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
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
    @Column(name = "situationDescription", nullable = true, unique = false)
    private String situationDescription;

    /**
     * Deadline
     *  TODO: koita saada date-formaattiin (toistaiseksi pelkkä String)
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
    @Column(name = "problemDescription", nullable = true, unique = false)
    private String problemDescription;

    /**
     * Kysyjän tietotaito
     *  [Textbox]
     */
    @Column(name = "yourSkills", nullable = true, unique = false)
    private String yourSkills;

    /**
     * Kysymyksen ohjelmointikielet
     *  [Checkbox]
     */
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "prorgammingLanguagesId")
    ProgrammingLanguages programmingLanguages;


    /* ************************************ */
    public Question() {}

    public Question(
            IsSchoolProject isSchoolProject,
            String situationDescription,
            String deadline,
            String schedule,
            String problemDescription,
            String yourSkills,
            ProgrammingLanguages programmingLanguages) {
        this.isSchoolProject = isSchoolProject;
        this.situationDescription = situationDescription;
        this.deadline = deadline;
        this.schedule = schedule;
        this.problemDescription = problemDescription;
        this.yourSkills = yourSkills;
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

    public String getSituationDescription() {
        return situationDescription;
    }

    public void setSituationDescription(String situationDescription) {
        this.situationDescription = situationDescription;
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

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getYourSkills() {
        return yourSkills;
    }

    public void setYourSkills(String yourSkills) {
        this.yourSkills = yourSkills;
    }

    public ProgrammingLanguages getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ProgrammingLanguages programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}

