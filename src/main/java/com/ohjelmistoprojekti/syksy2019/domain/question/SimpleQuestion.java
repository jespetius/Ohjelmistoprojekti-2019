package com.ohjelmistoprojekti.syksy2019.domain.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.persistence.*;
import java.util.List;

@Entity
public class SimpleQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    
    @ManyToMany
    @JsonIgnore
    @JoinColumn(name = "answerId")
    private List<SimpleAnswer> simpleAnswers;

    @Column(name = "title", nullable = true, unique = false)
    private String title;

    @Column(name = "description", nullable = true, unique = false)
    private String description;


	
    public SimpleQuestion() {
    	
    }
    
//	public SimpleQuestion(String title, String description) {
//		super();
//		this.title = title;
//		this.description = description;
//	}
    
	public SimpleQuestion(List<SimpleAnswer> simpleAnswers, String title, String description) {
		super();
		this.simpleAnswers = simpleAnswers;
		this.title = title;
		this.description = description;
	}
	
	

	public List<SimpleAnswer> getSimpleAnswers() {
		return simpleAnswers;
	}

	public void setAnswers(List<SimpleAnswer> simpleAnswers) {
		this.simpleAnswers = simpleAnswers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


    /* ************************************ */
    

}


