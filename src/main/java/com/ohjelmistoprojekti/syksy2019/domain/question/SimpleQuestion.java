package com.ohjelmistoprojekti.syksy2019.domain.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.persistence.*;
import java.util.List;

@Entity
public class SimpleQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id", nullable = false, unique = true)
    private Long id;

    /**
     *  [Textbox]
     */
    @Column(name = "title", nullable = true, unique = false)
    private String title;

    /**
     *  [Text]
     */
    @Column(name = "description", nullable = true, unique = false)
    private String description;

    public SimpleQuestion() {
    	
    }
    
	public SimpleQuestion(String title, String description) {
		super();
		this.title = title;
		this.description = description;
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


