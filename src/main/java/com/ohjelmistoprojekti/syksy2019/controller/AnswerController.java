package com.ohjelmistoprojekti.syksy2019.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleAnswer;
import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleAnswerRepository;

@RestController
public class AnswerController {

	


			private final SimpleAnswerRepository repository;
			
			AnswerController(SimpleAnswerRepository repository) {
				this.repository = repository;
			}
		
			@GetMapping("/answers")
			List<SimpleAnswer> all() {
				return (List<SimpleAnswer>) repository.findAll();
			}
			
			 @PostMapping("/answers")
			 SimpleAnswer newAnswer(@RequestBody SimpleAnswer newAnswer) {
			    return repository.save(newAnswer);
			  }
}