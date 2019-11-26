package com.ohjelmistoprojekti.syksy2019.domain.question;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SimpleAnswer {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "answerId", nullable = false, unique = true)
    private Long answerId;
	
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "simpleAnswers")
    @JsonIgnore
    private List<SimpleQuestion> simpleQuestions;
	
	@Column(name="answer", nullable=false, unique=false)
	private String answer;
	
	public SimpleAnswer() {}
	
	public SimpleAnswer(Long answerId, List<SimpleQuestion> simpleQuestions, String answer) {
		super();
		this.answerId = answerId;
		this.simpleQuestions = simpleQuestions;
		this.answer = answer;
	}



	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public List<SimpleQuestion> getSimpleQuestions() {
		return simpleQuestions;
	}

	public void setSimpleQuestions(List<SimpleQuestion> simpleQuestions) {
		this.simpleQuestions = simpleQuestions;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}
