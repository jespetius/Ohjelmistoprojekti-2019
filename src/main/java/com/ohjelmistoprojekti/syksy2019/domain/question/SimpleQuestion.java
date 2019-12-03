package com.ohjelmistoprojekti.syksy2019.domain.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SimpleQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "simpleQuestion")
    private List<SimpleAnswer> simpleAnswers;

    @Column(name = "title", nullable = true, unique = false)
    private String title;

    @Column(name = "description", nullable = true, unique = false)
    private String description;

    @ElementCollection
    @CollectionTable(name="listOfAnswers")
    private List<String> answers = new ArrayList<String>();
    
	public SimpleQuestion() {}
    
    
	public SimpleQuestion(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public SimpleQuestion(ArrayList<String> answers, String title, String description) {
		this.answers = answers;
		this.title = title;
		this.description = description;
	}
	
	
	
	/* ************************* */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
    public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}


