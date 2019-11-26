package com.ohjelmistoprojekti.syksy2019.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleQuestion;
import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleQuestionRepository;



@RestController
public class QuestionController {

	private final SimpleQuestionRepository repository;
	
	QuestionController(SimpleQuestionRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/questions")
	List<SimpleQuestion> all() {
		return (List<SimpleQuestion>) repository.findAll();
	}

	@PostMapping("/questions")
	SimpleQuestion newQuestion(@RequestBody SimpleQuestion newQuestion) {
		return repository.save(newQuestion);
	}

	// Single item
	@GetMapping("/questions/{id}")
	Optional<SimpleQuestion> one(@PathVariable Long id) {
		return repository.findById(id);
	}


	@PutMapping("/questions/{id}")
	SimpleQuestion replaceQuestion(@RequestBody SimpleQuestion newQuestion, @PathVariable Long id) {

    return repository.findById(id)
    	.map(question -> {
    		question.setTitle(newQuestion.getTitle());
	        question.setDescription(newQuestion.getDescription());

        
	        return repository.save(question);
    	})
		.orElseGet(() -> {
			newQuestion.setId(id);
			return repository.save(newQuestion);
		});

	}

	@DeleteMapping("/questions/{id}")
	void deleteQuestion(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	

}
