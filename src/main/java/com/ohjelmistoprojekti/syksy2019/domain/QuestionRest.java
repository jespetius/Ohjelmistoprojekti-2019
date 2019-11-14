package com.ohjelmistoprojekti.syksy2019.domain;

import javax.persistence.*;

@Entity
public class QuestionRest {
	@Id
	private final long id;
	    private String question;
	    private String q;
	    
	    public QuestionRest(long id, String question, String q) {
	        this.id = id;
	        this.question = question;
	        this.q = q;
	    }

	    public String getQ() {
			return q;
		}

		public long getId() {
	        return id;
	    }

	    public String getQuestion() {
	        return question;
	    }
	    
	    public void setQ(String q) {
			this.q=q;
		}
	    
}
