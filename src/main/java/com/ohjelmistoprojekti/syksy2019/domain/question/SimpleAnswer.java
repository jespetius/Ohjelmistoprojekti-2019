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
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "id")
	private SimpleQuestion simpleQuestion;
	
	@Column(name="answer", nullable=false, unique=false)
	private String answer;
	
	public SimpleAnswer() {}
	
	public SimpleAnswer(String answer) {
		this.answer = answer;
	}
	
	public SimpleAnswer(Long answerId, String answer) {
		this.answerId = answerId;
		this.answer = answer;
	}
	
	public SimpleAnswer(Long answerId, SimpleQuestion simpleQuestion, String answer) {
		this.answerId = answerId;
		this.simpleQuestion = simpleQuestion;
		this.answer = answer;
	}

	
	/* ***************************** */
	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public SimpleQuestion getSimpleQuestion() {
		return simpleQuestion;
	}

	public void setSimpleQuestion(SimpleQuestion simpleQuestion) {
		this.simpleQuestion = simpleQuestion;
	}
	
	
	
}
