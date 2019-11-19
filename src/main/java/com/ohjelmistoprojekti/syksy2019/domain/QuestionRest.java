package com.ohjelmistoprojekti.syksy2019.domain;

import javax.persistence.*;

@Entity
public class QuestionRest {
	
	@Id
	private long id;
    private String title;
    private String description;
    
    public QuestionRest() {}
    public QuestionRest(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
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


	public long getId() {
		return id;
	}
	
}
